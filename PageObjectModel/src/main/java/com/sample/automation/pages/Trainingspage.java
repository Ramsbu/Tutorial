package com.sample.automation.pages;

import org.openqa.selenium.By;

public class Trainingspage extends BasePage {
    public static final String Trainingpage="//a[@href='http://www.globalsqa.com/trainings/']";


    public void navigationtraining(){
        driver.findElement(By.xpath(Trainingpage)).click();


    }

}

