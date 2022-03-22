import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		features={"/Users/mdgulamkibria/Desktop/bit tech/CucumberPractice/facebook.feature"},
glue ={"/Users/mdgulamkibria/Desktop/bit tech/CucumberPractice/src/test/java"},
	 monochrome=true,	
	dryRun= false,
	format= {"pretty","html:test-optput"}

		
		)

		
		
		
		



public class RunnerClass {

}
