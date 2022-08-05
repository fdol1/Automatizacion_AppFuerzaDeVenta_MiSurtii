package com.surtimax.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.surtimax.certificacion.ui.UiAgregarNotaCredito.LBL_CANTIDAD_DE_NOTAS_CREDITO;
import static com.surtimax.certificacion.utils.Contantes.CANTIDAD_NOTAS_CREDITO;

public class VerificarCreacionDeNotaCredito implements Question<Boolean> {

    public VerificarCreacionDeNotaCredito() {}

    public  static VerificarCreacionDeNotaCredito enPantalla(){
        return new VerificarCreacionDeNotaCredito();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(
                WaitUntil.the(LBL_CANTIDAD_DE_NOTAS_CREDITO, WebElementStateMatchers.isEnabled()).forNoMoreThan(8).seconds()
        );
        return (CANTIDAD_NOTAS_CREDITO + 1) == Integer.parseInt(Text.of(LBL_CANTIDAD_DE_NOTAS_CREDITO).viewedBy(actor).asString());
    }
}