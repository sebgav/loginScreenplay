package io.sailor.demo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductDetail {
    public static final Target SIZE_TYPE =
            Target.the("Type of size").locatedBy("//label[text()='{0}']//preceding::input");

    public static final Target SIZE =
            Target.the("Size").locatedBy("//div[@data-test='attributeOption' and text()='{0}']");

    public static final Target QUANTITY=
            Target.the("Quantity").locatedBy("//input[@name='{0}']");

    public static final Target ADD_BUTTON=
            Target.the("ADD_BUTTON").locatedBy("//button[@data-test=\"addProductToCartButton\"]");

    public static final Target PRICE=
            Target.the("price whitout discount").locatedBy("//*[@class='product-page__product__info--fixed']//h4/span[1]");

    public static final Target PRICE_WITH_DISCOUNT=
            Target.the("price whit discount").locatedBy("//*[@class='product-page__product__info--fixed']//h4/span[2]");
}
