package com.anhtester.Bai8_Checkbox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;

public class HandleRadioButton extends BaseTest {
    public static void main(String[] args) {
        createDriver();

        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");

        System.out.println("Male: " + driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//label[text()='Male']//input")).isSelected());
        System.out.println("Female: " + driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//label[text()='Female']//input")).isSelected());

        driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//label[text()='Male']//input")).click();
        System.out.println("Male: " + driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//label[text()='Male']//input")).isSelected());
        System.out.println("Female: " + driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//label[text()='Female']//input")).isSelected());

        driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//label[text()='Female']//input")).click();
        System.out.println("Male: " + driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//label[text()='Male']//input")).isSelected());
        System.out.println("Female: " + driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//label[text()='Female']//input")).isSelected());

        //driver.findElement(By.xpath("//button[@id='buttoncheck']")).click();
        sleep(1);

        boolean checkMessage = checkElementExist(By.xpath("//p[@class='radiobutton']"));
        System.out.println("Check message exist: " + checkMessage);

        if (checkMessage == true) {
            System.out.println("Message Text: " + driver.findElement(By.xpath("//p[@class='radiobutton']")).getText());
        }

        closeDriver();
    }
}
