package com.sample.cucumber.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OpenBrowser {

    static WebDriver driver;

    public WebDriver loginToApplication() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepika Reddy G\\Documents\\Selenium\\software\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.globalsqa.com/samplepagetest/");
        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
