package pruebaAutomatizacion.usersinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class comprarLibros {

    public static final Target ADD_CART_SELENIUM = Target.the("Boton Añadir al Carro libro Selenium")
            .located(By.xpath("//a[@href='/shop/?add-to-cart=160']"));

    public static final Target ADD_CART_MASTERING = Target.the("Boton Añadir al Carro libro Mastering")
            .located(By.xpath("//a[@href='/shop/?add-to-cart=165']"));

}
