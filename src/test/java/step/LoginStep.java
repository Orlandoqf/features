package step;

import page.LoginPage;

public class LoginStep {

    LoginPage loginPage = new LoginPage();

    public void ingresarPagina(){
        loginPage.ingresarPagina();
    }
    public void iniciarSesion(){
        loginPage.iniciarSesion();
    }
    public void clickEnBoton(){
        loginPage.clickEnBoton();
    }
    public void mensajeExitoso(){
        loginPage.mensajeExitoso();
    }



}
