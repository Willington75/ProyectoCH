package com.demo.serenity.is.testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.demo.serenity.is.testing.ui.AutomationTestingPages.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VerifyRegisterQuestion implements Question <String>{

    @Override
    public String answeredBy(Actor actor) {
        return null;
    }

    public static Question<String> verifyRegisterQuestion(){

        WaitUntil.the(VALID_ACTIVATE, isVisible());
        return actor -> VALID_ACTIVATE.resolveFor(actor).getTextValue();

    }

}
