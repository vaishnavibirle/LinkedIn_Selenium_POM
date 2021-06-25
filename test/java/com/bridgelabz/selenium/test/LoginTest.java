package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.pages.Login;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest  extends BaseClass {
    /*@Desc-Here we have checked whether user is able to login or not
    * Used assert by giving title of the page*/
    @Test
    public void login() {
        Login login = new Login(driver);
        String actualTitle = login.login();
        String expectedTitle = "Feed | LinkedIn";
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
