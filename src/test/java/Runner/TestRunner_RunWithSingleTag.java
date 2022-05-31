package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/FeatureWithTags"},
        glue = {"Steps"},
      //  tags = {"@smoke"}
        //tags = "@smoke or @regression"
      //  tags = "@smoke and @regression"
        //tags = "@smoke or @regression} and @important"
        //tags = {"@regression and not @smoke"}
       // tags = "@smoke or @regression) and not@important"
tags = "@mustRun"
)
        public class TestRunner_RunWithSingleTag {
}
