package com.demo.serenity.is.testing.register.stepdefinitions;


import com.demo.serenity.is.testing.questions.VisualizeNameQuestion;
import com.demo.serenity.is.testing.tasks.DoLoginTask;
import com.demo.serenity.is.testing.tasks.OpenUserTask;
import com.demo.serenity.is.testing.ui.AutomationTestingPages;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import static com.demo.serenity.is.testing.util.User.FULL_NAME2;
import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;


public class LoginStepDefinition extends PageObject {

    @Managed(clearCookies = BeforeEachTest)
    WebDriver driver = getDriver();

    private final Actor robot = Actor.named("Robot");

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        robot.can(BrowseTheWeb.with(driver));
    }

    @Given("User want login user to service")
    public void userWantLoginUserToService() {
        robot.wasAbleTo(OpenUserTask.abrirPaginaWeb());
    }

    @When("The user inputs data for login")
    public void theUserInputsDataForLogin() {
        robot.attemptsTo(DoLoginTask.doLogin());
    }

    @Then("User visualize his name in the page")
    public void userVisualizeHisNameInThePage() {
        robot.attemptsTo(WaitUntil.the(AutomationTestingPages.CLICK_USER, WebElementStateMatchers.isCurrentlyVisible()));
        String User = FULL_NAME2.getValue();
        robot.should(GivenWhenThen.seeThat(VisualizeNameQuestion.visualizeNameQuestion(),
                Matchers.equalTo(User)));



    }
}
