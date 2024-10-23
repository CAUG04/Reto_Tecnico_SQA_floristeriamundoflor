package com.floristeriamundoflor.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductListPage {
    public static final Target PRODUCT = Target.the("Label Product").locatedBy("//*[@id=\"content\"]/div[2]/div/div[1]/div/div[2]/div/div/h3/a");
    public static final Target PRODUCT_1 = Target.the("Label Product_1").locatedBy("//*[@id=\"content\"]/div[2]/div/div[2]/div/div[2]/div/div/h3/a");

}
