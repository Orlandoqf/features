package paths;

import org.openqa.selenium.By;

public class LoginPath {

    public By txtUser = By.name("userName");
    public By txtPass = By.name("password");
    public By btnLogin = By.name("submit");
    public By txtMensajeError = By.xpath("//span");
    public String url = "http://demo.guru99.com/test/newtours/index.php";
    public By test = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/font");
}
