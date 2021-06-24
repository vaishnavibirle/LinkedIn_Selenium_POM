package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.By;


public class Login extends BaseClass {

    /*@Desc - Here we are logging in using sign in button
    * 1.Using click method we have reached to sign in page
    * 2.We have used send keys method for entering credentials
    * 3.Submitted
    * 4.also returned  the page title*/
    public String login() {

        driver.findElement(By.className("nav__button-secondary")).click();
        driver.findElement(By.id("username")).sendKeys("vaishnavibirle1133@gmail.com");
        driver.findElement(By.id("password")).sendKeys("vaishnavi@123");
        driver.findElement(By.className("login__form_action_container")).click();

        return driver.getTitle();
    }




}
