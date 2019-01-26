package Modelo;

import Controlador.Articulos;
import Controlador.Proveedor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Modelo_proveedor {

    String archivoR = "./txt/Proveedor.txt";
    File TextFile;
    FileReader fr;
    BufferedReader bf;
    String codigo = "";
    double preciosOriginal = 0;
    double precioVenta = 0;
    String descripcion = "";
    int cantidad = 0;
    String estado = "";
    String tipo = "";

    public boolean existe() {
        File archivo = new File(archivoR);
        return archivo.exists();
    }

    public void registrarProveedor(Proveedor p) throws IOException {
        TextFile = new File(archivoR);
        /*en este caso es un arraylist de articulos ya que un proveedir
        puede tener varios productos*/
        try (FileWriter TextOut = new FileWriter(TextFile, true)) {
            ArrayList<Articulos> nuevo = p.getArticulo();
            for (Articulos articulos : nuevo) {
                codigo = articulos.getCodigoArticulo();
                preciosOriginal = articulos.getPrecioOriginal();
                precioVenta = articulos.getPrecioVenta();
                descripcion = articulos.getDescripcion();
                cantidad = articulos.getExistencia();
                estado = articulos.getEstado();
                tipo = articulos.getTipo();
                TextOut.write(
                        p.getNombreEmpresa()
                        + ";" + p.getCi()
                        + ";" + p.getNombre()
                        + ";" + p.getApellido()
                        + ";" + p.getDireccion()
                        + ";" + p.getCiudad()
                        + ";" + p.getTelefono()
                        + ";" + p.getFechaNacimiento()
                        + ";" + codigo
                        + ";" + String.valueOf(preciosOriginal)
                        + ";" + String.valueOf(precioVenta)
                        + ";" + descripcion
                        + ";" + String.valueOf(cantidad)
                        + ";" + estado
                        + ";" + tipo
                        + "\n");
            }

        }
    }

    public int numeroProveedores() throws FileNotFoundException, IOException {
        fr = new FileReader(archivoR);
        bf = new BufferedReader(fr);
        long lNumeroLineas = 0;
        String sCadena;
        while ((sCadena = bf.readLine()) != null) {
            lNumeroLineas++;
        }
        return (int) lNumeroLineas;
    }

    public void reporteProveedores(Proveedor[] arrayProveedor) throws ParseException {
        TextFile = new File(archivoR);
        int iNumero = 0;
        StringTokenizer st;
        Scanner entrada = null;
        String sCadena;
        try {
            entrada = new Scanner(TextFile);
            while (entrada.hasNext()) {
                arrayProveedor[iNumero] = new Proveedor();
                sCadena = entrada.nextLine();
                st = new StringTokenizer(sCadena, ";");
                while (st.hasMoreTokens()) {
                    arrayProveedor[iNumero].setNombreEmpresa(st.nextToken());
                    arrayProveedor[iNumero].setCi(st.nextToken());
                    arrayProveedor[iNumero].setNombre(st.nextToken());
                    arrayProveedor[iNumero].setApellido(st.nextToken());
                    arrayProveedor[iNumero].setDireccion(st.nextToken());
                    arrayProveedor[iNumero].setCiudad(st.nextToken());
                    arrayProveedor[iNumero].setTelefono(st.nextToken());
                    String valor = st.nextToken();
                    SimpleDateFormat parserSDF = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.US);
                    Date date = parserSDF.parse(valor);
                    arrayProveedor[iNumero].setFechaNacimiento(date);
                    codigo = st.nextToken();
                    preciosOriginal = Double.parseDouble(st.nextToken());
                    precioVenta = Double.parseDouble(st.nextToken());
                    descripcion = st.nextToken();
                    cantidad = Integer.parseInt(st.nextToken());
                    estado = st.nextToken();
                    tipo = st.nextToken();
                    ArrayList<Articulos> a = new ArrayList<>();
                    Articulos a1 = new Articulos(codigo, preciosOriginal, 
                            precioVenta, descripcion, cantidad, estado, tipo);
                    a.add(a1);
                    arrayProveedor[iNumero].setArticulo(a);
                    iNumero++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }
    }
    public void ordenar(Proveedor[] proveedors){
        // metodo de ordenamiento burbuja
        int i=0;
        Proveedor aux;
        for (int j = 0; j < proveedors.length-1; j++) {
            for (int k = 0; k < proveedors.length-i-1; k++) {
                if(Integer.parseInt(proveedors[k+1].getCi())<Integer.parseInt(proveedors[k].getCi())){
                    aux =proveedors[k+1];
                    proveedors[k+1]=proveedors[k];
                    proveedors[k]=aux;
                }
            }
        }
    } 
}
