package com.sample.cucumber.stepdefs;

import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPageSteps {


    By COUNTRY = By.xpath("//div[@rel-title='Select Country']/descendant::select");


    @And("^I Select \"([^\"]*)\" value from the drop down$")
    public void selectCountry(String country) {
        WebDriver driver = OpenBrowser.getDriver();
        driver.get("http://www.globalsqa.com/demo-site/select-dropdown-menu/");
        Select select = new Select(driver.findElement(COUNTRY));
        select.selectByValue(country);
    }


}
