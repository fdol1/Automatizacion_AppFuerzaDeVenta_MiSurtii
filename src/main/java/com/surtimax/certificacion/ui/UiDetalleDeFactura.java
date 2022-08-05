package com.surtimax.certificacion.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UiDetalleDeFactura {

    public static final Target TXT_BUSQUEDA =
            Target.the("Campo para buscar el detalle de la factura")
                    .locatedForAndroid(By.id( "com.celuweb.Aliados:id/edtBusqueda"))
                    .locatedForIOS(By.id(""));

    public static final Target BTN_APLICAR_BUSCQUEDA =
            Target.the("Campo para aplicar la busqueda deel detalle de la factura")
                    .locatedForAndroid(By.id( "com.celuweb.Aliados:id/btnAplicarFiltro"))
                    .locatedForIOS(By.id(""));
}