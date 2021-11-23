package io.sailor.demo.taks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static io.sailor.demo.ui.ProductDetail.*;

public class Add implements Task {
    DataTable data;

    public Add(DataTable data) {
        this.data = data;
    }

    public static Add theProductoWithThe(DataTable data) {
       return Tasks.instrumented(Add.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String,String>> values=data.asMaps(String.class,String.class );
        String[] keys =(String[]) values.get(0).keySet().toArray(new String[0]);
        if (!actor.recall("subcategory").equals("Alcohol"))
        {
            actor.attemptsTo(

                    Click.on(SIZE_TYPE.of(values.get(0).get("sizeType"))),

                    Click.on(SIZE.of(values.get(0).get("size"))));
            actor.remember("sizeType",values.get(0).get("sizeType"));
            actor.remember("size",values.get(0).get("size"));

        }
            actor.attemptsTo(

                Enter.theValue(values.get(0).get("quantity")).into(QUANTITY.of(keys[2])),
                Click.on(ADD_BUTTON)
        );
        if (values.get(0).get("discount").equals("yes"))
        {
            actor.remember("price",PRICE_WITH_DISCOUNT.resolveFor(actor).getText());
        }
        else
        {
            actor.remember("price",PRICE.resolveFor(actor).getText());
        }

    }
}
