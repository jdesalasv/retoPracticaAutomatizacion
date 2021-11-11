package pruebaAutomatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import pruebaAutomatizacion.usersinterface.PaginaPracticaAutomatizacion;

public class Abrir implements Task {

    private PaginaPracticaAutomatizacion paginaBancolombia;

    public static Abrir laPagina(){

        return Tasks.instrumented(Abrir.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(Open.browserOn(paginaBancolombia));

    }

}
