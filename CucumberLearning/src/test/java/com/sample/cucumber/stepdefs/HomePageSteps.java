package com.sample.cucumber.stepdefs;

import com.sample.cucumber.dtos.UserDetails;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePageSteps {

    By USERNAME = By.xpath("//input[@class='name']");
    By EMAIL = By.xpath("//input[@class='email']");
    By WEBSITE =By.xpath("//input[@name='g2599-website']");
    By EXPERIENCE =By.xpath("//input[@id='g2599-experienceinyears']");

    @Given("^I register with below info in the application$")
    public void registerUser(List<UserDetails> detailsList) {
        UserDetails userDetails = detailsList.get(0);
        driver.findElement(USERNAME).sendKeys(userDetails.getFirstName());
        driver.findElement(EMAIL).sendKeys(userDetails.getEmail());
        driver.findElement(WEBSITE).sendKeys(userDetails.getWebsite());
        driver.findElement(EXPERIENCE).sendKeys(userDetails.getExperience());
    }




    WebDriver driver;

    @Before
    public void loginToApplication() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RamsPandu\\Documents\\Selenium\\Selenium Software\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.globalsqa.com/samplepagetest/");
    }

    @After
    public void tearDown() {
        driver.quit();

    }
}



