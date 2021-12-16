package page;

import Base.Base;
import paths.HomePath;
import paths.LoginPath;

public class LoginPage extends Base {

    LoginPath loginPath = new LoginPath();
    HomePath homePath = new HomePath();

    public void ingresarPagina(){
        driver = chromeDriverConnection();
        visit(loginPath.url);
        maximize();
    }

    public void iniciarSesion(){
        type("Qualityadmin", loginPath.txtUser);
        type("pass1", loginPath.txtPass);
    }

    public void clickEnBoton(){
        click(loginPath.btnLogin);
    }

    public void mensajeExitoso() {
        click(homePath.test);
        String mensaje = getText(homePath.test);
        //getText(homePath.txtMesajeExito);
        System.out.println(mensaje);

}
}

