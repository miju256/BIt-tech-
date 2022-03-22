package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"/Users/mdgulamkibria/Desktop/bit tech/CucumberWithFacebookAndPOM/loginfacebook.feature"},
		glue= {"testRunner"},
		monochrome=true,
		format= {"pretty","html:test-output"},
		dryRun=true
		
		
		
		
		)







public class RunnerClass {

}
