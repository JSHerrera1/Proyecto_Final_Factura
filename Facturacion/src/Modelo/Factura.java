package Modelo;
import java.util.Date;
/**
 *
 * @author Jhon
 */
public class Factura {
    //Atributos de la clase

    Cliente comprador; //composiscion de uno a muchos
    Personal_Laboral empleados; //composiscion de uno a muchos
    private String idComprador;
    private String nomEmpleado;
    private Date fechaCompra;
    private String codigoFactura;
    
    //Constructor Vacio

    public Factura() {
    }
    
    //Constructor unico que contiene los atributos de la clase

    public Factura(String idComprador, String nomEmpleado, Date fechaCompra, String codigoFactura) {
        this.idComprador = idComprador;
        this.nomEmpleado = nomEmpleado;
        this.fechaCompra = fechaCompra;
        this.codigoFactura = codigoFactura;
    }
    
    //cosntructor que contiene los atributos de la clase y el de la composicion

    public Factura(Cliente comprador, Personal_Laboral empleados, String idComprador, String nomEmpleado, Date fechaCompra, String codigoFactura) {
        this.comprador = comprador;
        this.empleados = empleados;
        this.idComprador = idComprador;
        this.nomEmpleado = nomEmpleado;
        this.fechaCompra = fechaCompra;
        this.codigoFactura = codigoFactura;
    }
    
    //Metodos get

    public Cliente getComprador() {
        return comprador;
    }

    public Personal_Laboral getEmpleados() {
        return empleados;
    }

    public String getIdComprador() {
        return idComprador;
    }

    public String getNomEmpleado() {
        return nomEmpleado;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }
    
    //Metodos set

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public void setEmpleados(Personal_Laboral empleados) {
        this.empleados = empleados;
    }

    public void setIdComprador(String idComprador) {
        this.idComprador = idComprador;
    }

    public void setNomEmpleado(String nomEmpleado) {
        this.nomEmpleado = nomEmpleado;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }
    

}
