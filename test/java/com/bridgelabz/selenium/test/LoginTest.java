package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.pages.Login;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest  extends BaseClass {
    @Test
    public void login() {
        Login login = new Login();
        String actualTitle = login.login();
        String expectedTitle = "Feed | LinkedIn";
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
