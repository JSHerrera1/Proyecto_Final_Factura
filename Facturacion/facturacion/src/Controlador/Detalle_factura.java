package Controlador;

public class Detalle_factura {

    Articulos articulos;
    int cantVendida;

    public Detalle_factura() {
    }

    public Detalle_factura(Articulos articulos, int cantVendida) {
        this.articulos = articulos;
        this.cantVendida = cantVendida;
    }

    public Articulos getArticulos() {
        return articulos;
    }

    public void setArticulos(Articulos articulos) {
        this.articulos = articulos;
    }

    public int getCantVendida() {
        return cantVendida;
    }

    public void setCantVendida(int cantVendida) {
        this.cantVendida = cantVendida;
    }

    @Override
    public String toString() {
        return "\nDetalle_factura{" + "articulos=" + articulos + ", cantVendida=" + cantVendida + '}';
    }

   
}
