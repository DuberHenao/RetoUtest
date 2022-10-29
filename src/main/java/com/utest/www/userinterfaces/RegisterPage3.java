package com.utest.www.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage3 {

    public static final Target YOURCOMPUTER = Target.the("Your Computer")
            .located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/div[1]"));
    public static final Target SElECTYOURCOMPUTER = Target.the("Select Your Computer")
            .located(By.xpath("//*[@id='ui-select-choices-row-3-1']/span/div"));
    public static final Target VERSION = Target.the("Version of computer")
            .located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/div[1]"));
    public static final Target SELECTVERSION = Target.the("Select Version of computer")
            .located(By.xpath("//*[@id='ui-select-choices-row-4-15']/span/div"));
    public static final Target LANGUAGE = Target.the("Lenguage")
            .located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/div[1]"));
    public static final Target SELECTLANGUAGE = Target.the("Select Lenguage")
            .located(By.xpath("//*[@id='ui-select-choices-row-5-37']/span/div"));
    public static final Target YOURMOBILEDEVICE = Target.the("Your Mobile Device")
            .located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/div[1]"));
    public static final Target SELECTYOURMOBILEDEVICE = Target.the("Select Your Mobile Device")
            .located(By.xpath("//*[@id='ui-select-choices-row-6-2']/span/div"));
    public static final Target MODEL = Target.the("Model of Mobil")
            .located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/div[1]"));
    public static final Target SELECTMODEL = Target.the("Select Model of Mobil")
            .located(By.xpath("//*[@id='ui-select-choices-row-7-9']/span/div"));
    public static final Target OPERATINGSYSTEM = Target.the("Operating system of Mobil")
            .located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]"));
    public static final Target SELECTOPERATINGSYSTEM = Target.the("Select Operating system of Mobil")
            .located(By.xpath("//*[@id='ui-select-choices-row-8-4']/span/div"));
    public static final Target BUTTONNEXT3 = Target.the("Button next page 3")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/a"));
}
