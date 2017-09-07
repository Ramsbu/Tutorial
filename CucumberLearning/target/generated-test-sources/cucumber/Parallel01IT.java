import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = false,
features = {"C:/Users/Deepika Reddy G/Documents/Selenium/projects/Tutorial/CucumberLearning/src/test/resources/features/sample.feature:3"},
plugin = {"pretty", "json:target/cucumber-parallel/1.json"},
monochrome = true,
glue = { "com.sample.cucumber.stepdefs" })
public class Parallel01IT {
}
