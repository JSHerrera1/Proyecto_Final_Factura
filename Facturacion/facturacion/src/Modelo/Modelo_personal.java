package Modelo;

import Controlador.Personal_laboral;
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

public class Modelo_personal {

    String archivoR = "./txt/Personal.txt";
    File TextFile;
    FileReader fr;
    BufferedReader bf;

    public boolean existe() {
        File archivo = new File(archivoR);
        return archivo.exists();
    }

    public void registrarPersonal(Personal_laboral p) throws IOException {
        TextFile = new File(archivoR);
        try (FileWriter TextOut = new FileWriter(TextFile, true)) {
            TextOut.write(
                    p.getCi()
                    + ";" + p.getNombre()
                    + ";" + p.getApellido()
                    + ";" + p.getDireccion()
                    + ";" + p.getCiudad()
                    + ";" + p.getTelefono()
                    + ";" + p.getFechaNacimiento()
                    + ";" + p.getUsuario()
                    + ";" + p.getContrasena()
                    + "\n");
        }
    }

    public void reportePersonal(Personal_laboral[] arrayCliente) throws ParseException {
        TextFile = new File(archivoR);
        int iNumero = 0;
        StringTokenizer st;
        Scanner entrada = null;
        String sCadena;
        try {
            entrada = new Scanner(TextFile);
            while (entrada.hasNext()) {
                arrayCliente[iNumero] = new Personal_laboral();
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
                    SimpleDateFormat parserSDF = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.US);
                    Date date = parserSDF.parse(valor);
                    arrayCliente[iNumero].setFechaNacimiento(date);
                    arrayCliente[iNumero].setUsuario(st.nextToken());
                    arrayCliente[iNumero].setContrasena(st.nextToken());
                    iNumero++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }
    }

    public int numeroPersonal() throws FileNotFoundException, IOException {
        fr = new FileReader(archivoR);
        bf = new BufferedReader(fr);
        long lNumeroLineas = 0;
        String sCadena;
        while ((sCadena = bf.readLine()) != null) {
            lNumeroLineas++;
        }
        return (int) lNumeroLineas;
    }
    
    public void buscarPersonal(String ci, Personal_laboral p) throws FileNotFoundException, ParseException{
        TextFile = new File(archivoR);
        Scanner entrada = null;
        entrada = new Scanner(TextFile);
        String sCadena = null;
        int iNumero = 0;
        try {
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                String[] partes = linea.split(";");
                if (partes[0].contains(ci)) {
                    StringTokenizer st;
                    st = new StringTokenizer(linea, ";");
                    while (st.hasMoreTokens()) {
                        p.setCi(st.nextToken());
                        p.setNombre(st.nextToken());
                        p.setApellido(st.nextToken());
                        p.setDireccion(st.nextToken());
                        p.setCiudad(st.nextToken());
                        p.setTelefono(st.nextToken());
                        String valor = st.nextToken();
                        SimpleDateFormat parserSDF = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.US);
                        Date date = parserSDF.parse(valor);
                        p.setFechaNacimiento(date);
                        p.setUsuario(st.nextToken());
                        p.setContrasena(st.nextToken());
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
    public void ordenar(Personal_laboral[] personal_laborals){
        // metodo de ordenamiento burbuja
        int i=0;
        Personal_laboral aux;
        for (int j = 0; j < personal_laborals.length-1; j++) {
            for (int k = 0; k < personal_laborals.length-i-1; k++) {
                if(Integer.parseInt(personal_laborals[k+1].getCi())<
                        Integer.parseInt(personal_laborals[k].getCi())){
                    aux =personal_laborals[k+1];
                    personal_laborals[k+1]=personal_laborals[k];
                    personal_laborals[k]=aux;
                }
            }
        }
    } 
}
