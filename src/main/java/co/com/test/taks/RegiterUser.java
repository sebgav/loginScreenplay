package co.com.test.taks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.test.ui.Home.SING_IN;
import static co.com.test.ui.PasswordLoginPage.TXT_PASSWORD;
import static co.com.test.ui.UserLoginPage.BTN_SIGUIENTE_USER;
import static co.com.test.ui.UserLoginPage.TXT_USERNAME;

public class RegiterUser implements Task {

    String user ;

    public RegiterUser(String user) {
        this.user = user;
    }

    public static RegiterUser login(String user) {
        return Tasks.instrumented(RegiterUser.class,user        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SING_IN),
                Enter.theValue(user).into(TXT_USERNAME),
                Click.on(BTN_SIGUIENTE_USER)
        );

    }
}
