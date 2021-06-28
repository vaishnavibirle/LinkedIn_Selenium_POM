package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Profile_Page  extends BaseClass {

    /*Used FindBy Annotation for finding elements using locators*/
    @FindBy(linkText = "Vaishnavi Birle")
    WebElement profile;

    @FindBy(xpath = "//a[@href='/in/vaishnavi-birle-915429178/edit/intro/']")
    WebElement pencil;

    @FindBy(xpath = "//div[@class='pe-form-footer__actions display-flex justify-space-between']")
    WebElement save;

    @FindBy(id = "ember3358")
    WebElement cancel;


    /*Called constructor*/
    public Profile_Page() {
        PageFactory.initElements(driver,this);
    }

    /*Created method for operating operations on profile page*/
    public void profile_page() throws InterruptedException {
        profile.click();
        Thread.sleep(4000);
        pencil.click();
        Thread.sleep(3000);
        save.click();
        Thread.sleep(2000);
        cancel.click();
        Thread.sleep(3000);
    }
}
