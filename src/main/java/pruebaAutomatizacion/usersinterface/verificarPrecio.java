package pruebaAutomatizacion.usersinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class verificarPrecio {

    public static final Target TEXT_PRECIO = Target.the("Precio")
            .located(By.cssSelector("#page-34 > div > div.woocommerce > div.cart-collaterals > div > table > tbody > tr.order-total > td > strong > span"));



}
