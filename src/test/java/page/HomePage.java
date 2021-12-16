package page;

import Base.Base;
import org.openqa.selenium.WebDriver;
import paths.HomePath;


public class HomePage extends Base {
    HomePath homePath = new HomePath();
    HomePage homePage;

    public HomePage(WebDriver driver){
        super(driver);
    }

    public HomePage(){

    }

    public void mensajeExitoso() {
        homePage = new HomePage(driver);
        String mensaje = homePage.getText(homePath.txtMesajeExito);
        System.out.println(mensaje);
    }
}
