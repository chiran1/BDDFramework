package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "/Users/binu/eclipse-workspace/CucumberBDD/src/main/java/Feature/map.feature", //the path of the feature files
			glue={"StepDefinitions"}, //the path of the step definition files
			format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
			monochrome = true, //display the console output in a proper readable format
			strict = true, //it will check if any step is not defined in step definition file
			dryRun = false //to check the mapping is proper between feature file and step def file
			//tags = {"~@EndToEnd"}			
			)

public class TestRunner {

}

	//OR: tags={"@SmokeTest, @RegressionTest"} - execute all tests tagged as @smokeTest OR @RegressionTest
	//AND : tags ={"@SmokeTest", "@RegressionTest"}--execute all test tagged as @Smoke AND @Regression
	//ignore: tags = {"~@SmokeTest", "~@RegressionTest"}