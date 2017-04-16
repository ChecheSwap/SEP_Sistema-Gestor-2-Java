/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep;

/**
 *
 *@author JJ.NAVARRETE
 */
public class FrmOtraInstitucion extends javax.swing.JFrame {

    String curp = "";
    String institucion = "";
    String nivelEducativo = "";
    String subsistema = "";
    String tipoSostenimiento = "";
    String asignatura = "";
    String horasAsignadas = "";

    /**
     * Creates new form FrmOtraInstitucion
     */
    public FrmOtraInstitucion(String curp) {
        this.curp = curp;
        initComponents();
        cargarDatosOtraInstitucion();
        deshabilitarElementos();
    }

    private synchronized void cargarDatosOtraInstitucion() {
        BD bd = new BD();
        String[] datosOtraInstitucion = bd.obtenerDatosOtraInstitucion(curp);

        institucion = datosOtraInstitucion[0];
        nivelEducativo = datosOtraInstitucion[1];
        subsistema = datosOtraInstitucion[2];
        tipoSostenimiento = datosOtraInstitucion[3];
        asignatura = datosOtraInstitucion[4];
        horasAsignadas = datosOtraInstitucion[5];

        jTextFieldInstitucion.setText(institucion);
        jTextFieldNivelEducativo.setText(nivelEducativo);
        jTextFieldSubsistema.setText(subsistema);
        jTextFieldTipoSostenimiento.setText(tipoSostenimiento);
        jTextFieldAsignatura.setText(asignatura);
        jTextFieldHrsImpoartidas.setText(horasAsignadas);
    }

    private void deshabilitarElementos() {
        jTextFieldInstitucion.setEditable(false);
        jTextFieldNivelEducativo.setEditable(false);
        jTextFieldSubsistema.setEditable(false);
        jTextFieldTipoSostenimiento.setEditable(false);
        jTextFieldAsignatura.setEditable(false);
        jTextFieldHrsImpoartidas.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelOtraInst = new javax.swing.JPanel();
        jLabelInstitucion = new javax.swing.JLabel();
        jLabelNivelEducativo = new javax.swing.JLabel();
        jLabelSubsistema = new javax.swing.JLabel();
        jLabelTipoSostenimiento = new javax.swing.JLabel();
        jLabelAsignatura = new javax.swing.JLabel();
        jLabelHrsImpartidas = new javax.swing.JLabel();
        jTextFieldInstitucion = new javax.swing.JTextField();
        jTextFieldNivelEducativo = new javax.swing.JTextField();
        jTextFieldSubsistema = new javax.swing.JTextField();
        jTextFieldTipoSostenimiento = new javax.swing.JTextField();
        jTextFieldAsignatura = new javax.swing.JTextField();
        jTextFieldHrsImpoartidas = new javax.swing.JTextField();
        jLabelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Otra Institución");

        jPanelOtraInst.setBorder(javax.swing.BorderFactory.createTitledBorder("Otra Institución donde labore"));

        jLabelInstitucion.setText("Institución:");

        jLabelNivelEducativo.setText("Nivel Educativo:");

        jLabelSubsistema.setText("Subsistema:");

        jLabelTipoSostenimiento.setText("Tipo de Sostenimiento:");

        jLabelAsignatura.setText("Asignatura:");

        jLabelHrsImpartidas.setText("Horas Impartidas:");

        javax.swing.GroupLayout jPanelOtraInstLayout = new javax.swing.GroupLayout(jPanelOtraInst);
        jPanelOtraInst.setLayout(jPanelOtraInstLayout);
        jPanelOtraInstLayout.setHorizontalGroup(
            jPanelOtraInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOtraInstLayout.createSequentialGroup()
                .addGroup(jPanelOtraInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelOtraInstLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelOtraInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelSubsistema)
                            .addGroup(jPanelOtraInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelTipoSostenimiento)
                                .addComponent(jLabelAsignatura, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelHrsImpartidas, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelOtraInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldSubsistema, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTipoSostenimiento, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldAsignatura, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldHrsImpoartidas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelOtraInstLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanelOtraInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNivelEducativo)
                            .addComponent(jLabelInstitucion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelOtraInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldInstitucion)
                            .addComponent(jTextFieldNivelEducativo))))
                .addContainerGap())
        );
        jPanelOtraInstLayout.setVerticalGroup(
            jPanelOtraInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOtraInstLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOtraInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInstitucion)
                    .addComponent(jTextFieldInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelOtraInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNivelEducativo)
                    .addComponent(jTextFieldNivelEducativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelOtraInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSubsistema, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSubsistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelOtraInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoSostenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTipoSostenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelOtraInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelOtraInstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHrsImpartidas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHrsImpoartidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoSEP.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelOtraInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLogo)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabelLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelOtraInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmOtraInstitucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOtraInstitucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOtraInstitucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOtraInstitucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmOtraInstitucion("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAsignatura;
    private javax.swing.JLabel jLabelHrsImpartidas;
    private javax.swing.JLabel jLabelInstitucion;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNivelEducativo;
    private javax.swing.JLabel jLabelSubsistema;
    private javax.swing.JLabel jLabelTipoSostenimiento;
    private javax.swing.JPanel jPanelOtraInst;
    private javax.swing.JTextField jTextFieldAsignatura;
    private javax.swing.JTextField jTextFieldHrsImpoartidas;
    private javax.swing.JTextField jTextFieldInstitucion;
    private javax.swing.JTextField jTextFieldNivelEducativo;
    private javax.swing.JTextField jTextFieldSubsistema;
    private javax.swing.JTextField jTextFieldTipoSostenimiento;
    // End of variables declaration//GEN-END:variables
}
