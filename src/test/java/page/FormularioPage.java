package page;

import Base.Base;
import org.openqa.selenium.WebDriver;
import paths.FormularioPath;

public class FormularioPage extends Base {
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
        formPage.maximize();
    }

    public void ingresoDatos(){
        formPage.type("Orlando Quispe", formPath.userName);
        formPage.type("test@test.com", formPath.userEmail);
        formPage.type("casa", formPath.currentAddress);
        formPage.type("trabajo", formPath.permanentAddress);
    }

    public void clickEnElBoton(){
        formPage.click(formPath.btn);
    }

    public void muestraDatos(){
        System.out.println(formPage.getText(formPath.name));
        System.out.println(formPage.getText(formPath.email));
        formPage.isDisplayed(formPath.currentAddress);
        formPage.isDisplayed(formPath.permanentAddress);
    }

}
