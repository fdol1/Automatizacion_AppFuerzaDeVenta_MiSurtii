package com.surtimax.certificacion.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UiCliente {

    public static final Target BTN_PEDIDO =
            Target.the("Image view para ingresar a la seccion de pedidos")
                    .locatedForAndroid(By.id( "com.celuweb.Aliados:id/imgPedido"))
                    .locatedForIOS(By.id(""));

    public static final Target BTN_ACEPTAR_PROBLEMA =
            Target.the("Boton para aceptar el mensaje de problema al cargar inventario")
                    .locatedForAndroid(By.id( "com.celuweb.Aliados:id/btnCancelar"))
                    .locatedForIOS(By.id(""));

    public static final Target BTN_NOTAS_CREDITO =
            Target.the("Boton para ingresar")
                    .locatedForAndroid(By.xpath( "//*[@class='android.widget.TextView' and @package='com.celuweb.Aliados' and @text = 'Notas crédito']"))
                    .locatedForIOS(By.id(""));
}