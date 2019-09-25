package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="feature\\pram.feature",glue= {"stepdef"},plugin= {"html:target/c1.html"})
public class testrunner {
	
}