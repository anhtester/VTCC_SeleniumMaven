package com.anhtester.Bai8_Checkbox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HandleDropdownDynamic extends BaseTest {
    public static void main(String[] args) {
        createDriver();

        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        sleep(2);

        //Click vào dropdown Category
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']")).click();
        //Search giá trị cần chọn
        sleep(1);
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']/parent::a/following-sibling::div//input")).sendKeys("Travel");
        //Click chọn Text đã search (cần chọn)
        sleep(1);
        //driver.findElement(By.xpath("//li[@class='active-result highlighted']")).click();

        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']/parent::a/following-sibling::div//input")).sendKeys(Keys.ENTER);

//        Actions action = new Actions(driver);
//        action.sendKeys(Keys.ENTER).perform(); //Cách ENTER dùng cho TH chỉ hiển thị 1 giá trị lựa chọn

        sleep(2);
        closeDriver();
    }
}
