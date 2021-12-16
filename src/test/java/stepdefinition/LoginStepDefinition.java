package stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import step.HomeStep;
import step.LoginStep;

public class LoginStepDefinition {

    LoginStep loginStepStep = new LoginStep();
    HomeStep homeStep = new HomeStep();

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

    @Entonces("se muestra un mensaje de exito")
    public void seMuestraUnMensajeDeExito() {
        loginStepStep.mensajeExitoso();
    }

}
