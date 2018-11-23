
package Modelo;
import java.util.ArrayList;
/**
 *
 * @author Jhon
 */
public class Articulos {
//Atributos unicos de la clase
    //realizando una composicion de muchos a muchos 
    ArrayList<Proveedor> proveedor; 
    private String codigoProducto;
    private double precioOriginal;
    private double pvp;
    private String caracteristicasProducto;
    private int cantDisParaVenta;
    private int cantVendidaProducto;
    private String tipoDeProducto;
    private boolean disponivilidadProducto;

    //Constructor vacio
    public Articulos() {
    }
    
    //Costructor con los metodos propios de la clase
    public Articulos(String codigoProducto, double precioOriginal, double pvp, String caracteristicasProducto, int cantDisParaVenta, int cantVendidaProducto, String tipoDeProducto, boolean disponivilidadProducto) {
        this.codigoProducto = codigoProducto;
        this.precioOriginal = precioOriginal;
        this.pvp = pvp;
        this.caracteristicasProducto = caracteristicasProducto;
        this.cantDisParaVenta = cantDisParaVenta;
        this.cantVendidaProducto = cantVendidaProducto;
        this.tipoDeProducto = tipoDeProducto;
        this.disponivilidadProducto = disponivilidadProducto;
    }
    //Constructor que contiene la compisicion
    //La diferencia es que el constructor anterior no contiene el arrayList
    public Articulos(ArrayList<Proveedor> proveedor, String codigoProducto, double precioOriginal, double pvp, String caracteristicasProducto, int cantDisParaVenta, int cantVendidaProducto, String tipoDeProducto, boolean disponivilidadProducto) {
        this.proveedor = proveedor;
        this.codigoProducto = codigoProducto;
        this.precioOriginal = precioOriginal;
        this.pvp = pvp;
        this.caracteristicasProducto = caracteristicasProducto;
        this.cantDisParaVenta = cantDisParaVenta;
        this.cantVendidaProducto = cantVendidaProducto;
        this.tipoDeProducto = tipoDeProducto;
        this.disponivilidadProducto = disponivilidadProducto;
    }
    
    //metodos get

    public ArrayList<Proveedor> getProveedor() {
        return proveedor;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public double getPrecioOriginal() {
        return precioOriginal;
    }

    public double getPvp() {
        return pvp;
    }

    public String getCaracteristicasProducto() {
        return caracteristicasProducto;
    }

    public int getCantDisParaVenta() {
        return cantDisParaVenta;
    }

    public int getCantVendidaProducto() {
        return cantVendidaProducto;
    }

    public String getTipoDeProducto() {
        return tipoDeProducto;
    }

    public boolean isDisponivilidadProducto() {
        return disponivilidadProducto;
    }
    
    //metodos set

    public void setProveedor(ArrayList<Proveedor> proveedor) {
        this.proveedor = proveedor;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setPrecioOriginal(double precioOriginal) {
        this.precioOriginal = precioOriginal;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    public void setCaracteristicasProducto(String caracteristicasProducto) {
        this.caracteristicasProducto = caracteristicasProducto;
    }

    public void setCantDisParaVenta(int cantDisParaVenta) {
        this.cantDisParaVenta = cantDisParaVenta;
    }

    public void setCantVendidaProducto(int cantVendidaProducto) {
        this.cantVendidaProducto = cantVendidaProducto;
    }

    public void setTipoDeProducto(String tipoDeProducto) {
        this.tipoDeProducto = tipoDeProducto;
    }

    public void setDisponivilidadProducto(boolean disponivilidadProducto) {
        this.disponivilidadProducto = disponivilidadProducto;
    }
    
}
