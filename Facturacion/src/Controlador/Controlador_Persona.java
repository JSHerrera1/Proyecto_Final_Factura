package Controlador;

import Modelo.Cliente; //importo la clase cliente del paquete modelo
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Jhon
 */
public class Controlador_Persona {

    String ruta = "C:\\Users\\TOSHIBA\\Desktop\\Nueva carpeta\\Facturacion\\txt\\Cliente.txt"; //Almacenamiento de datos en un txt
    File archivo; //File para crar archivos 
    FileReader leerArchivo;//Leer los arcivos
    BufferedReader escribir;//Escribir los archivos

    //Metodo que no retorna ningun valor
    //Escribir en el archivo
    //Crea un objeto
    public void registrarCliente(Cliente cliente) throws IOException {
        archivo = new File(ruta);//Crear el archivo  
        try (FileWriter TextOut = new FileWriter(archivo, true)) { //Manejo de ecepcion para crear el archivo
            TextOut.write(String.valueOf(cliente.getId() + "*" + cliente.getNombre()
                    + "*" + cliente.getApellido() + "*" + cliente.getNumTelf()
                    + "*" + cliente.getDireccion() + "*" + cliente.getCiudad())
                    + "*" + cliente.getCodigoClienteEmpresa()); //Enviar los parametros para que se escriban en el archivo
        }
    }

}
