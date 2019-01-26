package Vista;

import Controlador.Personal_laboral;
import Modelo.Modelo_personal;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Registro_personal extends javax.swing.JFrame {

    Personal_laboral p = new Personal_laboral();
    Modelo_personal mp = new Modelo_personal();
    DefaultTableModel mdlTableModel;
    String cedula;
    String nombre;
    String apellido;
    String direccion;
    String telefono;
    String ciudad;
    Date fechaNacimiento;
    String usuario;
    String contrasena;

    public Registro_personal() throws ParseException, IOException {
        initComponents();
        cabeceras();
        if (mp.existe() == true) {
            limpiarTabla();
            llenarTabla();
        }
    }

    void limpiarTxt() {
        txtApellido.setText("");
        txtCedula.setText("");
        txtCiudad.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtNombre.setText("");
        txtUsuario.setText("");
        psContrasena.setText("");
    }

    public void cabeceras() {
        Vector cabeceras = new Vector();
        cabeceras.addElement("CI");
        cabeceras.addElement("Nombre");
        cabeceras.addElement("Apellido");
        cabeceras.addElement("Direccion");
        cabeceras.addElement("Telefono");
        cabeceras.addElement("Ciudad");
        cabeceras.addElement("Usuario");
        cabeceras.addElement("Contraseña");
        cabeceras.addElement("Nacimiento");
        mdlTableModel = new DefaultTableModel(cabeceras, 0);
        tbPersonal.setModel(mdlTableModel);
    }

    void llenarTabla() throws ParseException, IOException {
        String[] registro = new String[9];
        int lim = mp.numeroPersonal();
        Personal_laboral[] ArrayUsuario = new Personal_laboral[lim];
        mp.reportePersonal(ArrayUsuario);
        //ordena a los de personal laboral por el parametro cedula
        mp.ordenar(ArrayUsuario);
        for (Personal_laboral usuario : ArrayUsuario) {
            registro[0] = usuario.getCi();
            registro[1] = usuario.getNombre();
            registro[2] = usuario.getApellido();
            registro[3] = usuario.getDireccion();
            registro[4] = usuario.getTelefono();
            registro[5] = usuario.getCiudad();
            registro[6] = usuario.getUsuario();
            registro[7] = usuario.getContrasena();
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String today = formatter.format(usuario.getFechaNacimiento());
            registro[8] = String.valueOf(today);
            mdlTableModel.addRow(registro);
        }
    }

    private void limpiarTabla() {
        for (int i = 0; i < tbPersonal.getRowCount(); i++) {
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        dcNacimiento = new datechooser.beans.DateChooserCombo();
        btRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPersonal = new javax.swing.JTable();
        psContrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registro Personal");

        jLabel2.setText("Cedula:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido:");

        jLabel5.setText("Direccion:");

        jLabel6.setText("Telefono:");

        jLabel7.setText("Ciudad:");

        jLabel8.setText("Usuario:");

        jLabel9.setText("Contraseña:");

        jLabel10.setText("Fecha de nacimiento:");

        btRegistrar.setText("Registrar");
        btRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarActionPerformed(evt);
            }
        });

        tbPersonal.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbPersonal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(165, 165, 165)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(78, 78, 78)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDireccion)
                                .addComponent(txtApellido)
                                .addComponent(txtNombre)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCedula)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGap(67, 67, 67)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUsuario)
                                .addComponent(txtCiudad, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(psContrasena)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dcNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 362, Short.MAX_VALUE)
                .addComponent(btRegistrar)
                .addGap(304, 304, 304))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(psContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(dcNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btRegistrar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarActionPerformed
        cedula = txtCedula.getText().toUpperCase();
        nombre = txtNombre.getText().toUpperCase();
        apellido = txtApellido.getText().toUpperCase();
        direccion = txtDireccion.getText().toUpperCase();
        telefono = txtTelefono.getText();
        ciudad = txtCiudad.getText().toUpperCase();
        usuario = txtUsuario.getText();
        /*para obtener la contraseña se obtiene con esta linea*/
        contrasena = String.valueOf(psContrasena.getPassword());
        String fecha = dcNacimiento.getText();
        DateFormat format = new SimpleDateFormat("d/MM/yy");
        try {
            fechaNacimiento = format.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(Registro_cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        p = new Personal_laboral(usuario, contrasena, nombre, apellido, cedula,
                direccion, telefono, ciudad, fechaNacimiento);
        if (cedula.length() != 0 && nombre.length() != 0 && apellido.length() != 0
                && direccion.length() != 0 && telefono.length() != 0 && ciudad.length() != 0
                && usuario.length() != 0 && contrasena.length() != 0) {
            try {
                mp.registrarPersonal(p);
                limpiarTxt();
                limpiarTabla();
                llenarTabla();
            } catch (IOException | ParseException ex) {
                Logger.getLogger(Registro_personal.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Datos almacenados.");
        } else {
            JOptionPane.showMessageDialog(null, "Llenar Campos");
        }
    }//GEN-LAST:event_btRegistrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Registro_personal().setVisible(true);
            } catch (ParseException | IOException ex) {
                Logger.getLogger(Registro_personal.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRegistrar;
    private datechooser.beans.DateChooserCombo dcNacimiento;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField psContrasena;
    private javax.swing.JTable tbPersonal;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
