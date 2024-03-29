package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxDemo {

    @Test
    public void test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.xpath("//input[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[2]"));

        //verify that checkbox 1 is unselected and 2 selected default
        Assert.assertFalse(checkbox1.isSelected(),"Verify checkbox 1 is not selected");
        Assert.assertTrue(checkbox2.isSelected(),"Verify checkbox 2 is selected");

        //select the first checkbox
        checkbox1.click();
        checkbox2.click();

        Assert.assertTrue(checkbox1.isSelected(),"Verify checkbox 1 is selected");
        Assert.assertTrue(checkbox2.isSelected(),"Verify checkbox 2 is selected");

    }
}
