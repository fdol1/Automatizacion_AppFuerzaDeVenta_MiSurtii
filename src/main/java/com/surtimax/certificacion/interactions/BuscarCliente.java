package com.surtimax.certificacion.interactions;

import com.surtimax.certificacion.exceptions.BuscarClienteException;
import com.surtimax.certificacion.interactions.choucair.TakeScreenshot;
import com.surtimax.certificacion.interactions.choucair.Tap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.surtimax.certificacion.ui.UIMenuPrincipal.*;
import static com.surtimax.certificacion.ui.UiBusquedaCliente.TXT_BUSQUEDA_CLIENTE;

public class BuscarCliente implements Interaction {

    private final String idCliente;

    public BuscarCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public static BuscarCliente paraRealizarPedido(String idCliente){
        return Tasks.instrumented(BuscarCliente.class,idCliente);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(
                    WaitUntil.the(LBL_MENSAJE, WebElementStateMatchers.isEnabled()).forNoMoreThan(7).seconds(),
                    Tap.on(BTN_DESPLEGAR_MENU),
                    Tap.on(IMG_BUSCAR_CLIENTE),
                    WaitUntil.the(TXT_BUSQUEDA_CLIENTE, WebElementStateMatchers.isEnabled()).forNoMoreThan(7).seconds(),
                    Enter.theValue(idCliente).into(TXT_BUSQUEDA_CLIENTE),
                    Tap.on(60,347),
                    TakeScreenshot.asEvidence()
            );
        }catch (RuntimeException eX){
            throw new BuscarClienteException(BuscarClienteException.Error(),eX);
        }
    }
}