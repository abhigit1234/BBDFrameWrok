package RunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/resources/Features/MapFeature.feature",
					glue = "StepFile",
					tags = "@Tag1",
					dryRun = false,
					monochrome = true,
					plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunnerTestFile{

	
}
