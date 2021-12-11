package page;

import Base.Base;
import org.openqa.selenium.WebDriver;
import paths.HomePath;

public class HomePage extends Base {
    HomePath homPath = new HomePath();
    HomePage homPage;

    public HomePage(WebDriver driver){
        super(driver);
    }
    public HomePage(){
        super();
    }

    public void mensajeExitoso() {
        try {
            homPage.getText(homPath.txtMesajeExito);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
