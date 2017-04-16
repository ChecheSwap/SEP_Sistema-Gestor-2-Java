/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep;

/**
 *
 * @author JJ.NAVARRETE
 */
public class FrmPlantel extends javax.swing.JFrame {

    String curp = "";
    String subsistema = "";
    String tipo_sostenimiento = "";
    String nombre_plantel = "";
    String clave_plantel = "";
    String cargo = "";
    String fechaCaptura = "";
    String antiguedadAños = "";
    String antiguedadMeses = "";
    String hrsGrupo = "";
    String tipoContratacion = "";
    String calle = "";
    String numero = "";
    String colonia = "";
    String municipio = "";
    String cp = "";

    /**
     * Creates new form FrmPlantel
     */
    public FrmPlantel(String curp) {
        this.curp = curp;        
        initComponents();
        cargarDatosPlantel(curp);
        deshabilitarElementos();

    }

    private void cargarDatosPlantel(String curp) {
        String CURP = curp;
        BD bd = new BD();
        String[] datosPlantel = bd.obtenerDatosPlantel(CURP);
        this.subsistema = datosPlantel[0];
        this.tipo_sostenimiento = datosPlantel[1];
        this.nombre_plantel = datosPlantel[2];
        this.clave_plantel = datosPlantel[3];
        this.cargo = datosPlantel[4];
        this.fechaCaptura = datosPlantel[5];
        this.antiguedadAños = datosPlantel[6];
        this.antiguedadMeses = datosPlantel[7];
        this.hrsGrupo = datosPlantel[8];
        this.tipoContratacion = datosPlantel[9];
        this.calle = datosPlantel[10];
        this.numero = datosPlantel[11];
        this.colonia = datosPlantel[12];
        this.municipio = datosPlantel[13];
        this.cp = datosPlantel[14];     
        
        
        jTextFieldSubsistema.setText(subsistema);
        jTextFieldTipoSostenimiento.setText(tipo_sostenimiento);
        jTextFieldNombrePlantel.setText(nombre_plantel);
        jTextFieldClavePlantel.setText(clave_plantel);
        jTextFieldCargo.setText(cargo);
        jTextFieldFechaCaptura.setText(fechaCaptura);
        jTextFieldAntiguedadAños.setText(antiguedadAños);
        jTextFieldAntiguedadMeses.setText(antiguedadMeses);
        jTextFieldHrsGrupo.setText(hrsGrupo);
        jTextFieldTipoContratacion.setText(tipoContratacion);
        jTextFieldCalle.setText(calle);
        jTextFieldNumero.setText(numero);
        jTextFieldColonia.setText(colonia);
        jTextFieldMunicipio.setText(municipio);
        jTextFieldCP.setText(cp);
    }

