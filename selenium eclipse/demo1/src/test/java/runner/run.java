package runner;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"steps"},
//        tags = {},
//        monochrome = true,
        plugin = {"pretty"}
)
public class run {
	
}
