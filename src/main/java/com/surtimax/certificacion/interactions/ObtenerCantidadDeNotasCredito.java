package com.surtimax.certificacion.interactions;

import com.surtimax.certificacion.exceptions.ObtenerCantidadDeNotasCreditoException;
import com.surtimax.certificacion.interactions.choucair.TakeScreenshot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;

import static com.surtimax.certificacion.ui.UiAgregarNotaCredito.LBL_CANTIDAD_DE_NOTAS_CREDITO;
import static com.surtimax.certificacion.utils.Contantes.CANTIDAD_NOTAS_CREDITO;

public class ObtenerCantidadDeNotasCredito implements Interaction {

    public ObtenerCantidadDeNotasCredito() {
    }

    public static ObtenerCantidadDeNotasCredito paraValidarCreacion(){
        return Tasks.instrumented(ObtenerCantidadDeNotasCredito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            CANTIDAD_NOTAS_CREDITO = Integer.parseInt(Text.of(LBL_CANTIDAD_DE_NOTAS_CREDITO).viewedBy(actor).asString());
            actor.attemptsTo(
                    TakeScreenshot.asEvidence()
            );
        }catch (RuntimeException eX){
            throw new ObtenerCantidadDeNotasCreditoException(ObtenerCantidadDeNotasCreditoException.Error(),eX);
        }

    }
}