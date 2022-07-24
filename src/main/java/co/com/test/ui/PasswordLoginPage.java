package co.com.test.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PasswordLoginPage {
    public static final Target TXT_PASSWORD =Target.the("password login").locatedBy("//input[@name='password']");
    public static final Target BTN_SIGUIENTE = Target.the("boton siguiente en password").locatedBy("//button//*[text()='Siguiente']");

    public static final Target LBL_WITHOUT_PASSWORD_MSG =Target.the("label de mensaje cuando falta ingresar passwor").locatedBy("//*[text()='Ingresar una contraseña']");

    public static final Target LBL_WITH_PASSWORDBAD_MSG =Target.the("label de mensaje con password incorrecto").locatedBy("//*[contains(text(),'incorrecta')]");




}
