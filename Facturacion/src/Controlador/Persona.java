package Controlador;

import java.util.Date;

public class Persona {

    protected String nombre;

    protected String apellido;

    protected String ci;

    protected String direccion;

    protected String telefono;

    protected String ciudad;

    protected Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String ci,
            String direccion, String telefono, String ciudad,
            Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "\nPersona{" + "nombre=" + nombre + ", apellido=" + apellido
                + ", ci=" + ci + ", direccion=" + direccion + ", telefono="
                + telefono + ", ciudad=" + ciudad + ", fechaNacimiento="
                + fechaNacimiento + '}';
    }

}
