package paths;

import org.openqa.selenium.By;

public class LoginPath {

    public By txtUser = By.name("userName");
    public By txtPass = By.name("password");
    public By btnLogin = By.name("submit");
    public By txtMensajeError = By.xpath("//span");
    public String url = "http://demo.guru99.com/test/newtours/index.php";
}
