
package facturacion;

import Controlador.Controlador_Persona;
import Modelo.Articulos;
import Modelo.Cliente;
import Modelo.Detalle_Factura;
import Modelo.Factura;
import Modelo.Personal_Laboral;
import Modelo.Proveedor;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author TOSHIBA
 */
public class Facturacion {

    public static void main(String[] args) throws ParseException, IOException {
        Cliente c = new Cliente();
        c.setApellido("Bermeo");
        c.setNombre("Juan");
        c.setCiudad("Loja");
        c.setCodigoClienteEmpresa("codC12");
        c.setDireccion("Avenida 18 noviembre");
        DateFormat format=new SimpleDateFormat("dd-MM-yyyy");
        Date fechaCliente = format.parse("21-02-1993");
        c.setFechaNacimiento(fechaCliente);
        c.setId("11041213587");
        c.setNumTelf("072586458");
        System.out.println(c.toString());
        System.out.println("****************************");
        System.out.println(c.getApellido()+" - "+c.getCiudad());
        Date fechaPersonal = format.parse("14-09-1889");
        
        
        System.out.println("\nCreacion del personal laboral");
        Personal_Laboral p = new Personal_Laboral("root", "root", 
        "David", "Benitez", fechaPersonal, "11041254852","072584521", "Avenida villonaco", "Loja");
        System.out.println(p.toString());
        
        System.out.println("\n Creacion Proveedores");
        Date fechaProveedor = format.parse("29-02-1983");
        Proveedor pr = new Proveedor("Ecolac", "Juana", "Perez", fechaProveedor, "1105426584", "072456852", 
                "10 de agosto", "Loja");
        Proveedor pr2 = new Proveedor("NutriLech", "Cevas", "Antony", fechaProveedor, "110355544", "0725842654", 
                "Mercadillo", "Loja");
        System.out.println(pr.toString());
        
        System.out.println("\nCreacion de articulos");
        //Articulos ar = new Articulos("art123", 12.56, 14.00, "leche en funda", 15, 5, "lacteo", true);
        ArrayList<Proveedor> p1 = new ArrayList<>();
        p1.add(pr);
        p1.add(pr2);
        Articulos ar = new Articulos(p1,"art123", 12.56, 14.00, "leche en funda", 15, 5, "lacteo", true);
        System.out.println(ar.toString());
        System.out.println("\n Mensaje solo proveedor");
        System.out.println(ar.getProveedor());
        Date actual = new Date();
        DateFormat format1 =new SimpleDateFormat("dd-MM-yyyy");
        Date fechaFactura = format.parse("26-11-2018");
        
        System.out.println("\nMensaje Factura");
        Factura f = new Factura(c, p, fechaFactura, "fact45");
        System.out.println(f.toString());

//        Cliente cliente1 = new Cliente();//        DateFormat format=new SimpleDateFormat("dd-MM-yyyy");
//        String fecha="26-11-2018";
//        Date ff = format.parse(fecha);
//        Date fff = format.parse("10-10-1997");
//        System.out.println(fff);
        
      /*  
        
        Cliente cliente2 = new Cliente("456", "Jonathan", "Herrera", fechaAhora, "asdfghjk", "asdfghj", "asdfghjkl", "zamora");
        Cliente cliente3 = new Cliente("123","Victor", "Guaman",fechaAhora,"1900571250","0983212365" , "Paris y Brucelas", "Loja");
        
        System.out.println(cliente2.getApellido());
        System.out.println(cliente2.getCiudad());
        
        
        
               // System.out.println(cliente1.getApellido());
                Personal_Laboral empleado = new Personal_Laboral("admin", "admin");
                //Factura factura1 = new Factura(cliente2, empleado, fecha, fecha, ff, fecha);
                //System.out.println(factura1.getEmpleados().getContraseña());
                
                Controlador_Persona pers = new Controlador_Persona(); //Instanciar al controlar persona
                pers.registrarCliente(cliente2);                    //Almacenar datos en el txt
                pers.registrarCliente(cliente3);

        System.out.println(cliente2.toString());
        System.out.println(cliente3.toString());
*/
    }
    
}
