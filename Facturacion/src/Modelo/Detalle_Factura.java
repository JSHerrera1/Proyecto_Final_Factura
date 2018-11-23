
package Modelo;
import java.util.ArrayList;
/**
 *
 * @author Jhon
 */
public class Detalle_Factura {
    //Atributos de la clase
    //Composicion muchos a muchos
    ArrayList<Articulos> detalle;
    //Composicion uno a muchos
    Factura facturacion;
    private float IVA;
    private int cantidadVendida;
    private double descuento;
    private String descripcionProducto;
    private String codigoFactura;
    private String identificadorUnicoProducto;

    //Constructor vacio
    public Detalle_Factura() {
    }

    //constructor que contiene los atributos unicos de la clase
    public Detalle_Factura(float IVA, int cantidadVendida, double descuento, String descripcionProducto, String codigoFactura, String identificadorUnicoProducto) {
        this.IVA = IVA;
        this.cantidadVendida = cantidadVendida;
        this.descuento = descuento;
        this.descripcionProducto = descripcionProducto;
        this.codigoFactura = codigoFactura;
        this.identificadorUnicoProducto = identificadorUnicoProducto;
    }

    //Constructor que contiene la composicion y los atributos propios de la clase

    public Detalle_Factura(ArrayList<Articulos> detalle, Factura facturacion, float IVA, int cantidadVendida, double descuento, String descripcionProducto, String codigoFactura, String identificadorUnicoProducto) {
        this.detalle = detalle;
        this.facturacion = facturacion;
        this.IVA = IVA;
        this.cantidadVendida = cantidadVendida;
        this.descuento = descuento;
        this.descripcionProducto = descripcionProducto;
        this.codigoFactura = codigoFactura;
        this.identificadorUnicoProducto = identificadorUnicoProducto;
    }
   
    
    //Metodo get

    public ArrayList<Articulos> getDetalle() {
        return detalle;
    }

    public Factura getFacturacion() {
        return facturacion;
    }
    

    public float getIVA() {
        return IVA;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public double getDescuento() {
        return descuento;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public String getIdentificadorUnicoProducto() {
        return identificadorUnicoProducto;
    }
    
    //metodo set

    public void setDetalle(ArrayList<Articulos> detalle) {
        this.detalle = detalle;
    }

    public void setFacturacion(Factura facturacion) {
        this.facturacion = facturacion;
    }

    public void setIVA(float IVA) {
        this.IVA = IVA;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public void setIdentificadorUnicoProducto(String identificadorUnicoProducto) {
        this.identificadorUnicoProducto = identificadorUnicoProducto;
    }
    

}
