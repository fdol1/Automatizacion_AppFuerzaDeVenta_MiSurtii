package com.surtimax.certificacion.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UiNotasCredito {

    public static final Target TXT_BUSQUEDA_FACTURA =
            Target.the("Campo para buscar un numero de factura")
                    .locatedForAndroid(By.id( "com.celuweb.Aliados:id/edtBusqueda"))
                    .locatedForIOS(By.id(""));

    public static final Target TXT_FECHA_INICIAL =
            Target.the("Campo para desplegar el calendario")
                    .locatedForAndroid(By.id( "com.celuweb.Aliados:id/txtFechaInicio"))
                    .locatedForIOS(By.id(""));

    public static final Target TXT_FECHA_FINAL =
            Target.the("Campo para desplegar el calendario")
                    .locatedForAndroid(By.id( "com.celuweb.Aliados:id/txtFechaFin"))
                    .locatedForIOS(By.id(""));

    public static final Target BTN_APLICAR_FILTROS =
            Target.the("")
                    .locatedForAndroid(By.id( "com.celuweb.Aliados:id/btnAplicarFiltro"))
                    .locatedForIOS(By.id(""));

    public static final Target BTN_LIMPIAR_FILTROS =
            Target.the("")
                    .locatedForAndroid(By.id( "com.celuweb.Aliados:id/btnLimpiarFiltro"))
                    .locatedForIOS(By.id(""));

   public static String LBL_FACTURA = "//*[@class='android.widget.TextView' and @package='com.celuweb.Aliados' and @text = '%s']";
}