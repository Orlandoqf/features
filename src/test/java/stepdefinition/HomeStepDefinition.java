package stepdefinition;

import io.cucumber.java.es.Entonces;
import step.HomeStep;

public class HomeStepDefinition {
    HomeStep HomStep = new HomeStep();

    @Entonces("se muestra un mensaje de exito")
    public void seMuestraUnMensajeDeExito() {
        HomStep.mensajeExitoso();
    }
}
