package stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import step.LoginStep;

public class LoginStepDefinition {

    LoginStep logStep = new LoginStep();

    @Dado("que la web Mercury tours esta disponible")
    public void queLaWebMercuryToursEstaDisponible() {
        logStep.ingresarPagina();
    }

    @Cuando("tipeo mis datos")
    public void tipeoMisDatos() {
        logStep.iniciarSesion();
    }

    @Y("Doy Click en el boton")
    public void doyClickEnElBoton() {
        logStep.clickEnBoton();
    }

}
