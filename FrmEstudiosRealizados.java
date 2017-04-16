/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep;

/**
 *
 * @author GermyMc
 */
public class FrmEstudiosRealizados extends javax.swing.JFrame {

    String curp = "";
    String gradoBachilleratoCarrera = "";
    String gradoLicenciatura = "";
    String gradoMaestria = "";
    String gradoDoctorado = "";

    String estudiosRealizadosBachilleratoCarrera = "";
    String estudiosRealizadosLicenciatura = "";
    String estudiosRealizadosMaestria = "";
    String estudiosRealizadosDoctorado = "";

    String campoDisciplinardoBachilleratoCarrera = "";
    String campoDisciplinarLicenciatura = "";
    String campoDisciplinarMaestria = "";
    String campoDisciplinarDoctorado = "";

    String institucionBachilleratoCarrera = "";
    String institucionLicenciatura = "";
    String institucionMaestria = "";
    String institucionDoctorado = "";

    String comicionadoSabatinoDe = "";
    String comicionadoSabatinoA = "";

    /**
     * Creates new form FrmEstudiosRealizados
     */
    public FrmEstudiosRealizados(String curp) {
        this.curp = curp;
        initComponents();
        cargarDatosEstudiosRealizados();
        deshabilitarElementos();

    }

    private synchronized void cargarDatosEstudiosRealizados() {
        BD bd = new BD();
        String[] datosEstudiosRealizados = bd.obtenerDatosEstudiosRealizados(curp);

        gradoBachilleratoCarrera = datosEstudiosRealizados[0];
        gradoLicenciatura = datosEstudiosRealizados[1];
        gradoMaestria = datosEstudiosRealizados[2];
        gradoDoctorado = datosEstudiosRealizados[3];

        estudiosRealizadosBachilleratoCarrera = datosEstudiosRealizados[4];
        estudiosRealizadosLicenciatura = datosEstudiosRealizados[5];
        estudiosRealizadosMaestria = datosEstudiosRealizados[6];
        estudiosRealizadosDoctorado = datosEstudiosRealizados[7];

        campoDisciplinardoBachilleratoCarrera = datosEstudiosRealizados[8];
        campoDisciplinarLicenciatura = datosEstudiosRealizados[9];
        campoDisciplinarMaestria = datosEstudiosRealizados[10];
        campoDisciplinarDoctorado = datosEstudiosRealizados[11];

        institucionBachilleratoCarrera = datosEstudiosRealizados[12];
        institucionLicenciatura = datosEstudiosRealizados[13];
        institucionMaestria = datosEstudiosRealizados[14];
        institucionDoctorado = datosEstudiosRealizados[15];

        comicionadoSabatinoDe = datosEstudiosRealizados[16];
        comicionadoSabatinoA = datosEstudiosRealizados[17];

        jTextFieldGradoBachilleratoCarrera.setText(gradoBachilleratoCarrera);
        jTextFieldGradoLicenciatura.setText(gradoLicenciatura);
        jTextFieldGradoMaestria.setText(gradoMaestria);
        jTextFieldGradoDoctorado.setText(gradoDoctorado);

        jTextFieldEstudiosRealizadosBachilleratoCarrera.setText(estudiosRealizadosBachilleratoCarrera);
        jTextFieldEstudiosRealizadosLicenciatura.setText(estudiosRealizadosLicenciatura);
        jTextFieldEstudiosRealizadosMaestria.setText(estudiosRealizadosMaestria);
        jTextFieldEstudiosRealizadosDoctorado.setText(estudiosRealizadosDoctorado);

        jTextFieldCampoBachilleratoCarrera.setText(campoDisciplinardoBachilleratoCarrera);
        jTextFieldCampoLicenciatura.setText(campoDisciplinarLicenciatura);
        jTextFieldCampoMaestria.setText(campoDisciplinarMaestria);
        jTextFieldCampoDoctorado.setText(campoDisciplinarDoctorado);

        jTextFieldInstitucionBachilleratoCarrera.setText(institucionBachilleratoCarrera);
        jTextFieldInstitucionLicenciatura.setText(institucionLicenciatura);
        jTextFieldInstitucionMaestria.setText(institucionMaestria);
        jTextFieldInstitucionDoctorado.setText(institucionDoctorado);

        jTextFieldComisionadoSabatinoDe.setText(comicionadoSabatinoDe);
        jTextFieldComisionadoSabatinoA.setText(comicionadoSabatinoA);

    }

