package com.utest.www.tasks;

import com.utest.www.userinterfaces.RegisterPage1;
import com.utest.www.userinterfaces.RegisterPage2;
import com.utest.www.userinterfaces.RegisterPage3;
import com.utest.www.userinterfaces.RegisterPage4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.internal.MouseAction;


public class FillRegisterForm implements Task {
    private String firstName = "";
    private String lastName = "";
    private String email = "";
    private String city = "";
    private String zip = "";
    private String password = "";
    private String passwordConfirm = "";

    public FillRegisterForm(String firstName, String lastName, String email, String city, String zip, String password, String passwordConfirm) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.city = city;
        this.zip = zip;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
    }
    public static FillRegisterForm fillData(String firstName, String lastName, String email, String city, String zip, String password, String passwordConfirm){
        return Tasks.instrumented(FillRegisterForm.class,firstName,lastName,email,city,zip,password,passwordConfirm);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(firstName).into(RegisterPage1.FIRSTNAME),
                Enter.theValue(lastName).into(RegisterPage1.LASTNAME),
                Enter.theValue(email).into(RegisterPage1.EMAIL),
                Click.on(RegisterPage1.MONTH),
                Click.on(RegisterPage1.SELECTMONTH),
                //Click.on(RegisterPage1.DAY),
                Click.on(RegisterPage1.SELECTDAY),
                Click.on(RegisterPage1.YEAR),
                Click.on(RegisterPage1.SELECTYEAR),
                Click.on(RegisterPage1.BUTTONNEXT),
                Enter.theValue(city).into(RegisterPage2.CITY),
                Enter.keyValues(Keys.ARROW_DOWN).into(RegisterPage2.CITY),
                Enter.keyValues(Keys.ENTER).into(RegisterPage2.CITY),
                Enter.theValue(zip).into(RegisterPage2.ZIP),
                Click.on(RegisterPage2.COUNTRY),
                Click.on(RegisterPage2.SELECTCOUNTRY),
                Click.on(RegisterPage2.BUTTONNEXT2),
                Click.on(RegisterPage3.YOURCOMPUTER),
                Click.on(RegisterPage3.SElECTYOURCOMPUTER),
                Click.on(RegisterPage3.VERSION),
                Click.on(RegisterPage3.SELECTVERSION),
                Click.on(RegisterPage3.LANGUAGE),
                Click.on(RegisterPage3.SELECTLANGUAGE),
                Click.on(RegisterPage3.YOURMOBILEDEVICE),
                Click.on(RegisterPage3.SELECTYOURMOBILEDEVICE),
                Click.on(RegisterPage3.MODEL),
                Click.on(RegisterPage3.SELECTMODEL),
                Click.on(RegisterPage3.OPERATINGSYSTEM),
                Click.on(RegisterPage3.SELECTOPERATINGSYSTEM),
                Click.on(RegisterPage3.BUTTONNEXT3),
                Enter.theValue(password).into(RegisterPage4.PASSWORD),
                Enter.theValue(passwordConfirm).into(RegisterPage4.CONFIRMPASSWORD),
                Click.on(RegisterPage4.ACCEPTTERMS),
                Click.on(RegisterPage4.ACCEPTPRIVACY),
                Click.on(RegisterPage4.BUTTONCOMPLETE));

    }
}
