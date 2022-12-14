package com.surtimax.certificacion.tasks;

import com.surtimax.certificacion.exceptions.RealizarPedidoException;
import com.surtimax.certificacion.interactions.BuscarCliente;
import com.surtimax.certificacion.interactions.GenerarPedido;
import com.surtimax.certificacion.interactions.IngresarFechasYObservaciones;
import com.surtimax.certificacion.interactions.ValidarDialogo;
import com.surtimax.certificacion.interactions.choucair.TakeScreenshot;
import com.surtimax.certificacion.models.InfoPedidoModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static com.surtimax.certificacion.ui.UiAlertaDeDialogo.BTN_ACEPTAR;

public class RealizarPedido implements Task {

    private final InfoPedidoModel infoPedidoModelList;

    public RealizarPedido(InfoPedidoModel infoPedidoModelList) {
        this.infoPedidoModelList = infoPedidoModelList;
    }

    public static RealizarPedido desdeLaAppSurtiMax(InfoPedidoModel infoPedidoModelList){
        return Tasks.instrumented(RealizarPedido.class, infoPedidoModelList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(
                    BuscarCliente.paraRealizarPedido(infoPedidoModelList.getIdCliente()),
                    ValidarDialogo.presentadoEnPantalla(BTN_ACEPTAR),
                    ValidarDialogo.presentadoEnPantalla(BTN_ACEPTAR),
                    GenerarPedido.paraElUsuario(infoPedidoModelList.getDetallePedido()),
                    IngresarFechasYObservaciones.delPedido(infoPedidoModelList),
                    TakeScreenshot.asEvidence()
            );
        }catch (RuntimeException eX){
            throw new RealizarPedidoException(RealizarPedidoException.Error(),eX);
        }
    }
}