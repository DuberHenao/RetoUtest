package com.utest.www.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.utest.www.stepdefinitions",
        features = "src/test/resources/features/registerutest.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerUtest {
}
