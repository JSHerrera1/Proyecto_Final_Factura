package Controlador;

import java.util.ArrayList;
import java.util.Date;

public class Factura {

    private String codigoFactura;

    private Date fechaCompra;

    private boolean estadoFactura;
    ArrayList<Detalle_factura> detalleFactura;
    Cliente cliente;
    double subtotal;
    double total;
    Personal_laboral personal_laboral;

    public Factura() {
    }

    public Factura(String codigoFactura, Date fechaCompra, 
            boolean estadoFactura, ArrayList<Detalle_factura> detalleFactura, 
            Cliente cliente, double subtotal, double total, 
            Personal_laboral personal_laboral) {
        this.codigoFactura = codigoFactura;
        this.fechaCompra = fechaCompra;
        this.estadoFactura = estadoFactura;
        this.detalleFactura = detalleFactura;
        this.cliente = cliente;
        this.subtotal = subtotal;
        this.total = total;
        this.personal_laboral = personal_laboral;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public boolean isEstadoFactura() {
        return estadoFactura;
    }

    public void setEstadoFactura(boolean estadoFactura) {
        this.estadoFactura = estadoFactura;
    }

    public ArrayList<Detalle_factura> getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(ArrayList<Detalle_factura> detalleFactura) {
        this.detalleFactura = detalleFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Personal_laboral getPersonal_laboral() {
        return personal_laboral;
    }

    public void setPersonal_laboral(Personal_laboral personal_laboral) {
        this.personal_laboral = personal_laboral;
    }

    @Override
    public String toString() {
        return "\nFactura{" + "codigoFactura=" + codigoFactura + ", fechaCompra=" + fechaCompra + ", estadoFactura=" + estadoFactura + ", detalleFactura=" + detalleFactura + ", cliente=" + cliente + ", subtotal=" + subtotal + ", total=" + total + ", personal_laboral=" + personal_laboral + '}';
    }

   
}
