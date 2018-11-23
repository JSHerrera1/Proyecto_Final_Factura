
package facturacion;

import Controlador.Controlador_Persona;
import Modelo.Cliente;
import Modelo.Factura;
import Modelo.Personal_Laboral;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author TOSHIBA
 */
public class Facturacion {

    public static void main(String[] args) throws ParseException, IOException {
        
        Cliente cliente1 = new Cliente();
        String fecha="20/01/2018";
        DateFormat format=new SimpleDateFormat("mm/dd/yyyy");
        Date ff = format.parse(fecha);
        Cliente cliente2 = new Cliente("456", "Jonathan", "Herrera", ff, "asdfghjk", "asdfghj", "asdfghjkl", "sdfghjk");
        System.out.println(cliente2.getApellido());
        cliente1.setApellido("dfghjk");
                System.out.println(cliente1.getApellido());
                Personal_Laboral empleado = new Personal_Laboral("admin", "admin");
                Factura factura1 = new Factura(cliente2, empleado, fecha, fecha, ff, fecha);
                System.out.println(factura1.getEmpleados().getContraseña());
                
                Controlador_Persona pers = new Controlador_Persona();
                pers.registarCliente(cliente2);
                

    }
    
}
