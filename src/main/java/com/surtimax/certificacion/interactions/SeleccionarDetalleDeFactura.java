package com.surtimax.certificacion.interactions;

import com.surtimax.certificacion.exceptions.SeleccionarDetalleFacturaException;
import com.surtimax.certificacion.interactions.choucair.TakeScreenshot;
import com.surtimax.certificacion.interactions.choucair.Tap;
import com.surtimax.certificacion.models.NotaCreditoModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.surtimax.certificacion.ui.UiDetalleDeFactura.BTN_APLICAR_BUSCQUEDA;
import static com.surtimax.certificacion.ui.UiDetalleDeFactura.TXT_BUSQUEDA;

public class SeleccionarDetalleDeFactura implements Interaction {

    private final NotaCreditoModel notaCreditoModel;

    public SeleccionarDetalleDeFactura(NotaCreditoModel notaCreditoModel) {
        this.notaCreditoModel = notaCreditoModel;
    }

    public static SeleccionarDetalleDeFactura paraNotaDeCredito(NotaCreditoModel notaCreditoModel){
        return Tasks.instrumented(SeleccionarDetalleDeFactura.class, notaCreditoModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(
                    WaitUntil.the(TXT_BUSQUEDA, WebElementStateMatchers.isEnabled()).forNoMoreThan(7).seconds(),
                    Enter.theValue(notaCreditoModel.getNroDetalle()).into(TXT_BUSQUEDA),
                    Tap.on(BTN_APLICAR_BUSCQUEDA),
                    Tap.on(358,315),
                    TakeScreenshot.asEvidence()
            );
        }catch (RuntimeException eX){
            throw new SeleccionarDetalleFacturaException(SeleccionarDetalleFacturaException.Error(),eX);
        }
    }
}