package page;

import Base.Base;
import org.openqa.selenium.WebDriver;
import paths.LoginPath;

public class LoginPage extends Base {
    LoginPath logPath = new LoginPath();
    LoginPage logPage;



    public LoginPage(WebDriver driver){
        super(driver);
    }
    public LoginPage(){
        super();
    }

    public void ingresarPagina(){
        logPage = new LoginPage(driver);
        logPage.chromeDriverConnection();
        logPage.visit(logPath.url);
        logPage.maximize();
    }


    public void iniciarSesion(){
        logPage.type("Qualityadmin", logPath.txtUser);
        logPage.type("pass1", logPath.txtPass);
    }

    public void clickEnBoton(){
        logPage.click(logPath.btnLogin);
    }

}

