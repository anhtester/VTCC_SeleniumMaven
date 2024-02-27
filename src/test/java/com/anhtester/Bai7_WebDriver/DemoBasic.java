package com.anhtester.Bai7_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoBasic {
    public static void main(String[] args) throws InterruptedException {

        //WebDriver driver = new EdgeDriver();
        //WebDriver driver = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://crm.anhtester.com/admin/authentication");

        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[normalize-space()='Forgot Password?']")).click();
        Thread.sleep(1000);

        driver.navigate().back();
        Thread.sleep(1000);

        driver.navigate().forward();
        Thread.sleep(1000);

        driver.navigate().back();
        Thread.sleep(1000);

        // Get the title of the page
        String title = driver.getTitle();
        // Get the current URL
        String url = driver.getCurrentUrl();
        // Get the current page HTML source
        String html = driver.getPageSource();

        //Kiểm tra giá trị text trong Page Source
        System.out.println(html.contains("Forgot Password? 123"));

        System.out.println(title);
        System.out.println(url);
        System.out.println(html);

        Thread.sleep(2000);

        driver.quit();

    }
}
