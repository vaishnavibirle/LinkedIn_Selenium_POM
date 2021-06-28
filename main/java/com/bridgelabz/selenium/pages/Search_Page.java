package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Search_Page extends BaseClass {

    /*Used FindBy Annotations for finding elements using locators*/

    @FindBy(xpath ="//input[@placeholder='Search']")
    WebElement search;

   @FindBy(xpath = "//a[@href='https://www.linkedin.com/company/brillio/']")
   WebElement name;

    /*Used parameterized  constructor
     * with page factory model*/

    public Search_Page() {
        PageFactory.initElements(driver,this);
    }

    /*@Desc - Created method for searching anything on the page
    * Used action class for performing search box operation*/
    public void search_in_page() throws InterruptedException {

        Actions actions = new Actions (driver);
        actions.sendKeys(search,"Brillio").build().perform();
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(3000);

        name.click();
        Thread.sleep(3000);
    }
}
