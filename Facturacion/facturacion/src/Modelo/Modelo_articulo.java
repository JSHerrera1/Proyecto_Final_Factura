package Modelo;

import Controlador.Articulos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Modelo_articulo {
    // direccion del archivo k va ser almacenado los datos
    String archivoR = "./txt/Articulo.txt";
    //librerias para operaciones de leectura y escritura de archivos
    File TextFile;
    FileReader fr;
    BufferedReader bf;

   /*metodo para saber si el archivo existe o no para
     evitar error de archivo al momento de leer*/
    public boolean existe() {
        File archivo = new File(archivoR);
        return archivo.exists();
    }

    /*metodo para poder escribir un articulo en el archivo, 
    se envia como separador el ; y un salto de linea para 
    diferenciar un articulo*/
    public void registrarArticulos(Articulos a) throws IOException {
        TextFile = new File(archivoR);
        try (FileWriter TextOut = new FileWriter(TextFile, true)) {
            TextOut.write(
                    a.getCodigoArticulo()
                    + ";" + a.getDescripcion()
                    + ";" + a.getTipo()
                    + ";" + a.getExistencia()
                    + ";" + a.getPrecioOriginal()
                    + ";" + a.getPrecioVenta()
                    + ";" + a.getEstado()
                    + "\n");
        }
    }

    /*metodo para saber cuantos articulos existe, sirve para definir vector
    de articulos para cargar en la tabla*/
    public int numeroArticulos() throws FileNotFoundException, IOException {
        fr = new FileReader(archivoR);
        bf = new BufferedReader(fr);
        long lNumeroLineas = 0;
        String sCadena;
        /* contador de lineas para obtener el numero de articulos registrados
        realiza el conteo hasta que la cadena sea nulo, la cadena tendra las 
        lineas del archivo que esta leyendo*/
        while ((sCadena = bf.readLine()) != null) {
            lNumeroLineas++;
        }
        return (int) lNumeroLineas;
    }

    /*metodo para poder cargar los articulos en el tabla para esto 
    se lee el archivo y luego las lineas del archivo
    pero como se debe enviar a la clase ARTICULOS se utiliza el separador ;
    para indicar las columnas y formar la clase ARTICULOS*/
    public void reporteArticulos(Articulos[] arrayArticulos) {
        TextFile = new File(archivoR);
        int iNumero = 0;
        StringTokenizer st;
        Scanner entrada = null;
        String sCadena;
        try {
            entrada = new Scanner(TextFile);
            while (entrada.hasNext()) {
                arrayArticulos[iNumero] = new Articulos();
                sCadena = entrada.nextLine();
                /*se utiliza la funcion toquenizar ya que permite que cuando
                encuentre el ; lo hace pedasos para enviar a los parametros
                de la clase Articulos*/
                st = new StringTokenizer(sCadena, ";");
                while (st.hasMoreTokens()) {
                    arrayArticulos[iNumero].setCodigoArticulo(st.nextToken());
                    arrayArticulos[iNumero].setDescripcion(st.nextToken());
                    arrayArticulos[iNumero].setTipo(st.nextToken());
                    arrayArticulos[iNumero].setExistencia(Integer.parseInt(st.nextToken()));
                    arrayArticulos[iNumero].setPrecioOriginal(Double.
                            parseDouble(st.nextToken()));
                    arrayArticulos[iNumero].setPrecioVenta(Double.
                            parseDouble(st.nextToken()));
                    arrayArticulos[iNumero].setEstado(st.nextToken());
                    iNumero++;
                }
            }
            /*catch mostrara mensajes de error si existiera y mostrara en consola
            el error que se produjo sin interrumpir la ejecucion*/
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            /*metodo para cerrar el archivo y confirmar cambios*/
        } finally {
            entrada.close();
        }
    }
    
    /*metodo de busqueda secuencial, este metodo va linea por linea buscando
    el valor a buscar hasta encontrarlo y envira los datos a la vista*/
    public void buscarArticulo(String codigo, Articulos a) throws FileNotFoundException{
         TextFile = new File(archivoR);
        Scanner entrada = null;
        entrada = new Scanner(TextFile);
        String sCadena = null;
        int iNumero = 0;
        try {
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                String[] partes = linea.split(";");
                /*condicion para encontrar el valor a buscar lo cual ingresa el 
                codigo y va comprarndo con todos los codigos hasta que sean iguales*/
                if (partes[0].contains(codigo)) {
                    StringTokenizer st;
                    st = new StringTokenizer(linea, ";");
                    while (st.hasMoreTokens()) {
                        a.setCodigoArticulo(st.nextToken());
                        a.setDescripcion(st.nextToken());
                        a.setTipo(st.nextToken());
                        a.setExistencia(Integer.parseInt(st.nextToken()));
                        a.setPrecioOriginal(Double.parseDouble(st.nextToken()));
                        a.setPrecioVenta(Double.parseDouble(st.nextToken()));
                        a.setEstado(st.nextToken());
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
    
    /* este metodo permite ordenar de forma descendente los datos 
    para ser enviados a la tabla*/
    public void ordenar(Articulos[] articuloses){
        // metodo de ordenamiento burbuja
        int i=0;
        Articulos aux;
        for (int j = 0; j < articuloses.length-1; j++) {
            for (int k = 0; k < articuloses.length-i-1; k++) {
                if(articuloses[k+1].getExistencia() < 
                        articuloses[k].getExistencia()){
                    aux =articuloses[k+1];
                    articuloses[k+1]=articuloses[k];
                    articuloses[k]=aux;
                }
            }
        }
    } 
}
