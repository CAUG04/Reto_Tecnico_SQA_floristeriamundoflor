package com.floristeriamundoflor.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductDetailsPage {
    public static final Target ADD_BUTTON = Target.the("ProductWas Button").locatedBy("//*[@id=\"product-4100\"]/div/div[2]/div/form/button");
    public static final Target CATEGORIES_AMOR = Target.the("Categories Amor").locatedBy("//*[@id=\"primary-menu\"]/li[3]/a");
    public static final Target ADD_BUTTON_1 = Target.the("ProductWas Button_1").locatedBy("//*[@id=\"product-4100\"]/div/div[2]/div/form/button");
    public static final Target CART = Target.the("Cart").locatedBy("//*[@id=\"cart\"]/a");
    public static final Target VIEW_CART = Target.the("Cart").locatedBy("//*[@id=\"cart\"]/div/div/div/div/div/p[2]/a[1]");
}
