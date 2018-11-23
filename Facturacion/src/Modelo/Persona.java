
package Modelo;
import java.util.Date; //paquete de la libreria date
/**
 *
 * @author Jhon
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String id;
    private String numTelf;
    private String direccion;
    private String ciudad;

    //Constructor vacio para adptarlo
    public Persona() {
    }

    //Constructor con todos los atributos
    public Persona(String nombre, String apellido, Date fechaNacimiento, String id, String numTelf, String direccion, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.id = id;
        this.numTelf = numTelf;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }
    
    //Metodos get

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getId() {
        return id;
    }

    public String getNumTelf() {
        return numTelf;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    //metodos set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNumTelf(String numTelf) {
        this.numTelf = numTelf;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
    

}
