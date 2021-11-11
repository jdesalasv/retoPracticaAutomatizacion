package pruebaAutomatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static pruebaAutomatizacion.usersinterface.eliminaCompra.*;

public class Elimina implements Task {

    public static Elimina compra(){

        return Tasks.instrumented(Elimina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(BOTON_ELIMINAR_SELENIUM)

        );

    }

}
