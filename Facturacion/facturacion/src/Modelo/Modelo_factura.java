package Modelo;

import Controlador.Cliente;
import Controlador.Detalle_factura;
import Controlador.Factura;
import Controlador.Personal_laboral;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class Modelo_factura {

     String archivoR = "./txt/Factura.txt";
     File TextFile;
    FileReader fr;
    BufferedReader bf;
    
    /*este metodo es el mas fuerte ya que se necesita acceso a todas las clases
    CLIENTE, PERSONAL_LABORAL son simples ya que se necesita solo un cliente y 
    un empleado pero el DETALLE FACTURA es una array list por el motivo de que 
    la factura tiene más de un articulo*/
    public void registrarFactura(Factura f) throws IOException {
        TextFile = new File(archivoR);
         Cliente cliente = f.getCliente();
        ArrayList<Detalle_factura> detalleFactura = f.getDetalleFactura();
        Personal_laboral personal_laboral = f.getPersonal_laboral();
        String codigoFactura = f.getCodigoFactura();
        Date fechaCompra = f.getFechaCompra();
        double subtotal = f.getSubtotal();
        double total = f.getTotal();
        try (FileWriter TextOut = new FileWriter(TextFile, true)) {
            /*ciclo for para poder realizar el detalle de la factura 
            e almacenar los paramteros necesarios*/
            for (Detalle_factura detalle_factura : detalleFactura) {
                TextOut.write(
                        f.getCodigoFactura()+";"
                        +f.getCliente().getCi()+";"
                        +detalle_factura.getArticulos().getCodigoArticulo()+";"
                        +detalle_factura.getCantVendida()+";"
                        +f.getFechaCompra()+";"
                        +personal_laboral.getCi()+";"
                        +f.getSubtotal()+";"
                        +f.getTotal()+"\n"
                );
            }
        }  
    }
    
    /*este metodo sirve para calcular el subtotal con el iva
    del 12%*/
    public double iva(Double subTotal){
        Double sub = subTotal*0.12;
        return sub+subTotal;
    }
    
}
