package com.demo.serenity.is.testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.demo.serenity.is.testing.ui.AutomationTestingPages.*;
import static com.demo.serenity.is.testing.util.User.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class DoLoginTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        WaitUntil.the(USERNAME, isVisible());
        actor.wasAbleTo(Enter.theValue(FULL_NAME2.getValue()).into(USERNAME),
                Enter.theValue(PASSWORD2.getValue()).into(LOGIN_PASSWORD));
        actor.attemptsTo(Click.on(CLICK_SIGN_IN));
        WaitUntil.the(CLICK_USER, isVisible());
        actor.attemptsTo(Click.on(CLICK_USER));
    }

    public static DoLoginTask doLogin() {
        return Tasks.instrumented(DoLoginTask.class);
    }
}

