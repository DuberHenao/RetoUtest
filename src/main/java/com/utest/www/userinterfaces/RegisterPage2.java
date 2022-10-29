package com.utest.www.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage2 {
    public static final Target CITY = Target.the("City")
            .located(By.id("city"));
    public static final Target ZIP = Target.the("zip")
            .located(By.id("zip"));
    public static final Target COUNTRY = Target.the("Country")
            .located(By.name("countryId"));
    public static final Target SELECTCOUNTRY = Target.the("Select Country")
            .located(By.xpath("//*[@id='ui-select-choices-row-2-51']/span/div"));
    public static final Target BUTTONNEXT2 = Target.the("Button next 2")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}
