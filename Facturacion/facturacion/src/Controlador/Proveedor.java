package Controlador;

import java.util.ArrayList;
import java.util.Date;

public class Proveedor extends Persona {

    ArrayList<Articulos> articulo;//ALMACENAN DETALLES DEL ARTICULO
    protected String nombreEmpresa;

    public Proveedor() {
    }

    public Proveedor(ArrayList<Articulos> articulos, String nombreEmpresa,
            String nombre, String apellido, String ci, String direccion,
            String telefono, String ciudad, Date fechaNacimiento) {
        super(nombre, apellido, ci, direccion, telefono, ciudad,
                fechaNacimiento);
        articulo = articulos;
        this.nombreEmpresa = nombreEmpresa;
    }

    public ArrayList<Articulos> getArticulo() {
        return articulo;
    }

    public void setArticulo(ArrayList<Articulos> articulo) {
        this.articulo = articulo;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public String toString() {
        return "\nProveedor{" + "\narticulo=" + articulo + ", \nnombreEmpresa="
                + nombreEmpresa + '}';
    }

}
