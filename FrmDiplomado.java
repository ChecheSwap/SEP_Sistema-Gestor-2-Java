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
public class FrmDiplomado extends javax.swing.JFrame {

    String curp = "";
    String institucionDirector = "";
    String generacionDirector = "";
    String diplomadoAcreditadoDirector = "";
    String certificadoDirector = "";
    String institucionDocente = "";
    String generacionDocente = "";
    String diplomadoAcreditadoDocente = "";
    String certificadoDocente = "";
    String institucionCarreraConcluida = "";
    String generacionCarreraConcluida = "";
    String diplomadoAcreditadoCarreraConcluida = "";
    String certificadoCarreraConcluida = "";
    String institucionCarreraTrunca = "";
    String generacionCarreraTrunca = "";
    String diplomadoAcreditadoCarreraTrunca = "";
    String certificadoCarreraTrunca = "";
    String institucionBachillerato = "";
    String generacionBachillerato = "";
    String diplomadoAcreditadoBachillerato = "";
    String certificadoBachillerato = "";

    /**
     * Creates new form FrmDiplomado
     */
    public FrmDiplomado(String curp) {
        this.curp = curp;
        initComponents();
        cargarDatosDiplomado(curp);
        deshabilitarElementos();

    }

    private void cargarDatosDiplomado(String curp) {
        String CURP = curp;
        BD bd = new BD();
        String[] datosDiplomado = bd.obtenerDatosDiplomado(CURP);

        institucionDirector = datosDiplomado[0];
        generacionDirector = datosDiplomado[1];
        diplomadoAcreditadoDirector = datosDiplomado[2];
        certificadoDirector = datosDiplomado[3];

        institucionDocente = datosDiplomado[4];
        generacionDocente = datosDiplomado[5];
        diplomadoAcreditadoDocente = datosDiplomado[6];
        certificadoDocente = datosDiplomado[7];

        institucionCarreraConcluida = datosDiplomado[8];
        generacionCarreraConcluida = datosDiplomado[9];
        diplomadoAcreditadoCarreraConcluida = datosDiplomado[10];
        certificadoCarreraConcluida = datosDiplomado[11];

        institucionCarreraTrunca = datosDiplomado[12];
        generacionCarreraTrunca = datosDiplomado[13];
        diplomadoAcreditadoCarreraTrunca = datosDiplomado[14];
        certificadoCarreraTrunca = datosDiplomado[15];

        institucionBachillerato = datosDiplomado[16];
        generacionBachillerato = datosDiplomado[17];
        diplomadoAcreditadoBachillerato = datosDiplomado[18];
        certificadoBachillerato = datosDiplomado[19];

        jTextFieldInstitucionDirector.setText(institucionDirector);
        jTextFieldGeneracionDirector.setText(generacionDirector);

        try {

            if (diplomadoAcreditadoDirector.equals("Si")) {
                jRadioButtonDiplomadoAcreditadoDirectorSi.setSelected(true);
            }
            if (diplomadoAcreditadoDirector.equals("No")) {

                jRadioButtonDiplomadoAcreditadoDirectorNo.setSelected(true);
            }

            jTextFieldCertificadoDiplomadoDirector.setText(certificadoDirector);

            jTextFieldInstitucionDocente.setText(institucionDocente);
            jTextFieldGeneracionDocente.setText(generacionDocente);

            if (diplomadoAcreditadoDocente.equals("Si")) {
                jRadioButtonDiplomadoAcreditadoDocenteSi.setSelected(true);
            }

            if (diplomadoAcreditadoDocente.equals("No")) {
                jRadioButtonDiplomadoAcreditadoDocenteNo.setSelected(true);
            }

            jTextFieldCertificadoDiplomadoDocente.setText(certificadoDocente);

            jTextFieldInstitucionCarrera.setText(institucionCarreraConcluida);
            jTextFieldGeneracionCarrera.setText(generacionCarreraConcluida);

            if (diplomadoAcreditadoCarreraConcluida.equals("Si")) {
                jRadioButtonDiplomadoAcreditadoCarreraSi.setSelected(true);
            }
            if (diplomadoAcreditadoCarreraConcluida.equals("No")) {
                jRadioButtonDiplomadoAcreditadoCarreraNo.setSelected(true);
            }

            jTextFieldCertificadoDiplomadoCarrera.setText(certificadoCarreraConcluida);

            jTextFieldInstitucionCarreraTrunca.setText(institucionCarreraTrunca);
            jTextFieldGeneracionCarreraTrunca.setText(generacionCarreraTrunca);

            if (diplomadoAcreditadoCarreraTrunca.equals("Si")) {
                jRadioButtonDiplomadoAcreditadoCarreraTruncaSi.setSelected(true);
            }
            if (diplomadoAcreditadoCarreraTrunca.equals("No")) {
                jRadioButtonDiplomadoAcreditadoCarreraTruncaNo.setSelected(true);
            }

            jTextFieldCertificadoDiplomadoCarreraTrunca.setText(certificadoCarreraTrunca);

            jTextFieldInstitucionBachillerato.setText(institucionBachillerato);
            jTextFieldGeneracionBachillerato.setText(generacionBachillerato);

            if (diplomadoAcreditadoBachillerato.equals("Si")) {
                jRadioButtonDiplomadoAcreditadoBachilleratoSi.setSelected(true);
            }

            if (diplomadoAcreditadoBachillerato.equals("No")) {
                jRadioButtonDiplomadoAcreditadoBachilleratoNo.setSelected(true);
            }

            jTextFieldCertificadoDiplomadoBachillerato.setText(certificadoBachillerato);

        } catch (Exception e) {
        }
    }

