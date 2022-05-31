package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features/LoginDemo.feature" ,
        glue = {"Steps"},
        monochrome = true,
        plugin = {"junit:target/JUnitReports/report.xml",
            "json:target/JSONReports/report.json",
            "html:target/htmlReports"})

public class TestRunnnerForLoginUsingPom {


}
