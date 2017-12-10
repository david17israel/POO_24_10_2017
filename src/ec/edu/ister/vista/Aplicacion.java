
package ec.edu.ister.vista;

import ec.edu.ister.modelo.ControlDeFlujo;

/**
 *
 * @author SHIELD
 */
public class Aplicacion {
    public static void main(String[] args) {
        ControlDeFlujo obj = new ControlDeFlujo();
        obj.mensaje();
        ControlDeFlujo.condicionales();
        ControlDeFlujo.IfAnidado();
        ControlDeFlujo.Switch();
        ControlDeFlujo.Switch2();
        ControlDeFlujo.interadorFor();
    }
}
