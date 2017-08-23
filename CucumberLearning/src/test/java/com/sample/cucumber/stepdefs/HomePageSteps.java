package com.sample.cucumber.stepdefs;

import com.sample.cucumber.dtos.UserDetails;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePageSteps {

    By USERNAME = By.xpath("//input[@class='name']");
    By EMAIL = By.xpath("//input[@class='email']");
    By WEBSITE = By.xpath("//input[@name='g2599-website']");
    By EXPERIENCE = By.xpath("//select[contains(@name,'experienceinyears')]");
    String EXPERTISE = "//label[contains(text(),'%s')]";
    String EDUCATION = "//input[@value='%s']";
    By SUBMIT = By.xpath("//input[@type='submit']");

    @Given("^I register with below info in the application$")
    public void registerUser(List<UserDetails> detailsList) {
        UserDetails userDetails = detailsList.get(0);
        driver.findElement(USERNAME).sendKeys(userDetails.getFirstName());
        driver.findElement(EMAIL).sendKeys(userDetails.getEmail());
        driver.findElement(WEBSITE).sendKeys(userDetails.getWebsite());

        Select select = new Select(driver.findElement(EXPERIENCE));
        select.selectByVisibleText(userDetails.getExperience());

        String[] exp = userDetails.getExpertise().split(";");
        for (String ex : exp) {
            driver.findElement(By.xpath(String.format(EXPERTISE, ex))).click();
        }
        //  driver.findElement(By.className("textarea")).sendKeys(userDetails.getComments());

        /*Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//textarea[contains(@name,'comment')]")));
        actions.sendKeys(userDetails.getComments());
        actions.build().perform();*/

        WebElement ele = driver.findElement(By.xpath("//textarea[contains(@name,'comment')]"));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].value='" + userDetails.getComments() + "'", ele);

        driver.findElement(By.xpath(String.format(EDUCATION, userDetails.getEducation()))).click();
        driver.findElement(SUBMIT).click();

    }

    WebDriver driver;

    @Before
    public void loginToApplication() {
/*        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RamsPandu\\Documents\\Selenium\\Selenium Software\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.globalsqa.com/samplepagetest/");

        //   driver.manage().window().maximize();*/
        OpenBrowser openBrowser = new OpenBrowser();
        driver = openBrowser.loginToApplication();
    }

    @After
    public void tearDown() {
        //driver.quit();

    }


}



