package runner_class;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"C:\\Users\\ADMIN\\git\\TrackingByte\\Cucumber_BDD\\src\\test\\java\\featureFile\\Login.feature"},
		glue= {"stepdefinition"},
		dryRun=false,
		monochrome=true,
		plugin= {"pretty", "html:reports\\login.html."}
		)
public class Runnerclass extends AbstractTestNGCucumberTests  {

}
