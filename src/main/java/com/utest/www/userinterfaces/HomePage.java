package com.utest.www.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://utest.com")
public class HomePage extends PageObject {
    public static final Target BUTTONJOINTODAY = Target.the("BUTTON JOIN TODAY")
            .located(By.className("unauthenticated-nav-bar__sign-up"));

}
