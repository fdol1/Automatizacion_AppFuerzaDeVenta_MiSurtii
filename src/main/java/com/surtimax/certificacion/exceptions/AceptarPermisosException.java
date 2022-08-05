package com.surtimax.certificacion.exceptions;

import com.surtimax.certificacion.utils.Severidad;

import static com.surtimax.certificacion.utils.Severidad.SEVERIDAD_MEDIA;

public class AceptarPermisosException extends RuntimeException{

    private static final Severidad serialVersionUID = SEVERIDAD_MEDIA;

    private static final String ERROR = "Error al realizar pedido";

    public AceptarPermisosException (String mensaje, Throwable motivo){
        super(mensaje,motivo);
    }

    public static String Error() {
        return ERROR;
    }
}