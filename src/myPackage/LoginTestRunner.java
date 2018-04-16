package myPackage;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions (
	monochrome = true,
	features = "src/myPackage",
	plugin = {"pretty", "html:target/cucmber-html-report"}
)

public class LoginTestRunner {

	
	
}
