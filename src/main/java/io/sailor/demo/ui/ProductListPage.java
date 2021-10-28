package io.sailor.demo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductListPage {
    public static final Target PRODUCT=Target.the("label product").
            locatedBy("//h4[@data-test='productTile' and .='{0}']");
}
