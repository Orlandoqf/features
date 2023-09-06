package step;

import page.LoginPage;

public class LoginStep {

    LoginPage loginPage;

    public void ingresarPagina(){
        loginPage.ingresarPagina();
    }

    public void iniciarSesion(){
        loginPage.iniciarSesion();
    }

    public void clickEnBoton(){
        loginPage.clickEnBoton();
    }

}
