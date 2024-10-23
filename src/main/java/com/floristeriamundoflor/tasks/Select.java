package com.floristeriamundoflor.tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;
import java.util.Map;

import static com.floristeriamundoflor.ui.HomePage.CATEGORIES;
import static com.floristeriamundoflor.ui.ProductListPage.PRODUCT;
import static com.floristeriamundoflor.ui.ProductListPage.PRODUCT_1;

public class Select implements Task {

    private DataTable data;

    public Select(DataTable data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String, String>> values = data.asMaps(String.class, String.class);
        actor.attemptsTo(
                Click.on(CATEGORIES.of(String.valueOf(values.get(0).get("categories"))).resolveFor(actor)),
                Click.on(PRODUCT.of(String.valueOf(values.get(0).get("product"))).resolveFor(actor)),
                Click.on(PRODUCT_1.of(String.valueOf(values.get(0).get("product_1"))).resolveFor(actor))

        );
        actor.remember("product", values.get(0).get("product"));
        actor.remember("product_1", values.get(0).get("product_1"));
    }

    public static Select theProductWithThe(DataTable data) {
        return Tasks.instrumented(Select.class, data);
    }
}