    private void deshabilitarElementos() {
        jTextFieldInstitucionBachillerato.setEditable(false);
        jTextFieldInstitucionDirector.setEditable(false);
        jTextFieldInstitucionDocente.setEditable(false);
        jTextFieldInstitucionCarrera.setEditable(false);
        jTextFieldInstitucionCarreraTrunca.setEditable(false);

        jTextFieldGeneracionBachillerato.setEditable(false);
        jTextFieldGeneracionDirector.setEditable(false);
        jTextFieldGeneracionDocente.setEditable(false);
        jTextFieldGeneracionCarrera.setEditable(false);
        jTextFieldGeneracionCarreraTrunca.setEditable(false);

        jRadioButtonDiplomadoAcreditadoBachilleratoSi.setEnabled(false);
        jRadioButtonDiplomadoAcreditadoDirectorSi.setEnabled(false);
        jRadioButtonDiplomadoAcreditadoCarreraSi.setEnabled(false);
        jRadioButtonDiplomadoAcreditadoCarreraTruncaSi.setEnabled(false);
        jRadioButtonDiplomadoAcreditadoDocenteSi.setEnabled(false);

        jRadioButtonDiplomadoAcreditadoBachilleratoNo.setEnabled(false);
        jRadioButtonDiplomadoAcreditadoDirectorNo.setEnabled(false);
        jRadioButtonDiplomadoAcreditadoCarreraNo.setEnabled(false);
        jRadioButtonDiplomadoAcreditadoCarreraTruncaNo.setEnabled(false);
        jRadioButtonDiplomadoAcreditadoDocenteNo.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupAcreditadoDirector = new javax.swing.ButtonGroup();
        buttonGroupAcreditadoDocente = new javax.swing.ButtonGroup();
        buttonGroupCarreraConcluida = new javax.swing.ButtonGroup();
        buttonGroupAcreditadoCarreraTrunca = new javax.swing.ButtonGroup();
        buttonGroupAcreditadoBachillerato = new javax.swing.ButtonGroup();
        jTabbedPanelDiplomadoProfordems = new javax.swing.JTabbedPane();
        jPanelDirector = new javax.swing.JPanel();
        jLabelInstitucionDirector1 = new javax.swing.JLabel();
        jTextFieldInstitucionDirector = new javax.swing.JTextField();
        jLabelGeneracionDirector = new javax.swing.JLabel();
        jTextFieldGeneracionDirector = new javax.swing.JTextField();
        jLabelDiplomadoAcreditadoDirector = new javax.swing.JLabel();
        jRadioButtonDiplomadoAcreditadoDirectorSi = new javax.swing.JRadioButton();
        jRadioButtonDiplomadoAcreditadoDirectorNo = new javax.swing.JRadioButton();
        jLabelCertificadoDiplomadoDirector = new javax.swing.JLabel();
        jTextFieldCertificadoDiplomadoDirector = new javax.swing.JTextField();
        jPanelDocente = new javax.swing.JPanel();
        jLabelInstitucionDocente = new javax.swing.JLabel();
        jTextFieldInstitucionDocente = new javax.swing.JTextField();
        jLabelGeneracionDocente = new javax.swing.JLabel();
        jTextFieldGeneracionDocente = new javax.swing.JTextField();
        jLabelDiplomadoAcreditadoDocente = new javax.swing.JLabel();
        jRadioButtonDiplomadoAcreditadoDocenteSi = new javax.swing.JRadioButton();
        jRadioButtonDiplomadoAcreditadoDocenteNo = new javax.swing.JRadioButton();
        jLabelCertificadoDiplomadoDocente = new javax.swing.JLabel();
        jTextFieldCertificadoDiplomadoDocente = new javax.swing.JTextField();
        jPanelCarrera = new javax.swing.JPanel();
        jLabelInstitucionCarrera = new javax.swing.JLabel();
        jTextFieldInstitucionCarrera = new javax.swing.JTextField();
        jLabelGeneracionCarrera = new javax.swing.JLabel();
        jTextFieldGeneracionCarrera = new javax.swing.JTextField();
        jLabelDiplomadoAcreditadoCarrera = new javax.swing.JLabel();
        jRadioButtonDiplomadoAcreditadoCarreraSi = new javax.swing.JRadioButton();
        jRadioButtonDiplomadoAcreditadoCarreraNo = new javax.swing.JRadioButton();
        jLabelCertificadoDiplomadoCarrera = new javax.swing.JLabel();
        jTextFieldCertificadoDiplomadoCarrera = new javax.swing.JTextField();
        jPanelCarreraTrunca = new javax.swing.JPanel();
        jLabelInstitucionCarreraTrunca = new javax.swing.JLabel();
        jTextFieldInstitucionCarreraTrunca = new javax.swing.JTextField();
        jLabelGeneracionCarreraTrunca = new javax.swing.JLabel();
        jTextFieldGeneracionCarreraTrunca = new javax.swing.JTextField();
        jLabelDiplomadoAcreditadoCarreraTrunca = new javax.swing.JLabel();
        jRadioButtonDiplomadoAcreditadoCarreraTruncaSi = new javax.swing.JRadioButton();
        jRadioButtonDiplomadoAcreditadoCarreraTruncaNo = new javax.swing.JRadioButton();
        jLabelCertificadoDiplomadoCarreraTrunca = new javax.swing.JLabel();
        jTextFieldCertificadoDiplomadoCarreraTrunca = new javax.swing.JTextField();
        jPanelBachillerato = new javax.swing.JPanel();
        jLabelInstitucionBachillerato = new javax.swing.JLabel();
        jTextFieldInstitucionBachillerato = new javax.swing.JTextField();
        jLabelGeneracionBachillerato = new javax.swing.JLabel();
        jTextFieldGeneracionBachillerato = new javax.swing.JTextField();
        jLabelDiplomadoAcreditadoBachillerato = new javax.swing.JLabel();
        jRadioButtonDiplomadoAcreditadoBachilleratoSi = new javax.swing.JRadioButton();
        jRadioButtonDiplomadoAcreditadoBachilleratoNo = new javax.swing.JRadioButton();
        jLabelCertificadoDiplomadoBachillerato = new javax.swing.JLabel();
        jTextFieldCertificadoDiplomadoBachillerato = new javax.swing.JTextField();
        jLabelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Diplomado");

        jLabelInstitucionDirector1.setText("Institución:");

        jLabelGeneracionDirector.setText("Generación:");

        jLabelDiplomadoAcreditadoDirector.setText("Diplomado Acreditado:");

        buttonGroupAcreditadoDirector.add(jRadioButtonDiplomadoAcreditadoDirectorSi);
        jRadioButtonDiplomadoAcreditadoDirectorSi.setText("Si");

        buttonGroupAcreditadoDirector.add(jRadioButtonDiplomadoAcreditadoDirectorNo);
        jRadioButtonDiplomadoAcreditadoDirectorNo.setText("No");

        jLabelCertificadoDiplomadoDirector.setText("Certificado Diplomado:");

        javax.swing.GroupLayout jPanelDirectorLayout = new javax.swing.GroupLayout(jPanelDirector);
        jPanelDirector.setLayout(jPanelDirectorLayout);
        jPanelDirectorLayout.setHorizontalGroup(
            jPanelDirectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDirectorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDirectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDiplomadoAcreditadoDirector, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelGeneracionDirector, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelInstitucionDirector1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCertificadoDiplomadoDirector, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDirectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldInstitucionDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldGeneracionDirector)
                    .addGroup(jPanelDirectorLayout.createSequentialGroup()
                        .addComponent(jRadioButtonDiplomadoAcreditadoDirectorSi)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonDiplomadoAcreditadoDirectorNo))
                    .addComponent(jTextFieldCertificadoDiplomadoDirector, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanelDirectorLayout.setVerticalGroup(
            jPanelDirectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDirectorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDirectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInstitucionDirector1)
                    .addComponent(jTextFieldInstitucionDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDirectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGeneracionDirector)
                    .addComponent(jTextFieldGeneracionDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDirectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDiplomadoAcreditadoDirector)
                    .addComponent(jRadioButtonDiplomadoAcreditadoDirectorSi)
                    .addComponent(jRadioButtonDiplomadoAcreditadoDirectorNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDirectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCertificadoDiplomadoDirector)
                    .addComponent(jTextFieldCertificadoDiplomadoDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPanelDiplomadoProfordems.addTab("Director", jPanelDirector);

        jLabelInstitucionDocente.setText("Institución:");

        jLabelGeneracionDocente.setText("Generación:");

        jLabelDiplomadoAcreditadoDocente.setText("Diplomado Acreditado:");

        buttonGroupAcreditadoDocente.add(jRadioButtonDiplomadoAcreditadoDocenteSi);
        jRadioButtonDiplomadoAcreditadoDocenteSi.setText("Si");

        buttonGroupAcreditadoDocente.add(jRadioButtonDiplomadoAcreditadoDocenteNo);
        jRadioButtonDiplomadoAcreditadoDocenteNo.setText("No");

        jLabelCertificadoDiplomadoDocente.setText("Certificado Diplomado:");

        javax.swing.GroupLayout jPanelDocenteLayout = new javax.swing.GroupLayout(jPanelDocente);
        jPanelDocente.setLayout(jPanelDocenteLayout);
        jPanelDocenteLayout.setHorizontalGroup(
            jPanelDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDocenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDiplomadoAcreditadoDocente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelGeneracionDocente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelInstitucionDocente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCertificadoDiplomadoDocente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldInstitucionDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldGeneracionDocente)
                    .addGroup(jPanelDocenteLayout.createSequentialGroup()
                        .addComponent(jRadioButtonDiplomadoAcreditadoDocenteSi)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonDiplomadoAcreditadoDocenteNo))
                    .addComponent(jTextFieldCertificadoDiplomadoDocente, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanelDocenteLayout.setVerticalGroup(
            jPanelDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDocenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInstitucionDocente)
                    .addComponent(jTextFieldInstitucionDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGeneracionDocente)
                    .addComponent(jTextFieldGeneracionDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDiplomadoAcreditadoDocente)
                    .addComponent(jRadioButtonDiplomadoAcreditadoDocenteSi)
                    .addComponent(jRadioButtonDiplomadoAcreditadoDocenteNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCertificadoDiplomadoDocente)
                    .addComponent(jTextFieldCertificadoDiplomadoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPanelDiplomadoProfordems.addTab("Docente", jPanelDocente);

        jLabelInstitucionCarrera.setText("Institución:");

        jLabelGeneracionCarrera.setText("Generación:");

        jLabelDiplomadoAcreditadoCarrera.setText("Diplomado Acreditado:");

        buttonGroupCarreraConcluida.add(jRadioButtonDiplomadoAcreditadoCarreraSi);
        jRadioButtonDiplomadoAcreditadoCarreraSi.setText("Si");

        buttonGroupCarreraConcluida.add(jRadioButtonDiplomadoAcreditadoCarreraNo);
        jRadioButtonDiplomadoAcreditadoCarreraNo.setText("No");

        jLabelCertificadoDiplomadoCarrera.setText("Certificado Diplomado:");

        javax.swing.GroupLayout jPanelCarreraLayout = new javax.swing.GroupLayout(jPanelCarrera);
        jPanelCarrera.setLayout(jPanelCarreraLayout);
        jPanelCarreraLayout.setHorizontalGroup(
            jPanelCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCarreraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDiplomadoAcreditadoCarrera, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelGeneracionCarrera, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelInstitucionCarrera, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCertificadoDiplomadoCarrera, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldInstitucionCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldGeneracionCarrera)
                    .addGroup(jPanelCarreraLayout.createSequentialGroup()
                        .addComponent(jRadioButtonDiplomadoAcreditadoCarreraSi)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonDiplomadoAcreditadoCarreraNo))
                    .addComponent(jTextFieldCertificadoDiplomadoCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanelCarreraLayout.setVerticalGroup(
            jPanelCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCarreraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInstitucionCarrera)
                    .addComponent(jTextFieldInstitucionCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGeneracionCarrera)
                    .addComponent(jTextFieldGeneracionCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDiplomadoAcreditadoCarrera)
                    .addComponent(jRadioButtonDiplomadoAcreditadoCarreraSi)
                    .addComponent(jRadioButtonDiplomadoAcreditadoCarreraNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCertificadoDiplomadoCarrera)
                    .addComponent(jTextFieldCertificadoDiplomadoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPanelDiplomadoProfordems.addTab("Carrera Concluida", jPanelCarrera);

        jLabelInstitucionCarreraTrunca.setText("Institución:");

        jLabelGeneracionCarreraTrunca.setText("Generación:");

        jLabelDiplomadoAcreditadoCarreraTrunca.setText("Diplomado Acreditado:");

        buttonGroupAcreditadoCarreraTrunca.add(jRadioButtonDiplomadoAcreditadoCarreraTruncaSi);
        jRadioButtonDiplomadoAcreditadoCarreraTruncaSi.setText("Si");

        buttonGroupAcreditadoCarreraTrunca.add(jRadioButtonDiplomadoAcreditadoCarreraTruncaNo);
        jRadioButtonDiplomadoAcreditadoCarreraTruncaNo.setText("No");

        jLabelCertificadoDiplomadoCarreraTrunca.setText("Certificado Diplomado:");

        javax.swing.GroupLayout jPanelCarreraTruncaLayout = new javax.swing.GroupLayout(jPanelCarreraTrunca);
        jPanelCarreraTrunca.setLayout(jPanelCarreraTruncaLayout);
        jPanelCarreraTruncaLayout.setHorizontalGroup(
            jPanelCarreraTruncaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCarreraTruncaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCarreraTruncaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDiplomadoAcreditadoCarreraTrunca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelGeneracionCarreraTrunca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelInstitucionCarreraTrunca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCertificadoDiplomadoCarreraTrunca, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCarreraTruncaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldInstitucionCarreraTrunca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldGeneracionCarreraTrunca)
                    .addGroup(jPanelCarreraTruncaLayout.createSequentialGroup()
                        .addComponent(jRadioButtonDiplomadoAcreditadoCarreraTruncaSi)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonDiplomadoAcreditadoCarreraTruncaNo))
                    .addComponent(jTextFieldCertificadoDiplomadoCarreraTrunca, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanelCarreraTruncaLayout.setVerticalGroup(
            jPanelCarreraTruncaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCarreraTruncaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCarreraTruncaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInstitucionCarreraTrunca)
                    .addComponent(jTextFieldInstitucionCarreraTrunca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCarreraTruncaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGeneracionCarreraTrunca)
                    .addComponent(jTextFieldGeneracionCarreraTrunca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCarreraTruncaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDiplomadoAcreditadoCarreraTrunca)
                    .addComponent(jRadioButtonDiplomadoAcreditadoCarreraTruncaSi)
                    .addComponent(jRadioButtonDiplomadoAcreditadoCarreraTruncaNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCarreraTruncaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCertificadoDiplomadoCarreraTrunca)
                    .addComponent(jTextFieldCertificadoDiplomadoCarreraTrunca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPanelDiplomadoProfordems.addTab("Carrera Trunca", jPanelCarreraTrunca);

        jLabelInstitucionBachillerato.setText("Institución:");

        jLabelGeneracionBachillerato.setText("Generación:");

        jLabelDiplomadoAcreditadoBachillerato.setText("Diplomado Acreditado:");

        buttonGroupAcreditadoBachillerato.add(jRadioButtonDiplomadoAcreditadoBachilleratoSi);
        jRadioButtonDiplomadoAcreditadoBachilleratoSi.setText("Si");

        buttonGroupAcreditadoBachillerato.add(jRadioButtonDiplomadoAcreditadoBachilleratoNo);
        jRadioButtonDiplomadoAcreditadoBachilleratoNo.setText("No");

        jLabelCertificadoDiplomadoBachillerato.setText("Certificado Diplomado:");

        javax.swing.GroupLayout jPanelBachilleratoLayout = new javax.swing.GroupLayout(jPanelBachillerato);
        jPanelBachillerato.setLayout(jPanelBachilleratoLayout);
        jPanelBachilleratoLayout.setHorizontalGroup(
            jPanelBachilleratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBachilleratoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBachilleratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDiplomadoAcreditadoBachillerato, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelGeneracionBachillerato, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelInstitucionBachillerato, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCertificadoDiplomadoBachillerato, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBachilleratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldInstitucionBachillerato, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldGeneracionBachillerato)
                    .addGroup(jPanelBachilleratoLayout.createSequentialGroup()
                        .addComponent(jRadioButtonDiplomadoAcreditadoBachilleratoSi)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonDiplomadoAcreditadoBachilleratoNo))
                    .addComponent(jTextFieldCertificadoDiplomadoBachillerato, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanelBachilleratoLayout.setVerticalGroup(
            jPanelBachilleratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBachilleratoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBachilleratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInstitucionBachillerato)
                    .addComponent(jTextFieldInstitucionBachillerato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBachilleratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGeneracionBachillerato)
                    .addComponent(jTextFieldGeneracionBachillerato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBachilleratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDiplomadoAcreditadoBachillerato)
                    .addComponent(jRadioButtonDiplomadoAcreditadoBachilleratoSi)
                    .addComponent(jRadioButtonDiplomadoAcreditadoBachilleratoNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBachilleratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCertificadoDiplomadoBachillerato)
                    .addComponent(jTextFieldCertificadoDiplomadoBachillerato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPanelDiplomadoProfordems.addTab("Bachillerato", jPanelBachillerato);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoSEP.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPanelDiplomadoProfordems, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabelLogo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabelLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPanelDiplomadoProfordems, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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
            java.util.logging.Logger.getLogger(FrmDiplomado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDiplomado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDiplomado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDiplomado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDiplomado("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupAcreditadoBachillerato;
    private javax.swing.ButtonGroup buttonGroupAcreditadoCarreraTrunca;
    private javax.swing.ButtonGroup buttonGroupAcreditadoDirector;
    private javax.swing.ButtonGroup buttonGroupAcreditadoDocente;
    private javax.swing.ButtonGroup buttonGroupCarreraConcluida;
    private javax.swing.JLabel jLabelCertificadoDiplomadoBachillerato;
    private javax.swing.JLabel jLabelCertificadoDiplomadoCarrera;
    private javax.swing.JLabel jLabelCertificadoDiplomadoCarreraTrunca;
    private javax.swing.JLabel jLabelCertificadoDiplomadoDirector;
    private javax.swing.JLabel jLabelCertificadoDiplomadoDocente;
    private javax.swing.JLabel jLabelDiplomadoAcreditadoBachillerato;
    private javax.swing.JLabel jLabelDiplomadoAcreditadoCarrera;
    private javax.swing.JLabel jLabelDiplomadoAcreditadoCarreraTrunca;
    private javax.swing.JLabel jLabelDiplomadoAcreditadoDirector;
    private javax.swing.JLabel jLabelDiplomadoAcreditadoDocente;
    private javax.swing.JLabel jLabelGeneracionBachillerato;
    private javax.swing.JLabel jLabelGeneracionCarrera;
    private javax.swing.JLabel jLabelGeneracionCarreraTrunca;
    private javax.swing.JLabel jLabelGeneracionDirector;
    private javax.swing.JLabel jLabelGeneracionDocente;
    private javax.swing.JLabel jLabelInstitucionBachillerato;
    private javax.swing.JLabel jLabelInstitucionCarrera;
    private javax.swing.JLabel jLabelInstitucionCarreraTrunca;
    private javax.swing.JLabel jLabelInstitucionDirector1;
    private javax.swing.JLabel jLabelInstitucionDocente;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanelBachillerato;
    private javax.swing.JPanel jPanelCarrera;
    private javax.swing.JPanel jPanelCarreraTrunca;
    private javax.swing.JPanel jPanelDirector;
    private javax.swing.JPanel jPanelDocente;
    private javax.swing.JRadioButton jRadioButtonDiplomadoAcreditadoBachilleratoNo;
    private javax.swing.JRadioButton jRadioButtonDiplomadoAcreditadoBachilleratoSi;
    private javax.swing.JRadioButton jRadioButtonDiplomadoAcreditadoCarreraNo;
    private javax.swing.JRadioButton jRadioButtonDiplomadoAcreditadoCarreraSi;
    private javax.swing.JRadioButton jRadioButtonDiplomadoAcreditadoCarreraTruncaNo;
    private javax.swing.JRadioButton jRadioButtonDiplomadoAcreditadoCarreraTruncaSi;
    private javax.swing.JRadioButton jRadioButtonDiplomadoAcreditadoDirectorNo;
    private javax.swing.JRadioButton jRadioButtonDiplomadoAcreditadoDirectorSi;
    private javax.swing.JRadioButton jRadioButtonDiplomadoAcreditadoDocenteNo;
    private javax.swing.JRadioButton jRadioButtonDiplomadoAcreditadoDocenteSi;
    private javax.swing.JTabbedPane jTabbedPanelDiplomadoProfordems;
    private javax.swing.JTextField jTextFieldCertificadoDiplomadoBachillerato;
    private javax.swing.JTextField jTextFieldCertificadoDiplomadoCarrera;
    private javax.swing.JTextField jTextFieldCertificadoDiplomadoCarreraTrunca;
    private javax.swing.JTextField jTextFieldCertificadoDiplomadoDirector;
    private javax.swing.JTextField jTextFieldCertificadoDiplomadoDocente;
    private javax.swing.JTextField jTextFieldGeneracionBachillerato;
    private javax.swing.JTextField jTextFieldGeneracionCarrera;
    private javax.swing.JTextField jTextFieldGeneracionCarreraTrunca;
    private javax.swing.JTextField jTextFieldGeneracionDirector;
    private javax.swing.JTextField jTextFieldGeneracionDocente;
    private javax.swing.JTextField jTextFieldInstitucionBachillerato;
    private javax.swing.JTextField jTextFieldInstitucionCarrera;
    private javax.swing.JTextField jTextFieldInstitucionCarreraTrunca;
    private javax.swing.JTextField jTextFieldInstitucionDirector;
    private javax.swing.JTextField jTextFieldInstitucionDocente;
    // End of variables declaration//GEN-END:variables
}
