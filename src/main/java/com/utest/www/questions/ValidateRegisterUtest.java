package com.utest.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateRegisterUtest implements Question<String> {

    private Target target;

    public ValidateRegisterUtest(Target target) {
        this.target = target;
    }

    public static ValidateRegisterUtest validateRegister(Target target) {
        return new ValidateRegisterUtest(target);
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(target).viewedBy(actor).asString();
    }
}
