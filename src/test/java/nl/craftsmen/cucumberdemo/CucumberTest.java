package nl.craftsmen.cucumberdemo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        plugin = {"pretty", "html:target/cucumber-reports",
                "json:target/cucumber.json"
        },
        tags = "@MP3POC"


)

public class CucumberTest {
}
