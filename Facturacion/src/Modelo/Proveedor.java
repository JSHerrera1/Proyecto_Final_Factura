
package Modelo;

import java.util.Date;

/**
 *
 * @author Jhon
 */
public class Proveedor extends Persona{

    //Atributo unico de la clase
    private String nombreEmpresa;
    
   //Constructor vacio de la clase
    public Proveedor() {
    }

    //Constructor que contiene los metodos de la clase
    public Proveedor(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    //Constructor que contiene los metodos pripos de la clase y los heredados
    public Proveedor(String nombreEmpresa, String nombre, String apellido, Date fechaNacimiento, String id, String numTelf, String direccion, String ciudad) {
        super(nombre, apellido, fechaNacimiento, id, numTelf, direccion, ciudad);
        this.nombreEmpresa = nombreEmpresa;
    }
    
    //metodo get
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    
    //metodo set
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public String toString() {
        String linea = ("\nPersona = {"+"Nombre: "+nombre +" - Apellido: "+ 
                apellido +" -fechaNacimiento: "+ fechaNacimiento +
                "\n - idCliente: "+ id +" - numeroTelefono: "+ numTelf  +
                " - direccion: "+ direccion +" - ciudad: "+ ciudad);
        return "Proveedor{" + "nombreEmpresa=" + nombreEmpresa + '}'+linea;
    }
    
}
