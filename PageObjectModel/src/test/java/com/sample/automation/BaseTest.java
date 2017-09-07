package com.sample.automation;

import com.sample.automation.pages.BasePage;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    public void setup() {
        BasePage basePage = new BasePage();
        basePage.openApplication();
    }
}