    private void deshabilitarElementos() {
        jTextFieldGradoBachilleratoCarrera.setEditable(false);
        jTextFieldGradoLicenciatura.setEditable(false);
        jTextFieldGradoMaestria.setEditable(false);
        jTextFieldGradoDoctorado.setEditable(false);

        jTextFieldEstudiosRealizadosBachilleratoCarrera.setEditable(false);
        jTextFieldEstudiosRealizadosLicenciatura.setEditable(false);
        jTextFieldEstudiosRealizadosMaestria.setEditable(false);
        jTextFieldEstudiosRealizadosDoctorado.setEditable(false);

        jTextFieldCampoBachilleratoCarrera.setEditable(false);
        jTextFieldCampoLicenciatura.setEditable(false);
        jTextFieldCampoMaestria.setEditable(false);
        jTextFieldCampoDoctorado.setEditable(false);

        jTextFieldInstitucionBachilleratoCarrera.setEditable(false);
        jTextFieldInstitucionLicenciatura.setEditable(false);
        jTextFieldInstitucionMaestria.setEditable(false);
        jTextFieldInstitucionDoctorado.setEditable(false);

        jTextFieldComisionadoSabatinoDe.setEditable(false);
        jTextFieldComisionadoSabatinoA.setEditable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneEstudiosRealizados = new javax.swing.JTabbedPane();
        jPanelBachillearoCarrera = new javax.swing.JPanel();
        jLabelGradoBachilleratoCarrera = new javax.swing.JLabel();
        jLabelEstudiosRealizadosBachilleratoCarrera = new javax.swing.JLabel();
        jLabelCampoBachilleratoCarrera = new javax.swing.JLabel();
        jLabelInstitucionBachilleratoCarrera = new javax.swing.JLabel();
        jTextFieldGradoBachilleratoCarrera = new javax.swing.JTextField();
        jTextFieldEstudiosRealizadosBachilleratoCarrera = new javax.swing.JTextField();
        jTextFieldCampoBachilleratoCarrera = new javax.swing.JTextField();
        jTextFieldInstitucionBachilleratoCarrera = new javax.swing.JTextField();
        jPanelLicenciatura = new javax.swing.JPanel();
        jLabelGradoLicenciatura = new javax.swing.JLabel();
        jTextFieldGradoLicenciatura = new javax.swing.JTextField();
        jLabelEstudiosRealizadosLicenciatura = new javax.swing.JLabel();
        jTextFieldEstudiosRealizadosLicenciatura = new javax.swing.JTextField();
        jLabelCampoLicenciatura = new javax.swing.JLabel();
        jTextFieldCampoLicenciatura = new javax.swing.JTextField();
        jLabelInstitucionLicenciatura = new javax.swing.JLabel();
        jTextFieldInstitucionLicenciatura = new javax.swing.JTextField();
        jPanelMaestria = new javax.swing.JPanel();
        jLabelGradoMaestria = new javax.swing.JLabel();
        jTextFieldGradoMaestria = new javax.swing.JTextField();
        jLabelEstudiosMaestria = new javax.swing.JLabel();
        jTextFieldEstudiosRealizadosMaestria = new javax.swing.JTextField();
        jLabelCampoMaestria = new javax.swing.JLabel();
        jTextFieldCampoMaestria = new javax.swing.JTextField();
        jLabelInstitucionMaestria = new javax.swing.JLabel();
        jTextFieldInstitucionMaestria = new javax.swing.JTextField();
        jPanelDoctorado = new javax.swing.JPanel();
        jLabelGradoDoctorado = new javax.swing.JLabel();
        jTextFieldGradoDoctorado = new javax.swing.JTextField();
        jLabelEstudiosRealizadosDoctorado = new javax.swing.JLabel();
        jTextFieldEstudiosRealizadosDoctorado = new javax.swing.JTextField();
        jLabelCampoDoctorado = new javax.swing.JLabel();
        jTextFieldCampoDoctorado = new javax.swing.JTextField();
        jLabelInstitucionDoctorado = new javax.swing.JLabel();
        jTextFieldInstitucionDoctorado = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabelComisionadoSabatinoDe = new javax.swing.JLabel();
        jTextFieldComisionadoSabatinoDe = new javax.swing.JTextField();
        jLabelComisionadoSabatinoA = new javax.swing.JLabel();
        jTextFieldComisionadoSabatinoA = new javax.swing.JTextField();
        jLabelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estudios Realizados");

        jLabelGradoBachilleratoCarrera.setText("Grado Obtenido:");

        jLabelEstudiosRealizadosBachilleratoCarrera.setText("Estudios Realizados:");

        jLabelCampoBachilleratoCarrera.setText("Campo Disciplinar:");

        jLabelInstitucionBachilleratoCarrera.setText("Institución:");

        javax.swing.GroupLayout jPanelBachillearoCarreraLayout = new javax.swing.GroupLayout(jPanelBachillearoCarrera);
        jPanelBachillearoCarrera.setLayout(jPanelBachillearoCarreraLayout);
        jPanelBachillearoCarreraLayout.setHorizontalGroup(
            jPanelBachillearoCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBachillearoCarreraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBachillearoCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelInstitucionBachilleratoCarrera)
                    .addComponent(jLabelCampoBachilleratoCarrera)
                    .addComponent(jLabelEstudiosRealizadosBachilleratoCarrera)
                    .addComponent(jLabelGradoBachilleratoCarrera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBachillearoCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldGradoBachilleratoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEstudiosRealizadosBachilleratoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCampoBachilleratoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInstitucionBachilleratoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanelBachillearoCarreraLayout.setVerticalGroup(
            jPanelBachillearoCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBachillearoCarreraLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelBachillearoCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGradoBachilleratoCarrera)
                    .addComponent(jTextFieldGradoBachilleratoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBachillearoCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstudiosRealizadosBachilleratoCarrera)
                    .addComponent(jTextFieldEstudiosRealizadosBachilleratoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBachillearoCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCampoBachilleratoCarrera)
                    .addComponent(jTextFieldCampoBachilleratoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBachillearoCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInstitucionBachilleratoCarrera)
                    .addComponent(jTextFieldInstitucionBachilleratoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneEstudiosRealizados.addTab("Bachillerato / Carrera Técnica", jPanelBachillearoCarrera);

        jLabelGradoLicenciatura.setText("Grado Obtenido:");

        jLabelEstudiosRealizadosLicenciatura.setText("Estudios Realizados:");

        jLabelCampoLicenciatura.setText("Campo Disciplinar:");

        jLabelInstitucionLicenciatura.setText("Institución:");

        javax.swing.GroupLayout jPanelLicenciaturaLayout = new javax.swing.GroupLayout(jPanelLicenciatura);
        jPanelLicenciatura.setLayout(jPanelLicenciaturaLayout);
        jPanelLicenciaturaLayout.setHorizontalGroup(
            jPanelLicenciaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLicenciaturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLicenciaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelInstitucionLicenciatura)
                    .addComponent(jLabelCampoLicenciatura)
                    .addComponent(jLabelEstudiosRealizadosLicenciatura)
                    .addComponent(jLabelGradoLicenciatura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLicenciaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldGradoLicenciatura, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEstudiosRealizadosLicenciatura, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCampoLicenciatura, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInstitucionLicenciatura, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanelLicenciaturaLayout.setVerticalGroup(
            jPanelLicenciaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLicenciaturaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelLicenciaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGradoLicenciatura)
                    .addComponent(jTextFieldGradoLicenciatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLicenciaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstudiosRealizadosLicenciatura)
                    .addComponent(jTextFieldEstudiosRealizadosLicenciatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLicenciaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCampoLicenciatura)
                    .addComponent(jTextFieldCampoLicenciatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLicenciaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInstitucionLicenciatura)
                    .addComponent(jTextFieldInstitucionLicenciatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneEstudiosRealizados.addTab("Licenciatura", jPanelLicenciatura);

        jLabelGradoMaestria.setText("Grado Obtenido:");

        jLabelEstudiosMaestria.setText("Estudios Realizados:");

        jLabelCampoMaestria.setText("Campo Disciplinar:");

        jLabelInstitucionMaestria.setText("Institución:");

        javax.swing.GroupLayout jPanelMaestriaLayout = new javax.swing.GroupLayout(jPanelMaestria);
        jPanelMaestria.setLayout(jPanelMaestriaLayout);
        jPanelMaestriaLayout.setHorizontalGroup(
            jPanelMaestriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMaestriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMaestriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelInstitucionMaestria)
                    .addComponent(jLabelCampoMaestria)
                    .addComponent(jLabelEstudiosMaestria)
                    .addComponent(jLabelGradoMaestria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMaestriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldGradoMaestria, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEstudiosRealizadosMaestria, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCampoMaestria, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInstitucionMaestria, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanelMaestriaLayout.setVerticalGroup(
            jPanelMaestriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMaestriaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelMaestriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGradoMaestria)
                    .addComponent(jTextFieldGradoMaestria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMaestriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstudiosMaestria)
                    .addComponent(jTextFieldEstudiosRealizadosMaestria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMaestriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCampoMaestria)
                    .addComponent(jTextFieldCampoMaestria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMaestriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInstitucionMaestria)
                    .addComponent(jTextFieldInstitucionMaestria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneEstudiosRealizados.addTab("Maestría", jPanelMaestria);

        jLabelGradoDoctorado.setText("Grado Obtenido:");

        jLabelEstudiosRealizadosDoctorado.setText("Estudios Realizados:");

        jLabelCampoDoctorado.setText("Campo Disciplinar:");

        jLabelInstitucionDoctorado.setText("Institución:");

        javax.swing.GroupLayout jPanelDoctoradoLayout = new javax.swing.GroupLayout(jPanelDoctorado);
        jPanelDoctorado.setLayout(jPanelDoctoradoLayout);
        jPanelDoctoradoLayout.setHorizontalGroup(
            jPanelDoctoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDoctoradoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDoctoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelInstitucionDoctorado)
                    .addComponent(jLabelCampoDoctorado)
                    .addComponent(jLabelEstudiosRealizadosDoctorado)
                    .addComponent(jLabelGradoDoctorado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDoctoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldGradoDoctorado, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEstudiosRealizadosDoctorado, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCampoDoctorado, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInstitucionDoctorado, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanelDoctoradoLayout.setVerticalGroup(
            jPanelDoctoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDoctoradoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelDoctoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGradoDoctorado)
                    .addComponent(jTextFieldGradoDoctorado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDoctoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstudiosRealizadosDoctorado)
                    .addComponent(jTextFieldEstudiosRealizadosDoctorado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDoctoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCampoDoctorado)
                    .addComponent(jTextFieldCampoDoctorado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDoctoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInstitucionDoctorado)
                    .addComponent(jTextFieldInstitucionDoctorado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneEstudiosRealizados.addTab("Doctorado", jPanelDoctorado);

        jLabelComisionadoSabatinoDe.setText("De:");

        jLabelComisionadoSabatinoA.setText("A:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelComisionadoSabatinoDe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldComisionadoSabatinoDe, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelComisionadoSabatinoA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldComisionadoSabatinoA, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelComisionadoSabatinoDe)
                    .addComponent(jTextFieldComisionadoSabatinoDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelComisionadoSabatinoA)
                    .addComponent(jTextFieldComisionadoSabatinoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jTabbedPaneEstudiosRealizados.addTab("Comisionado Sabatino", jPanel1);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoSEP.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPaneEstudiosRealizados, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabelLogo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabelLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneEstudiosRealizados, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmEstudiosRealizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEstudiosRealizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEstudiosRealizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEstudiosRealizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEstudiosRealizados("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCampoBachilleratoCarrera;
    private javax.swing.JLabel jLabelCampoDoctorado;
    private javax.swing.JLabel jLabelCampoLicenciatura;
    private javax.swing.JLabel jLabelCampoMaestria;
    private javax.swing.JLabel jLabelComisionadoSabatinoA;
    private javax.swing.JLabel jLabelComisionadoSabatinoDe;
    private javax.swing.JLabel jLabelEstudiosMaestria;
    private javax.swing.JLabel jLabelEstudiosRealizadosBachilleratoCarrera;
    private javax.swing.JLabel jLabelEstudiosRealizadosDoctorado;
    private javax.swing.JLabel jLabelEstudiosRealizadosLicenciatura;
    private javax.swing.JLabel jLabelGradoBachilleratoCarrera;
    private javax.swing.JLabel jLabelGradoDoctorado;
    private javax.swing.JLabel jLabelGradoLicenciatura;
    private javax.swing.JLabel jLabelGradoMaestria;
    private javax.swing.JLabel jLabelInstitucionBachilleratoCarrera;
    private javax.swing.JLabel jLabelInstitucionDoctorado;
    private javax.swing.JLabel jLabelInstitucionLicenciatura;
    private javax.swing.JLabel jLabelInstitucionMaestria;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBachillearoCarrera;
    private javax.swing.JPanel jPanelDoctorado;
    private javax.swing.JPanel jPanelLicenciatura;
    private javax.swing.JPanel jPanelMaestria;
    private javax.swing.JTabbedPane jTabbedPaneEstudiosRealizados;
    private javax.swing.JTextField jTextFieldCampoBachilleratoCarrera;
    private javax.swing.JTextField jTextFieldCampoDoctorado;
    private javax.swing.JTextField jTextFieldCampoLicenciatura;
    private javax.swing.JTextField jTextFieldCampoMaestria;
    private javax.swing.JTextField jTextFieldComisionadoSabatinoA;
    private javax.swing.JTextField jTextFieldComisionadoSabatinoDe;
    private javax.swing.JTextField jTextFieldEstudiosRealizadosBachilleratoCarrera;
    private javax.swing.JTextField jTextFieldEstudiosRealizadosDoctorado;
    private javax.swing.JTextField jTextFieldEstudiosRealizadosLicenciatura;
    private javax.swing.JTextField jTextFieldEstudiosRealizadosMaestria;
    private javax.swing.JTextField jTextFieldGradoBachilleratoCarrera;
    private javax.swing.JTextField jTextFieldGradoDoctorado;
    private javax.swing.JTextField jTextFieldGradoLicenciatura;
    private javax.swing.JTextField jTextFieldGradoMaestria;
    private javax.swing.JTextField jTextFieldInstitucionBachilleratoCarrera;
    private javax.swing.JTextField jTextFieldInstitucionDoctorado;
    private javax.swing.JTextField jTextFieldInstitucionLicenciatura;
    private javax.swing.JTextField jTextFieldInstitucionMaestria;
    // End of variables declaration//GEN-END:variables
}
