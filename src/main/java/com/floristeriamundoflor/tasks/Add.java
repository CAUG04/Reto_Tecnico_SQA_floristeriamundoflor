package com.floristeriamundoflor.tasks;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebDriver;

import static com.floristeriamundoflor.ui.ProductDetailsPage.*;

public class Add implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ADD_BUTTON),
                Click.on(CATEGORIES_AMOR),
                Click.on(ADD_BUTTON_1),
                Click.on(CART),
                Click.on(VIEW_CART)
        );
    }

    public static Add theProductWithThe() {
        return Tasks.instrumented(Add.class);
    }
}
