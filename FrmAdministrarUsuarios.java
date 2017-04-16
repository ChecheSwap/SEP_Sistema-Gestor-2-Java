/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JJ.NAVARRETE
 */
public class FrmAdministrarUsuarios extends javax.swing.JFrame {

    public static FrmAdministrarUsuarios instancia;

    /**
     * Creates new form FrmEliminarUsuario
     */
    public FrmAdministrarUsuarios() {
        initComponents();
        instancia = this;
        jTableUsuarios.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                JTable table = (JTable) me.getSource();
                Point p = me.getPoint();
                int row = table.rowAtPoint(p);
                int col = table.columnAtPoint(p);
                if (me.getClickCount() == 2) {
                    try {
                        enviarDatos(row, col);
                    } catch (MyExcepcion ex) {

                    }
                }
            }

        });

        verificarTabla();

    }

    private void verificarTabla() {
        if (jTableUsuarios.getRowCount() == 0) {
            jButtonModificarUsuario.setEnabled(false);
            jButtonEliminarUsuario.setEnabled(false);
        } else {
            jButtonModificarUsuario.setEnabled(true);
            jButtonEliminarUsuario.setEnabled(true);
        }
    }

    public synchronized void enviarDatos(int row, int col) throws MyExcepcion {
        String nombre = "";
        String dependencia = "";
        String email = "";
        String telefono = "";
        String tipoUsuario = "";
        String curp = "";
        String usuario = "";
        tipoUsuario = jTableUsuarios.getValueAt(row, 5).toString();
        switch (tipoUsuario) {
            case "Administrador":
                try {
                    nombre = jTableUsuarios.getValueAt(row, 1).toString();
                    dependencia = jTableUsuarios.getValueAt(row, 2).toString();
                    email = jTableUsuarios.getValueAt(row, 3).toString();
                    telefono = jTableUsuarios.getValueAt(row, 4).toString();

                    usuario = jTableUsuarios.getValueAt(row, 7).toString();

                } catch (Exception e) {
                    System.out.println("error");
                } finally {
                    String[] datos = {nombre, dependencia, email, telefono, tipoUsuario, curp, usuario};
                    actualizarDatosUsuarios(datos);
                }
                break;

            case "Docente":
                try {
                    nombre = jTableUsuarios.getValueAt(row, 1).toString();
                    dependencia = jTableUsuarios.getValueAt(row, 2).toString();
                    email = jTableUsuarios.getValueAt(row, 3).toString();
                    telefono = jTableUsuarios.getValueAt(row, 4).toString();
                    tipoUsuario = jTableUsuarios.getValueAt(row, 5).toString();
                    curp = jTableUsuarios.getValueAt(row, 6).toString();

                } catch (Exception e) {

                } finally {
                    String[] datos = {nombre, dependencia, email, telefono, tipoUsuario, curp, usuario};
                    actualizarDatosUsuarios(datos);
                }
                break;
        }

    }

    private void actualizarDatosUsuarios(String[] datos) {
        String[] datosUsuario = datos;
        FrmActualizarUsuario actualizarUsuario = new FrmActualizarUsuario(datosUsuario);
        actualizarUsuario.setLocationRelativeTo(null);
        actualizarUsuario.setVisible(true);

    }

    public void eliminarUsuario() {
        BD bd = new BD();
        int fila = jTableUsuarios.getSelectedRow();
        int rowsC = jTableUsuarios.getRowCount();
        int[] rows = jTableUsuarios.getSelectedRows();
        String usuario = String.valueOf(jTableUsuarios.getValueAt(fila, 5));

        if (usuario.equals("Docente")) {
            if (rows.length == 0) {
                JOptionPane.showMessageDialog(this,
                        "No ha seleccionado un usuario a eliminar",
                        "Advertencia",
                        JOptionPane.WARNING_MESSAGE);
            } else if (rowsC == 0) {
                JOptionPane.showMessageDialog(this,
                        "No hay usuarios registrados",
                        "Advertencia",
                        JOptionPane.WARNING_MESSAGE);

            } else if (rows != null) {
                int seleccion = jTableUsuarios.getSelectedRowCount();
                if (seleccion != 0) {
                    int result = JOptionPane.showConfirmDialog(null,
                        "¿Esta seguro que desea eliminar este usuario?\nTenga en cuenta que se eliminara"
                        + " toda información relacionada.", null, JOptionPane.YES_NO_OPTION);
                    if (result == JOptionPane.YES_OPTION) {
                        DefaultTableModel model = (DefaultTableModel) jTableUsuarios.getModel();

                        int row = jTableUsuarios.getSelectedRow();
                        String curp = model.getValueAt(row, 6).toString();
                        String tipoUsuario = model.getValueAt(row, 5).toString();

                        String consulta = bd.eliminarUsuarioDocente(curp);

                        if (consulta.equals("Ok")) {
                            JOptionPane.showMessageDialog(this,
                                    "Usuario eliminado correctamente",
                                    "Info",
                                    JOptionPane.INFORMATION_MESSAGE);

                            for (int i = rows.length - 1; i >= 0; i--) {
                                model.removeRow(i);
                            }

                            int casillaSeleccionada = jTableUsuarios.getSelectedRow();
                            cargarTabla(tipoUsuario);
                            if (casillaSeleccionada != 0 && casillaSeleccionada > 1) {
                                jTableUsuarios.changeSelection(casillaSeleccionada, 1, false, false);
                            } else {
                                jTableUsuarios.changeSelection(0, 0, false, false);
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Usuario no eliminado",
                            "Info",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            if (rows.length == 0) {
                JOptionPane.showMessageDialog(this,
                        "No ha seleccionado un usuario a eliminar",
                        "Advertencia",
                        JOptionPane.WARNING_MESSAGE);
            } else if (rowsC == 0) {
                JOptionPane.showMessageDialog(this,
                        "No hay usuarios registrados",
                        "Advertencia",
                        JOptionPane.WARNING_MESSAGE);

            } else if (rows != null) {
                int seleccion = jTableUsuarios.getSelectedRowCount();
                if (seleccion != 0) {
                    int result = JOptionPane.showConfirmDialog(null,
                            "¿Esta seguro que desea eliminar este usuario?", null, JOptionPane.YES_NO_OPTION);
                    if (result == JOptionPane.YES_OPTION) {
                        DefaultTableModel model = (DefaultTableModel) jTableUsuarios.getModel();

                        int row = jTableUsuarios.getSelectedRow();
                        String ID = model.getValueAt(row, 0).toString();
                        String tipoUsuario = model.getValueAt(row, 5).toString();

                        String consulta = bd.eliminarUsuario(ID);

                        if (consulta.equals("Ok")) {
                            JOptionPane.showMessageDialog(this,
                                    "Usuario eliminado correctamente",
                                    "Info",
                                    JOptionPane.INFORMATION_MESSAGE);

                            for (int i = rows.length - 1; i >= 0; i--) {
                                model.removeRow(i);
                            }

                            int casillaSeleccionada = jTableUsuarios.getSelectedRow();
                            cargarTabla(tipoUsuario);
                            if (casillaSeleccionada != 0 && casillaSeleccionada > 1) {
                                jTableUsuarios.changeSelection(casillaSeleccionada, 1, false, false);
                            } else {
                                jTableUsuarios.changeSelection(0, 0, false, false);
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Usuario no eliminado",
                            "Info",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTipoUsuario = new javax.swing.JLabel();
        jComboBoxTipoUsuario = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jButtonAgregarUsuario = new javax.swing.JButton();
        jButtonModificarUsuario = new javax.swing.JButton();
        jButtonEliminarUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador de Usuarios");

        jLabelTipoUsuario.setText("Tipo de Usuario:");

        jComboBoxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione tipo usuario", "Administrador", "Docente" }));
        jComboBoxTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoUsuarioActionPerformed(evt);
            }
        });

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Dependencia", "Email", "Teléfono", "Tipo Usuario", "Curp", "Usuario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUsuarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableUsuarios);

        jButtonAgregarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        jButtonAgregarUsuario.setBorderPainted(false);
        jButtonAgregarUsuario.setContentAreaFilled(false);
        jButtonAgregarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAgregarUsuario.setFocusPainted(false);
        jButtonAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarUsuarioActionPerformed(evt);
            }
        });

        jButtonModificarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar_1.png"))); // NOI18N
        jButtonModificarUsuario.setBorderPainted(false);
        jButtonModificarUsuario.setContentAreaFilled(false);
        jButtonModificarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonModificarUsuario.setFocusPainted(false);
        jButtonModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarUsuarioActionPerformed(evt);
            }
        });

        jButtonEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        jButtonEliminarUsuario.setBorderPainted(false);
        jButtonEliminarUsuario.setContentAreaFilled(false);
        jButtonEliminarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEliminarUsuario.setFocusPainted(false);
        jButtonEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setText("Nuevo");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Modificar");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Eliminar");

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoSEP.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTipoUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButtonModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLogo))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelTipoUsuario)
                                .addComponent(jComboBoxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addComponent(jLabelLogo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarUsuarioActionPerformed
        int row = jTableUsuarios.getSelectedRow();
        int col = jTableUsuarios.getSelectedColumn();

        if (row > 0) {
            try {
                enviarDatos(row, col);
            } catch (MyExcepcion ex) {
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un usuario", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonModificarUsuarioActionPerformed

    private void jButtonEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarUsuarioActionPerformed
        eliminarUsuario();
    }//GEN-LAST:event_jButtonEliminarUsuarioActionPerformed

    private void jComboBoxTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoUsuarioActionPerformed
        String tipoUsuario = jComboBoxTipoUsuario.getSelectedItem().toString();
        cargarTabla(tipoUsuario);


    }//GEN-LAST:event_jComboBoxTipoUsuarioActionPerformed

    private void jButtonAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarUsuarioActionPerformed
        FrmAgregarNuevoUsuarioDesdePanelAdmin agregarUsuario = new FrmAgregarNuevoUsuarioDesdePanelAdmin();
        agregarUsuario.setLocationRelativeTo(null);
        agregarUsuario.setVisible(true);
    }//GEN-LAST:event_jButtonAgregarUsuarioActionPerformed

    public void cargarTabla(String usuario) {
        BD bd = new BD();
        DefaultTableModel model = (DefaultTableModel) jTableUsuarios.getModel();
        String tipoUsuario = usuario;
        switch (tipoUsuario) {
            case "Administrador":
                jComboBoxTipoUsuario.setSelectedIndex(1);
                model.getDataVector().removeAllElements();
                List<Usuarios> listaUsuarios = bd.cargarUsuariosAdministadores();
                for (Usuarios u : listaUsuarios) {
                    model.addRow(new Object[]{
                        u.id,
                        u.nombre,
                        u.dependencia,
                        u.email,
                        u.telefono,
                        u.tipoUsuario,
                        u.curp,
                        u.usuario,});
                }
                model.fireTableDataChanged();
                verificarTabla();
                break;

            case "Docente":
                jComboBoxTipoUsuario.setSelectedIndex(2);
                model.getDataVector().removeAllElements();
                List<Usuarios> listaU = bd.cargarUsuariosDocentes();
                for (Usuarios us : listaU) {
                    model.addRow(new Object[]{
                        us.id,
                        us.nombre,
                        us.dependencia,
                        us.email,
                        us.telefono,
                        us.tipoUsuario,
                        us.curp,
                        us.usuario,});
                }
                model.fireTableDataChanged();
                verificarTabla();
                break;

            case "Seleccione tipo usuario":
                model.getDataVector().removeAllElements();
                model.fireTableDataChanged();
                verificarTabla();
                break;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrarUsuarios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrarUsuarios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrarUsuarios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrarUsuarios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdministrarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarUsuario;
    private javax.swing.JButton jButtonEliminarUsuario;
    private javax.swing.JButton jButtonModificarUsuario;
    private javax.swing.JComboBox jComboBoxTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelTipoUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuarios;
    // End of variables declaration//GEN-END:variables
}
