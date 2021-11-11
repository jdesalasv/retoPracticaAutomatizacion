package pruebaAutomatizacion.usersinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class accederCarrito {

    public static final Target BOTON_CARRITO = Target.the("Boton Carrito")
            .located(By.xpath("//a[@href='http://practice.automationtesting.in/basket/']"));

}

