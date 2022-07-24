package co.com.test.ui;

import net.serenitybdd.screenplay.targets.Target;

public class UserLoginPage {
    public static final Target TXT_USERNAME =Target.the("txt username").locatedBy("//input[@id='identifierId']");
    public static final Target BTN_SIGUIENTE_USER =Target.the("txt siguiente").locatedBy("//button//*[text()='Siguiente']");


}
