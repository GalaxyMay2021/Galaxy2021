package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions
	(
	features="C:/Workspace/NewSCD/src/test/java/feature/NewSCDLoginFeature.feature",
	glue= {"stepdefinition"},
	plugin= {"pretty", "html:target/TestReport.html"},
	tags="@Smoketest1 or @Smoketest2",
			//tags="@Smoketest1 or @Smoketest2 or @Smoketest6", 
				//tags="@Smoketest1 or @Smoketest2 or @Smoketest7", 
	monochrome = true
			)
		
	public class Runner {

}
