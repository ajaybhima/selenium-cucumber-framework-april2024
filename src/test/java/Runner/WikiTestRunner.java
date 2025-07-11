package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest7",
        features = {"src/test/resources/Features"},
        glue = {"stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class WikiTestRunner extends AbstractTestNGCucumberTests {


}
