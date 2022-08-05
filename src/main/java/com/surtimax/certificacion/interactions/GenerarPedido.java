package com.surtimax.certificacion.interactions;

import com.surtimax.certificacion.exceptions.GenerarPedidoException;
import com.surtimax.certificacion.interactions.choucair.TakeScreenshot;
import com.surtimax.certificacion.interactions.choucair.Tap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.surtimax.certificacion.ui.UiCliente.BTN_ACEPTAR_PROBLEMA;
import static com.surtimax.certificacion.ui.UiCliente.BTN_PEDIDO;
import static com.surtimax.certificacion.ui.UiDetalleDeFactura.TXT_BUSQUEDA;
import static com.surtimax.certificacion.ui.UiPedido.*;

public class GenerarPedido implements Interaction {

    private String detallePedido;

    public GenerarPedido(String detallePedido) {
        this.detallePedido = detallePedido;
    }

    public static GenerarPedido paraElUsuario(String detallePedido){
        return Tasks.instrumented(GenerarPedido.class, detallePedido);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(
                    WaitUntil.the(BTN_PEDIDO, WebElementStateMatchers.isEnabled()).forNoMoreThan(7).seconds(),
                    Tap.on(BTN_PEDIDO),
                    ValidarDialogo.presentadoEnPantalla(BTN_ACEPTAR_PROBLEMA),
                    WaitUntil.the(BTN_FINALIZAR, WebElementStateMatchers.isEnabled()).forNoMoreThan(7).seconds(),
                    Enter.theValue(detallePedido).into(TXT_BUSQUEDA),
                    Tap.on(359,438),
                    Tap.on(BTN_MAS),
                    Tap.on(BTN_ACEPTAR_PEDIDO),
                    Tap.on(BTN_FINALIZAR),
                    TakeScreenshot.asEvidence()
            );
        }catch (RuntimeException eX){
            throw new GenerarPedidoException(GenerarPedidoException.Error(),eX);
        }
    }
}