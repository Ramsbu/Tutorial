package com.sample.automation;

import com.sample.automation.pages.AboutUsPage;
import com.sample.automation.pages.Trainingspage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AboutUSTest extends BaseTest {
    @Test
    public void aboutUS(){

        AboutUsPage aboutUsPage= new AboutUsPage();
        aboutUsPage.navigationaboutus();

    }
}