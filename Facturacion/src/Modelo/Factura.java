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
    private Date fechaCompra;
    private String codigoFactura;
    
    //Constructor Vacio

    public Factura() {
    }


    
    //Constructor unico que contiene los atributos de la clase

    public Factura(Date fechaCompra, String codigoFactura) {
        this.fechaCompra = fechaCompra;
        this.codigoFactura = codigoFactura;
    }

    //cosntructor que contiene los atributos de la clase y el de la composicion
    public Factura(Cliente comprador, Personal_Laboral empleados, Date fechaCompra, String codigoFactura) {    
        this.comprador = comprador;
        this.empleados = empleados;
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

   
    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    @Override
    public String toString() {
        return "Factura{" + "comprador=" + comprador + ", empleados=" + empleados + ", fechaCompra=" + fechaCompra + ", codigoFactura=" + codigoFactura + '}';
    }
    
    

}
