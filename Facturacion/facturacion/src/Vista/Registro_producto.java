package Vista;

import Controlador.Articulos;
import Modelo.Modelo_articulo;
import java.io.IOException;
import java.text.ParseException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Registro_producto extends javax.swing.JFrame {

    String codArticulo;
    double precioOriginal;
    double precioVenta;
    String descripcion;
    int existencia;
    String estado;
    String tipo;
    Articulos a;
    Modelo_articulo art = new Modelo_articulo();
    DefaultTableModel mdlTableModel;

    public Registro_producto() throws ParseException, IOException {
        initComponents();
        cabecera();
        if (art.existe() == true) {
            limpiarTabla();
            llenarTabla();
        }
    }

    public void limpiarTxt() {
        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtExistencia.setText("");
        txtOriginal.setText("");
        txtVenta.setText("");
    }

    public void cabecera() {
        Vector cabeceras = new Vector();
        cabeceras.addElement("Codigo Artiuclo");
        cabeceras.addElement("Precio Venta");
        cabeceras.addElement("Precio Original");
        cabeceras.addElement("Descripcion");
        cabeceras.addElement("Existencia");
        cabeceras.addElement("Estado");
        cabeceras.addElement("Tipo");
        mdlTableModel = new DefaultTableModel(cabeceras, 0);
        tbProducto.setModel(mdlTableModel);
    }

    void llenarTabla() throws ParseException, IOException {
        String[] registro = new String[7];
        int lim = art.numeroArticulos();
        Articulos[] arrayArticulos = new Articulos[lim];
        art.reporteArticulos(arrayArticulos);
        art.ordenar(arrayArticulos);
        for (Articulos a : arrayArticulos) {
            registro[0] = a.getCodigoArticulo();
            registro[1] = String.valueOf(a.getPrecioVenta());
            registro[2] = String.valueOf(a.getPrecioOriginal());
            registro[3] = a.getDescripcion();
            registro[4] = String.valueOf(a.getExistencia());
            registro[5] = a.getEstado();
            registro[6] = String.valueOf(a.getTipo());
            mdlTableModel.addRow(registro);
        }
    }

    private void limpiarTabla() {
        for (int i = 0; i < tbProducto.getRowCount(); i++) {
            mdlTableModel.removeRow(i);
            i -= 1;
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
        txtCodigo = new javax.swing.JTextField();
        txtOriginal = new javax.swing.JTextField();
        txtVenta = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtExistencia = new javax.swing.JTextField();
        cbEstado = new javax.swing.JComboBox<>();
        btRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProducto = new javax.swing.JTable();
        cbTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registro de producto");

        jLabel2.setText("Codigo Articulo:");

        jLabel3.setText("Precio Original:");

        jLabel4.setText("Precio Venta:");

        jLabel5.setText("Descripcion:");

        jLabel6.setText("Existencia:");

        jLabel7.setText("Estado:");

        jLabel8.setText("Tipo:");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVO", "INACTIVO" }));

        btRegistrar.setText("Registrar");
        btRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarActionPerformed(evt);
            }
        });

        tbProducto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbProducto);

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Higiene personal", "Viveres", "Cosmetico de belleza", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btRegistrar)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(txtExistencia)
                            .addComponent(txtDescripcion)
                            .addComponent(txtVenta)
                            .addComponent(txtOriginal))
                        .addGap(18, 18, 18)
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(316, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarActionPerformed
        codArticulo = txtCodigo.getText().toUpperCase();
        precioVenta = Double.parseDouble(txtVenta.getText());
        precioOriginal = Double.parseDouble(txtOriginal.getText());
        descripcion = txtDescripcion.getText().toUpperCase();
        existencia = Integer.parseInt(txtExistencia.getText());
        estado = (String) cbEstado.getSelectedItem();
        tipo = (String) cbTipo.getSelectedItem();
        a = new Articulos(codArticulo, precioOriginal, precioVenta,
                descripcion, existencia, estado.toUpperCase(), tipo.toUpperCase());
        if (codArticulo.length() != 0 && precioVenta >= 0 && precioOriginal >= 0
                && descripcion.length() != 0 && existencia >= 0
                && estado.length() != 0 && tipo.length() != 0) {
            try {
                art.registrarArticulos(a);
                limpiarTxt();
                limpiarTabla();
                llenarTabla();
            } catch (IOException | ParseException ex) {
                Logger.getLogger(Registro_producto.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Datos almacenados.");
        } else {
            JOptionPane.showMessageDialog(null, "Llenar Campos");
        }
    }//GEN-LAST:event_btRegistrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Registro_producto().setVisible(true);
            } catch (ParseException | IOException ex) {
                Logger.getLogger(Registro_producto.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRegistrar;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbProducto;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtOriginal;
    private javax.swing.JTextField txtVenta;
    // End of variables declaration//GEN-END:variables
}
