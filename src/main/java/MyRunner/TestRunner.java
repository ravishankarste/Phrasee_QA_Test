package MyRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/main/java/Features/SetUp.feature",
        glue={"StepDefinitions"}, // The path of the step definition files
        plugin= {"pretty",// To generate different types of reporting
                "html:test-outout",
                "json:json_output/cucumber.json",
                "junit:junit_xml/cucumber.xml"},
        monochrome = true, // Display the console output in a proper readable format
        strict = true, // It will check if any step is not defined in step definition file
        dryRun = false // To check the mapping is proper between feature file and step def file
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
