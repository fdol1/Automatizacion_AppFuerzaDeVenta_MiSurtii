package com.surtimax.certificacion.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UiPedido {

    public static final Target BTN_FINALIZAR =
            Target.the("Boton para finalizar la orden de pedido")
                    .locatedForAndroid(By.id("com.celuweb.Aliados:id/btnFinalizar"))
                    .locatedForIOS(By.id(""));

    public static final Target BTN_MAS =
            Target.the("Boton para aumentar la cantidad del producto")
                    .locatedForAndroid(By.id("com.celuweb.Aliados:id/txtMas"))
                    .locatedForIOS(By.id(""));

    public static final Target BTN_ACEPTAR_PEDIDO =
            Target.the("Boton para aumentar la cantidad del producto")
                    .locatedForAndroid(By.id("com.celuweb.Aliados:id/btnAceptarEnviarInfo"))
                    .locatedForIOS(By.id(""));

    public static final Target LBL_NOMBRE_USUARIO =
            Target.the("Campo con el nombre del usuario que hace el pedido")
                    .locatedForAndroid(By.id("com.celuweb.Aliados:id/txtRazonSocial"))
                    .locatedForIOS(By.id(""));
}