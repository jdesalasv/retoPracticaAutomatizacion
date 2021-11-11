package pruebaAutomatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static pruebaAutomatizacion.usersinterface.comprarLibros.*;

public class Comprar implements Task {

    public static Comprar libros(){

        return Tasks.instrumented(Comprar.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(

                Click.on(ADD_CART_SELENIUM),
                Click.on(ADD_CART_MASTERING)

        );

    }

}
