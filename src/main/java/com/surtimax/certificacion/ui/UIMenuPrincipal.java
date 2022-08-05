package com.surtimax.certificacion.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UIMenuPrincipal {

    public static final Target LBL_MENSAJE =
            Target.the("Campo donde se muestra mensaje de compra exitosa")
                    .locatedForAndroid(By.xpath("//*[@class='android.widget.TextView' and @package='com.celuweb.Aliados' and @text = 'Fuerza de Venta']"))
                    .locatedForIOS(By.id(""));

    public static final Target BTN_DESPLEGAR_MENU =
            Target.the("Campo para desplegar el menu principal")
                    .locatedForAndroid(By.xpath("(//*[@class='android.widget.ImageView' and @package='com.celuweb.Aliados' and @index = '0'])[2]"))
                    .locatedForIOS(By.id(""));

    public static final Target IMG_BUSCAR_CLIENTE =
            Target.the("Campo para pasar al menù de busqueda")
                    .locatedForAndroid(By.id("com.celuweb.Aliados:id/btnBuscarCliente"))
                    .locatedForIOS(By.id(""));

}