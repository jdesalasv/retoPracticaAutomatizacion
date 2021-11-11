package pruebaAutomatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static pruebaAutomatizacion.usersinterface.accederCarrito.*;

public class Acceder implements Task {

    public static  Acceder carrito(){

        return Tasks.instrumented(Acceder.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(BOTON_CARRITO)

        );
    }
}
