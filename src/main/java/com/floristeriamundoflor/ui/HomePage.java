package com.floristeriamundoflor.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target CATEGORIES = Target.the("Label Category").locatedBy("//*[@id=\"primary-menu\"]/li[3]/a");
}
