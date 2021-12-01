package page;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import paths.FormularioPath;

public class FormularioPage extends Base {

    private WebDriver driver;
    FormularioPath formPath = new FormularioPath();
    FormularioPage formPage;

    public FormularioPage(WebDriver driver) {
        super(driver);
    }

    public FormularioPage() {
        super();
    }


    public void validarCargaPagina(){
        formPage = new FormularioPage(driver);
        formPage.chromeDriverConnection();
        formPage.visit(formPath.url);

    }

    public void ingresoDatos(){
        type("Orlando Quispe", formPath.userName);
        type("test@test.com", formPath.userEmail);
        type("casa", formPath.currentAddress);
        type("trabajo", formPath.permanentAddress);

    }

    public void clickEnElBoton(){
        click(formPath.btn);
    }

    public void muestraDatos(){
        System.out.println(getText(formPath.name));
        System.out.println(getText(formPath.email));
        isDisplayed(formPath.currentAddress);
        isDisplayed(formPath.permanentAddress);

    }

}
