package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class Signup extends BaseClass {

    /*@Desc - Used FindBy Annotations for finding elements on web page
    * using various locators*/

    @FindBy(className = "nav__button-tertiary")
    WebElement join_now;

    @FindBy(name = "email-or-phone")
    WebElement email;

    @FindBy(name = "password")
    WebElement pwd;

    @FindBy(id = "join-form-submit")
    WebElement AgreeAndJoin;

    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id = "last-name")
    WebElement lastName;

    @FindBy(linkText = "Continue")
    WebElement continueBtn;

    @FindBy(id = "select-register-phone-country")
    WebElement Country;

    @FindBy(id = "phoneNumber")
    WebElement phone;

    @FindBy(linkText = "Submit")
    WebElement submit;

    /*Called Constructor*/
    public Signup() {
        PageFactory.initElements(driver,this);
    }

    /*@Desc - Linkedin application will get opened in browser
    * 1.Using click method , signing up for account
    * 2.Entering credentials by using send key method
    * 3.Used click for submitting the credentials*/
    public void signup() {

        join_now.click();

        email.sendKeys("vaishnavibirle2209@gmail.com");
        pwd.sendKeys("Vaishnavi@123");
        AgreeAndJoin.click();

        firstName.sendKeys("Vaishnavi");
        lastName.sendKeys("Birle");
        continueBtn.click();

        Select select = new Select(Country);

        select.selectByVisibleText("India");
        WebElement India = select.getFirstSelectedOption();
        String selectedOption = India.getText();
        System.out.println("Selected option is : "+ selectedOption);

        phone.sendKeys("8668602568");

        submit.click();



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

        }


    }
}
