package step;

import page.LoginPage;

public class LoginStep {

    LoginPage logPage = new LoginPage();

    public void ingresarPagina(){
        logPage.ingresarPagina();
    }
    public void iniciarSesion(){
        logPage.iniciarSesion();
    }
    public void clickEnBoton(){
        logPage.clickEnBoton();
    }



}
