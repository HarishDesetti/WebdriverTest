package runnerclass;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class RunnerClass {
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "Feature", glue = "stepDefinition")
	public class TestRunner {

	}

}
