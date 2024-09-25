package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class) //only for Junit
@CucumberOptions( 
		features = "src/test/resources/Features/ScenarioOutline1.feature"
		,glue= {"stepDefinitions"}
		,plugin= {"pretty", "html:target/cucumber-reports.html", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}// format option can also be used instead of plugin
		,dryRun=false
	    ,publish = true
	    
	    //,strict=true  // this will fail the execution if there are any pending steps---after cucumber 6, this has removed.
	     //,monochrome = true  //to generate result in pretty format, monochrome should not mention
		)
public class LivedemoLoginRunner extends AbstractTestNGCucumberTests {  //for testng AbstractTestNGCucumberTests

}
