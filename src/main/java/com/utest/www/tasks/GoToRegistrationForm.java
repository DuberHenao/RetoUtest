package com.utest.www.tasks;

import com.utest.www.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GoToRegistrationForm implements Task {
    public GoToRegistrationForm() {
    }
    public static GoToRegistrationForm register(){
        return Tasks.instrumented(GoToRegistrationForm.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BUTTONJOINTODAY));
    }

}
