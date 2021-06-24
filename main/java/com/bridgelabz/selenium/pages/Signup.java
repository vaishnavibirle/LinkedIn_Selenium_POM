package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class Signup extends BaseClass {

    /*@Desc - Linkedin application will get opened in browser
    * 1.Using click method , signing up for account
    * 2.Entering credentials by using send key method
    * 3.Used click for submitting the credentials*/
    public void signup() {

        driver.findElement(By.className("nav__button-tertiary")).click();

        driver.findElement(By.name("email-or-phone")).sendKeys("vaishnavibirle2209@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Vaishnavi@123");
        driver.findElement(By.id("join-form-submit")).click();

        driver.findElement(By.id("first-name")).sendKeys("Vaishnavi");
        driver.findElement(By.id("last-name")).sendKeys("Birle");
        driver.findElement(By.linkText("Continue")).click();


        WebElement Country = driver.findElement(By.id("select-register-phone-country"));
        Select select = new Select(Country);

        select.selectByVisibleText("India");
        WebElement India = select.getFirstSelectedOption();
        String selectedOption = India.getText();
        System.out.println("Selected option is : "+ selectedOption);

        driver.findElement(By.name("phoneNumber")).sendKeys("8668602568");

        driver.findElement(By.linkText("Submit")).click();



    }

    /*@Desc - Here we have signed up using google account
    * 1.using click method we have clicked on join using google
    * 2.Entered password
    * 3.And using click method submitted*/
    public void signup_with_google() throws InterruptedException {

        driver.findElement(By.className("nav__button-tertiary")).click();

        driver.findElement(By.className("third-party-join__container")).click();
        driver.findElement(By.className("third-party-join__google-btn-content")).click();


        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);

        for (String winHandle : windowHandles) {
            driver.switchTo().window(winHandle);
            System.out.println(winHandle);
            String actual = driver.getTitle();
            System.out.println(actual);
            System.out.println("Before if");

            if (actual.equals("Sign in – Google accounts")) {
                System.out.println("After if");
                driver.findElement(By.name("identifier")).sendKeys("vaishnavibirle1133@gmail.com");
                driver.findElement(By.linkText("Next")).click();

                Thread.sleep(3000);
            }
        }


    }
}
