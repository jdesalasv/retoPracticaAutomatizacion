package pruebaAutomatizacion.questions;

import net.serenitybdd.screenplay.Question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static pruebaAutomatizacion.usersinterface.verificarPrecio.*;


public class Verificar implements Question<Boolean> {



    public Verificar() {

    }


    public static Verificar precio(){

        return new Verificar();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String precio_text = Text.of(TEXT_PRECIO).viewedBy(actor).asString();
        char[] c = precio_text.toCharArray();
        String nuevo_precio = "";
        for (int i = 1; i < c.length; i++) {

                nuevo_precio += c[i];
        }
        double precio = Double.parseDouble(nuevo_precio);
        if (precio<400){
            return true;
        }else{
            return false;
        }

    }

}
