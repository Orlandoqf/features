package page;

import Base.Base;
import org.openqa.selenium.WebDriver;
import paths.LoginPath;

public class LoginPage extends Base {
    LoginPath loginPath = new LoginPath();
    LoginPage loginPage;

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public LoginPage() {

    }

    public void ingresarPagina(){
        loginPage = new LoginPage(driver);
        driver = loginPage.chromeDriverConnection();
        loginPage.visit(loginPath.url);
        loginPage.maximize();
    }

    public void iniciarSesion(){
        type("Qualityadmin", loginPath.txtUser);
        type("pass1", loginPath.txtPass);
        String prueba = getText(loginPath.test);
        System.out.println(prueba);
    }

    public void clickEnBoton(){
        click(loginPath.btnLogin);
    }

}

