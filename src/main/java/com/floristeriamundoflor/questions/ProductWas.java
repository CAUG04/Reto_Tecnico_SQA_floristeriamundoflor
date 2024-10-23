package com.floristeriamundoflor.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.floristeriamundoflor.ui.CartPage.PRODUCT_NAME_ON_CART;
import static com.floristeriamundoflor.ui.CartPage.PRODUCT_NAME_ON_CART_1;

public class ProductWas implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Ensure.that(PRODUCT_NAME_ON_CART).hasText(actor.recall("product"));
        Ensure.that(PRODUCT_NAME_ON_CART_1).hasText(actor.recall("product_1"));
        return true;
    }

    public static ProductWas Added() {
        return new ProductWas();
    }
}
