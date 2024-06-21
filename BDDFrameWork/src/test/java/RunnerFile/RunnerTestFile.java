package RunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/resources/Features",
					glue = "StepFile",
					tags = "",
					dryRun = false,
					monochrome = true,
					plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunnerTestFile{

	
}
