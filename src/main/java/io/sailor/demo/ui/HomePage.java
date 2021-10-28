package io.sailor.demo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target CATEGORY=Target.the("Label Cateogory").locatedBy("//*[@id='header']//a[.='{0}']");
    public static final Target SUBCATEGORY=Target.the("Label SubCateogory").locatedBy("//*[@id='header']//a[.='{0}']");

}
