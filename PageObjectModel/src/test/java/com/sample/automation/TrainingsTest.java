package com.sample.automation;

import com.sample.automation.pages.Trainingspage;
import org.testng.annotations.Test;

public class TrainingsTest extends BaseTest {
    @Test
    public void navigateTrainingspage() {
        Trainingspage trainingspage = new Trainingspage();
        trainingspage.navigationtraining();
    }
}