package com.demo.serenity.is.testing.register.stepdefinitions;

import com.demo.serenity.is.testing.questions.VerifyRegisterQuestion;
import com.demo.serenity.is.testing.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;



public class RegisterStepDefinition extends PageObject{

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        Willy.can(BrowseTheWeb.with(getDriver()));
}

    private final Actor Willy = Actor.named("Willy");

    @Given("User open the page startsharp")
    public void registro () {
        Willy.wasAbleTo(OpenUserTask.abrirPaginaWeb());
    }

    @When("Click in the link 'Registrar una cuenta nueva'")
    public void theUserPerformsClickOnLink() {
        Willy.attemptsTo(CreateNewAccountTask.doClick());
    }

    @And("User fills out formulary")
    public void UserfillsUOutFormulary() {
        Willy.attemptsTo(WriteFormTask.data());
    }

    @Then("User can validate his activate account")
    public void theUserValidatesAuthentication() {
        String textWell = "Information\nYour account is now activated. Use the e-mail and password you used while signing up to login.";
        Willy.should(GivenWhenThen.seeThat(VerifyRegisterQuestion.verifyRegisterQuestion(),
                Matchers.equalTo(textWell)));
    }

}



