package Modelo;

import Controlador.Cliente;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Modelo_cliente {

    String archivoR = "./txt/Cliente.txt";
    File TextFile;
    FileReader fr;
    BufferedReader bf;

    public boolean existe() {
        File archivo = new File(archivoR);
        return archivo.exists();
    }

    public void registrarCliente(Cliente cliente) throws IOException {
        TextFile = new File(archivoR);
        try (FileWriter TextOut = new FileWriter(TextFile, true)) {
            TextOut.write(
                    cliente.getCi()
                    + ";" + cliente.getNombre()
                    + ";" + cliente.getApellido()
                    + ";" + cliente.getDireccion()
                    + ";" + cliente.getCiudad()
                    + ";" + cliente.getTelefono()
                    + ";" + cliente.getFechaNacimiento()
                    + "\n");
        }
    }

    public void reporteCliente(Cliente[] arrayCliente) throws ParseException {
        TextFile = new File(archivoR);
        int iNumero = 0;
        StringTokenizer st;
        Scanner entrada = null;
        String sCadena;
        try {
            entrada = new Scanner(TextFile);
            while (entrada.hasNext()) {
                arrayCliente[iNumero] = new Cliente();
                sCadena = entrada.nextLine();
                st = new StringTokenizer(sCadena, ";");
                while (st.hasMoreTokens()) {
                    arrayCliente[iNumero].setCi(st.nextToken());
                    arrayCliente[iNumero].setNombre(st.nextToken());
                    arrayCliente[iNumero].setApellido(st.nextToken());
                    arrayCliente[iNumero].setDireccion(st.nextToken());
                    arrayCliente[iNumero].setCiudad(st.nextToken());
                    arrayCliente[iNumero].setTelefono(st.nextToken());
                    String valor = st.nextToken();
                    /*en este caso la fecha se encuentra en un STRING para esto se debe convertir 
                    a tipo DATE para enviar a la clase*/
                    SimpleDateFormat parserSDF = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.US);
                    Date date = parserSDF.parse(valor);
                    arrayCliente[iNumero].setFechaNacimiento(date);
                    iNumero++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }
    }

    public int numeroClientes() throws FileNotFoundException, IOException {
        fr = new FileReader(archivoR);
        bf = new BufferedReader(fr);
        long lNumeroLineas = 0;
        String sCadena;
        while ((sCadena = bf.readLine()) != null) {
            lNumeroLineas++;
        }
        return (int) lNumeroLineas;
    }

    public void buscarCliente(String cedula, Cliente c) throws FileNotFoundException, ParseException {
        TextFile = new File(archivoR);
        Scanner entrada = null;
        entrada = new Scanner(TextFile);
        String sCadena = null;
        int iNumero = 0;
        try {
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                String[] partes = linea.split(";");
                if (partes[0].contains(cedula)) {
                    StringTokenizer st;
                    st = new StringTokenizer(linea, ";");
                    while (st.hasMoreTokens()) {
                        c.setCi(st.nextToken());
                        c.setNombre(st.nextToken());
                        c.setApellido(st.nextToken());
                        c.setDireccion(st.nextToken());
                        c.setCiudad(st.nextToken());
                        c.setTelefono(st.nextToken());
                        String valor = st.nextToken();
                        SimpleDateFormat parserSDF = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.US);
                        Date date = parserSDF.parse(valor);
                        c.setFechaNacimiento(date);
                    }
                }
            }
        } catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        }
    }
    
    public void ordenar(Cliente[] clientes){
        // metodo de ordenamiento burbuja
        int i=0;
        Cliente aux;
        for (int j = 0; j < clientes.length-1; j++) {
            for (int k = 0; k < clientes.length-i-1; k++) {
                if(Integer.parseInt(clientes[k+1].getCi())<Integer.parseInt(clientes[k].getCi())){
                    aux =clientes[k+1];
                    clientes[k+1]=clientes[k];
                    clientes[k]=aux;
                }
            }
        }
    } 
}
