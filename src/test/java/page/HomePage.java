package page;

import Base.Base;
import paths.HomePath;


public class HomePage extends Base {

    HomePath homePath;

    public void mensajeExitoso() {
        String mensaje = getText(homePath.txtMesajeExito);
        System.out.println(mensaje);
    }
}
