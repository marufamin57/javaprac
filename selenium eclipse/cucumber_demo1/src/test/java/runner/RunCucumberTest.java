package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
//        glue = {"steps","hooks"},
        glue = {"steps"},
        plugin = {"pretty"},
//        publish = true
        dryRun = true
)

public class RunCucumberTest {
}
