package FeatureRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/FeatureFiles", glue = {"Steps"},
		monochrome = true,
		plugin = { "pretty", "html:target/HtmlReport","json:target/JsonReport.json" },
		tags = "@login"
		
		)

public class Runner {

}
