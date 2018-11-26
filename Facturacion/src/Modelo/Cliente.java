
package Modelo;

import java.util.Date;

/**
 *
 * @author Jhon
 */
public class Cliente extends Persona {

    private String codigoClienteEmpresa;
    public Cliente() {
    }

    public Cliente(String codigoClienteEmpresa) {
        this.codigoClienteEmpresa = codigoClienteEmpresa;
    }

    public Cliente(String codigoClienteEmpresa, String nombre, String apellido, Date fechaNacimiento, String id, String numTelf, String direccion, String ciudad) {
        super(nombre, apellido, fechaNacimiento, id, numTelf, direccion, ciudad);
        this.codigoClienteEmpresa = codigoClienteEmpresa;
    }

    //metodo get
    public String getCodigoClienteEmpresa() {
        return codigoClienteEmpresa;
    }
    
    //metodo set
    public void setCodigoClienteEmpresa(String codigoClienteEmpresa) {
        this.codigoClienteEmpresa = codigoClienteEmpresa;
    }

    @Override
    public String toString() {
        String linea = ("Persona = {"+"Nombre: "+nombre +" - Apellido: "+ 
                apellido +" -fechaNacimiento: "+ fechaNacimiento +
                "\n - idCliente: "+ id +" - numeroTelefono: "+ numTelf  +
                " - direccion: "+ direccion +" - ciudad: "+ ciudad);     
        return "Cliente={" + "codigoClienteEmpresa=" + codigoClienteEmpresa + "};\n" + linea;
    }
 
}
