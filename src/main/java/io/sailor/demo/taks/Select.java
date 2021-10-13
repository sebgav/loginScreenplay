package io.sailor.demo.taks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;
import java.util.Map;

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
        //values.get(0).get("category");
        actor.attemptsTo(

        );
    }
}
