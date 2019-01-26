package Vista;

import Controlador.Articulos;
import Controlador.Cliente;
import Controlador.Detalle_factura;
import Controlador.Factura;
import Controlador.Personal_laboral;
import Modelo.Modelo_articulo;
import Modelo.Modelo_cliente;
import Modelo.Modelo_factura;
import Modelo.Modelo_personal;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Registro_factura extends javax.swing.JFrame {

    Modelo_cliente m = new Modelo_cliente();
    Modelo_articulo ma = new Modelo_articulo();
    Modelo_personal mp = new Modelo_personal();
    Modelo_factura mf = new Modelo_factura();
    Personal_laboral pl = new Personal_laboral();
    Articulos a = new Articulos();
    Cliente c = new Cliente();
    Factura f = new Factura();
    DefaultTableModel mdlTableModel;
    /*permite que todos los numeros dobles sean de 2 decimales*/
    private static DecimalFormat df2 = new DecimalFormat(".##");

    public Registro_factura() {
        initComponents();
        cargarCodigo();
        cargarFecha();
        cabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        lbCodigo = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        lbEstado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFactura = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbSubtotal = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
        lbApelllido = new javax.swing.JLabel();
        lbNombreP = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbNombreU = new javax.swing.JLabel();
        btArticulo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Facturacion");

        jLabel2.setText("Ci cliente:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido:");

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jLabel5.setText("Codigo Producto:");

        tbFactura.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbFactura);

        jLabel6.setText("Subtotal:");

        jLabel7.setText("Total:");

        jLabel8.setText("Usuario:");

        jLabel11.setText("Cantidad:");

        jLabel12.setText("Estado:");

        jLabel13.setText("Cod Factura:");

        jLabel14.setText("Fecha Factura:");

        btArticulo.setText("Registrar Articulo");
        btArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btArticuloActionPerformed(evt);
            }
        });

        jButton1.setText("Generar Factura");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(393, 393, 393))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(196, 196, 196)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(224, 224, 224)
                                    .addComponent(jLabel7)
                                    .addGap(75, 75, 75)
                                    .addComponent(lbTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btBuscar)
                                            .addComponent(lbNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbApelllido, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbNombreU, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel13)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel14)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btArticulo)))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13))
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(lbApelllido, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btBuscar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbNombreU, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btArticulo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbNombreP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jButton1))
                        .addGap(21, 21, 21))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*este metodo es para crear el codigo de factura
    solo con los caracteres de la variable chart*/
    public void cargarCodigo() {
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRST".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String randomStr = sb.toString();
        lbCodigo.setText(randomStr);
    }

    public void cargarFecha() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date today = Calendar.getInstance().getTime();
        String reportDate = df.format(today);
        lbFecha.setText(reportDate);
        lbEstado.setText("Activo");
    }

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        String ci = txtCedula.getText();
        String ciP = txtUsuario.getText();
        try {
            if (ci.length() != 0 && ciP.length() != 0) {
                m.buscarCliente(ci, c);
                mp.buscarPersonal(ciP, pl);
                /*sirve para enviar datos a la GUI*/
                lbApelllido.setText(c.getApellido());
                lbNombre.setText(c.getNombre());
                lbNombreU.setText(pl.getNombre());
            } else {
                JOptionPane.showMessageDialog(null, "Llenar Campos");
            }
        } catch (FileNotFoundException | ParseException ex) {
            Logger.getLogger(Registro_factura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    public void cabecera() {
        Vector cabeceras = new Vector();
        cabeceras.addElement("Codigo Producto");
        cabeceras.addElement("Detalle");
        cabeceras.addElement("Precio Venta");
        cabeceras.addElement("Cantidad");
        cabeceras.addElement("Valor");
        mdlTableModel = new DefaultTableModel(cabeceras, 0);
        tbFactura.setModel(mdlTableModel);
    }

    public void cargarTabla(ArrayList<Detalle_factura> d) {
       String[] registro = new String[6];
        for (Detalle_factura detalle_factura : d) {
         registro[0]= detalle_factura.getArticulos().getCodigoArticulo();
         registro[1]=detalle_factura.getArticulos().getDescripcion();
         /*fijate como se va navegando en las clases para obtener los datos*/
         registro[2]=String.valueOf(detalle_factura.getArticulos().getPrecioVenta());
         registro[3]=String.valueOf(detalle_factura.getCantVendida());
         /*calcula el valor total del producto, valor de compra * cantidad vendida
         del articulo comprado*/
         registro[4]=String.valueOf(detalle_factura.getCantVendida()*
                 detalle_factura.getArticulos().getPrecioVenta());
         mdlTableModel.addRow(registro);
        }
    }
    /*metodo para calcular el subtotal de factura junto con el total*/
    public void subTotal(){
        Double valor=0.0;
        Double aux=0.0;
        /*obtiene todos los articulos los suma almcenado en la variable aux
        como acumulador, luegonenvia el total para calcular el total
        */
        for (int i = 0; i < tbFactura.getRowCount(); i++) {
            valor = Double.parseDouble(String.valueOf(tbFactura.getValueAt(i, 4)));
            aux=valor+aux;
        }
        lbSubtotal.setText(String.valueOf(df2.format(aux)));
        Double total = mf.iva(aux);
        lbTotal.setText(String.valueOf(df2.format(total)));
    }
    
    private void btArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btArticuloActionPerformed
        String codigo = "";
        String cant = "";
        int cantidad = 0;
        codigo = txtCodigo.getText().toUpperCase();
        cant = txtCantidad.getText();
        try {
            if (codigo.length() != 0 && txtCantidad.getText().length() != 0) {
                cantidad = Integer.parseInt(cant);
                if (cantidad > 0) {
                    ma.buscarArticulo(codigo, a);
                    lbNombreP.setText(a.getDescripcion());
                    if(cantidad<=a.getExistencia()){
                    Detalle_factura d = new Detalle_factura(a, cantidad);
                    ArrayList<Detalle_factura> al = new ArrayList<>();
                    al.add(d);
                    cargarTabla(al);
                    subTotal();}
                    else{
                        JOptionPane.showMessageDialog(null, "Cantidad Incorrecta");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Cantidad Incorrecta");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Llenar Campos");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Registro_factura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btArticuloActionPerformed

    public ArrayList<Detalle_factura> productos() throws FileNotFoundException{
        ArrayList<Detalle_factura> al = new ArrayList<>();
        for (int i = 0; i < tbFactura.getRowCount(); i++) {
            ma.buscarArticulo((String) tbFactura.getValueAt(i,0), a);
            String valor = String.valueOf(tbFactura.getValueAt(i, 3));
            Detalle_factura d = new Detalle_factura(a, 
                    Integer.parseInt(valor));
            al.add(d); 
        }
        return al;
    }
    
    public void limpiar(){
        txtCantidad.setText("");
        txtCedula.setText("");
        txtCodigo.setText("");
        lbApelllido.setText("");
        lbNombre.setText("");
        lbNombreP.setText("");
        lbSubtotal.setText("");
        lbTotal.setText("");
    }
    
    public void limpiaTabla(){
        for (int i = 0; i < tbFactura.getRowCount(); i++) {
            mdlTableModel.removeRow(i);
            i -= 1;
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(lbApelllido.getText().length()!=0 && lbNombreU.getText().length()!=0
                && lbNombreP.getText().length()!=0){
            String cedula = txtCedula.getText();
            String cedulaA = txtUsuario.getText();
            String codigo = lbCodigo.getText();
            String fecha = lbFecha.getText();
            String estado = lbEstado.getText();
            /*esta parte remplaza una , por . y porder convertir de string a double*/
            Double subtotal = Double.parseDouble(lbSubtotal.getText().replace(",", "."));
            Double total = Double.parseDouble(lbTotal.getText().replace(",", "."));
            DateFormat format = new SimpleDateFormat("dd/MM/yy hh:mm");
            try {
                m.buscarCliente(cedula, c);
                mp.buscarPersonal(cedulaA, pl);
                ArrayList<Detalle_factura> des = productos();
                f = new Factura(codigo, format.parse(fecha), estado, des, c, subtotal, total, pl);
                mf.registrarFactura(f);
                JOptionPane.showMessageDialog(null, "Factura Registrada");
                limpiaTabla();
                limpiar();
                cargarCodigo();
            } catch (FileNotFoundException | ParseException ex) {
                Logger.getLogger(Registro_factura.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Registro_factura.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else {
                JOptionPane.showMessageDialog(null, "Llenar Campos");
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Registro_factura().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btArticulo;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbApelllido;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNombreP;
    private javax.swing.JLabel lbNombreU;
    private javax.swing.JLabel lbSubtotal;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTable tbFactura;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
