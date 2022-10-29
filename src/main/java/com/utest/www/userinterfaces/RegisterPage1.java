package com.utest.www.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage1 {
    public static final Target FIRSTNAME = Target.the("First Name")
            .located(By.id("firstName"));
    public static final Target LASTNAME = Target.the("Last Name")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Email")
            .located(By.id("email"));
    public static final Target MONTH = Target.the("Month Birth")
            .located(By.id("birthMonth"));
    //public static final Target DAY = Target.the("Day Birth")
    //        .located(By.id("birthDay"));
    public static final Target YEAR = Target.the("Year Birth")
            .located(By.id("birthYear"));
    public static final Target BUTTONNEXT = Target.the("Button Next")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target SELECTDAY = Target.the("Button Next")
            .located(By.xpath("//*[@id='birthDay']/option[5]"));
    public static final Target SELECTMONTH = Target.the("Button Next")
            .located(By.xpath("//*[@id='birthMonth']/option[3]"));

    public static final Target SELECTYEAR = Target.the("Button Next")
            .located(By.xpath("//*[@id='birthYear']/option[5]"));


}
