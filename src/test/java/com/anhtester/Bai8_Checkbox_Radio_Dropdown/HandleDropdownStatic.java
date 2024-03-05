package com.anhtester.Bai8_Checkbox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownStatic extends BaseTest {

    public static void main(String[] args) {
        createDriver();

        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        //Khởi tạo giá trị cho dropdown (thẻ select)
        Select select1 = new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));

        Select select2 = new Select(driver.findElement(By.xpath("//select[@id='multi-select']")));

        System.out.println("Is Multiple: " + select2.isMultiple());
        select2.selectByVisibleText("Florida");
        select2.selectByVisibleText("New York");
        System.out.println("============================================");
        for (int i = 0; i < select2.getAllSelectedOptions().size(); i++) {
            System.out.println(select2.getAllSelectedOptions().get(i).getText());
        }
        System.out.println("============================================");


        System.out.println("Option Total: " + select1.getOptions().size());

        System.out.println("============================================");
        for (int i = 0; i < select1.getOptions().size(); i++) {
            System.out.println(select1.getOptions().get(i).getText());
        }
        System.out.println("============================================");

        //Chọn giá trị trong dropdown (select - option)
        select1.selectByVisibleText("Tuesday");
        sleep(1);
        String itemSelected1 = select1.getFirstSelectedOption().getText();
        System.out.println(itemSelected1);

        select1.selectByValue("Monday");
        sleep(1);
        select1.selectByIndex(4); //Wednesday
        sleep(1);

        String itemSelected = select1.getFirstSelectedOption().getText();
        System.out.println(itemSelected);

        sleep(1);

        closeDriver();
    }

}
