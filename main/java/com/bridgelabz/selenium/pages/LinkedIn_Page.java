package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.By;

public class LinkedIn_Page extends BaseClass {

    public void linkedInPage(){
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Brillio");

    }
}
