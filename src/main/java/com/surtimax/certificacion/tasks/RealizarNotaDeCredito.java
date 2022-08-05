package com.surtimax.certificacion.tasks;

import com.surtimax.certificacion.exceptions.RealizarNotaDeCreditoException;
import com.surtimax.certificacion.interactions.*;
import com.surtimax.certificacion.interactions.choucair.TakeScreenshot;
import com.surtimax.certificacion.models.NotaCreditoModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static com.surtimax.certificacion.ui.UiAlertaDeDialogo.BTN_ACEPTAR;

public class RealizarNotaDeCredito implements Task {

    private final NotaCreditoModel notaCreditoModel;

    public RealizarNotaDeCredito(NotaCreditoModel notaCreditoModel) {
        this.notaCreditoModel = notaCreditoModel;
    }

    public static RealizarNotaDeCredito paraLaFacturaDeVenta(NotaCreditoModel notaCreditoModel){
        return Tasks.instrumented(RealizarNotaDeCredito.class, notaCreditoModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(
                    BuscarCliente.paraRealizarPedido(notaCreditoModel.getIdCliente()),
                    ValidarDialogo.presentadoEnPantalla(BTN_ACEPTAR),
                    ValidarDialogo.presentadoEnPantalla(BTN_ACEPTAR),
                    SeleccionarFactura.paraNotaDeCredito(notaCreditoModel),
                    SeleccionarDetalleDeFactura.paraNotaDeCredito(notaCreditoModel),
                    AgregarNotaCredito.aLaFacturaDeVenta(notaCreditoModel),
                    ValidarDialogo.presentadoEnPantalla(BTN_ACEPTAR),
                    TakeScreenshot.asEvidence()
            );
        }catch (RuntimeException ex){
            throw new RealizarNotaDeCreditoException(RealizarNotaDeCreditoException.Error(),ex);
        }
    }
}