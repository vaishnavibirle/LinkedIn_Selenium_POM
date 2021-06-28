package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.pages.Login;
import com.bridgelabz.selenium.pages.Profile_Page;
import org.testng.annotations.Test;

public class Profile_Page_Test extends BaseClass {

    /*Used testNG method for testing profile page
    * tested the pencil tool for editing info*/
    @Test
    public void profileTest() throws InterruptedException {
        Login login = new Login(driver);
        login.login();
        Profile_Page profile_page = new Profile_Page();
        profile_page.profile_page();
    }

}

