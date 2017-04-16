/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author GermyMcG
 */
public class FrmLogin extends javax.swing.JFrame {
    

    /**
     * Creates new form FrmLogin
     */
    public FrmLogin() {

        initComponents();

        jLabelCurp.setVisible(false);
        jTextFieldCurp.setVisible(false);
        jLabelUsuario.setVisible(false);
        jTextFieldUsuario.setVisible(false);
        jPasswordFieldContraseña.setVisible(false);
        jLabelContraseña.setVisible(false);
    }
    
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogin = new javax.swing.JPanel();
        jLabelTipoUsuario = new javax.swing.JLabel();
        jLabelContraseña = new javax.swing.JLabel();
        jButtonLogin = new javax.swing.JButton();
        jLabelInfoLogin = new javax.swing.JLabel();
        jLabelIconoLogin = new javax.swing.JLabel();
        jComboBoxTipoUsuario = new javax.swing.JComboBox();
        jLabelCurp = new javax.swing.JLabel();
        jTextFieldCurp = new javax.swing.JTextField();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SEP");
        setResizable(false);

        jPanelLogin.setBorder(javax.swing.BorderFactory.createTitledBorder("Inicio de Sesión"));

        jLabelTipoUsuario.setText("Tipo Usuario:");

        jLabelContraseña.setText("Contraseña:");

        jButtonLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iniciar sesion.png"))); // NOI18N
        jButtonLogin.setText("Entrar");
        jButtonLogin.setToolTipText("Presione para iniciar sesión");
        jButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogin.setFocusPainted(false);
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jLabelInfoLogin.setText("Introduzca Usuario y Contraseña");

        jLabelIconoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/padlock.png"))); // NOI18N

        jComboBoxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Usuario", "Administrador", "Docente" }));
        jComboBoxTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoUsuarioActionPerformed(evt);
            }
        });

        jLabelCurp.setText("CURP:");

        jTextFieldCurp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCurpActionPerformed(evt);
            }
        });

        jLabelUsuario.setText("Usuario:");

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelInfoLogin)
                        .addGap(8, 8, 8))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(jLabelIconoLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelContraseña)
                                .addComponent(jLabelTipoUsuario, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabelCurp, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelUsuario, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxTipoUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelLoginLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButtonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPasswordFieldContraseña)
                            .addComponent(jTextFieldCurp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jTextFieldUsuario)))))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTipoUsuario)
                            .addComponent(jComboBoxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelUsuario)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCurp)
                            .addComponent(jTextFieldCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelContraseña)
                            .addComponent(jPasswordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelIconoLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelInfoLogin))
        );

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoSEP.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLogo)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabelLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabelLogo.getAccessibleContext().setAccessibleDescription("");

        getAccessibleContext().setAccessibleName("Secretaria De Educacion Publica");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        String tipoUsuario = jComboBoxTipoUsuario.getSelectedItem().toString();
        validar(tipoUsuario);
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jComboBoxTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoUsuarioActionPerformed

        switch (jComboBoxTipoUsuario.getSelectedItem().toString()) {
            case "Administrador":
                jTextFieldCurp.setText("");
                jTextFieldUsuario.setText("");
                jPasswordFieldContraseña.setText("");
                jLabelCurp.setVisible(false);
                jTextFieldCurp.setVisible(false);
                jLabelUsuario.setVisible(true);
                jTextFieldUsuario.setVisible(true);
                jPasswordFieldContraseña.setVisible(true);
                jLabelContraseña.setVisible(true);
                break;
            case "Docente":
                jTextFieldCurp.setText("VIGG890325HCHLNR02");
                jTextFieldUsuario.setText("");
                jPasswordFieldContraseña.setText("1");
                jLabelCurp.setVisible(true);
                jTextFieldCurp.setVisible(true);
                jPasswordFieldContraseña.setVisible(true);
                jLabelContraseña.setVisible(true);
                jTextFieldUsuario.setVisible(false);
                jLabelUsuario.setVisible(false);
                break;
        }
    }//GEN-LAST:event_jComboBoxTipoUsuarioActionPerformed

    private void jTextFieldCurpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCurpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCurpActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {

        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmLogin login = new FrmLogin();
                login.setResizable(false);
                login.setLocationRelativeTo(null);
                login.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JComboBox jComboBoxTipoUsuario;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelCurp;
    private javax.swing.JLabel jLabelIconoLogin;
    private javax.swing.JLabel jLabelInfoLogin;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelTipoUsuario;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JTextField jTextFieldCurp;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables

    private void validar(String user) {
        String usuario = user;
        if (usuario.equals("Administrador")) {
            String pass = String.valueOf(jPasswordFieldContraseña.getPassword());
            if (!"".equals(jTextFieldUsuario.getText()) && pass != "") {
                String usuarioSis = jTextFieldUsuario.getText();
                String passwordSis = String.valueOf(jPasswordFieldContraseña.getPassword());

                BD bd = new BD();
                String sesion = bd.IniciarSesionAdmin(usuarioSis, passwordSis);
                if (sesion.equals("Exito")) {
                    FrmAdmin admin = new FrmAdmin();
                    admin.setLocationRelativeTo(null);
                    admin.setVisible(true);
                    jLabelInfoLogin.setText("Introduzca Usuario y Contraseña");
                    jLabelInfoLogin.setForeground(Color.black);
                    this.dispose();
                } else {
                    jLabelInfoLogin.setText("Usuario y/o Contraseña incorrecta");
                    jLabelInfoLogin.setForeground(Color.red);
                    jPasswordFieldContraseña.setText("");
                    jTextFieldUsuario.setText("");
                }

            } else {
                JOptionPane.showMessageDialog(this,
                        "Ingrese usuario y contraseña",
                        "Advertencia",
                        JOptionPane.WARNING_MESSAGE);
            }
        } else if (usuario.equals("Docente")) {
            String pass = String.valueOf(jPasswordFieldContraseña.getPassword());
            if (!"".equals(jTextFieldCurp.getText()) && pass != "") {
                String curp = jTextFieldCurp.getText();
                String passwordSis = String.valueOf(jPasswordFieldContraseña.getPassword());

                 BD bd = new BD();
                String sesion = bd.IniciarSesionDocente(curp, passwordSis);                
                
                if (sesion.equals("Exito")) {
                    FrmDocente docente = new FrmDocente(curp);
                    
                    docente.setLocationRelativeTo(null);
                    docente.setVisible(true);
                    jLabelInfoLogin.setText("Introduzca Usuario y Contraseña");
                    jLabelInfoLogin.setForeground(Color.black);
                    this.dispose();
                } else {
                    jLabelInfoLogin.setText("Usuario y/o Contraseña incorrecta");
                    jLabelInfoLogin.setForeground(Color.red);
                    jPasswordFieldContraseña.setText("");
                    jTextFieldCurp.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(this,
                        "Ingrese usuario y contraseña",
                        "Advertencia",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

}