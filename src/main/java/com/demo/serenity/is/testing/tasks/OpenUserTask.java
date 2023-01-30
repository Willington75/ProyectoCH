package com.demo.serenity.is.testing.tasks;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUserTask {


    public static Performable abrirPaginaWeb() {
        return Task.where("el usuario desea abrir el navegador", Open.browserOn().the(Homepage.class));
    }

}

