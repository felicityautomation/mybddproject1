package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"features\\Login.feature","features\\LoginMultipleSetofData.feature"},
		glue = {"step.definitions"},
		plugin = {"html:htmlreport/cucumber-test-report.html"}
		)
public class LoginRunnerFile2 extends AbstractTestNGCucumberTests{

}
