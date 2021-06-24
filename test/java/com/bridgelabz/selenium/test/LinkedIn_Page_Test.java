package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.pages.LinkedIn_Page;
import com.bridgelabz.selenium.pages.Login;
import org.testng.annotations.Test;

public class LinkedIn_Page_Test extends BaseClass {

    @Test
    public void linkedInPageTest() {
        Login login = new Login();
        login.login();
        LinkedIn_Page page = new LinkedIn_Page();
        page.linkedInPage();
    }

}
