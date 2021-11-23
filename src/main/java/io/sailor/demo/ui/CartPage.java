package io.sailor.demo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
    public static final Target PRODUCT_NAME_CART=Target.the("NAME OF PRODUCT CART").locatedBy("//p[@data-test='itemName']");

    public static final Target PRODUCT_PRICE_CART=Target.the("PRICE OF PRODUCT CART").locatedBy("//p[@data-test='unitPrice']");

    public static final Target PRODUCT_SIZE_CART=Target.the("PRICE OF PRODUCT CART").locatedBy("//div[@data-test='cartOverlay']//span[@data-test='itemSingleAttribute']");



}
