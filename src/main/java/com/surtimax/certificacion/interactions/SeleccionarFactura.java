package com.surtimax.certificacion.interactions;

import com.surtimax.certificacion.exceptions.SeleccionarFacturaException;
import com.surtimax.certificacion.interactions.choucair.TakeScreenshot;
import com.surtimax.certificacion.interactions.choucair.Tap;
import com.surtimax.certificacion.models.NotaCreditoModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.surtimax.certificacion.ui.UiCliente.BTN_NOTAS_CREDITO;
import static com.surtimax.certificacion.ui.UiNotasCredito.LBL_FACTURA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarFactura implements Interaction {

    private NotaCreditoModel notaCreditoModel;

    public SeleccionarFactura(NotaCreditoModel notaCreditoModel) {
        this.notaCreditoModel = notaCreditoModel;
    }

    public static SeleccionarFactura paraNotaDeCredito(NotaCreditoModel notaCreditoModel){
        return Tasks.instrumented(SeleccionarFactura.class,notaCreditoModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(
                    WaitUntil.the(BTN_NOTAS_CREDITO, WebElementStateMatchers.isEnabled()).forNoMoreThan(7).seconds(),
                    Tap.on(BTN_NOTAS_CREDITO),
                    WaitUntil.the(String.format(LBL_FACTURA,notaCreditoModel.getNroFactura()),isVisible()),
                    Click.on(String.format(LBL_FACTURA,notaCreditoModel.getNroFactura())),
                    TakeScreenshot.asEvidence()
            );
        }catch (RuntimeException eX){
            throw new SeleccionarFacturaException(SeleccionarFacturaException.Error(),eX);
        }
    }
}