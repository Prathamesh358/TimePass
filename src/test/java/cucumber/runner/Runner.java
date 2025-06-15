package cucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, features = "src/test/java/cucumberfeatures/login.feature", glue = {
		"cucumber.step.def" }, tags = "@tag1 or @tag2")

public class Runner {
	
}
