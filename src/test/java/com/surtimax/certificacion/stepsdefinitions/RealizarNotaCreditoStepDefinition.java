package com.surtimax.certificacion.stepsdefinitions;

import com.surtimax.certificacion.models.NotaCreditoModel;
import com.surtimax.certificacion.questions.VerificarCreacionDeNotaCredito;
import com.surtimax.certificacion.tasks.RealizarNotaDeCredito;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RealizarNotaCreditoStepDefinition {

    @Given("^que realiza una nota de credito en la app$")
    public void queRealizaUnaNotaDeCreditoEnLaApp(List<NotaCreditoModel> creditoModelList) {
        theActorInTheSpotlight().attemptsTo(RealizarNotaDeCredito.paraLaFacturaDeVenta(creditoModelList.get(0)));
    }

    @Then("^se verifica que la nota de credito se haya creado$")
    public void seVerificaQueLaNotaDeCreditoSeHayaCreado() {
        theActorInTheSpotlight().should(seeThat(VerificarCreacionDeNotaCredito.enPantalla()));
    }

    @Then("^se verifica que se visualice el mensaje:(.*)$")
    public void seVerificaQueSeVisualiceElMensajeLaCantidadIngresadaSuperaLaCantidadDisponible(String mensaje) {
    }
}