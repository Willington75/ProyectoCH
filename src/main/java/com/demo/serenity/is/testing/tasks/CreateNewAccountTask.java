package com.demo.serenity.is.testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.demo.serenity.is.testing.ui.AutomationTestingPages.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreateNewAccountTask implements Task {
    public static CreateNewAccountTask doClick() {
        return Tasks.instrumented(CreateNewAccountTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(BTN_REGISTER, isVisible());
        actor.attemptsTo(Click.on(BTN_REGISTER));
    }
}

