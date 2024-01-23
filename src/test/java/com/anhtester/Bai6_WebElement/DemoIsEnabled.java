package com.anhtester.Bai6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoIsEnabled {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://angular-reactive-forms-zvzqvd.stackblitz.io/");

        driver.findElement(By.xpath("//span[normalize-space()='Run this project']")).click();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));

        //Kiểm tra element có bật lên hay không
        System.out.println("Submit button: " + element.isEnabled());

        System.out.println("Hacked button: " + driver.findElement(By.xpath("//button[normalize-space()='\"Hacked\" Submit button']")).isEnabled());

        Thread.sleep(2000);
        driver.quit();
    }
}
