package io.sailor.demo.taks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.MoveMouseToTarget;

import java.util.List;
import java.util.Map;

import static io.sailor.demo.ui.HomePage.CATEGORY;
import static io.sailor.demo.ui.HomePage.SUBCATEGORY;
import static io.sailor.demo.ui.ProductListPage.PRODUCT;

public class Select implements Task {
    DataTable data;

    public Select(DataTable data) {
        this.data = data;
    }

    public static Select theProduct(DataTable data) {

        return Tasks.instrumented(Select.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String,String>> values =data.asMaps(String.class,String.class);
        actor.attemptsTo(
                MoveMouse.to(CATEGORY.of(String.valueOf(values.get(0).get("category"))).resolveFor(actor)),
                Click.on(SUBCATEGORY.of(String.valueOf(values.get(0).get("subcategory"))).resolveFor(actor)),
                Click.on(PRODUCT.of(String.valueOf(values.get(0).get("product"))).resolveFor(actor))
        );
    }
}
