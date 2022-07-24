package co.com.test.questions;

import co.com.test.ui.EmailPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.test.ui.EmailPage.BTN_COUNT_MAIL;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginMailWas implements Question {


    @Override
    public Boolean answeredBy(Actor actor) {


        WaitUntil.the(BTN_COUNT_MAIL,isVisible());
        actor.attemptsTo(
                Ensure.that(BTN_COUNT_MAIL).attribute("aria-label").contains("josgavir")
        );
        return true;
    }

    public static LoginMailWas In() {
        return new LoginMailWas();
    }
}
