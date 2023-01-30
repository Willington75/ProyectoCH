package com.demo.serenity.is.testing.register.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = "pretty",
        glue = "com.demo.serenity.is.testing.register.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags ="@Login",
        publish = true,
        features = "src/test/resources/login.feature"
)

public class LoginRunner {
}
