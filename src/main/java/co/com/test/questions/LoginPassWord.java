package co.com.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.test.ui.PasswordLoginPage.LBL_WITHOUT_PASSWORD_MSG;
import static co.com.test.ui.PasswordLoginPage.LBL_WITH_PASSWORDBAD_MSG;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginPassWord implements Question {
    public static LoginPassWord Bad() {
        return new LoginPassWord();

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if (actor.recall("password").toString().trim().equals("-"))
        {
            WaitUntil.the(LBL_WITHOUT_PASSWORD_MSG,isVisible());
            actor.attemptsTo(
                    Ensure.that(LBL_WITHOUT_PASSWORD_MSG).hasText("Ingresar una contraseña")
            );
        }
        else {
            WaitUntil.the(LBL_WITH_PASSWORDBAD_MSG,isVisible());
            actor.attemptsTo(
                    Ensure.that(LBL_WITH_PASSWORDBAD_MSG).textContent().contains("La contraseña es incorrecta")

            );


        }

        return true;
    }
}
