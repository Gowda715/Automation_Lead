package Dom.Runnerfile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"Afeature"},
glue= {"Dom.StepDefinations"},
tags= {"@Login1",} ,
plugin= {"pretty","json: target/Myreports/report.json", 
		"junit:target/Myreports/report.xml "},
monochrome=true, dryRun=false)

public class Test1 {

}