    private void deshabilitarElementos() {
        jTextFieldSubsistema.setEditable(false);
        jTextFieldTipoSostenimiento.setEditable(false);
        jTextFieldNombrePlantel.setEditable(false);
        jTextFieldClavePlantel.setEditable(false);
        jTextFieldCargo.setEditable(false);
        jTextFieldFechaCaptura.setEditable(false);
        jTextFieldAntiguedadAños.setEditable(false);
        jTextFieldAntiguedadMeses.setEditable(false);
        jTextFieldHrsGrupo.setEditable(false);
        jTextFieldTipoContratacion.setEditable(false);
        jTextFieldCalle.setEditable(false);
        jTextFieldNumero.setEditable(false);
        jTextFieldColonia.setEditable(false);
        jTextFieldMunicipio.setEditable(false);
        jTextFieldCP.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelPlantel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelTipoSostenimiento = new javax.swing.JLabel();
        jLabelNombrePlantel = new javax.swing.JLabel();
        jLabelCargo = new javax.swing.JLabel();
        jLabelHrsGrupo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelAños = new javax.swing.JLabel();
        jLabelMeses = new javax.swing.JLabel();
        jLabelFechaCaptura = new javax.swing.JLabel();
        jTextFieldAntiguedadAños = new javax.swing.JTextField();
        jTextFieldAntiguedadMeses = new javax.swing.JTextField();
        jTextFieldFechaCaptura = new javax.swing.JTextField();
        jLabelClavePlantel = new javax.swing.JLabel();
        jLabelTipoContratacion = new javax.swing.JLabel();
        jTextFieldSubsistema = new javax.swing.JTextField();
        jTextFieldTipoSostenimiento = new javax.swing.JTextField();
        jTextFieldNombrePlantel = new javax.swing.JTextField();
        jTextFieldClavePlantel = new javax.swing.JTextField();
        jTextFieldCargo = new javax.swing.JTextField();
        jTextFieldHrsGrupo = new javax.swing.JTextField();
        jTextFieldTipoContratacion = new javax.swing.JTextField();
        jPanelDomicilioPlantel = new javax.swing.JPanel();
        jLabelCallePlantel = new javax.swing.JLabel();
        jLabelCalleNumero = new javax.swing.JLabel();
        jLabelColonia = new javax.swing.JLabel();
        jLabelMunicipio = new javax.swing.JLabel();
        jLabelCodigoPostal = new javax.swing.JLabel();
        jTextFieldCalle = new javax.swing.JTextField();
        jTextFieldNumero = new javax.swing.JTextField();
        jTextFieldColonia = new javax.swing.JTextField();
        jTextFieldMunicipio = new javax.swing.JTextField();
        jTextFieldCP = new javax.swing.JTextField();
        jLabelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Plantel");

        jLabel2.setText("Subsistema:");

        jLabelTipoSostenimiento.setText("Tipo de Sostenimiento:");

        jLabelNombrePlantel.setText("Nombre del Plantel:");

        jLabelCargo.setText("Cargo: ");

        jLabelHrsGrupo.setText("Horas frente a Grupo (total):");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Antigüedad"));

        jLabelAños.setText("Años:");

        jLabelMeses.setText("Meses:");

        jLabelFechaCaptura.setText("Fecha de Captura:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelAños)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldAntiguedadAños, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMeses)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldAntiguedadMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelFechaCaptura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldFechaCaptura, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAños)
                    .addComponent(jLabelMeses)
                    .addComponent(jTextFieldAntiguedadAños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAntiguedadMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaCaptura)
                    .addComponent(jTextFieldFechaCaptura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabelClavePlantel.setText("Clave Plantel:");

        jLabelTipoContratacion.setText("Tipo de Contratación:");

        javax.swing.GroupLayout jPanelPlantelLayout = new javax.swing.GroupLayout(jPanelPlantel);
        jPanelPlantel.setLayout(jPanelPlantelLayout);
        jPanelPlantelLayout.setHorizontalGroup(
            jPanelPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlantelLayout.createSequentialGroup()
                .addGroup(jPanelPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPlantelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanelPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelPlantelLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabelCargo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCargo))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelPlantelLayout.createSequentialGroup()
                                .addGroup(jPanelPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabelTipoSostenimiento))
                                        .addComponent(jLabelNombrePlantel, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabelClavePlantel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldSubsistema)
                                    .addComponent(jTextFieldTipoSostenimiento, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldNombrePlantel)
                                    .addComponent(jTextFieldClavePlantel)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPlantelLayout.createSequentialGroup()
                        .addContainerGap(77, Short.MAX_VALUE)
                        .addGroup(jPanelPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPlantelLayout.createSequentialGroup()
                                .addGroup(jPanelPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelHrsGrupo)
                                    .addComponent(jLabelTipoContratacion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldHrsGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(jTextFieldTipoContratacion))))))
                .addContainerGap())
        );
        jPanelPlantelLayout.setVerticalGroup(
            jPanelPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlantelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldSubsistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoSostenimiento)
                    .addComponent(jTextFieldTipoSostenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombrePlantel)
                    .addComponent(jTextFieldNombrePlantel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClavePlantel)
                    .addComponent(jTextFieldClavePlantel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanelPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCargo)
                    .addComponent(jTextFieldCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHrsGrupo)
                    .addComponent(jTextFieldHrsGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoContratacion)
                    .addComponent(jTextFieldTipoContratacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Plantel de Adscripción", jPanelPlantel);

        jLabelCallePlantel.setText("Calle:");

        jLabelCalleNumero.setText("Número:");

        jLabelColonia.setText("Colonia:");

        jLabelMunicipio.setText("Municipio:");

        jLabelCodigoPostal.setText("CP:");

        javax.swing.GroupLayout jPanelDomicilioPlantelLayout = new javax.swing.GroupLayout(jPanelDomicilioPlantel);
        jPanelDomicilioPlantel.setLayout(jPanelDomicilioPlantelLayout);
        jPanelDomicilioPlantelLayout.setHorizontalGroup(
            jPanelDomicilioPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDomicilioPlantelLayout.createSequentialGroup()
                .addGroup(jPanelDomicilioPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDomicilioPlantelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabelColonia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldColonia, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                    .addGroup(jPanelDomicilioPlantelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanelDomicilioPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCalleNumero)
                            .addComponent(jLabelCallePlantel)
                            .addComponent(jLabelMunicipio)
                            .addComponent(jLabelCodigoPostal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDomicilioPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNumero)
                            .addComponent(jTextFieldCalle)
                            .addComponent(jTextFieldMunicipio)
                            .addComponent(jTextFieldCP))))
                .addGap(78, 78, 78))
        );
        jPanelDomicilioPlantelLayout.setVerticalGroup(
            jPanelDomicilioPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDomicilioPlantelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDomicilioPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCallePlantel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDomicilioPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCalleNumero)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDomicilioPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelColonia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDomicilioPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMunicipio)
                    .addComponent(jTextFieldMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDomicilioPlantelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigoPostal)
                    .addComponent(jTextFieldCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Domicilio", jPanelDomicilioPlantel);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoSEP.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabelLogo))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabelLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(FrmPlantel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPlantel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPlantel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPlantel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPlantel("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAños;
    private javax.swing.JLabel jLabelCalleNumero;
    private javax.swing.JLabel jLabelCallePlantel;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelClavePlantel;
    private javax.swing.JLabel jLabelCodigoPostal;
    private javax.swing.JLabel jLabelColonia;
    private javax.swing.JLabel jLabelFechaCaptura;
    private javax.swing.JLabel jLabelHrsGrupo;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelMeses;
    private javax.swing.JLabel jLabelMunicipio;
    private javax.swing.JLabel jLabelNombrePlantel;
    private javax.swing.JLabel jLabelTipoContratacion;
    private javax.swing.JLabel jLabelTipoSostenimiento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDomicilioPlantel;
    private javax.swing.JPanel jPanelPlantel;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldAntiguedadAños;
    private javax.swing.JTextField jTextFieldAntiguedadMeses;
    private javax.swing.JTextField jTextFieldCP;
    private javax.swing.JTextField jTextFieldCalle;
    private javax.swing.JTextField jTextFieldCargo;
    private javax.swing.JTextField jTextFieldClavePlantel;
    private javax.swing.JTextField jTextFieldColonia;
    private javax.swing.JTextField jTextFieldFechaCaptura;
    private javax.swing.JTextField jTextFieldHrsGrupo;
    private javax.swing.JTextField jTextFieldMunicipio;
    private javax.swing.JTextField jTextFieldNombrePlantel;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldSubsistema;
    private javax.swing.JTextField jTextFieldTipoContratacion;
    private javax.swing.JTextField jTextFieldTipoSostenimiento;
    // End of variables declaration//GEN-END:variables
}
