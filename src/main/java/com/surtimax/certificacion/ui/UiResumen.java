package com.surtimax.certificacion.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UiResumen {

    public static final Target BTN_SELECCIONAR_FECHA =
            Target.the("Boton para sacar el menu del calendario")
                    .locatedForAndroid(By.id("com.celuweb.Aliados:id/txtFecha"))
                    .locatedForIOS(By.id(""));

    public static String LBL_ITEM_CALENDARIO = "//android.view.View[@content-desc='%s']";

    public static final Target BTN_ACEPTAR_FECHA =
            Target.the("Boton para aceptar la fecha seleccionada")
                    .locatedForAndroid(By.id("com.celuweb.Aliados:id/done_button"))
                    .locatedForIOS(By.id(""));

    public static final Target TXT_OBSERVACION =
            Target.the("Campo para ingresar observacion del pedido")
                    .locatedForAndroid(By.id("com.celuweb.Aliados:id/txtObservacion"))
                    .locatedForIOS(By.id(""));

    public static final Target TXT_FIRMA =
            Target.the("Campo para firmar")
                    .locatedForAndroid(By.id("com.celuweb.Aliados:id/inkn"))
                    .locatedForIOS(By.id(""));

    public static final Target BTN_ACEPTAR_FIRMA =
            Target.the("Boton para aceptar la firma")
                    .locatedForAndroid(By.id("com.celuweb.Aliados:id/llAceptarFirma"))
                    .locatedForIOS(By.id(""));

    public static final Target BTN_ACEPTAR_RESUMEN =
            Target.the("Boton para aceptar el resumen realizado")
                    .locatedForAndroid(By.id("com.celuweb.Aliados:id/btnFinalizar"))
                    .locatedForIOS(By.id(""));
}