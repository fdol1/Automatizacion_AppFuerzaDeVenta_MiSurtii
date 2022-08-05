package com.surtimax.certificacion.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UiBusquedaCliente {

    public static final Target TXT_BUSQUEDA_CLIENTE =
            Target.the("Campo para buscar al cliente")
                    .locatedForAndroid(By.id("com.celuweb.Aliados:id/txtBusqueda"))
                    .locatedForIOS(By.id(""));
}