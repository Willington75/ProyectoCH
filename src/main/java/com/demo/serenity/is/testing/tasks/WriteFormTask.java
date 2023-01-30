package com.demo.serenity.is.testing.tasks;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.demo.serenity.is.testing.ui.AutomationTestingPages.*;
import static com.demo.serenity.is.testing.util.User.CONFIRM_EMAIL;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static com.demo.serenity.is.testing.util.User.*;

public class WriteFormTask implements Task {
    public static WriteFormTask data() {
        return Tasks.instrumented(WriteFormTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(REGISTER_ACCOUNT,isVisible());
        actor.wasAbleTo(Enter.theValue(FULL_NAME.getValue()).into(INP_FULLNAME));
        actor.attemptsTo(Enter.theValue(EMAIL.getValue()).into(INP_EMAIL),
                Enter.theValue(CONFIRM_EMAIL.getValue()).into(CONFIRM_EMAIL1),
                Enter.theValue(PASSWORD.getValue()).into(INP_PASSW),
                Enter.theValue(CONFIRM_PASSWORD.getValue()).into(CONFIRM_PASSW));
                BrowseTheWeb.as(actor).evaluateJavascript("window.scrollBy(0," + 350 + ")", "");
                actor.attemptsTo(
                Click.on(BTN_INGRESAR),
                Click.on(CLICK_OK));
    }
}
