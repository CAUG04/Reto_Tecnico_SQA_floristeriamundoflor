package com.floristeriamundoflor.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
    public static final Target PRODUCT_NAME_ON_CART = Target.the("Name of product on cart").locatedBy("//*[@id=\"main\"]/div/div/div/div[2]/div/div/div/div[2]/form/div/table/tbody/tr[1]/td[2]/a");
    public static final Target PRODUCT_NAME_ON_CART_1 = Target.the("Name of product on cart_1").locatedBy("//*[@id=\"main\"]/div/div/div/div[2]/div/div/div/div[2]/form/div/table/tbody/tr[1]/td[2]/a");

}
