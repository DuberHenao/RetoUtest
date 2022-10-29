package com.utest.www.stepdefinitions;

import com.utest.www.questions.ValidateRegisterUtest;
import com.utest.www.tasks.FillRegisterForm;
import com.utest.www.tasks.GoToRegistrationForm;
import com.utest.www.tasks.NavigateTo;
import com.utest.www.userinterfaces.HomePage;
import com.utest.www.userinterfaces.WelcomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class StepDefinitionsRegisterUtest {

    @Managed(driver = "chrome")
    private WebDriver web;
    private Actor actor = Actor.named("Duber");

    private HomePage home;

    @Before
    public void setUp() {
        web.manage().window().maximize();
        actor.can(BrowseTheWeb.with(web));
    }
    @Given("Go to Utest page")
    public void goToUtestPage() {
        actor.wasAbleTo(NavigateTo.on(home));
    }
    @When("Fill in the form with the data")
    public void fillInTheFormWithTheData(List<Map<String, String>> registerForm) {
        Map<String, String> registerData = registerForm.get(0);
        actor.attemptsTo(GoToRegistrationForm.register(),
                FillRegisterForm.fillData(registerData.get("firstname"),registerData.get("lastname"),registerData.get("email"),registerData.get("city"),registerData.get("zip"),registerData.get("password"),registerData.get("password")));

    }
    @Then("Verify user registration")
    public void verifyUserRegistration() {
        actor.should(seeThat(ValidateRegisterUtest.validateRegister(WelcomePage.WELCOMEMESAGGE),
                equalTo("Welcome to the world's largest community of freelance software testers!")));
    }
}
