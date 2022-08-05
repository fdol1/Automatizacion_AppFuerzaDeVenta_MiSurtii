package com.surtimax.certificacion.exceptions;

import com.surtimax.certificacion.utils.Severidad;

import static com.surtimax.certificacion.utils.Severidad.SEVERIDAD_ALTA;

public class AgregarNotaCreditoException extends RuntimeException{

    private static final Severidad serialVersionUID = SEVERIDAD_ALTA;

    private static final String ERROR = "Error al agregar nota de credito";

    public AgregarNotaCreditoException(String mensaje, Throwable motivo){
        super(mensaje,motivo);
    }

    public static String Error() {
        return ERROR;
    }
}