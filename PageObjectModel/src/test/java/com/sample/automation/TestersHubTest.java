package com.sample.automation;

import com.sample.automation.pages.TestersHubPage;
import org.testng.annotations.Test;

public class TestersHubTest extends BaseTest {

    @Test
    public void navigateToTesterHUbPage() {
        TestersHubPage testersHubPage=new TestersHubPage();
        testersHubPage.navigateToTesterHubPage();

    }
}
