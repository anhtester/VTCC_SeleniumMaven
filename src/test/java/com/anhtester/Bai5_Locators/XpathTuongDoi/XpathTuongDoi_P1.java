package com.anhtester.Bai5_Locators.XpathTuongDoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathTuongDoi_P1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver(); //Mở trình duyệt Chrome
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Vào trang web chỉ định
        driver.get("https://crm.anhtester.com/admin/authentication");

        Thread.sleep(2000);
        //Điền input email
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        //Điền password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");

        Thread.sleep(1000);

        //Click nút Remember Me
        driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();
        Thread.sleep(1000);
        //Click nút Login
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        Thread.sleep(1000);

        //Click menu Customers
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
        Thread.sleep(1000);

        //Nút Add New Customer
        driver.findElement(By.xpath("//a[normalize-space()='New Customer']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("VTCC Viettel A1");

        Thread.sleep(2000);
        //Đóng trình duyệt
        driver.quit();

    }
}
