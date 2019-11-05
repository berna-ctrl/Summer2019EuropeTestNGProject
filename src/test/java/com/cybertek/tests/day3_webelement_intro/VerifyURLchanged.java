package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLchanged {
    /**open browser
    * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
     *enter any email
     *click on Retrieve password
     *verify that url changed to http://practice.cybertekschool.com/email_sent*/
    public static void main(String[] args) {
        //open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any email
        WebElement emailInput = driver.findElement(By.name("email"));

        //sendKeys()-->send keyboard actions to webelement / enters given text
        emailInput.sendKeys("email@gmail.com");

        //locate to password button
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));

        //click button
        retrievePasswordButton.click();

        String expectedURL = "http://practice.cybertekschool.com/email_sent";

        String actualURL = driver.getCurrentUrl();

        //verify that url changed to http://practice.cybertekschool.com/email_sent
        if(expectedURL.equals(actualURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actual URL = " + actualURL);
            System.out.println("expected URL = " + expectedURL);
        }

        //close
        driver.quit();
    }

}
