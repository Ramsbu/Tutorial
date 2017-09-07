package com.sample.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutUsPage extends BasePage
{
   public static final String ABOUTUS="//a[@href='http://www.globalsqa.com/about-the-company/']";
    public void navigationaboutus(){
        driver.findElement(By.xpath(ABOUTUS)).click();
    }


}


