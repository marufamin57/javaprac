package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key=PLUGIN_PROPERTY_NAME, value = "pretty")
@ConfigurationParameter(key =FILTER_TAGS_PROPERTY_NAME, value = "@smoke or @smoke1")
@ConfigurationParameter(key = PLUGIN_PUBLISH_QUIET_PROPERTY_NAME, value = "true")
//@ConfigurationParameter(key=PLUGIN_PROPERTY_NAME, value = "json:target/Cucumber.json")
//@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "json")
//@RunWith(Cucumber.class)
//@CucumberOptions(
//        plugin = {"pretty","html:target/html"}
//)
public class RunCucumberTest {
}
