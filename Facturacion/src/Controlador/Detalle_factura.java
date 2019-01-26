package Controlador;

import java.util.ArrayList;

public class Detalle_factura {

    ArrayList<Articulos> articulos;
    int cantidad;

    public Detalle_factura() {
    }

    public Detalle_factura(ArrayList<Articulos> articulo, int cantidad) {
        articulos = articulo;
        this.cantidad = cantidad;
    }

    public ArrayList<Articulos> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulos> articulos) {
        this.articulos = articulos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "\nDetalle_factura{" + "articulos=" + articulos + ", cantidad="
                + cantidad + '}';
    }

}
