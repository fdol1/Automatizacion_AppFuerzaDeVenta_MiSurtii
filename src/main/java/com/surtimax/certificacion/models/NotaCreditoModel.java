package com.surtimax.certificacion.models;

public class NotaCreditoModel {

    private String nroFactura;
    private String nroDetalle;
    private String fechaI;
    private String fechaF;
    private String valorReal;
    private String cantidad;
    private String motivo;
    private String idCliente;

    public String getNroFactura() {
        return nroFactura;
    }

    public String getNroDetalle() {
        return nroDetalle;
    }

    public String getFechaI() {
        return fechaI;
    }

    public String getFechaF() {
        return fechaF;
    }

    public String getValorReal() {
        return valorReal;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getIdCliente() {
        return idCliente;
    }
}