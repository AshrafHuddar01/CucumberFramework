package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		features = "src/test/resources/Features/Tag1.feature"
		,glue= {"stepDefinitions"}
		,plugin= {"pretty"}
		,dryRun = false
		//,tags = "@Smoke"
		) 
public class Tag1Runner extends AbstractTestNGCucumberTests {
	
	

}
