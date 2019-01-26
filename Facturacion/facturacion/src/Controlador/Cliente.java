package Controlador;

import java.util.Date;

public class Cliente extends Persona {

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String ci, String direccion,
            String telefono, String ciudad, Date fechaNacimiento) {
        super(nombre, apellido, ci, direccion, telefono, ciudad,
                fechaNacimiento);
    }

    @Override
    public String toString() {
        return "\nCliente Persona{" + nombre + " - " + apellido + " - " + ci
                + " - " + direccion + " - " + telefono + " - " + ciudad + " - "
                + fechaNacimiento + '}';
    }

}
