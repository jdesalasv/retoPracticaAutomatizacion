package pruebaAutomatizacion.usersinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class eliminaCompra {

    public static final Target BOTON_ELIMINAR_SELENIUM = Target.the("Boton eliminar curso selenim")
            .located(By.xpath("//*[@class='shop_table shop_table_responsive cart']//tr//a[@data-product_id='160']"));
}
