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
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).submit();

        //isSelected
        driver.findElement(By.xpath("//div[normalize-space()='Dashboard Options']")).click();
        Thread.sleep(1000);
        System.out.println("Checkbox 1: " + driver.findElement(By.xpath("//input[@id='widget_option_top_stats']")).isSelected());
        Thread.sleep(1000);
        System.out.println("Checkbox 2: " + driver.findElement(By.xpath("//input[@id='widget_option_finance_overview']")).isSelected());

        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();

        //Get Text
        System.out.println(driver.findElement(By.xpath("//span[normalize-space()='Customers Summary']")).getText());

        //Get Attribute
        System.out.println(driver.findElement(By.xpath("//input[@class='form-control input-sm']")).getAttribute("placeholder"));

        //Get Css value (color)
        System.out.println(driver.findElement(By.xpath("//span[@class='text-success tw-truncate sm:tw-text-clip']")).getCssValue("color"));
        System.out.println(driver.findElement(By.xpath("//span[@class='text-success tw-truncate sm:tw-text-clip']")).getCssValue("font-size"));

        System.out.println(driver.findElement(By.xpath("//span[normalize-space()='Inactive Customers']")).getCssValue("color"));
        System.out.println(driver.findElement(By.xpath("//span[normalize-space()='Inactive Customers']")).getCssValue("font-size"));

        System.out.println(driver.findElement(By.xpath("//a[normalize-space()='New Customer']")).getCssValue("background-color"));
        System.out.println(driver.findElement(By.xpath("//a[normalize-space()='New Customer']")).getCssValue("width"));
        System.out.println(driver.findElement(By.xpath("//a[normalize-space()='New Customer']")).getCssValue("height"));
        System.out.println(driver.findElement(By.xpath("//a[normalize-space()='New Customer']")).getText());

        //Get Size of button
        System.out.println(driver.findElement(By.xpath("//a[normalize-space()='New Customer']")).getSize());

        //Get Location
        System.out.println(driver.findElement(By.xpath("//a[normalize-space()='New Customer']")).getLocation());

        Thread.sleep(2000);
        driver.quit();
    }
}
