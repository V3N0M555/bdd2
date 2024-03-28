package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="featureFiles", 
		glue={"stepdefinitions","com.actitime.generic"}, dryRun = false,
		plugin = "html:target/report.html",monochrome = true,
		tags = "@createCustomer"
		)
public class RunnerClass extends AbstractTestNGCucumberTests{

}