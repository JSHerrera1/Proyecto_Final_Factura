package facturacion;

import Controlador.Articulos;
import Controlador.Cliente;
import Controlador.Detalle_factura;
import Controlador.Factura;
import Controlador.Personal_laboral;
import Controlador.Proveedor;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Facturacion {

    public static void main(String[] args) throws ParseException {
        String fechaC = "1992-11-09";
        String fechaP = "1992-01-09";
        String fechaPr = "1992-08-09";
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaCli = format.parse(fechaC);
        Date fechaPer = format.parse(fechaP);

        Cliente c = new Cliente("juan", "Bermeo", "1104121423",
                "mercadillo - 10 de agosto", "2324532", "Loja", fechaCli);
        System.out.println(c.toString());

        Personal_laboral p = new Personal_laboral("admin", "admin", "Angel",
                "Camachi", "1104121545", "Avenida Universitaria y 18 de noviembre",
                "2435234", "Loja", fechaPer);
        System.out.println("\n" + p.toString());

        Articulos a = new Articulos("art123", 12.50, 14.00, "leche en polvo",
                20, "existe", "jabon");
        Articulos a1 = new Articulos("art12", 5.00, 6.00, "pañal", 10, "existe", "bebe");
        ArrayList<Articulos> articulos = new ArrayList<>();
        articulos.add(a);
        articulos.add(a1);
        System.out.println(a.toString());

        Proveedor proveedor = new Proveedor(articulos,
                "bebeMundo", "Juan", "Perez", "1102321234", "Zamora Huayco",
                "2345123", "Loja", fechaPer);
        System.out.println(proveedor.toString());

//***** Creacion del detalle de compra del cliente
        ArrayList<Detalle_factura>  al = new ArrayList<>();
        Detalle_factura d1 = new Detalle_factura(a, 1);
        Detalle_factura d2 = new Detalle_factura(a1, 20);
        al.add(d2);
        al.add(d1);
        System.out.println(al.toString());

        java.util.Date fecha = new Date();
        Factura factura = new Factura("FACT123", fecha, "bien",
                al, c,12.1,12.2, p);
        System.out.println(factura.toString());

    }

}
