package com.anhtester.Bai6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCRM {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://crm.anhtester.com/admin/authentication");

        WebElement element = driver.findElement(By.xpath("//input[@id='email']"));
        element.sendKeys("admin@example.com");

        Thread.sleep(1000);
        element.clear();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        //isSelected
        driver.findElement(By.xpath("//div[normalize-space()='Dashboard Options']")).click();
        Thread.sleep(1000);
        System.out.println("Checkbox 1: " + driver.findElement(By.xpath("//input[@id='widget_option_top_stats']")).isSelected());
        Thread.sleep(1000);
        System.out.println("Checkbox 2: " + driver.findElement(By.xpath("//input[@id='widget_option_finance_overview']")).isSelected());


        Thread.sleep(2000);
        driver.quit();
    }
}
