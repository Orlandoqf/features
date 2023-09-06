package page;

import Base.Base;;
import paths.LoginPath;

public class LoginPage extends Base {

    LoginPath loginPath;

    public void ingresarPagina(){
        chromeDriverConnection();
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


}

