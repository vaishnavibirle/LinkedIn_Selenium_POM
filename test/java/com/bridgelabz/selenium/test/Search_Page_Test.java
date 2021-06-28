package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.pages.Search_Page;
import com.bridgelabz.selenium.pages.Login;
import org.testng.annotations.Test;

public class Search_Page_Test extends BaseClass {

    @Test
    public void searchTest() throws InterruptedException {
        Login login = new Login(driver);
        login.login();
        Search_Page page = new Search_Page();
        page.search_in_page();

    }

}
