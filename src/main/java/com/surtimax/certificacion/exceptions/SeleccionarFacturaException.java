package com.surtimax.certificacion.exceptions;

import com.surtimax.certificacion.utils.Severidad;

import static com.surtimax.certificacion.utils.Severidad.SEVERIDAD_BAJA;

public class SeleccionarFacturaException extends RuntimeException{

    private static final Severidad serialVersionUID = SEVERIDAD_BAJA;

    private static final String ERROR = "Error al seleccionaer factura";

    public SeleccionarFacturaException(String mensaje, Throwable motivo){
        super(mensaje,motivo);
    }

    public static String Error() {
        return ERROR;
    }
}