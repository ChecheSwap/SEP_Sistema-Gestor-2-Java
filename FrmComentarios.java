/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep;

import javax.swing.JOptionPane;

/**
 *
 * @author JJ.NAVARRETE
 */
public class FrmComentarios extends javax.swing.JFrame {
    
    String curp = "";
    String nombre1 = "";
    String apellidop = "";
    String apellidom = "";
    String nombre2 = "";
    String email = "";
    String subsistema = "";
    String plantel = "";
    String nombre = "";

    /**
     * Creates new form FrmComentarios
     */
    public FrmComentarios(String curp) {
        this.curp = curp;
        initComponents();
        obtenerDatosDocente();
        deshabilitarElementos();
    }
    
    private synchronized void obtenerDatosDocente() {
        BD bd = new BD();
        String[] datosDatosDocente = bd.obtenerDatosDocenteComentario(curp);
        String[] datosDatosDocentePlantel = bd.obtenerDatosDocenteComentarioPlantel(curp);
        nombre1 = datosDatosDocente[0];
        nombre2 = datosDatosDocente[1];
        apellidop = datosDatosDocente[2];
        apellidom = datosDatosDocente[3];
        email = datosDatosDocente[4];
        subsistema = datosDatosDocentePlantel[0];
        plantel = datosDatosDocentePlantel[1];
        if (nombre1 != null) {
            try {
                nombre = nombre1.concat(" ").concat(nombre2);
            } catch (Exception e) {
            }
        }
        
        jTextFieldNombre.setText(nombre);
        jTextFieldApellidoP.setText(apellidop);
        jTextFieldApellidoM.setText(apellidom);
        jTextFieldCurp.setText(curp);
        jTextFieldEmail.setText(email);
        jTextFieldSubsistema.setText(subsistema);
        jTextFieldPlantel.setText(plantel);
        
    }
    
    private void deshabilitarElementos() {
        jTextFieldNombre.setEditable(false);
        jTextFieldApellidoP.setEditable(false);
        jTextFieldApellidoM.setEditable(false);
        jTextFieldCurp.setEditable(false);
        jTextFieldEmail.setEditable(false);
        jTextFieldSubsistema.setEditable(false);
        jTextFieldPlantel.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelNombreApellidoP = new javax.swing.JLabel();
        jTextFieldApellidoP = new javax.swing.JTextField();
        jTextFieldApellidoM = new javax.swing.JTextField();
        jLabelNombreApellidoM = new javax.swing.JLabel();
        jLabelCurp = new javax.swing.JLabel();
        jTextFieldCurp = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelSubsistema = new javax.swing.JLabel();
        jTextFieldSubsistema = new javax.swing.JTextField();
        jLabelPlantel = new javax.swing.JLabel();
        jTextFieldPlantel = new javax.swing.JTextField();
        jLabelComentario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaComentario = new javax.swing.JTextArea();
        jButtonEnviar = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Enviar Comentario");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Comentarios"));

        jLabelNombre.setText("Nombre:");

        jLabelNombreApellidoP.setText("Apellido Paterno:");

        jLabelNombreApellidoM.setText("Apellido Materno:");

        jLabelCurp.setText("CURP:");

        jLabelEmail.setText("E-mail:");

        jLabelSubsistema.setText("Subsistema:");

        jLabelPlantel.setText("Plantel:");

        jLabelComentario.setText("Comentario:");

        jTextAreaComentario.setColumns(20);
        jTextAreaComentario.setLineWrap(true);
        jTextAreaComentario.setRows(5);
        jTextAreaComentario.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextAreaComentario);

        jButtonEnviar.setText("Enviar");
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonEnviar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelComentario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombreApellidoM)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelNombre)
                                .addComponent(jLabelNombreApellidoP))
                            .addComponent(jLabelCurp, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelSubsistema, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelPlantel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPlantel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSubsistema, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreApellidoP)
                    .addComponent(jTextFieldApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreApellidoM)
                    .addComponent(jTextFieldApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCurp)
                    .addComponent(jTextFieldCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSubsistema)
                    .addComponent(jTextFieldSubsistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPlantel)
                    .addComponent(jTextFieldPlantel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelComentario)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEnviar))))
        );

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoSEP.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabelLogo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabelLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarActionPerformed
        validar();

    }//GEN-LAST:event_jButtonEnviarActionPerformed
    
    private void validar() {
        if (jTextFieldEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Se requiere su e-mail.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            jTextFieldEmail.requestFocus();
        } else if (jTextFieldSubsistema.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Subsistema requerido.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            jTextFieldSubsistema.requestFocus();
        } else if (jTextFieldPlantel.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Plantel requerido.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            jTextFieldPlantel.requestFocus();
        } else if (jTextAreaComentario.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese su comentario.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            jTextAreaComentario.requestFocus();
        } else {
            
            enviarComentario();
        }
    }
    
    private void enviarComentario() {
        BD bd = new BD();
        
        
        String comentario = jTextAreaComentario.getText();
        String[] datosComentario = {curp, nombre1, nombre2, apellidop, apellidom, email, subsistema, plantel, comentario,"Pendiente"};
        String consulta = bd.enviarComentario(datosComentario);
        
        if (consulta.equals("Ok")) {
            JOptionPane.showMessageDialog(this, "Comentario enviado correctamente.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Comentario no enviado.", "Advertencia", JOptionPane.ERROR_MESSAGE);
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmComentarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmComentarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmComentarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmComentarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmComentarios("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JLabel jLabelComentario;
    private javax.swing.JLabel jLabelCurp;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombreApellidoM;
    private javax.swing.JLabel jLabelNombreApellidoP;
    private javax.swing.JLabel jLabelPlantel;
    private javax.swing.JLabel jLabelSubsistema;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaComentario;
    private javax.swing.JTextField jTextFieldApellidoM;
    private javax.swing.JTextField jTextFieldApellidoP;
    private javax.swing.JTextField jTextFieldCurp;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPlantel;
    private javax.swing.JTextField jTextFieldSubsistema;
    // End of variables declaration//GEN-END:variables
}
