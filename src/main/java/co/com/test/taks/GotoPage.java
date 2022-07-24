package co.com.test.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class GotoPage implements Task {
    public static GotoPage theMail() {
      return   Tasks.instrumented(GotoPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.google.com/intl/es-419/gmail/about/")
        );
    }


}
