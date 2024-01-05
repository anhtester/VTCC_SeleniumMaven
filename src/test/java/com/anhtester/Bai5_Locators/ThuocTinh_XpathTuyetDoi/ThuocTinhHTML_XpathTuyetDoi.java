package com.anhtester.Bai5_Locators.ThuocTinh_XpathTuyetDoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ThuocTinhHTML_XpathTuyetDoi {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver(); //Mở trình duyệt Chrome
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Vào 1 trang web chỉ định
        driver.get("https://crm.anhtester.com/admin/authentication");

        Thread.sleep(2000);
        //Điền input email
        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        //Điền password
        driver.findElement(By.name("password")).sendKeys("123456");

        Thread.sleep(1000);

        //Click vào link text
        //driver.findElement(By.linkText("Forgot Password?")).click();
        //driver.findElement(By.partialLinkText("Forgot")).click();

        //Click nút Remember Me với Class Name
        driver.findElement(By.className("checkbox")).click();
        Thread.sleep(1000);
        //Dựa vào TagName để click nút Login
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(1000);
        //Verify login success
        //User redirect to Dashboard page (kiểm tra menu Dashboard hiện lên, URL có chứa /dashboard)
        //Click menu Customers
        driver.findElement(By.className("menu-item-customers")).click();
        Thread.sleep(1000);

        //Dùng xpath tuyệt đối
        //Nút Add New Customer
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("VTCC Viettel A1");

        Thread.sleep(2000);
        //Đóng trình duyệt
        driver.quit();

    }
}
