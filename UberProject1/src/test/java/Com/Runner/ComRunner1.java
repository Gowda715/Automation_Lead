package Com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"Uber.feature"},
glue= {"Com.StepDefinations"},
tags= "@login",
plugin= {"pretty", "json:target/Myreports/reports,json","junit:target/Myreports/report.xml " },
monochrome=true, dryRun=false)




public class ComRunner1 {

}
