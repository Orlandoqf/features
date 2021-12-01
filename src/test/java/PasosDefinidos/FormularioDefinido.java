//package PasosDefinidos;
//
//import io.cucumber.java.es.Cuando;
//import io.cucumber.java.es.Dado;
//import io.cucumber.java.es.Entonces;
//import io.cucumber.java.es.Y;
//import io.cucumber.java.vi.Cho;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class FormularioDefinido {
//    WebDriver driver;
//
//    @Dado("que la web DEMOQA esta disponible")
//    public void queLaWebDEMOQAEstaDisponible() {
//        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.navigate().to("https://demoqa.com/text-box");
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//    }
//
//    @Cuando("registro mis datos")
//    public void registroMisDatos() {
//        driver.findElement(By.id("userName")).sendKeys("Orlando Quispe");
//        driver.findElement(By.id("userEmail")).sendKeys("test@test.com");
//        driver.findElement(By.id("currentAddress")).sendKeys("casa");
//        driver.findElement(By.id("permanentAddress")).sendKeys("trabajo");
//
//
//    }
//
//    @Y("Doy Click en el boton")
//    public void doyClickEnElBoton() {
//        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//    }
//
//    @Entonces("se muestran mis datos en la pantalla")
//    public void seMuestranMisDatosEnLaPantalla() {
//        System.out.println(driver.findElement(By.id("name")).getText());
//        System.out.println(driver.findElement(By.id("email")).getText());
//        driver.findElement(By.id("currentAddress")).isDisplayed();
//        driver.findElement(By.id("permanentAddress")).isDisplayed();
//
//        //limpiar cookies y cerrar ventana
//        driver.manage().deleteAllCookies();
//        driver.close();
//    }
//
//
//}
