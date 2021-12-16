package stepdefinition;

import io.cucumber.java.es.Entonces;
import step.HomeStep;

public class HomeStepDefinition {
    HomeStep homeStep = new HomeStep();

    @Entonces("se muestra un mensaje de exito")
    public void seMuestraUnMensajeDeExito() {
        homeStep.mensajeExitoso();
    }
}
