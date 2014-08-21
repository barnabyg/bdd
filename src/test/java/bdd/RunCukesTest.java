package bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Hook in to cucumber-jvm.
 * When this class is instantiated it start up Cucumber and
 * goes looking for feature files in either the default location or
 * a specified location.
 *
 * CucumberOptions allow us to run some or all tests using 'tags'.
 * To use a tag, include the following in @CucumberOptions
 * tags={"@some-tag"}
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}, monochrome = true)
public final class RunCukesTest {

}
