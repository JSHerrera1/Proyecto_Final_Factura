package Vista;

import Controlador.Articulos;
import Controlador.Proveedor;
import Modelo.Modelo_articulo;
import Modelo.Modelo_proveedor;
import java.awt.HeadlessException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Registrar_proveedor extends javax.swing.JFrame {

    String nombreEmpresa;
    String cedula;
    String nombre;
    String apellido;
    String direccion;
    String telefono;
    String ciudad;
    Date nacimiento;
    Proveedor pr;
    Articulos a;
    Modelo_proveedor mpr = new Modelo_proveedor();
    Modelo_articulo art = new Modelo_articulo();
    DefaultTableModel mdlArticulo;
    DefaultTableModel mdlProveedor;
    Vector cabeceraArticulo = new Vector();
    Vector cabeceraProveedor = new Vector();

    public Registrar_proveedor() throws IOException, ParseException {
        initComponents();
        cabeceraArticulos();
        /*llamamos al metodo donde verificamos si existe el archivo
        estas lineas seran las primeras que se ejecuten al momento de cargar
        la gui*/
        if (art.existe() == true) {
            limpiarTablaArticulo();
            cargarTablaArticulo();
        }
        /*metodo para colocar los nombres de las colunas de la tabla*/
        cabeceraProveedor();
        if (mpr.existe() == true) {
            limpiarTablaProveedor();
            cargarTablaProveedor();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombreE = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        dateNacimiento = new datechooser.beans.DateChooserCombo();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProveedor = new javax.swing.JTable();
        btRegistrar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbArticulo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registrar Proveedores");

        jLabel2.setText("Nombre empresa:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido:");

        jLabel5.setText("Cedula:");

        jLabel6.setText("Direccion:");

        jLabel7.setText("Telefono:");

        jLabel8.setText("Ciudad:");

        jLabel9.setText("Fecha nacimiento:");

        tbProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbProveedor);

        btRegistrar.setText("Registrar");
        btRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarActionPerformed(evt);
            }
        });

        jLabel10.setText("Articulos:");

        tbArticulo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbArticulo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbArticuloMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbArticulo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(353, 353, 353)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCedula, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombreE, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtApellido)
                                            .addComponent(txtCiudad)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dateNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(btRegistrar))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10)))
                        .addGap(0, 245, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8))
                            .addComponent(txtCiudad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9))
                    .addComponent(dateNacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btRegistrar)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*metodo para enviar los nombres de las comlumnas*/
    public void cabeceraArticulos() {
        cabeceraArticulo.addElement("Codigo Artiuclo");
        cabeceraArticulo.addElement("Precio Venta");
        cabeceraArticulo.addElement("Precio Original");
        cabeceraArticulo.addElement("Descripcion");
        cabeceraArticulo.addElement("Existencia");
        cabeceraArticulo.addElement("Estado");
        cabeceraArticulo.addElement("Tipo");
        mdlArticulo = new DefaultTableModel(cabeceraArticulo, 0);
        tbArticulo.setModel(mdlArticulo);
    }

    public void cargarTablaArticulo() throws IOException {
        String[] registro = new String[7];
        /*obtenemos el numero de articulos existente por los metodos del
        paquete modelo*/
        int lim = art.numeroArticulos();
        /*creamos un arraylist para que los datos del archivo se almacenen
        en esta variable*/
        Articulos[] arrayArticulos = new Articulos[lim];
        /*obtnemos todos los datos del archivo*/
        art.reporteArticulos(arrayArticulos);
        //ordena los articulos por el parametro existencia
        //menor a mayor
        art.ordenar(arrayArticulos);
        /*enviamos los datos en las columnas que pertenecen por medio de la 
        varible registro y enviando el numero de columna junto con el parametro*/
        for (Articulos a : arrayArticulos) {
            registro[0] = a.getCodigoArticulo();
            registro[1] = String.valueOf(a.getPrecioVenta());
            registro[2] = String.valueOf(a.getPrecioOriginal());
            registro[3] = a.getDescripcion();
            registro[4] = String.valueOf(a.getExistencia());
            registro[5] = a.getEstado();
            registro[6] = String.valueOf(a.getTipo());
            mdlArticulo.addRow(registro);
        }
    }

    /*metodo para vaciar toda la tabla ya k sin este metodo
    se repitirian los datos al momento de cargar la tabla*/
    private void limpiarTablaArticulo() {
        for (int i = 0; i < tbArticulo.getRowCount(); i++) {
            mdlArticulo.removeRow(i);
            System.out.println("limpiar");
            i -= 1;
        }
    }

    public void cabeceraProveedor() {
        cabeceraProveedor.addElement("Empresa");
        cabeceraProveedor.addElement("CI");
        cabeceraProveedor.addElement("Nombre");
        cabeceraProveedor.addElement("Apellido");
        cabeceraProveedor.addElement("Direccion");
        cabeceraProveedor.addElement("Ciudad");
        cabeceraProveedor.addElement("Telefono");
        cabeceraProveedor.addElement("Nacimiento");
        //para cargar nuevo modelo de la tabla
        mdlProveedor = new DefaultTableModel(cabeceraProveedor, 0);
        //envio del modelo
        tbProveedor.setModel(mdlProveedor);
    }

    public void cargarTablaProveedor() throws IOException, ParseException {
        String[] registro = new String[8];
        int lim = mpr.numeroProveedores();
        Proveedor[] arrayProveedores = new Proveedor[lim];
        mpr.reporteProveedores(arrayProveedores);
        //ordena a los proveedores por el parametro cedula
        mpr.ordenar(arrayProveedores);
        for (Proveedor proveedor : arrayProveedores) {
            registro[0] = proveedor.getNombreEmpresa();
            registro[1] = proveedor.getCi();
            registro[2] = proveedor.getNombre();
            registro[3] = proveedor.getApellido();
            registro[4] = proveedor.getDireccion();
            registro[5] = proveedor.getCiudad();
            registro[6] = proveedor.getTelefono();
            /*cambaindo la fecha a cadena*/
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String today = formatter.format(proveedor.getFechaNacimiento());
            registro[7] = String.valueOf(today);
            mdlProveedor.addRow(registro);
        }
    }

    private void limpiarTablaProveedor() {
        for (int i = 0; i < tbProveedor.getRowCount(); i++) {
            mdlProveedor.removeRow(i);
            i -= 1;
        }
    }

    private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarActionPerformed
        nombreEmpresa = txtNombreE.getText().toUpperCase();
        cedula = txtCedula.getText();
        nombre = txtNombre.getText().toUpperCase();
        apellido = txtApellido.getText().toUpperCase();
        direccion = txtDireccion.getText().toUpperCase();
        telefono = txtTelefono.getText();
        ciudad = txtCiudad.getText().toUpperCase();
        String fecha = dateNacimiento.getText();
        ArrayList<Articulos> ae = new ArrayList<>();
        DateFormat format = new SimpleDateFormat("dd/MM/YY");
        try {
            nacimiento = format.parse(fecha);
            int fila = tbArticulo.getSelectedRow();
            if (fila != -1) {
                String codArticulo;
                double precioOriginal;
                double precioVenta;
                String descripcion;
                int existencia;
                String estado;
                String tipo;
                /*estas lineas no permiten saber que articulo escojimos en la tabla
                    obteniendo los valores de cada columna para crear un articulo y asignarle
                    al proveedor*/
                for (int i = fila; i == fila; i++) {
                    codArticulo = mdlArticulo.getValueAt(i, 0).toString();
                    precioVenta = Double.parseDouble(mdlArticulo.getValueAt(i, 1).toString());
                    precioOriginal = Double.parseDouble(mdlArticulo.getValueAt(i, 2).toString());
                    descripcion = mdlArticulo.getValueAt(i, 3).toString();
                    existencia = Integer.parseInt(mdlArticulo.getValueAt(i, 4).toString());
                    estado = mdlArticulo.getValueAt(i, 5).toString();
                    tipo = mdlArticulo.getValueAt(i, 6).toString();
                    a = new Articulos(codArticulo, precioOriginal, precioVenta, descripcion, existencia, estado, tipo);
                }
            } else {
                /*mensaje por medio de interfaz al usuario que debe elegir articulo*/
                JOptionPane.showMessageDialog(null, "Elija Articulo");
            }
            ae.add(a);
            pr = new Proveedor(ae, nombreEmpresa, nombre, apellido, cedula, direccion, telefono, ciudad, nacimiento);
            /*condicional para verificar si todos los datos han sido ingresados*/
            if (cedula.length() != 0 && nombre.length() != 0 && apellido.length() != 0
                    && direccion.length() != 0 && telefono.length() != 0
                    && ciudad.length() != 0 && nombreEmpresa.length() != 0) {
                /*enviamos proveedor al metodo para ser almacenados en el archivo*/
                mpr.registrarProveedor(pr);
                JOptionPane.showMessageDialog(null, "Datos almacenados.");
                cargarTablaProveedor();
            } else {
                JOptionPane.showMessageDialog(null, "Llenar Campos");
            }
        } catch (ParseException | HeadlessException | NumberFormatException ex) {
            Logger.getLogger(Registro_cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Registrar_proveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btRegistrarActionPerformed

    private void tbArticuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbArticuloMouseClicked
    }//GEN-LAST:event_tbArticuloMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Registrar_proveedor().setVisible(true);
            } catch (IOException | ParseException ex) {
                Logger.getLogger(Registrar_proveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRegistrar;
    private datechooser.beans.DateChooserCombo dateNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbArticulo;
    private javax.swing.JTable tbProveedor;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreE;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
