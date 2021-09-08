import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/Features",glue ={"Steps"},
        monochrome = true,
        //plugin = {"pretty","html:target/HtmlReports"},
        plugin = {"pretty","json:target/JSONReports"}

)
public class TestRunner {


}
