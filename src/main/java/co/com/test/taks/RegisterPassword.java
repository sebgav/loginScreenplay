package co.com.test.taks;

import co.com.test.ui.PasswordLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.test.ui.PasswordLoginPage.*;
import static co.com.test.ui.PasswordLoginPage.BTN_SIGUIENTE;
import static co.com.test.ui.PasswordLoginPage.TXT_PASSWORD;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegisterPassword implements Task {

    String password;

    public RegisterPassword(String password) {
        this.password = password;
    }

    public static RegisterPassword login(String password) {
        return Tasks.instrumented(RegisterPassword.class,password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(password.equals("-"))
        {
            actor.attemptsTo(
                    WaitUntil.the(BTN_SIGUIENTE,isVisible()).forNoMoreThan(10).seconds()

            );
            actor.attemptsTo(
                    Click.on(TXT_PASSWORD),
                    Click.on(BTN_SIGUIENTE)
            );

        }
        else {
            actor.attemptsTo(
                    Click.on(TXT_PASSWORD),
                    Enter.theValue(password.trim()).into(TXT_PASSWORD),
                    Click.on(BTN_SIGUIENTE)
            );
        }
        actor.remember("password",password);


    }
}
