package pruebaAutomatizacion.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import pruebaAutomatizacion.tasks.Abrir;


public class pruebaAutomatizacionStepdefinition {

    @Before
    public void setStage(){

        OnStage.setTheStage(new OnlineCast());

    }


    @Given("^Jahaziel necesita entrar a la pagina de Practica de automatizacion$")
    public void jahazielNecesitaEntrarALaPaginaDePracticaDeAutomatizacion() {

        OnStage.theActorCalled("Jahaziel").wasAbleTo(Abrir.laPagina());

    }


    @When("^realizar la compra de los libros$")
    public void realizarLaCompraDeLosLibros() {
    }

    @Then("^validar que la compra sea menor aun precio dado$")
    public void validarQueLaCompraSeaMenorAunPrecioDado() {

    }



}
