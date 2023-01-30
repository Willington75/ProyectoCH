package com.demo.serenity.is.testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.demo.serenity.is.testing.ui.AutomationTestingPages.VALID_USER;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class VisualizeNameQuestion implements Question <String>{

    @Override
    public String answeredBy(Actor actor) {
        return null;
    }

    public static Question<String> visualizeNameQuestion(){

        WaitUntil.the(VALID_USER, isVisible()).forNoMoreThan(10).seconds();
        return actor -> VALID_USER.resolveFor(actor).getTextValue();

    }
}
