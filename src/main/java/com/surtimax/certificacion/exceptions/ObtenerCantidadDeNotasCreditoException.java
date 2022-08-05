package com.surtimax.certificacion.exceptions;

import com.surtimax.certificacion.utils.Severidad;

import static com.surtimax.certificacion.utils.Severidad.SEVERIDAD_ALTA;

public class ObtenerCantidadDeNotasCreditoException extends RuntimeException{

    private static final Severidad serialVersionUID = SEVERIDAD_ALTA;

    private static final String ERROR = "Error al obtener las cantidades de las notas existentes";

    public ObtenerCantidadDeNotasCreditoException(String mensaje, Throwable motivo){
        super(mensaje,motivo);
    }

    public static String Error() {
        return ERROR;
    }
}