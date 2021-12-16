package page;

import Base.Base;
import paths.HomePath;


public class HomePage extends Base {

    HomePath homePath = new HomePath();

    public void mensajeExitoso() {
        click(homePath.test);
        String mensaje = getText(homePath.txtMesajeExito);
        System.out.println(mensaje);
    }
}
