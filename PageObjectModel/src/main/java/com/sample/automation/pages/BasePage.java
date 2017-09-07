package com.sample.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {

    static WebDriver driver;

    public void openApplication() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepika Reddy G\\Documents\\Selenium\\software\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.globalsqa.com");
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
