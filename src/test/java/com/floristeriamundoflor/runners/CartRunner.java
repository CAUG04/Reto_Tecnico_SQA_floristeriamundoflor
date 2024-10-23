package com.floristeriamundoflor.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"com.floristeriamundoflor.stepdefinitions"},
        features = "src/test/resources/features/cart.feature",
        tags = "",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CartRunner {
}
