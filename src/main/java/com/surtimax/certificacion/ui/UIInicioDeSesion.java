package com.surtimax.certificacion.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UIInicioDeSesion {

    public static final Target TXT_USUARIO =
            Target.the("Campo para el usuario")
                    .locatedForAndroid(By.id("com.celuweb.Aliados:id/txtUsuario"))
                    .locatedForIOS(By.id(""));
    public static final Target TXT_CLAVE =
            Target.the("Campo para la clave")
                    .locatedForAndroid(By.id("com.celuweb.Aliados:id/txtClave"))
                    .locatedForIOS(By.id(""));
    public static final Target BTN_INICIAR_SESION =
            Target.the("Boton para iniciar sesion")
                    .locatedForAndroid(By.id("com.celuweb.Aliados:id/btnIniciar"))
                    .locatedForIOS(By.id(""));
}