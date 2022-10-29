package com.utest.www.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class WelcomePage {
    public static final Target WELCOMEMESAGGE = Target.the("Welcome Mesagge")
            .located(By.xpath("//*[@id='mainContent']/div/div/div[1]/div/h1"));
}
