package com.sample.automation.pages;

import org.openqa.selenium.By;

    public class TestersHubPage extends BasePage {

    private static final String TESTERS_HUB_PAGE = "//a[@href='http://www.globalsqa.com/testers-hub/']";


    public void navigateToTesterHubPage() {
        driver.findElement(By.xpath(TESTERS_HUB_PAGE)).click();
    }

}
