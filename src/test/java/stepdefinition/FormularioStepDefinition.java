package stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import step.FormularioStep;


public class FormularioStepDefinition {

    FormularioStep formStep = new FormularioStep();

    @Dado("que la web DEMOQA esta disponiblee")
    public void queLaWebDEMOQAEstaDisponiblee() {
        formStep.validarCargaPagina();
    }

    @Cuando("registro mis datoss")
    public void registroMisDatoss() {
        formStep.ingresoDatos();
    }

    @Y("Doy Click en el botonn")
    public void doyClickEnElBotonn() {
        formStep.clickEnElBoton();
    }

    @Entonces("se muestran mis datos en la pantalla")
    public void seMuestranMisDatosEnLaPantallaa() {
        formStep.muestraDatos();
    }
}
