package com.anhtester.Bai7_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoAdvanced {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        //driver.get("https://crm.anhtester.com/admin/authentication");

        driver.get("https://anhtester.com");

        //driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get("https://google.com");
        driver.close();

        driver.quit(); //Tắt luôn trình duyệt

    }
}
