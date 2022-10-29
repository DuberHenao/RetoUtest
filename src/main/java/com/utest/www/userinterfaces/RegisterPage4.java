package com.utest.www.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage4 {
    public static final Target PASSWORD = Target.the("Password")
            .located(By.id("password"));
    public static final Target CONFIRMPASSWORD = Target.the("Confirm Password")
            .located(By.id("confirmPassword"));
    public static final Target ACCEPTTERMS = Target.the("Accept terms of Use uTest")
            .located(By.id("termOfUse"));
    public static final Target ACCEPTPRIVACY = Target.the("Accept Privacy and Secury Policy of uTest")
            .located(By.id("privacySetting"));
    public static final Target BUTTONCOMPLETE = Target.the("Button complete of register form")
            .located(By.id("laddaBtn"));


}
