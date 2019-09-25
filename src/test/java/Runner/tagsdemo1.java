package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature\\tagdemo.feature",glue= {"stepdef"},plugin= {"html:target/cucumber2.html"},tags= {"@SmokeTest","@RegressionTest"})
public class tagsdemo1 {
	
}