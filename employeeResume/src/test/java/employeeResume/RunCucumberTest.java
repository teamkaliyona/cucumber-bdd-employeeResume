package employeeResume;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
                 features = "src/test/resources/employeeResume"
				// tags = "@office"                 
				 )
public class RunCucumberTest {

}
