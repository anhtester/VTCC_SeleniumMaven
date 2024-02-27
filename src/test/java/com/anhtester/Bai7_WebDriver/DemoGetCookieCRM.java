package com.anhtester.Bai7_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGetCookieCRM {
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
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).submit();

        //Handle Cookies
        System.out.println("sp_session all: " + driver.manage().getCookieNamed("sp_session"));
        System.out.println("Value: " + driver.manage().getCookieNamed("sp_session").getValue());
        System.out.println("Domain: " + driver.manage().getCookieNamed("sp_session").getDomain());
        System.out.println("Expires: " + driver.manage().getCookieNamed("sp_session").getExpiry());

        Thread.sleep(2000);
        driver.quit();
    }
}
