
package Modelo;

import java.util.Date;

/**
 *
 * @author Jhon
 */
public class Personal_Laboral extends Persona{

    //Atributos
    private String usuario;
    private String contraseña;

    //constructor vacio
    public Personal_Laboral() {
    }
    //constructor  que contiene los stributos pripos de la clase
    public Personal_Laboral(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    //constructor  que contiene los stributos pripos de la clase y los heredados del padre
    public Personal_Laboral(String usuario, String contraseña, String nombre, String apellido, Date fechaNacimiento, String id, String numTelf, String direccion, String ciudad) {
        super(nombre, apellido, fechaNacimiento, id, numTelf, direccion, ciudad);
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    
    //metodo get
    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    //metodos set
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
}
