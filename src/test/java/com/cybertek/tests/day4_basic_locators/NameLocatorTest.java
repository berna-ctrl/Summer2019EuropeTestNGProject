package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput = driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Mike Smith");

        //enter email
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("secretmail@gmail.com");

        //clicking signup button
        WebElement signUpButton = driver.findElement(By.name("wooden_spoon"));
        signUpButton.click();

        //verify that you got "Thank you for signing up. Click the button below to return to home page."

        WebElement messageElement = driver.findElement(By.name("signup_message"));
        String actualMessage = messageElement.getText();

        String expectedMessage = "Thank you for signing up. Click the button below to return to home page.";

        if(actualMessage.equals(expectedMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }

        //close the browser
        driver.quit();
    }
}
