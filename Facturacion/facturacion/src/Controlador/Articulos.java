package Controlador;

public class Articulos {

    public String codigoArticulo;

    protected double precioOriginal;

    protected double precioVenta;

    protected String descripcion;

    protected int existencia;

    protected String estado;

    protected String tipo;

    public Articulos() {
    }

    public Articulos(String codigoArticulo, double precioOriginal,
            double precioVenta, String descripcion, int existencia,
            String estado, String tipo) {
        this.codigoArticulo = codigoArticulo;
        this.precioOriginal = precioOriginal;
        this.precioVenta = precioVenta;
        this.descripcion = descripcion;
        this.existencia = existencia;
        this.estado = estado;
        this.tipo = tipo;
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public double getPrecioOriginal() {
        return precioOriginal;
    }

    public void setPrecioOriginal(double precioOriginal) {
        this.precioOriginal = precioOriginal;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\nArticulos{" + "codigoArticulo=" + codigoArticulo
                + ", precioOriginal=" + precioOriginal + ", precioVenta="
                + precioVenta + ", descripcion=" + descripcion
                + ", existencia=" + existencia + ", estado=" + estado
                + ", tipo=" + tipo + '}';
    }

}
