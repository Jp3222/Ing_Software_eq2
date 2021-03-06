package Main;

import Controlador.Sistema;
import Modelo.Ficheros;
import Modelo.cons;
import Vista.Vista_Configuracion;
import Vista.Vista_Login;
import javax.swing.SwingUtilities;

/**
 *
 * @author jp
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        //Arranque de un hilo independiente
        SwingUtilities.invokeLater(() -> Star());
    }

    /**
     * Metodo de activacion del sistema
     */
    public static void Star() {
        Ficheros ft = new Ficheros();
        Sistema sistema = Sistema.getNodo();
        if (!ft.Exists(cons.url(1))) {
            Vista_Configuracion vista = new Vista_Configuracion();
            vista.setVisible(true);
        } else {
            sistema.star();
            Vista_Login log = Vista_Login.getNodo();
            log.setVisible(true);
        }
    }

}
