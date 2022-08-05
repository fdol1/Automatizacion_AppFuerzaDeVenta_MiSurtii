package com.surtimax.certificacion.interactions;

import com.surtimax.certificacion.exceptions.AgregarNotaCreditoException;
import com.surtimax.certificacion.interactions.choucair.TakeScreenshot;
import com.surtimax.certificacion.interactions.choucair.Tap;
import com.surtimax.certificacion.models.NotaCreditoModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.surtimax.certificacion.ui.UiAgregarNotaCredito.*;

public class AgregarNotaCredito implements Task {

    private final NotaCreditoModel notaCreditoModel;

    public AgregarNotaCredito(NotaCreditoModel notaCreditoModel) {
        this.notaCreditoModel = notaCreditoModel;
    }

    public static AgregarNotaCredito aLaFacturaDeVenta(NotaCreditoModel notaCreditoModel){
        return Tasks.instrumented(AgregarNotaCredito.class,notaCreditoModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(
                    WaitUntil.the(LBL_CANTIDAD_DE_NOTAS_CREDITO, WebElementStateMatchers.isVisible()).forNoMoreThan(7).seconds(),
                    ObtenerCantidadDeNotasCredito.paraValidarCreacion(),
                    Tap.on(BTN_CREAR_NOTA),
                    WaitUntil.the(TXT_VALOR_REAL_SIN_IVA, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                    Enter.theValue(notaCreditoModel.getValorReal()).into(TXT_VALOR_REAL_SIN_IVA),
                    Enter.theValue(notaCreditoModel.getCantidad()).into(TXT_CANTIDAD),
                    Tap.on(SCL_MOTIVO_DEVOLUCION),
                    Click.on(String.format(LBL_MOTIVO_DEVOLUCION,notaCreditoModel.getMotivo())),
                    Tap.on(BTN_GUARDAR_NOTA),
                    TakeScreenshot.asEvidence()
            );
        }catch (RuntimeException eX){
            throw new AgregarNotaCreditoException(AgregarNotaCreditoException.Error(),eX);
        }


    }
}