package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass {

    /*Used FindBy Annotations for finding elements using locators*/

    @FindBy(className = "nav__button-secondary")
    WebElement SignIn;

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(className = "login__form_action_container")
    WebElement SignIn_Submit;

    /*Used parameterized  constructor
    * with page factory model*/

    public  Login(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    /*@Desc - Here we are logging in using sign in button
     * 1.Using click method we have reached to sign in page
     * 2.We have used send keys method for entering credentials
     * 3.Submitted
     * 4.also returned  the page title*/

    public String login() {

        SignIn.click();
        username.sendKeys("");
        password.sendKeys("");
        SignIn_Submit.click();

        return driver.getTitle();
    }




}
