package io.sailor.demo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static io.sailor.demo.ui.CartPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class ProductWas implements Question <Boolean>{
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(PRODUCT_NAME_CART,isVisible());
        if (!actor.recall("subcategory").equals("Alcohol"))
        {
            actor.attemptsTo(
                    WaitUntil.the(PRODUCT_NAME_CART,isVisible()).forNoMoreThan(45).seconds(),

            Ensure.that(PRODUCT_NAME_CART).hasText(actor.recall("product")),
                    Ensure.that(PRODUCT_PRICE_CART).hasText(actor.recall("price")),
                    Ensure.that(PRODUCT_SIZE_CART).hasText(actor.recall("sizeType").toString().concat(": ").concat(actor.recall("size")))
            );
        }
        else
        {
            actor.attemptsTo(
                    WaitUntil.the(PRODUCT_NAME_CART,isVisible()).forNoMoreThan(45).seconds(),

                    Ensure.that(PRODUCT_NAME_CART).hasText(actor.recall("product")),
                    Ensure.that(PRODUCT_PRICE_CART).hasText(actor.recall("price"))
            );

        }



        return true;
    }

    public static ProductWas Added()
    {
        return new ProductWas();
    }


}
