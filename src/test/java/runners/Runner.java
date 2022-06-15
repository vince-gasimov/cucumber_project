package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "./src/test/resources/features", // path of future folder
        glue = "stepdefinitions", // path of the step definitions folder
        tags = "@customer_registration", // will only run this tag
        dryRun = false
)

public class Runner {
}

/*
Runner class is used to run the feature files
@RunWith : makes this class runnable
@CucumberOptions : 1. features : path of the features folder
                   2. glue : path of the step definitions folder

dryRun is used to check if there is any missing Java Codes (step definitions)
dryRun takes 2 values, true and false
default value is false
false: runs tests on the browser while checkin is there is any java code missing
true: runs tests without browser while chekcing if there is any java

 */