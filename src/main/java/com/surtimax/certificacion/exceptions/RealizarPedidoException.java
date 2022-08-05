package com.surtimax.certificacion.exceptions;

import com.surtimax.certificacion.utils.Severidad;

import static com.surtimax.certificacion.utils.Severidad.SEVERIDAD_MEDIA;

public class RealizarPedidoException extends RuntimeException{

    private static final Severidad serialVersionUID = SEVERIDAD_MEDIA;

    private static final String ERROR = "Error al realizar pedido";

    public RealizarPedidoException (String mensaje, Throwable motivo){
        super(mensaje,motivo);
    }

    public static String Error() {
        return ERROR;
    }
}