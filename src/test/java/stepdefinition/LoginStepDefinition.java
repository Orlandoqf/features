package stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import step.HomeStep;
import step.LoginStep;

public class LoginStepDefinition {

    LoginStep loginStepStep;

    @Dado("que la web Mercury tours esta disponible")
    public void queLaWebMercuryToursEstaDisponible() {
        loginStepStep.ingresarPagina();
    }

    @Cuando("tipeo mis datos")
    public void tipeoMisDatos() {
        loginStepStep.iniciarSesion();
    }

    @Y("Doy Click en el boton")
    public void doyClickEnElBoton() {
        loginStepStep.clickEnBoton();
    }


}
