package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTest {
    public static void main(String[] args) {
        WebDriver driver = new WebDriverFactory().getDriver("chrome");

        //maximize the browser
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement homeLink = driver.findElement(By.className("nav-link"));
        homeLink.click();

        driver.get("http://practice.cybertekschoool.com/multiple_buttons");

        //proper way
        WebElement messageElement = driver.findElement(By.className("h3"));
        String message = messageElement.getText();
        System.out.println(message);

        //lazy way
        System.out.println(driver.findElement(By.className("h3")).getText());

        //note: if there is a space in the class attribute value, we CANNOT use it.
    }
}
