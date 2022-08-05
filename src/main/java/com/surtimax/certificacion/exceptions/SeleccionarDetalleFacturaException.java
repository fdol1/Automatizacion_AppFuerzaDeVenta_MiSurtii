package com.surtimax.certificacion.exceptions;

import com.surtimax.certificacion.utils.Severidad;

import static com.surtimax.certificacion.utils.Severidad.SEVERIDAD_BAJA;

public class SeleccionarDetalleFacturaException extends RuntimeException{

    private static final Severidad serialVersionUID = SEVERIDAD_BAJA;

    private static final String ERROR = "Error al seleccionar el detalle de la factura";

    public SeleccionarDetalleFacturaException(String mensaje, Throwable motivo){
        super(mensaje,motivo);
    }

    public static String Error() {
        return ERROR;
    }
}