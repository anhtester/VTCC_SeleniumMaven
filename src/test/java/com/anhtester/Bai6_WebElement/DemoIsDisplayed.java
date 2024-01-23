package com.anhtester.Bai6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoIsDisplayed {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://anhtester.com/");

        WebElement element = driver.findElement(By.xpath("//h1"));

        //Kiểm tra element hiển thị
        System.out.println("Result: " + element.isDisplayed());

        System.out.println("Displayed: " + driver.findElement(By.xpath("(//h2[@class='section__title'])[1]")).isDisplayed());

        Thread.sleep(2000);
        driver.quit();
    }
}
