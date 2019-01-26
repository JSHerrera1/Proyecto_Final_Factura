package Controlador;

import java.util.Date;

public class Personal_laboral extends Persona {

    protected String usuario;

    protected String contrasena;

    public Personal_laboral() {
    }

    public Personal_laboral(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public Personal_laboral(String usuario, String contrasena, String nombre,
            String apellido, String ci, String direccion, String telefono,
            String ciudad, Date fechaNacimiento) {
        super(nombre, apellido, ci, direccion, telefono, ciudad,
                fechaNacimiento);
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        String cadena = "\tPersona{" + nombre + " - " + apellido + " - " + ci
                + " - " + direccion + " - " + telefono + " - " + ciudad + " - "
                + fechaNacimiento + '}';
        return "\nPersonal_laboral{" + "usuario=" + usuario + ", contrasena="
                + contrasena + '}' + cadena;
    }

}
