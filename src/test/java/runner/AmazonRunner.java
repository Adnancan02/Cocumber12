package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "features",
        glue = "src/test/java/stepDefinitions",
        tags = "@wip",
        dryRun = true)





public class AmazonRunner {

}
