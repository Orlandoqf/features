package step;

import page.FormularioPage;

public class FormularioStep {

    FormularioPage formPage = new FormularioPage();

    public void validarCargaPagina(){
        formPage.validarCargaPagina();
    }

    public void ingresoDatos(){
        formPage.ingresoDatos();
    }

    public void clickEnElBoton(){
        formPage.clickEnElBoton();
    }

    public void muestraDatos(){
        formPage.muestraDatos();
    }

}
