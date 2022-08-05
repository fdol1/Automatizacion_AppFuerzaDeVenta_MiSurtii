package com.surtimax.certificacion.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UiAgregarNotaCredito {

    public static final Target BTN_CREAR_NOTA =
            Target.the("Boton para crear la nota de credito del cliente")
                    .locatedForAndroid(By.id( "com.celuweb.Aliados:id/btn_crear_nota"))
                    .locatedForIOS(By.id(""));

    public static final Target LBL_CANTIDAD_DE_NOTAS_CREDITO =
            Target.the("Campo para determincar cantidade de notas")
                    .locatedForAndroid(By.id("com.celuweb.Aliados:id/lbl_cantidad_notas_credito"))
                    .locatedForIOS(By.id(""));

    public static final Target TXT_VALOR_REAL_SIN_IVA=
            Target.the("Valor total de los articulos sin iva")
                    .locatedForAndroid(By.id( "com.celuweb.Aliados:id/txt_precio_sin_iva"))
                    .locatedForIOS(By.id(""));

    public static final Target TXT_CANTIDAD =
            Target.the("campo para la cantidad de articulos")
                    .locatedForAndroid(By.id("com.celuweb.Aliados:id/txt_cantidad"))
                    .locatedForIOS(By.id(""));

    public static final Target SCL_MOTIVO_DEVOLUCION =
            Target.the("Escrol para desplegar la lista de opciones")
                    .locatedForAndroid(By.id("com.celuweb.Aliados:id/spnMotivos"))
                    .locatedForIOS(By.id(""));

    public static String LBL_MOTIVO_DEVOLUCION = "//*[@class='android.widget.CheckedTextView' and @package='com.celuweb.Aliados' and @text = '%s']";

    public static final Target BTN_GUARDAR_NOTA =
            Target.the("Boton para guardar la nota de credito")
                    .locatedForAndroid(By.id("com.celuweb.Aliados:id/btn_guardar_nota"))
                    .locatedForIOS(By.id(""));
}