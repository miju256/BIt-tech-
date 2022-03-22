package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"/Users/mdgulamkibria/Desktop/bit tech/CucumberClasswork/src/test/java/feature/login1.feature"},
		glue= {"StepDefinition"},
		monochrome=true,
		strict=true,
		dryRun=true
		
		
		
		)
public class RunnerClass {

}
