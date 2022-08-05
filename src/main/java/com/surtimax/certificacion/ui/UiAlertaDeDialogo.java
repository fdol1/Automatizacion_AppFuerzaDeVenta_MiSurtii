package com.surtimax.certificacion.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UiAlertaDeDialogo {

    public static final Target BTN_ACEPTAR =
            Target.the("Acepta las condiciones que se presentan en la alerta de dialogo")
                    .locatedForAndroid(By.id( "android:id/button1"))
                    .locatedForIOS(By.id(""));

    public static final Target BTN_CANCELAR =
            Target.the("Cancela las condiciones que se presentan en la alerta de dialogo")
                    .locatedForAndroid(By.id( "android:id/button2"))
                    .locatedForIOS(By.id(""));
}