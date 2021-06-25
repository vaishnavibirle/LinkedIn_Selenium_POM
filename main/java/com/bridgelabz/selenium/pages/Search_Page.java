package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_Page extends BaseClass {

    @FindBy(xpath ="//input[@placeholder='Search']")
    WebElement Search;



    public void search_in_page(){
        Search.sendKeys("Brillio");


    }
}
