package co.com.test.ui;

import net.serenitybdd.screenplay.targets.Target;

public class Home {
    public static final Target SING_IN = Target.the("boton sing in").locatedBy("//a[@data-action='sign in']");
}
