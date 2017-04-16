/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep;

import javax.swing.JOptionPane;

/**
 *
 * @author GermyMc
 */
public class FrmComplementarAsignatura extends javax.swing.JFrame {

    String curp = "";

    String asignarutra1Semestre1 = "";
    String asignarutra1Semestre2 = "";
    String asignarutra1Semestre3 = "";
    String asignarutra1Semestre4 = "";
    String asignarutra1Semestre5 = "";
    String asignarutra1Semestre6 = "";

    String asignarutra2Semestre1 = "";
    String asignarutra2Semestre2 = "";
    String asignarutra2Semestre3 = "";
    String asignarutra2Semestre4 = "";
    String asignarutra2Semestre5 = "";
    String asignarutra2Semestre6 = "";

    String asignarutra3Semestre1 = "";
    String asignarutra3Semestre2 = "";
    String asignarutra3Semestre3 = "";
    String asignarutra3Semestre4 = "";
    String asignarutra3Semestre5 = "";
    String asignarutra3Semestre6 = "";

    String numeroGruposAtendidosAsignatura1Semestre1 = "";
    String numeroGruposAtendidosAsignatura1Semestre2 = "";
    String numeroGruposAtendidosAsignatura1Semestre3 = "";
    String numeroGruposAtendidosAsignatura1Semestre4 = "";
    String numeroGruposAtendidosAsignatura1Semestre5 = "";
    String numeroGruposAtendidosAsignatura1Semestre6 = "";

    String numeroGruposAtendidosAsignatura2Semestre1 = "";
    String numeroGruposAtendidosAsignatura2Semestre2 = "";
    String numeroGruposAtendidosAsignatura2Semestre3 = "";
    String numeroGruposAtendidosAsignatura2Semestre4 = "";
    String numeroGruposAtendidosAsignatura2Semestre5 = "";
    String numeroGruposAtendidosAsignatura2Semestre6 = "";

    String numeroGruposAtendidosAsignatura3Semestre1 = "";
    String numeroGruposAtendidosAsignatura3Semestre2 = "";
    String numeroGruposAtendidosAsignatura3Semestre3 = "";
    String numeroGruposAtendidosAsignatura3Semestre4 = "";
    String numeroGruposAtendidosAsignatura3Semestre5 = "";
    String numeroGruposAtendidosAsignatura3Semestre6 = "";

    String numeroAlumnosGrupoAsignatura1Semestre1 = "";
    String numeroAlumnosGrupoAsignatura1Semestre2 = "";
    String numeroAlumnosGrupoAsignatura1Semestre3 = "";
    String numeroAlumnosGrupoAsignatura1Semestre4 = "";
    String numeroAlumnosGrupoAsignatura1Semestre5 = "";
    String numeroAlumnosGrupoAsignatura1Semestre6 = "";

    String numeroAlumnosGrupoAsignatura2Semestre1 = "";
    String numeroAlumnosGrupoAsignatura2Semestre2 = "";
    String numeroAlumnosGrupoAsignatura2Semestre3 = "";
    String numeroAlumnosGrupoAsignatura2Semestre4 = "";
    String numeroAlumnosGrupoAsignatura2Semestre5 = "";
    String numeroAlumnosGrupoAsignatura2Semestre6 = "";

    String numeroAlumnosGrupoAsignatura3Semestre1 = "";
    String numeroAlumnosGrupoAsignatura3Semestre2 = "";
    String numeroAlumnosGrupoAsignatura3Semestre3 = "";
    String numeroAlumnosGrupoAsignatura3Semestre4 = "";
    String numeroAlumnosGrupoAsignatura3Semestre5 = "";
    String numeroAlumnosGrupoAsignatura3Semestre6 = "";

    /**
     * Creates new form FrmAsignatura
     */
    public FrmComplementarAsignatura(String curp) {
        this.curp = curp;
        initComponents();
        cargarAsignaturasSemestres(curp);

    }

    private synchronized void cargarAsignaturasSemestres(String curp) {
        String CURP = curp;
        BD bd = new BD();
        String[] datosAsignaturas = bd.obtenerDatosAsignaturas(CURP);
        asignarutra1Semestre1 = datosAsignaturas[0];
        asignarutra1Semestre2 = datosAsignaturas[1];
        asignarutra1Semestre3 = datosAsignaturas[2];
        asignarutra1Semestre4 = datosAsignaturas[3];
        asignarutra1Semestre5 = datosAsignaturas[4];
        asignarutra1Semestre6 = datosAsignaturas[5];

        asignarutra2Semestre1 = datosAsignaturas[6];
        asignarutra2Semestre2 = datosAsignaturas[7];
        asignarutra2Semestre3 = datosAsignaturas[8];
        asignarutra2Semestre4 = datosAsignaturas[9];
        asignarutra2Semestre5 = datosAsignaturas[10];
        asignarutra2Semestre6 = datosAsignaturas[11];

        asignarutra3Semestre1 = datosAsignaturas[12];
        asignarutra3Semestre2 = datosAsignaturas[13];
        asignarutra3Semestre3 = datosAsignaturas[14];
        asignarutra3Semestre4 = datosAsignaturas[15];
        asignarutra3Semestre5 = datosAsignaturas[16];
        asignarutra3Semestre6 = datosAsignaturas[17];

        numeroGruposAtendidosAsignatura1Semestre1 = datosAsignaturas[18];
        numeroGruposAtendidosAsignatura1Semestre2 = datosAsignaturas[19];
        numeroGruposAtendidosAsignatura1Semestre3 = datosAsignaturas[20];
        numeroGruposAtendidosAsignatura1Semestre4 = datosAsignaturas[21];
        numeroGruposAtendidosAsignatura1Semestre5 = datosAsignaturas[22];
        numeroGruposAtendidosAsignatura1Semestre6 = datosAsignaturas[23];

        numeroGruposAtendidosAsignatura2Semestre1 = datosAsignaturas[24];
        numeroGruposAtendidosAsignatura2Semestre2 = datosAsignaturas[25];
        numeroGruposAtendidosAsignatura2Semestre3 = datosAsignaturas[26];
        numeroGruposAtendidosAsignatura2Semestre4 = datosAsignaturas[27];
        numeroGruposAtendidosAsignatura2Semestre5 = datosAsignaturas[28];
        numeroGruposAtendidosAsignatura2Semestre6 = datosAsignaturas[29];

        numeroGruposAtendidosAsignatura3Semestre1 = datosAsignaturas[30];
        numeroGruposAtendidosAsignatura3Semestre2 = datosAsignaturas[31];
        numeroGruposAtendidosAsignatura3Semestre3 = datosAsignaturas[32];
        numeroGruposAtendidosAsignatura3Semestre4 = datosAsignaturas[33];
        numeroGruposAtendidosAsignatura3Semestre5 = datosAsignaturas[34];
        numeroGruposAtendidosAsignatura3Semestre6 = datosAsignaturas[35];

        numeroAlumnosGrupoAsignatura1Semestre1 = datosAsignaturas[36];
        numeroAlumnosGrupoAsignatura1Semestre2 = datosAsignaturas[37];
        numeroAlumnosGrupoAsignatura1Semestre3 = datosAsignaturas[38];
        numeroAlumnosGrupoAsignatura1Semestre4 = datosAsignaturas[39];
        numeroAlumnosGrupoAsignatura1Semestre5 = datosAsignaturas[40];
        numeroAlumnosGrupoAsignatura1Semestre6 = datosAsignaturas[41];

        numeroAlumnosGrupoAsignatura2Semestre1 = datosAsignaturas[42];
        numeroAlumnosGrupoAsignatura2Semestre2 = datosAsignaturas[43];
        numeroAlumnosGrupoAsignatura2Semestre3 = datosAsignaturas[44];
        numeroAlumnosGrupoAsignatura2Semestre4 = datosAsignaturas[45];
        numeroAlumnosGrupoAsignatura2Semestre5 = datosAsignaturas[46];
        numeroAlumnosGrupoAsignatura2Semestre6 = datosAsignaturas[47];

        numeroAlumnosGrupoAsignatura3Semestre1 = datosAsignaturas[48];
        numeroAlumnosGrupoAsignatura3Semestre2 = datosAsignaturas[49];
        numeroAlumnosGrupoAsignatura3Semestre3 = datosAsignaturas[50];
        numeroAlumnosGrupoAsignatura3Semestre4 = datosAsignaturas[51];
        numeroAlumnosGrupoAsignatura3Semestre5 = datosAsignaturas[52];
        numeroAlumnosGrupoAsignatura3Semestre6 = datosAsignaturas[53];

        jTextFieldAsignatura1Sem1.setText(asignarutra1Semestre1);
        jTextFieldAsignatura1Sem2.setText(asignarutra1Semestre2);
        jTextFieldAsignatura1Sem3.setText(asignarutra1Semestre3);
        jTextFieldAsignatura1Sem4.setText(asignarutra1Semestre4);
        jTextFieldAsignatura1Sem5.setText(asignarutra1Semestre5);
        jTextFieldAsignatura1Sem6.setText(asignarutra1Semestre6);

        jTextFieldAsignatura2Sem1.setText(asignarutra2Semestre1);
        jTextFieldAsignatura2Sem2.setText(asignarutra2Semestre2);
        jTextFieldAsignatura2Sem3.setText(asignarutra2Semestre3);
        jTextFieldAsignatura2Sem4.setText(asignarutra2Semestre4);
        jTextFieldAsignatura2Sem5.setText(asignarutra2Semestre5);
        jTextFieldAsignatura2Sem6.setText(asignarutra2Semestre6);

        jTextFieldAsignatura3Sem1.setText(asignarutra3Semestre1);
        jTextFieldAsignatura3Sem2.setText(asignarutra3Semestre2);
        jTextFieldAsignatura3Sem3.setText(asignarutra3Semestre3);
        jTextFieldAsignatura3Sem4.setText(asignarutra3Semestre4);
        jTextFieldAsignatura3Sem5.setText(asignarutra3Semestre5);
        jTextFieldAsignatura3Sem6.setText(asignarutra3Semestre6);

        try {

            if (!"".equals(numeroGruposAtendidosAsignatura1Semestre1)) {
                jSpinnerNoGruposAsignatura1Sem1.setValue(Integer.parseInt(numeroGruposAtendidosAsignatura1Semestre1));
            }

            if (!"".equals(numeroGruposAtendidosAsignatura1Semestre2)) {
                jSpinnerNoGruposAsignatura1Sem2.setValue(Integer.parseInt(numeroGruposAtendidosAsignatura1Semestre2));
            }

            if (!"".equals(numeroGruposAtendidosAsignatura1Semestre3)) {
                jSpinnerNoGruposAsignatura1Sem3.setValue(Integer.parseInt(numeroGruposAtendidosAsignatura1Semestre3));
            }

            if (!"".equals(numeroGruposAtendidosAsignatura1Semestre4)) {
                jSpinnerNoGruposAsignatura1Sem4.setValue(Integer.parseInt(numeroGruposAtendidosAsignatura1Semestre4));
            }

            if (!"".equals(numeroGruposAtendidosAsignatura1Semestre5)) {
                jSpinnerNoGruposAsignatura1Sem5.setValue(Integer.parseInt(numeroGruposAtendidosAsignatura1Semestre5));
            }

            if (!"".equals(numeroGruposAtendidosAsignatura1Semestre6)) {
                jSpinnerNoGruposAsignatura1Sem6.setValue(Integer.parseInt(numeroGruposAtendidosAsignatura1Semestre6));
            }

            if (!"".equals(numeroGruposAtendidosAsignatura2Semestre1)) {
                jSpinnerNoGruposAsignatura2Sem1.setValue(Integer.parseInt(numeroGruposAtendidosAsignatura2Semestre1));
            }

            if (!"".equals(numeroGruposAtendidosAsignatura2Semestre2)) {
                jSpinnerNoGruposAsignatura2Sem2.setValue(Integer.parseInt(numeroGruposAtendidosAsignatura2Semestre2));
            }

            if (!"".equals(numeroGruposAtendidosAsignatura2Semestre3)) {
                jSpinnerNoGruposAsignatura2Sem3.setValue(Integer.parseInt(numeroGruposAtendidosAsignatura2Semestre3));
            }

            if (!"".equals(numeroGruposAtendidosAsignatura2Semestre4)) {
                jSpinnerNoGruposAsignatura2Sem4.setValue(Integer.parseInt(numeroGruposAtendidosAsignatura2Semestre4));
            }

            if (!"".equals(numeroGruposAtendidosAsignatura2Semestre5)) {
                jSpinnerNoGruposAsignatura2Sem5.setValue(Integer.parseInt(numeroGruposAtendidosAsignatura2Semestre5));
            }

            if (!"".equals(numeroGruposAtendidosAsignatura2Semestre6)) {
                jSpinnerNoGruposAsignatura2Sem6.setValue(Integer.parseInt(numeroGruposAtendidosAsignatura2Semestre6));
            }

            if (!"".equals(numeroGruposAtendidosAsignatura3Semestre1)) {
                jSpinnerNoGruposAsignatura3Sem1.setValue(Integer.parseInt(numeroGruposAtendidosAsignatura3Semestre1));
            }

            if (!"".equals(numeroGruposAtendidosAsignatura3Semestre2)) {
                jSpinnerNoGruposAsignatura3Sem2.setValue(Integer.parseInt(numeroGruposAtendidosAsignatura3Semestre2));
            }

            if (!"".equals(numeroGruposAtendidosAsignatura3Semestre3)) {
                jSpinnerNoGruposAsignatura3Sem3.setValue(Integer.parseInt(numeroGruposAtendidosAsignatura3Semestre3));
            }

            if (!"".equals(numeroGruposAtendidosAsignatura3Semestre4)) {
                jSpinnerNoGruposAsignatura3Sem4.setValue(Integer.parseInt(numeroGruposAtendidosAsignatura3Semestre4));
            }

            if (!"".equals(numeroGruposAtendidosAsignatura3Semestre5)) {
                jSpinnerNoGruposAsignatura3Sem5.setValue(Integer.parseInt(numeroGruposAtendidosAsignatura3Semestre5));
            }

            if (!"".equals(numeroGruposAtendidosAsignatura3Semestre6)) {
                jSpinnerNoGruposAsignatura3Sem6.setValue(Integer.parseInt(numeroGruposAtendidosAsignatura3Semestre6));
            }

            if (!"".equals(numeroAlumnosGrupoAsignatura1Semestre1)) {
                jSpinnerNoAlumnosAsignatura1Sem1.setValue(Integer.parseInt(numeroAlumnosGrupoAsignatura1Semestre1));
            }

            if (!"".equals(numeroAlumnosGrupoAsignatura1Semestre2)) {
                jSpinnerNoAlumnosAsignatura1Sem2.setValue(Integer.parseInt(numeroAlumnosGrupoAsignatura1Semestre2));
            }

            if (!"".equals(numeroAlumnosGrupoAsignatura1Semestre3)) {
                jSpinnerNoAlumnosAsignatura1Sem3.setValue(Integer.parseInt(numeroAlumnosGrupoAsignatura1Semestre3));
            }

            if (!"".equals(numeroAlumnosGrupoAsignatura1Semestre4)) {
                jSpinnerNoAlumnosAsignatura1Sem4.setValue(Integer.parseInt(numeroAlumnosGrupoAsignatura1Semestre4));
            }

            if (!"".equals(numeroAlumnosGrupoAsignatura1Semestre5)) {
                jSpinnerNoAlumnosAsignatura1Sem5.setValue(Integer.parseInt(numeroAlumnosGrupoAsignatura1Semestre5));
            }

            if (!"".equals(numeroAlumnosGrupoAsignatura1Semestre6)) {
                jSpinnerNoAlumnosAsignatura1Sem6.setValue(Integer.parseInt(numeroAlumnosGrupoAsignatura1Semestre6));
            }

            if (!"".equals(numeroAlumnosGrupoAsignatura2Semestre1)) {
                jSpinnerNoAlumnosAsignatura2Sem1.setValue(Integer.parseInt(numeroAlumnosGrupoAsignatura2Semestre1));
            }

            if (!"".equals(numeroAlumnosGrupoAsignatura2Semestre2)) {
                jSpinnerNoAlumnosAsignatura2Sem2.setValue(Integer.parseInt(numeroAlumnosGrupoAsignatura2Semestre2));
            }

            if (!"".equals(numeroAlumnosGrupoAsignatura2Semestre3)) {
                jSpinnerNoAlumnosAsignatura2Sem3.setValue(Integer.parseInt(numeroAlumnosGrupoAsignatura2Semestre3));
            }

            if (!"".equals(numeroAlumnosGrupoAsignatura2Semestre4)) {
                jSpinnerNoAlumnosAsignatura2Sem4.setValue(Integer.parseInt(numeroAlumnosGrupoAsignatura2Semestre4));
            }

            if (!"".equals(numeroAlumnosGrupoAsignatura2Semestre5)) {
                jSpinnerNoAlumnosAsignatura2Sem5.setValue(Integer.parseInt(numeroAlumnosGrupoAsignatura2Semestre5));
            }

            if (!"".equals(numeroAlumnosGrupoAsignatura2Semestre6)) {
                jSpinnerNoAlumnosAsignatura2Sem6.setValue(Integer.parseInt(numeroAlumnosGrupoAsignatura2Semestre6));

            }

            if (!"".equals(numeroAlumnosGrupoAsignatura3Semestre1)) {
                jSpinnerNoAlumnosAsignatura3Sem1.setValue(Integer.parseInt(numeroAlumnosGrupoAsignatura3Semestre1));
            }

            if (!"".equals(numeroAlumnosGrupoAsignatura3Semestre2)) {
                jSpinnerNoAlumnosAsignatura3Sem2.setValue(Integer.parseInt(numeroAlumnosGrupoAsignatura3Semestre2));
            }

            if (!"".equals(numeroAlumnosGrupoAsignatura3Semestre3)) {
                jSpinnerNoAlumnosAsignatura3Sem3.setValue(Integer.parseInt(numeroAlumnosGrupoAsignatura3Semestre3));
            }

            if (!"".equals(numeroAlumnosGrupoAsignatura3Semestre4)) {
                jSpinnerNoAlumnosAsignatura3Sem4.setValue(Integer.parseInt(numeroAlumnosGrupoAsignatura3Semestre4));
            }

            if (!"".equals(numeroAlumnosGrupoAsignatura3Semestre5)) {
                jSpinnerNoAlumnosAsignatura3Sem5.setValue(Integer.parseInt(numeroAlumnosGrupoAsignatura3Semestre5));
            }

            if (!"".equals(numeroAlumnosGrupoAsignatura3Semestre6)) {
                jSpinnerNoAlumnosAsignatura3Sem6.setValue(Integer.parseInt(numeroAlumnosGrupoAsignatura3Semestre6));
            }

        } catch (Exception e) {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelSemestre1 = new javax.swing.JPanel();
        jPanelAsignarutra1Sem1 = new javax.swing.JPanel();
        jLabelNoAsignatura1Sem1 = new javax.swing.JLabel();
        jLabelNoGruposAsignatura1Sem1 = new javax.swing.JLabel();
        jLabelNoAlumnosAsignatura1Sem1 = new javax.swing.JLabel();
        jTextFieldAsignatura1Sem1 = new javax.swing.JTextField();
        jSpinnerNoGruposAsignatura1Sem1 = new javax.swing.JSpinner();
        jSpinnerNoAlumnosAsignatura1Sem1 = new javax.swing.JSpinner();
        jPanelAsignarutra2Sem1 = new javax.swing.JPanel();
        jLabelNoAsignatura2Sem1 = new javax.swing.JLabel();
        jLabelNoGruposAsignatura2Sem1 = new javax.swing.JLabel();
        jLabelNoAlumnosAsignatura2Sem1 = new javax.swing.JLabel();
        jTextFieldAsignatura2Sem1 = new javax.swing.JTextField();
        jSpinnerNoGruposAsignatura2Sem1 = new javax.swing.JSpinner();
        jSpinnerNoAlumnosAsignatura2Sem1 = new javax.swing.JSpinner();
        jPanelAsignarutra3Sem1 = new javax.swing.JPanel();
        jLabelNoAsignatura3Sem1 = new javax.swing.JLabel();
        jLabelNoGruposAsignatura3Sem1 = new javax.swing.JLabel();
        jLabelNoAlumnosAsignatura3Sem1 = new javax.swing.JLabel();
        jTextFieldAsignatura3Sem1 = new javax.swing.JTextField();
        jSpinnerNoGruposAsignatura3Sem1 = new javax.swing.JSpinner();
        jSpinnerNoAlumnosAsignatura3Sem1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jPanelSemestre2 = new javax.swing.JPanel();
        jPanelAsignarutra1Sem2 = new javax.swing.JPanel();
        jLabelNoAsignatura1Sem2 = new javax.swing.JLabel();
        jLabelNoGruposAsignatura1Sem2 = new javax.swing.JLabel();
        jLabelNoAlumnosAsignatura1Sem2 = new javax.swing.JLabel();
        jTextFieldAsignatura1Sem2 = new javax.swing.JTextField();
        jSpinnerNoGruposAsignatura1Sem2 = new javax.swing.JSpinner();
        jSpinnerNoAlumnosAsignatura1Sem2 = new javax.swing.JSpinner();
        jPanelAsignarutra2Sem2 = new javax.swing.JPanel();
        jLabelNoAsignatura2Sem2 = new javax.swing.JLabel();
        jLabelNoGruposAsignatura2Sem2 = new javax.swing.JLabel();
        jLabelNoAlumnosAsignatura2Sem2 = new javax.swing.JLabel();
        jTextFieldAsignatura2Sem2 = new javax.swing.JTextField();
        jSpinnerNoGruposAsignatura2Sem2 = new javax.swing.JSpinner();
        jSpinnerNoAlumnosAsignatura2Sem2 = new javax.swing.JSpinner();
        jPanelAsignarutra3Sem2 = new javax.swing.JPanel();
        jLabelNoAsignatura3Sem2 = new javax.swing.JLabel();
        jLabelNoGruposAsignatura3Sem2 = new javax.swing.JLabel();
        jLabelNoAlumnosAsignatura3Sem2 = new javax.swing.JLabel();
        jTextFieldAsignatura3Sem2 = new javax.swing.JTextField();
        jSpinnerNoGruposAsignatura3Sem2 = new javax.swing.JSpinner();
        jSpinnerNoAlumnosAsignatura3Sem2 = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanelSemestre3 = new javax.swing.JPanel();
        jPanelAsignarutra1Sem3 = new javax.swing.JPanel();
        jLabelNoAsignatura1Sem3 = new javax.swing.JLabel();
        jLabelNoGruposAsignatura1Sem3 = new javax.swing.JLabel();
        jLabelNoAlumnosAsignatura1Sem3 = new javax.swing.JLabel();
        jTextFieldAsignatura1Sem3 = new javax.swing.JTextField();
        jSpinnerNoGruposAsignatura1Sem3 = new javax.swing.JSpinner();
        jSpinnerNoAlumnosAsignatura1Sem3 = new javax.swing.JSpinner();
        jPanelAsignarutra2Sem3 = new javax.swing.JPanel();
        jLabelNoAsignatura2Sem3 = new javax.swing.JLabel();
        jLabelNoGruposAsignatura2Sem3 = new javax.swing.JLabel();
        jLabelNoAlumnosAsignatura2Sem3 = new javax.swing.JLabel();
        jTextFieldAsignatura2Sem3 = new javax.swing.JTextField();
        jSpinnerNoGruposAsignatura2Sem3 = new javax.swing.JSpinner();
        jSpinnerNoAlumnosAsignatura2Sem3 = new javax.swing.JSpinner();
        jPanelAsignarutra3Sem3 = new javax.swing.JPanel();
        jLabelNoAsignatura3Sem3 = new javax.swing.JLabel();
        jLabelNoGruposAsignatura3Sem3 = new javax.swing.JLabel();
        jLabelNoAlumnosAsignatura3Sem3 = new javax.swing.JLabel();
        jTextFieldAsignatura3Sem3 = new javax.swing.JTextField();
        jSpinnerNoGruposAsignatura3Sem3 = new javax.swing.JSpinner();
        jSpinnerNoAlumnosAsignatura3Sem3 = new javax.swing.JSpinner();
        jButton5 = new javax.swing.JButton();
        jPanelSemestre4 = new javax.swing.JPanel();
        jPanelAsignarutra1Sem4 = new javax.swing.JPanel();
        jLabelNoAsignatura1Sem4 = new javax.swing.JLabel();
        jLabelNoGruposAsignatura1Sem4 = new javax.swing.JLabel();
        jLabelNoAlumnosAsignatura1Sem4 = new javax.swing.JLabel();
        jTextFieldAsignatura1Sem4 = new javax.swing.JTextField();
        jSpinnerNoGruposAsignatura1Sem4 = new javax.swing.JSpinner();
        jSpinnerNoAlumnosAsignatura1Sem4 = new javax.swing.JSpinner();
        jPanelAsignarutra2Sem4 = new javax.swing.JPanel();
        jLabelNoAsignatura2Sem4 = new javax.swing.JLabel();
        jLabelNoGruposAsignatura2Sem4 = new javax.swing.JLabel();
        jLabelNoAlumnosAsignatura2Sem4 = new javax.swing.JLabel();
        jTextFieldAsignatura2Sem4 = new javax.swing.JTextField();
        jSpinnerNoGruposAsignatura2Sem4 = new javax.swing.JSpinner();
        jSpinnerNoAlumnosAsignatura2Sem4 = new javax.swing.JSpinner();
        jPanelAsignarutra3Sem4 = new javax.swing.JPanel();
        jLabelNoAsignatura3Sem4 = new javax.swing.JLabel();
        jLabelNoGruposAsignatura3Sem4 = new javax.swing.JLabel();
        jLabelNoAlumnosAsignatura3Sem4 = new javax.swing.JLabel();
        jTextFieldAsignatura3Sem4 = new javax.swing.JTextField();
        jSpinnerNoGruposAsignatura3Sem4 = new javax.swing.JSpinner();
        jSpinnerNoAlumnosAsignatura3Sem4 = new javax.swing.JSpinner();
        jButton6 = new javax.swing.JButton();
        jPanelSemestre5 = new javax.swing.JPanel();
        jPanelAsignarutra1Sem5 = new javax.swing.JPanel();
        jLabelNoAsignatura1Sem5 = new javax.swing.JLabel();
        jLabelNoGruposAsignatura1Sem5 = new javax.swing.JLabel();
        jLabelNoAlumnosAsignatura1Sem5 = new javax.swing.JLabel();
        jTextFieldAsignatura1Sem5 = new javax.swing.JTextField();
        jSpinnerNoGruposAsignatura1Sem5 = new javax.swing.JSpinner();
        jSpinnerNoAlumnosAsignatura1Sem5 = new javax.swing.JSpinner();
        jPanelAsignarutra2Sem5 = new javax.swing.JPanel();
        jLabelNoAsignatura2Sem5 = new javax.swing.JLabel();
        jLabelNoGruposAsignatura2Sem5 = new javax.swing.JLabel();
        jLabelNoAlumnosAsignatura2Sem5 = new javax.swing.JLabel();
        jTextFieldAsignatura2Sem5 = new javax.swing.JTextField();
        jSpinnerNoGruposAsignatura2Sem5 = new javax.swing.JSpinner();
        jSpinnerNoAlumnosAsignatura2Sem5 = new javax.swing.JSpinner();
        jPanelAsignarutra3Sem5 = new javax.swing.JPanel();
        jLabelNoAsignatura3Sem5 = new javax.swing.JLabel();
        jLabelNoGruposAsignatura3Sem5 = new javax.swing.JLabel();
        jLabelNoAlumnosAsignatura3Sem5 = new javax.swing.JLabel();
        jTextFieldAsignatura3Sem5 = new javax.swing.JTextField();
        jSpinnerNoGruposAsignatura3Sem5 = new javax.swing.JSpinner();
        jSpinnerNoAlumnosAsignatura3Sem5 = new javax.swing.JSpinner();
        jButton7 = new javax.swing.JButton();
        jPanelSemestre6 = new javax.swing.JPanel();
        jPanelAsignarutra1Sem6 = new javax.swing.JPanel();
        jLabelNoAsignatura1Sem6 = new javax.swing.JLabel();
        jLabelNoGruposAsignatura1Sem6 = new javax.swing.JLabel();
        jLabelNoAlumnosAsignatura1Sem6 = new javax.swing.JLabel();
        jTextFieldAsignatura1Sem6 = new javax.swing.JTextField();
        jSpinnerNoGruposAsignatura1Sem6 = new javax.swing.JSpinner();
        jSpinnerNoAlumnosAsignatura1Sem6 = new javax.swing.JSpinner();
        jPanelAsignarutra2Sem6 = new javax.swing.JPanel();
        jLabelNoAsignatura2Sem6 = new javax.swing.JLabel();
        jLabelNoGruposAsignatura2Sem6 = new javax.swing.JLabel();
        jLabelNoAlumnosAsignatura2Sem6 = new javax.swing.JLabel();
        jTextFieldAsignatura2Sem6 = new javax.swing.JTextField();
        jSpinnerNoGruposAsignatura2Sem6 = new javax.swing.JSpinner();
        jSpinnerNoAlumnosAsignatura2Sem6 = new javax.swing.JSpinner();
        jPanelAsignarutra3Sem6 = new javax.swing.JPanel();
        jLabelNoAsignatura3Sem6 = new javax.swing.JLabel();
        jLabelNoGruposAsignatura3Sem6 = new javax.swing.JLabel();
        jLabelNoAlumnosAsignatura3Sem6 = new javax.swing.JLabel();
        jTextFieldAsignatura3Sem6 = new javax.swing.JTextField();
        jSpinnerNoGruposAsignatura3Sem6 = new javax.swing.JSpinner();
        jSpinnerNoAlumnosAsignatura3Sem6 = new javax.swing.JSpinner();
        jButton8 = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Complementar Datos Asignaturas");
        setType(java.awt.Window.Type.POPUP);

        jPanelAsignarutra1Sem1.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignatura 1"));

        jLabelNoAsignatura1Sem1.setText("Asignatura:");

        jLabelNoGruposAsignatura1Sem1.setText("No. Grupos Atendidos:");

        jLabelNoAlumnosAsignatura1Sem1.setText("No. Alumnos por Grupo:");

        javax.swing.GroupLayout jPanelAsignarutra1Sem1Layout = new javax.swing.GroupLayout(jPanelAsignarutra1Sem1);
        jPanelAsignarutra1Sem1.setLayout(jPanelAsignarutra1Sem1Layout);
        jPanelAsignarutra1Sem1Layout.setHorizontalGroup(
            jPanelAsignarutra1Sem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra1Sem1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAsignarutra1Sem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNoAsignatura1Sem1)
                    .addComponent(jLabelNoAlumnosAsignatura1Sem1)
                    .addComponent(jLabelNoGruposAsignatura1Sem1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra1Sem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAsignatura1Sem1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoGruposAsignatura1Sem1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoAlumnosAsignatura1Sem1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanelAsignarutra1Sem1Layout.setVerticalGroup(
            jPanelAsignarutra1Sem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra1Sem1Layout.createSequentialGroup()
                .addGroup(jPanelAsignarutra1Sem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAsignatura1Sem1)
                    .addComponent(jTextFieldAsignatura1Sem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra1Sem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoGruposAsignatura1Sem1)
                    .addComponent(jSpinnerNoGruposAsignatura1Sem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra1Sem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAlumnosAsignatura1Sem1)
                    .addComponent(jSpinnerNoAlumnosAsignatura1Sem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelAsignarutra2Sem1.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignatura 2"));

        jLabelNoAsignatura2Sem1.setText("Asignatura:");

        jLabelNoGruposAsignatura2Sem1.setText("No. Grupos Atendidos:");

        jLabelNoAlumnosAsignatura2Sem1.setText("No. Alumnos por Grupo:");

        javax.swing.GroupLayout jPanelAsignarutra2Sem1Layout = new javax.swing.GroupLayout(jPanelAsignarutra2Sem1);
        jPanelAsignarutra2Sem1.setLayout(jPanelAsignarutra2Sem1Layout);
        jPanelAsignarutra2Sem1Layout.setHorizontalGroup(
            jPanelAsignarutra2Sem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra2Sem1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAsignarutra2Sem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNoAsignatura2Sem1)
                    .addComponent(jLabelNoAlumnosAsignatura2Sem1)
                    .addComponent(jLabelNoGruposAsignatura2Sem1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra2Sem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAsignatura2Sem1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoGruposAsignatura2Sem1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoAlumnosAsignatura2Sem1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAsignarutra2Sem1Layout.setVerticalGroup(
            jPanelAsignarutra2Sem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra2Sem1Layout.createSequentialGroup()
                .addGroup(jPanelAsignarutra2Sem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAsignatura2Sem1)
                    .addComponent(jTextFieldAsignatura2Sem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra2Sem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoGruposAsignatura2Sem1)
                    .addComponent(jSpinnerNoGruposAsignatura2Sem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra2Sem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAlumnosAsignatura2Sem1)
                    .addComponent(jSpinnerNoAlumnosAsignatura2Sem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelAsignarutra3Sem1.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignatura 3"));

        jLabelNoAsignatura3Sem1.setText("Asignatura:");

        jLabelNoGruposAsignatura3Sem1.setText("No. Grupos Atendidos:");

        jLabelNoAlumnosAsignatura3Sem1.setText("No. Alumnos por Grupo:");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAsignarutra3Sem1Layout = new javax.swing.GroupLayout(jPanelAsignarutra3Sem1);
        jPanelAsignarutra3Sem1.setLayout(jPanelAsignarutra3Sem1Layout);
        jPanelAsignarutra3Sem1Layout.setHorizontalGroup(
            jPanelAsignarutra3Sem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra3Sem1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAsignarutra3Sem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanelAsignarutra3Sem1Layout.createSequentialGroup()
                        .addGroup(jPanelAsignarutra3Sem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNoAsignatura3Sem1)
                            .addComponent(jLabelNoAlumnosAsignatura3Sem1)
                            .addComponent(jLabelNoGruposAsignatura3Sem1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAsignarutra3Sem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldAsignatura3Sem1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerNoGruposAsignatura3Sem1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerNoAlumnosAsignatura3Sem1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanelAsignarutra3Sem1Layout.setVerticalGroup(
            jPanelAsignarutra3Sem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra3Sem1Layout.createSequentialGroup()
                .addGroup(jPanelAsignarutra3Sem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAsignatura3Sem1)
                    .addComponent(jTextFieldAsignatura3Sem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra3Sem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoGruposAsignatura3Sem1)
                    .addComponent(jSpinnerNoGruposAsignatura3Sem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra3Sem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAlumnosAsignatura3Sem1)
                    .addComponent(jSpinnerNoAlumnosAsignatura3Sem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );

        javax.swing.GroupLayout jPanelSemestre1Layout = new javax.swing.GroupLayout(jPanelSemestre1);
        jPanelSemestre1.setLayout(jPanelSemestre1Layout);
        jPanelSemestre1Layout.setHorizontalGroup(
            jPanelSemestre1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSemestre1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSemestre1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelAsignarutra3Sem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAsignarutra1Sem1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAsignarutra2Sem1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSemestre1Layout.setVerticalGroup(
            jPanelSemestre1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSemestre1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAsignarutra1Sem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAsignarutra2Sem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAsignarutra3Sem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Semestre 1", jPanelSemestre1);

        jPanelAsignarutra1Sem2.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignatura 1"));

        jLabelNoAsignatura1Sem2.setText("Asignatura:");

        jLabelNoGruposAsignatura1Sem2.setText("No. Grupos Atendidos:");

        jLabelNoAlumnosAsignatura1Sem2.setText("No. Alumnos por Grupo:");

        javax.swing.GroupLayout jPanelAsignarutra1Sem2Layout = new javax.swing.GroupLayout(jPanelAsignarutra1Sem2);
        jPanelAsignarutra1Sem2.setLayout(jPanelAsignarutra1Sem2Layout);
        jPanelAsignarutra1Sem2Layout.setHorizontalGroup(
            jPanelAsignarutra1Sem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra1Sem2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAsignarutra1Sem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNoAsignatura1Sem2)
                    .addComponent(jLabelNoAlumnosAsignatura1Sem2)
                    .addComponent(jLabelNoGruposAsignatura1Sem2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra1Sem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAsignatura1Sem2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoGruposAsignatura1Sem2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoAlumnosAsignatura1Sem2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanelAsignarutra1Sem2Layout.setVerticalGroup(
            jPanelAsignarutra1Sem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra1Sem2Layout.createSequentialGroup()
                .addGroup(jPanelAsignarutra1Sem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAsignatura1Sem2)
                    .addComponent(jTextFieldAsignatura1Sem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra1Sem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoGruposAsignatura1Sem2)
                    .addComponent(jSpinnerNoGruposAsignatura1Sem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra1Sem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAlumnosAsignatura1Sem2)
                    .addComponent(jSpinnerNoAlumnosAsignatura1Sem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelAsignarutra2Sem2.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignatura 2"));

        jLabelNoAsignatura2Sem2.setText("Asignatura:");

        jLabelNoGruposAsignatura2Sem2.setText("No. Grupos Atendidos:");

        jLabelNoAlumnosAsignatura2Sem2.setText("No. Alumnos por Grupo:");

        javax.swing.GroupLayout jPanelAsignarutra2Sem2Layout = new javax.swing.GroupLayout(jPanelAsignarutra2Sem2);
        jPanelAsignarutra2Sem2.setLayout(jPanelAsignarutra2Sem2Layout);
        jPanelAsignarutra2Sem2Layout.setHorizontalGroup(
            jPanelAsignarutra2Sem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra2Sem2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAsignarutra2Sem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNoAsignatura2Sem2)
                    .addComponent(jLabelNoAlumnosAsignatura2Sem2)
                    .addComponent(jLabelNoGruposAsignatura2Sem2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra2Sem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAsignatura2Sem2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoGruposAsignatura2Sem2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoAlumnosAsignatura2Sem2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAsignarutra2Sem2Layout.setVerticalGroup(
            jPanelAsignarutra2Sem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra2Sem2Layout.createSequentialGroup()
                .addGroup(jPanelAsignarutra2Sem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAsignatura2Sem2)
                    .addComponent(jTextFieldAsignatura2Sem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra2Sem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoGruposAsignatura2Sem2)
                    .addComponent(jSpinnerNoGruposAsignatura2Sem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra2Sem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAlumnosAsignatura2Sem2)
                    .addComponent(jSpinnerNoAlumnosAsignatura2Sem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelAsignarutra3Sem2.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignatura 3"));

        jLabelNoAsignatura3Sem2.setText("Asignatura:");

        jLabelNoGruposAsignatura3Sem2.setText("No. Grupos Atendidos:");

        jLabelNoAlumnosAsignatura3Sem2.setText("No. Alumnos por Grupo:");

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAsignarutra3Sem2Layout = new javax.swing.GroupLayout(jPanelAsignarutra3Sem2);
        jPanelAsignarutra3Sem2.setLayout(jPanelAsignarutra3Sem2Layout);
        jPanelAsignarutra3Sem2Layout.setHorizontalGroup(
            jPanelAsignarutra3Sem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra3Sem2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAsignarutra3Sem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addGroup(jPanelAsignarutra3Sem2Layout.createSequentialGroup()
                        .addGroup(jPanelAsignarutra3Sem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNoAsignatura3Sem2)
                            .addComponent(jLabelNoAlumnosAsignatura3Sem2)
                            .addComponent(jLabelNoGruposAsignatura3Sem2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAsignarutra3Sem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldAsignatura3Sem2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerNoGruposAsignatura3Sem2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerNoAlumnosAsignatura3Sem2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanelAsignarutra3Sem2Layout.setVerticalGroup(
            jPanelAsignarutra3Sem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra3Sem2Layout.createSequentialGroup()
                .addGroup(jPanelAsignarutra3Sem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAsignatura3Sem2)
                    .addComponent(jTextFieldAsignatura3Sem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra3Sem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoGruposAsignatura3Sem2)
                    .addComponent(jSpinnerNoGruposAsignatura3Sem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra3Sem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAlumnosAsignatura3Sem2)
                    .addComponent(jSpinnerNoAlumnosAsignatura3Sem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3))
        );

        jButton2.setText("Guardar");

        javax.swing.GroupLayout jPanelSemestre2Layout = new javax.swing.GroupLayout(jPanelSemestre2);
        jPanelSemestre2.setLayout(jPanelSemestre2Layout);
        jPanelSemestre2Layout.setHorizontalGroup(
            jPanelSemestre2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSemestre2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSemestre2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelAsignarutra3Sem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAsignarutra1Sem2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAsignarutra2Sem2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelSemestre2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelSemestre2Layout.createSequentialGroup()
                    .addGap(186, 186, 186)
                    .addComponent(jButton2)
                    .addContainerGap(187, Short.MAX_VALUE)))
        );
        jPanelSemestre2Layout.setVerticalGroup(
            jPanelSemestre2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSemestre2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAsignarutra1Sem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAsignarutra2Sem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAsignarutra3Sem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelSemestre2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelSemestre2Layout.createSequentialGroup()
                    .addGap(159, 159, 159)
                    .addComponent(jButton2)
                    .addContainerGap(166, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Semestre2", jPanelSemestre2);

        jPanelAsignarutra1Sem3.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignatura 1"));

        jLabelNoAsignatura1Sem3.setText("Asignatura:");

        jLabelNoGruposAsignatura1Sem3.setText("No. Grupos Atendidos:");

        jLabelNoAlumnosAsignatura1Sem3.setText("No. Alumnos por Grupo:");

        javax.swing.GroupLayout jPanelAsignarutra1Sem3Layout = new javax.swing.GroupLayout(jPanelAsignarutra1Sem3);
        jPanelAsignarutra1Sem3.setLayout(jPanelAsignarutra1Sem3Layout);
        jPanelAsignarutra1Sem3Layout.setHorizontalGroup(
            jPanelAsignarutra1Sem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra1Sem3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAsignarutra1Sem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNoAsignatura1Sem3)
                    .addComponent(jLabelNoAlumnosAsignatura1Sem3)
                    .addComponent(jLabelNoGruposAsignatura1Sem3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra1Sem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAsignatura1Sem3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoGruposAsignatura1Sem3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoAlumnosAsignatura1Sem3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanelAsignarutra1Sem3Layout.setVerticalGroup(
            jPanelAsignarutra1Sem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra1Sem3Layout.createSequentialGroup()
                .addGroup(jPanelAsignarutra1Sem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAsignatura1Sem3)
                    .addComponent(jTextFieldAsignatura1Sem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra1Sem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoGruposAsignatura1Sem3)
                    .addComponent(jSpinnerNoGruposAsignatura1Sem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra1Sem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAlumnosAsignatura1Sem3)
                    .addComponent(jSpinnerNoAlumnosAsignatura1Sem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelAsignarutra2Sem3.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignatura 2"));

        jLabelNoAsignatura2Sem3.setText("Asignatura:");

        jLabelNoGruposAsignatura2Sem3.setText("No. Grupos Atendidos:");

        jLabelNoAlumnosAsignatura2Sem3.setText("No. Alumnos por Grupo:");

        javax.swing.GroupLayout jPanelAsignarutra2Sem3Layout = new javax.swing.GroupLayout(jPanelAsignarutra2Sem3);
        jPanelAsignarutra2Sem3.setLayout(jPanelAsignarutra2Sem3Layout);
        jPanelAsignarutra2Sem3Layout.setHorizontalGroup(
            jPanelAsignarutra2Sem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra2Sem3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAsignarutra2Sem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNoAsignatura2Sem3)
                    .addComponent(jLabelNoAlumnosAsignatura2Sem3)
                    .addComponent(jLabelNoGruposAsignatura2Sem3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra2Sem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAsignatura2Sem3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoGruposAsignatura2Sem3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoAlumnosAsignatura2Sem3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAsignarutra2Sem3Layout.setVerticalGroup(
            jPanelAsignarutra2Sem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra2Sem3Layout.createSequentialGroup()
                .addGroup(jPanelAsignarutra2Sem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAsignatura2Sem3)
                    .addComponent(jTextFieldAsignatura2Sem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra2Sem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoGruposAsignatura2Sem3)
                    .addComponent(jSpinnerNoGruposAsignatura2Sem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra2Sem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAlumnosAsignatura2Sem3)
                    .addComponent(jSpinnerNoAlumnosAsignatura2Sem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelAsignarutra3Sem3.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignatura 3"));

        jLabelNoAsignatura3Sem3.setText("Asignatura:");

        jLabelNoGruposAsignatura3Sem3.setText("No. Grupos Atendidos:");

        jLabelNoAlumnosAsignatura3Sem3.setText("No. Alumnos por Grupo:");

        jButton5.setText("Guardar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAsignarutra3Sem3Layout = new javax.swing.GroupLayout(jPanelAsignarutra3Sem3);
        jPanelAsignarutra3Sem3.setLayout(jPanelAsignarutra3Sem3Layout);
        jPanelAsignarutra3Sem3Layout.setHorizontalGroup(
            jPanelAsignarutra3Sem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra3Sem3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAsignarutra3Sem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNoAsignatura3Sem3)
                    .addComponent(jLabelNoAlumnosAsignatura3Sem3)
                    .addComponent(jLabelNoGruposAsignatura3Sem3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra3Sem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerNoGruposAsignatura3Sem3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelAsignarutra3Sem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton5)
                        .addGroup(jPanelAsignarutra3Sem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSpinnerNoAlumnosAsignatura3Sem3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAsignatura3Sem3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanelAsignarutra3Sem3Layout.setVerticalGroup(
            jPanelAsignarutra3Sem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra3Sem3Layout.createSequentialGroup()
                .addGroup(jPanelAsignarutra3Sem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAsignatura3Sem3)
                    .addComponent(jTextFieldAsignatura3Sem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra3Sem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoGruposAsignatura3Sem3)
                    .addComponent(jSpinnerNoGruposAsignatura3Sem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra3Sem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAlumnosAsignatura3Sem3)
                    .addComponent(jSpinnerNoAlumnosAsignatura3Sem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelSemestre3Layout = new javax.swing.GroupLayout(jPanelSemestre3);
        jPanelSemestre3.setLayout(jPanelSemestre3Layout);
        jPanelSemestre3Layout.setHorizontalGroup(
            jPanelSemestre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSemestre3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSemestre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelAsignarutra3Sem3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAsignarutra1Sem3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAsignarutra2Sem3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSemestre3Layout.setVerticalGroup(
            jPanelSemestre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSemestre3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAsignarutra1Sem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAsignarutra2Sem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAsignarutra3Sem3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Semestre 3", jPanelSemestre3);

        jPanelAsignarutra1Sem4.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignatura 1"));

        jLabelNoAsignatura1Sem4.setText("Asignatura:");

        jLabelNoGruposAsignatura1Sem4.setText("No. Grupos Atendidos:");

        jLabelNoAlumnosAsignatura1Sem4.setText("No. Alumnos por Grupo:");

        javax.swing.GroupLayout jPanelAsignarutra1Sem4Layout = new javax.swing.GroupLayout(jPanelAsignarutra1Sem4);
        jPanelAsignarutra1Sem4.setLayout(jPanelAsignarutra1Sem4Layout);
        jPanelAsignarutra1Sem4Layout.setHorizontalGroup(
            jPanelAsignarutra1Sem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra1Sem4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAsignarutra1Sem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNoAsignatura1Sem4)
                    .addComponent(jLabelNoAlumnosAsignatura1Sem4)
                    .addComponent(jLabelNoGruposAsignatura1Sem4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra1Sem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAsignatura1Sem4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoGruposAsignatura1Sem4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoAlumnosAsignatura1Sem4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanelAsignarutra1Sem4Layout.setVerticalGroup(
            jPanelAsignarutra1Sem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra1Sem4Layout.createSequentialGroup()
                .addGroup(jPanelAsignarutra1Sem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAsignatura1Sem4)
                    .addComponent(jTextFieldAsignatura1Sem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra1Sem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoGruposAsignatura1Sem4)
                    .addComponent(jSpinnerNoGruposAsignatura1Sem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra1Sem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAlumnosAsignatura1Sem4)
                    .addComponent(jSpinnerNoAlumnosAsignatura1Sem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelAsignarutra2Sem4.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignatura 2"));

        jLabelNoAsignatura2Sem4.setText("Asignatura:");

        jLabelNoGruposAsignatura2Sem4.setText("No. Grupos Atendidos:");

        jLabelNoAlumnosAsignatura2Sem4.setText("No. Alumnos por Grupo:");

        javax.swing.GroupLayout jPanelAsignarutra2Sem4Layout = new javax.swing.GroupLayout(jPanelAsignarutra2Sem4);
        jPanelAsignarutra2Sem4.setLayout(jPanelAsignarutra2Sem4Layout);
        jPanelAsignarutra2Sem4Layout.setHorizontalGroup(
            jPanelAsignarutra2Sem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra2Sem4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAsignarutra2Sem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNoAsignatura2Sem4)
                    .addComponent(jLabelNoAlumnosAsignatura2Sem4)
                    .addComponent(jLabelNoGruposAsignatura2Sem4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra2Sem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAsignatura2Sem4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoGruposAsignatura2Sem4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoAlumnosAsignatura2Sem4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAsignarutra2Sem4Layout.setVerticalGroup(
            jPanelAsignarutra2Sem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra2Sem4Layout.createSequentialGroup()
                .addGroup(jPanelAsignarutra2Sem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAsignatura2Sem4)
                    .addComponent(jTextFieldAsignatura2Sem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra2Sem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoGruposAsignatura2Sem4)
                    .addComponent(jSpinnerNoGruposAsignatura2Sem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra2Sem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAlumnosAsignatura2Sem4)
                    .addComponent(jSpinnerNoAlumnosAsignatura2Sem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelAsignarutra3Sem4.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignatura 3"));

        jLabelNoAsignatura3Sem4.setText("Asignatura:");

        jLabelNoGruposAsignatura3Sem4.setText("No. Grupos Atendidos:");

        jLabelNoAlumnosAsignatura3Sem4.setText("No. Alumnos por Grupo:");

        jButton6.setText("Guardar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAsignarutra3Sem4Layout = new javax.swing.GroupLayout(jPanelAsignarutra3Sem4);
        jPanelAsignarutra3Sem4.setLayout(jPanelAsignarutra3Sem4Layout);
        jPanelAsignarutra3Sem4Layout.setHorizontalGroup(
            jPanelAsignarutra3Sem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra3Sem4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAsignarutra3Sem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6)
                    .addGroup(jPanelAsignarutra3Sem4Layout.createSequentialGroup()
                        .addGroup(jPanelAsignarutra3Sem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNoAsignatura3Sem4)
                            .addComponent(jLabelNoAlumnosAsignatura3Sem4)
                            .addComponent(jLabelNoGruposAsignatura3Sem4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAsignarutra3Sem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinnerNoGruposAsignatura3Sem4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerNoAlumnosAsignatura3Sem4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAsignatura3Sem4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAsignarutra3Sem4Layout.setVerticalGroup(
            jPanelAsignarutra3Sem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra3Sem4Layout.createSequentialGroup()
                .addGroup(jPanelAsignarutra3Sem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAsignatura3Sem4)
                    .addComponent(jTextFieldAsignatura3Sem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra3Sem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoGruposAsignatura3Sem4)
                    .addComponent(jSpinnerNoGruposAsignatura3Sem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra3Sem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAlumnosAsignatura3Sem4)
                    .addComponent(jSpinnerNoAlumnosAsignatura3Sem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelSemestre4Layout = new javax.swing.GroupLayout(jPanelSemestre4);
        jPanelSemestre4.setLayout(jPanelSemestre4Layout);
        jPanelSemestre4Layout.setHorizontalGroup(
            jPanelSemestre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSemestre4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSemestre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelAsignarutra3Sem4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAsignarutra1Sem4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAsignarutra2Sem4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSemestre4Layout.setVerticalGroup(
            jPanelSemestre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSemestre4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAsignarutra1Sem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAsignarutra2Sem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAsignarutra3Sem4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Semestre 4", jPanelSemestre4);

        jPanelAsignarutra1Sem5.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignatura 1"));

        jLabelNoAsignatura1Sem5.setText("Asignatura:");

        jLabelNoGruposAsignatura1Sem5.setText("No. Grupos Atendidos:");

        jLabelNoAlumnosAsignatura1Sem5.setText("No. Alumnos por Grupo:");

        javax.swing.GroupLayout jPanelAsignarutra1Sem5Layout = new javax.swing.GroupLayout(jPanelAsignarutra1Sem5);
        jPanelAsignarutra1Sem5.setLayout(jPanelAsignarutra1Sem5Layout);
        jPanelAsignarutra1Sem5Layout.setHorizontalGroup(
            jPanelAsignarutra1Sem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra1Sem5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAsignarutra1Sem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNoAsignatura1Sem5)
                    .addComponent(jLabelNoAlumnosAsignatura1Sem5)
                    .addComponent(jLabelNoGruposAsignatura1Sem5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra1Sem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAsignatura1Sem5, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoGruposAsignatura1Sem5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoAlumnosAsignatura1Sem5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanelAsignarutra1Sem5Layout.setVerticalGroup(
            jPanelAsignarutra1Sem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra1Sem5Layout.createSequentialGroup()
                .addGroup(jPanelAsignarutra1Sem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAsignatura1Sem5)
                    .addComponent(jTextFieldAsignatura1Sem5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra1Sem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoGruposAsignatura1Sem5)
                    .addComponent(jSpinnerNoGruposAsignatura1Sem5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra1Sem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAlumnosAsignatura1Sem5)
                    .addComponent(jSpinnerNoAlumnosAsignatura1Sem5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelAsignarutra2Sem5.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignatura 2"));

        jLabelNoAsignatura2Sem5.setText("Asignatura:");

        jLabelNoGruposAsignatura2Sem5.setText("No. Grupos Atendidos:");

        jLabelNoAlumnosAsignatura2Sem5.setText("No. Alumnos por Grupo:");

        javax.swing.GroupLayout jPanelAsignarutra2Sem5Layout = new javax.swing.GroupLayout(jPanelAsignarutra2Sem5);
        jPanelAsignarutra2Sem5.setLayout(jPanelAsignarutra2Sem5Layout);
        jPanelAsignarutra2Sem5Layout.setHorizontalGroup(
            jPanelAsignarutra2Sem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra2Sem5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAsignarutra2Sem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNoAsignatura2Sem5)
                    .addComponent(jLabelNoAlumnosAsignatura2Sem5)
                    .addComponent(jLabelNoGruposAsignatura2Sem5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra2Sem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAsignatura2Sem5, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoGruposAsignatura2Sem5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoAlumnosAsignatura2Sem5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAsignarutra2Sem5Layout.setVerticalGroup(
            jPanelAsignarutra2Sem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra2Sem5Layout.createSequentialGroup()
                .addGroup(jPanelAsignarutra2Sem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAsignatura2Sem5)
                    .addComponent(jTextFieldAsignatura2Sem5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra2Sem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoGruposAsignatura2Sem5)
                    .addComponent(jSpinnerNoGruposAsignatura2Sem5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra2Sem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAlumnosAsignatura2Sem5)
                    .addComponent(jSpinnerNoAlumnosAsignatura2Sem5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelAsignarutra3Sem5.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignatura 3"));

        jLabelNoAsignatura3Sem5.setText("Asignatura:");

        jLabelNoGruposAsignatura3Sem5.setText("No. Grupos Atendidos:");

        jLabelNoAlumnosAsignatura3Sem5.setText("No. Alumnos por Grupo:");

        jButton7.setText("Guardar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAsignarutra3Sem5Layout = new javax.swing.GroupLayout(jPanelAsignarutra3Sem5);
        jPanelAsignarutra3Sem5.setLayout(jPanelAsignarutra3Sem5Layout);
        jPanelAsignarutra3Sem5Layout.setHorizontalGroup(
            jPanelAsignarutra3Sem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra3Sem5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAsignarutra3Sem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7)
                    .addGroup(jPanelAsignarutra3Sem5Layout.createSequentialGroup()
                        .addGroup(jPanelAsignarutra3Sem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNoAsignatura3Sem5)
                            .addComponent(jLabelNoAlumnosAsignatura3Sem5)
                            .addComponent(jLabelNoGruposAsignatura3Sem5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAsignarutra3Sem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinnerNoGruposAsignatura3Sem5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerNoAlumnosAsignatura3Sem5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAsignatura3Sem5, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanelAsignarutra3Sem5Layout.setVerticalGroup(
            jPanelAsignarutra3Sem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra3Sem5Layout.createSequentialGroup()
                .addGroup(jPanelAsignarutra3Sem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAsignatura3Sem5)
                    .addComponent(jTextFieldAsignatura3Sem5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra3Sem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoGruposAsignatura3Sem5)
                    .addComponent(jSpinnerNoGruposAsignatura3Sem5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra3Sem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAlumnosAsignatura3Sem5)
                    .addComponent(jSpinnerNoAlumnosAsignatura3Sem5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelSemestre5Layout = new javax.swing.GroupLayout(jPanelSemestre5);
        jPanelSemestre5.setLayout(jPanelSemestre5Layout);
        jPanelSemestre5Layout.setHorizontalGroup(
            jPanelSemestre5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSemestre5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSemestre5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelAsignarutra3Sem5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAsignarutra1Sem5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAsignarutra2Sem5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSemestre5Layout.setVerticalGroup(
            jPanelSemestre5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSemestre5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAsignarutra1Sem5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAsignarutra2Sem5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAsignarutra3Sem5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Semestre 5", jPanelSemestre5);

        jPanelAsignarutra1Sem6.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignatura 1"));

        jLabelNoAsignatura1Sem6.setText("Asignatura:");

        jLabelNoGruposAsignatura1Sem6.setText("No. Grupos Atendidos:");

        jLabelNoAlumnosAsignatura1Sem6.setText("No. Alumnos por Grupo:");

        javax.swing.GroupLayout jPanelAsignarutra1Sem6Layout = new javax.swing.GroupLayout(jPanelAsignarutra1Sem6);
        jPanelAsignarutra1Sem6.setLayout(jPanelAsignarutra1Sem6Layout);
        jPanelAsignarutra1Sem6Layout.setHorizontalGroup(
            jPanelAsignarutra1Sem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra1Sem6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAsignarutra1Sem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNoAsignatura1Sem6)
                    .addComponent(jLabelNoAlumnosAsignatura1Sem6)
                    .addComponent(jLabelNoGruposAsignatura1Sem6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra1Sem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAsignatura1Sem6, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoGruposAsignatura1Sem6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoAlumnosAsignatura1Sem6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanelAsignarutra1Sem6Layout.setVerticalGroup(
            jPanelAsignarutra1Sem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra1Sem6Layout.createSequentialGroup()
                .addGroup(jPanelAsignarutra1Sem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAsignatura1Sem6)
                    .addComponent(jTextFieldAsignatura1Sem6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra1Sem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoGruposAsignatura1Sem6)
                    .addComponent(jSpinnerNoGruposAsignatura1Sem6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra1Sem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAlumnosAsignatura1Sem6)
                    .addComponent(jSpinnerNoAlumnosAsignatura1Sem6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelAsignarutra2Sem6.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignatura 2"));

        jLabelNoAsignatura2Sem6.setText("Asignatura:");

        jLabelNoGruposAsignatura2Sem6.setText("No. Grupos Atendidos:");

        jLabelNoAlumnosAsignatura2Sem6.setText("No. Alumnos por Grupo:");

        javax.swing.GroupLayout jPanelAsignarutra2Sem6Layout = new javax.swing.GroupLayout(jPanelAsignarutra2Sem6);
        jPanelAsignarutra2Sem6.setLayout(jPanelAsignarutra2Sem6Layout);
        jPanelAsignarutra2Sem6Layout.setHorizontalGroup(
            jPanelAsignarutra2Sem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra2Sem6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAsignarutra2Sem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNoAsignatura2Sem6)
                    .addComponent(jLabelNoAlumnosAsignatura2Sem6)
                    .addComponent(jLabelNoGruposAsignatura2Sem6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra2Sem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAsignatura2Sem6, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoGruposAsignatura2Sem6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoAlumnosAsignatura2Sem6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAsignarutra2Sem6Layout.setVerticalGroup(
            jPanelAsignarutra2Sem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra2Sem6Layout.createSequentialGroup()
                .addGroup(jPanelAsignarutra2Sem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAsignatura2Sem6)
                    .addComponent(jTextFieldAsignatura2Sem6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra2Sem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoGruposAsignatura2Sem6)
                    .addComponent(jSpinnerNoGruposAsignatura2Sem6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra2Sem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAlumnosAsignatura2Sem6)
                    .addComponent(jSpinnerNoAlumnosAsignatura2Sem6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelAsignarutra3Sem6.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignatura 3"));

        jLabelNoAsignatura3Sem6.setText("Asignatura:");

        jLabelNoGruposAsignatura3Sem6.setText("No. Grupos Atendidos:");

        jLabelNoAlumnosAsignatura3Sem6.setText("No. Alumnos por Grupo:");

        jButton8.setText("Guardar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAsignarutra3Sem6Layout = new javax.swing.GroupLayout(jPanelAsignarutra3Sem6);
        jPanelAsignarutra3Sem6.setLayout(jPanelAsignarutra3Sem6Layout);
        jPanelAsignarutra3Sem6Layout.setHorizontalGroup(
            jPanelAsignarutra3Sem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra3Sem6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAsignarutra3Sem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNoAsignatura3Sem6)
                    .addComponent(jLabelNoAlumnosAsignatura3Sem6)
                    .addComponent(jLabelNoGruposAsignatura3Sem6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra3Sem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerNoGruposAsignatura3Sem6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelAsignarutra3Sem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelAsignarutra3Sem6Layout.createSequentialGroup()
                            .addComponent(jSpinnerNoAlumnosAsignatura3Sem6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8))
                        .addComponent(jTextFieldAsignatura3Sem6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanelAsignarutra3Sem6Layout.setVerticalGroup(
            jPanelAsignarutra3Sem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarutra3Sem6Layout.createSequentialGroup()
                .addGroup(jPanelAsignarutra3Sem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAsignatura3Sem6)
                    .addComponent(jTextFieldAsignatura3Sem6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra3Sem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoGruposAsignatura3Sem6)
                    .addComponent(jSpinnerNoGruposAsignatura3Sem6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsignarutra3Sem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoAlumnosAsignatura3Sem6)
                    .addComponent(jSpinnerNoAlumnosAsignatura3Sem6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelSemestre6Layout = new javax.swing.GroupLayout(jPanelSemestre6);
        jPanelSemestre6.setLayout(jPanelSemestre6Layout);
        jPanelSemestre6Layout.setHorizontalGroup(
            jPanelSemestre6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSemestre6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSemestre6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelAsignarutra3Sem6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAsignarutra1Sem6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAsignarutra2Sem6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSemestre6Layout.setVerticalGroup(
            jPanelSemestre6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSemestre6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAsignarutra1Sem6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAsignarutra2Sem6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAsignarutra3Sem6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Semestre6", jPanelSemestre6);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoSEP.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabelLogo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String asignatura1Sem1 = jTextFieldAsignatura1Sem1.getText();
        String noGruposAtendidos1Sem1 = String.valueOf(jSpinnerNoGruposAsignatura1Sem1.getValue());
        String noAlumnosGrupo1Sem1 = String.valueOf(jSpinnerNoAlumnosAsignatura1Sem1.getValue());

        String asignatura2Sem1 = jTextFieldAsignatura2Sem1.getText();
        String noGruposAtendidos2Sem1 = String.valueOf(jSpinnerNoGruposAsignatura2Sem1.getValue());
        String noAlumnosGrupo2Sem1 = String.valueOf(jSpinnerNoAlumnosAsignatura2Sem1.getValue());

        String asignatura3Sem1 = jTextFieldAsignatura3Sem1.getText();
        String noGruposAtendidos3Sem1 = String.valueOf(jSpinnerNoGruposAsignatura3Sem1.getValue());
        String noAlumnosGrupo3Sem1 = String.valueOf(jSpinnerNoAlumnosAsignatura3Sem1.getValue());

        String[] datos = {asignatura1Sem1, noGruposAtendidos1Sem1, noAlumnosGrupo1Sem1, asignatura2Sem1, noGruposAtendidos2Sem1, noAlumnosGrupo2Sem1, asignatura3Sem1, noGruposAtendidos3Sem1, noAlumnosGrupo3Sem1, curp};

        BD bd = new BD();
        String consulta = bd.actualizarDatosAsignaturasSem1(datos);
        if (consulta.equals("Ok")) {
            JOptionPane.showMessageDialog(this, "Datos guardados correctamente", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos", "Advertencia", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String asignatura1Sem2 = jTextFieldAsignatura1Sem2.getText();
        String noGruposAtendidos1Sem2 = String.valueOf(jSpinnerNoGruposAsignatura1Sem2.getValue());
        String noAlumnosGrupo1Sem2 = String.valueOf(jSpinnerNoAlumnosAsignatura1Sem2.getValue());

        String asignatura2Sem2 = jTextFieldAsignatura2Sem2.getText();
        String noGruposAtendidos2Sem2 = String.valueOf(jSpinnerNoGruposAsignatura2Sem2.getValue());
        String noAlumnosGrupo2Sem2 = String.valueOf(jSpinnerNoAlumnosAsignatura2Sem2.getValue());

        String asignatura3Sem2 = jTextFieldAsignatura3Sem2.getText();
        String noGruposAtendidos3Sem2 = String.valueOf(jSpinnerNoGruposAsignatura3Sem2.getValue());
        String noAlumnosGrupo3Sem2 = String.valueOf(jSpinnerNoAlumnosAsignatura3Sem2.getValue());

        String[] datos = {asignatura1Sem2, noGruposAtendidos1Sem2, noAlumnosGrupo1Sem2, asignatura2Sem2, noGruposAtendidos2Sem2, noAlumnosGrupo2Sem2, asignatura3Sem2, noGruposAtendidos3Sem2, noAlumnosGrupo3Sem2, curp};

        BD bd = new BD();
        String consulta = bd.actualizarDatosAsignaturasSem2(datos);
        if (consulta.equals("Ok")) {
            JOptionPane.showMessageDialog(this, "Datos guardados correctamente", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos", "Advertencia", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String asignatura1Sem3 = jTextFieldAsignatura1Sem3.getText();
        String noGruposAtendidos1Sem3 = String.valueOf(jSpinnerNoGruposAsignatura1Sem3.getValue());
        String noAlumnosGrupo1Sem3 = String.valueOf(jSpinnerNoAlumnosAsignatura1Sem3.getValue());

        String asignatura2Sem3 = jTextFieldAsignatura2Sem3.getText();
        String noGruposAtendidos2Sem3 = String.valueOf(jSpinnerNoGruposAsignatura2Sem3.getValue());
        String noAlumnosGrupo2Sem3 = String.valueOf(jSpinnerNoAlumnosAsignatura2Sem3.getValue());

        String asignatura3Sem3 = jTextFieldAsignatura3Sem3.getText();
        String noGruposAtendidos3Sem3 = String.valueOf(jSpinnerNoGruposAsignatura3Sem3.getValue());
        String noAlumnosGrupo3Sem3 = String.valueOf(jSpinnerNoAlumnosAsignatura3Sem3.getValue());

        String[] datos = {asignatura1Sem3, noGruposAtendidos1Sem3, noAlumnosGrupo1Sem3, asignatura2Sem3, noGruposAtendidos2Sem3, noAlumnosGrupo2Sem3, asignatura3Sem3, noGruposAtendidos3Sem3, noAlumnosGrupo3Sem3, curp};

        BD bd = new BD();
        String consulta = bd.actualizarDatosAsignaturasSem3(datos);
        if (consulta.equals("Ok")) {
            JOptionPane.showMessageDialog(this, "Datos guardados correctamente", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos", "Advertencia", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String asignatura1Sem4 = jTextFieldAsignatura1Sem4.getText();
        String noGruposAtendidos1Sem4 = String.valueOf(jSpinnerNoGruposAsignatura1Sem4.getValue());
        String noAlumnosGrupo1Sem4 = String.valueOf(jSpinnerNoAlumnosAsignatura1Sem4.getValue());

        String asignatura2Sem4 = jTextFieldAsignatura2Sem4.getText();
        String noGruposAtendidos2Sem4 = String.valueOf(jSpinnerNoGruposAsignatura2Sem4.getValue());
        String noAlumnosGrupo2Sem4 = String.valueOf(jSpinnerNoAlumnosAsignatura2Sem4.getValue());

        String asignatura3Sem4 = jTextFieldAsignatura3Sem4.getText();
        String noGruposAtendidos3Sem4 = String.valueOf(jSpinnerNoGruposAsignatura3Sem4.getValue());
        String noAlumnosGrupo3Sem4 = String.valueOf(jSpinnerNoAlumnosAsignatura3Sem4.getValue());

        String[] datos = {asignatura1Sem4, noGruposAtendidos1Sem4, noAlumnosGrupo1Sem4, asignatura2Sem4, noGruposAtendidos2Sem4, noAlumnosGrupo2Sem4, asignatura3Sem4, noGruposAtendidos3Sem4, noAlumnosGrupo3Sem4, curp};

        BD bd = new BD();
        String consulta = bd.actualizarDatosAsignaturasSem4(datos);
        if (consulta.equals("Ok")) {
            JOptionPane.showMessageDialog(this, "Datos guardados correctamente", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos", "Advertencia", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String asignatura1Sem5 = jTextFieldAsignatura1Sem5.getText();
        String noGruposAtendidos1Sem5 = String.valueOf(jSpinnerNoGruposAsignatura1Sem5.getValue());
        String noAlumnosGrupo1Sem5 = String.valueOf(jSpinnerNoAlumnosAsignatura1Sem5.getValue());

        String asignatura2Sem5 = jTextFieldAsignatura2Sem5.getText();
        String noGruposAtendidos2Sem5 = String.valueOf(jSpinnerNoGruposAsignatura2Sem5.getValue());
        String noAlumnosGrupo2Sem5 = String.valueOf(jSpinnerNoAlumnosAsignatura2Sem5.getValue());

        String asignatura3Sem5 = jTextFieldAsignatura3Sem5.getText();
        String noGruposAtendidos3Sem5 = String.valueOf(jSpinnerNoGruposAsignatura3Sem5.getValue());
        String noAlumnosGrupo3Sem5 = String.valueOf(jSpinnerNoAlumnosAsignatura3Sem5.getValue());

        String[] datos = {asignatura1Sem5, noGruposAtendidos1Sem5, noAlumnosGrupo1Sem5, asignatura2Sem5, noGruposAtendidos2Sem5, noAlumnosGrupo2Sem5, asignatura3Sem5, noGruposAtendidos3Sem5, noAlumnosGrupo3Sem5, curp};

        BD bd = new BD();
        String consulta = bd.actualizarDatosAsignaturasSem5(datos);
        if (consulta.equals("Ok")) {
            JOptionPane.showMessageDialog(this, "Datos guardados correctamente", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos", "Advertencia", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String asignatura1Sem6 = jTextFieldAsignatura1Sem6.getText();
        String noGruposAtendidos1Sem6 = String.valueOf(jSpinnerNoGruposAsignatura1Sem6.getValue());
        String noAlumnosGrupo1Sem6= String.valueOf(jSpinnerNoAlumnosAsignatura1Sem6.getValue());

        String asignatura2Sem6 = jTextFieldAsignatura2Sem6.getText();
        String noGruposAtendidos2Sem6 = String.valueOf(jSpinnerNoGruposAsignatura2Sem6.getValue());
        String noAlumnosGrupo2Sem6= String.valueOf(jSpinnerNoAlumnosAsignatura2Sem6.getValue());

        String asignatura3Sem6 = jTextFieldAsignatura3Sem6.getText();
        String noGruposAtendidos3Sem6 = String.valueOf(jSpinnerNoGruposAsignatura3Sem6.getValue());
        String noAlumnosGrupo3Sem6 = String.valueOf(jSpinnerNoAlumnosAsignatura3Sem6.getValue());

        String[] datos = {asignatura1Sem6, noGruposAtendidos1Sem6, noAlumnosGrupo1Sem6, asignatura2Sem6, noGruposAtendidos2Sem6, noAlumnosGrupo2Sem6, asignatura3Sem6, noGruposAtendidos3Sem6, noAlumnosGrupo3Sem6, curp};

        BD bd = new BD();
        String consulta = bd.actualizarDatosAsignaturasSem6(datos);
        if (consulta.equals("Ok")) {
            JOptionPane.showMessageDialog(this, "Datos guardados correctamente", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos", "Advertencia", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmComplementarAsignatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmComplementarAsignatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmComplementarAsignatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmComplementarAsignatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmComplementarAsignatura("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNoAlumnosAsignatura1Sem1;
    private javax.swing.JLabel jLabelNoAlumnosAsignatura1Sem2;
    private javax.swing.JLabel jLabelNoAlumnosAsignatura1Sem3;
    private javax.swing.JLabel jLabelNoAlumnosAsignatura1Sem4;
    private javax.swing.JLabel jLabelNoAlumnosAsignatura1Sem5;
    private javax.swing.JLabel jLabelNoAlumnosAsignatura1Sem6;
    private javax.swing.JLabel jLabelNoAlumnosAsignatura2Sem1;
    private javax.swing.JLabel jLabelNoAlumnosAsignatura2Sem2;
    private javax.swing.JLabel jLabelNoAlumnosAsignatura2Sem3;
    private javax.swing.JLabel jLabelNoAlumnosAsignatura2Sem4;
    private javax.swing.JLabel jLabelNoAlumnosAsignatura2Sem5;
    private javax.swing.JLabel jLabelNoAlumnosAsignatura2Sem6;
    private javax.swing.JLabel jLabelNoAlumnosAsignatura3Sem1;
    private javax.swing.JLabel jLabelNoAlumnosAsignatura3Sem2;
    private javax.swing.JLabel jLabelNoAlumnosAsignatura3Sem3;
    private javax.swing.JLabel jLabelNoAlumnosAsignatura3Sem4;
    private javax.swing.JLabel jLabelNoAlumnosAsignatura3Sem5;
    private javax.swing.JLabel jLabelNoAlumnosAsignatura3Sem6;
    private javax.swing.JLabel jLabelNoAsignatura1Sem1;
    private javax.swing.JLabel jLabelNoAsignatura1Sem2;
    private javax.swing.JLabel jLabelNoAsignatura1Sem3;
    private javax.swing.JLabel jLabelNoAsignatura1Sem4;
    private javax.swing.JLabel jLabelNoAsignatura1Sem5;
    private javax.swing.JLabel jLabelNoAsignatura1Sem6;
    private javax.swing.JLabel jLabelNoAsignatura2Sem1;
    private javax.swing.JLabel jLabelNoAsignatura2Sem2;
    private javax.swing.JLabel jLabelNoAsignatura2Sem3;
    private javax.swing.JLabel jLabelNoAsignatura2Sem4;
    private javax.swing.JLabel jLabelNoAsignatura2Sem5;
    private javax.swing.JLabel jLabelNoAsignatura2Sem6;
    private javax.swing.JLabel jLabelNoAsignatura3Sem1;
    private javax.swing.JLabel jLabelNoAsignatura3Sem2;
    private javax.swing.JLabel jLabelNoAsignatura3Sem3;
    private javax.swing.JLabel jLabelNoAsignatura3Sem4;
    private javax.swing.JLabel jLabelNoAsignatura3Sem5;
    private javax.swing.JLabel jLabelNoAsignatura3Sem6;
    private javax.swing.JLabel jLabelNoGruposAsignatura1Sem1;
    private javax.swing.JLabel jLabelNoGruposAsignatura1Sem2;
    private javax.swing.JLabel jLabelNoGruposAsignatura1Sem3;
    private javax.swing.JLabel jLabelNoGruposAsignatura1Sem4;
    private javax.swing.JLabel jLabelNoGruposAsignatura1Sem5;
    private javax.swing.JLabel jLabelNoGruposAsignatura1Sem6;
    private javax.swing.JLabel jLabelNoGruposAsignatura2Sem1;
    private javax.swing.JLabel jLabelNoGruposAsignatura2Sem2;
    private javax.swing.JLabel jLabelNoGruposAsignatura2Sem3;
    private javax.swing.JLabel jLabelNoGruposAsignatura2Sem4;
    private javax.swing.JLabel jLabelNoGruposAsignatura2Sem5;
    private javax.swing.JLabel jLabelNoGruposAsignatura2Sem6;
    private javax.swing.JLabel jLabelNoGruposAsignatura3Sem1;
    private javax.swing.JLabel jLabelNoGruposAsignatura3Sem2;
    private javax.swing.JLabel jLabelNoGruposAsignatura3Sem3;
    private javax.swing.JLabel jLabelNoGruposAsignatura3Sem4;
    private javax.swing.JLabel jLabelNoGruposAsignatura3Sem5;
    private javax.swing.JLabel jLabelNoGruposAsignatura3Sem6;
    private javax.swing.JPanel jPanelAsignarutra1Sem1;
    private javax.swing.JPanel jPanelAsignarutra1Sem2;
    private javax.swing.JPanel jPanelAsignarutra1Sem3;
    private javax.swing.JPanel jPanelAsignarutra1Sem4;
    private javax.swing.JPanel jPanelAsignarutra1Sem5;
    private javax.swing.JPanel jPanelAsignarutra1Sem6;
    private javax.swing.JPanel jPanelAsignarutra2Sem1;
    private javax.swing.JPanel jPanelAsignarutra2Sem2;
    private javax.swing.JPanel jPanelAsignarutra2Sem3;
    private javax.swing.JPanel jPanelAsignarutra2Sem4;
    private javax.swing.JPanel jPanelAsignarutra2Sem5;
    private javax.swing.JPanel jPanelAsignarutra2Sem6;
    private javax.swing.JPanel jPanelAsignarutra3Sem1;
    private javax.swing.JPanel jPanelAsignarutra3Sem2;
    private javax.swing.JPanel jPanelAsignarutra3Sem3;
    private javax.swing.JPanel jPanelAsignarutra3Sem4;
    private javax.swing.JPanel jPanelAsignarutra3Sem5;
    private javax.swing.JPanel jPanelAsignarutra3Sem6;
    private javax.swing.JPanel jPanelSemestre1;
    private javax.swing.JPanel jPanelSemestre2;
    private javax.swing.JPanel jPanelSemestre3;
    private javax.swing.JPanel jPanelSemestre4;
    private javax.swing.JPanel jPanelSemestre5;
    private javax.swing.JPanel jPanelSemestre6;
    private javax.swing.JSpinner jSpinnerNoAlumnosAsignatura1Sem1;
    private javax.swing.JSpinner jSpinnerNoAlumnosAsignatura1Sem2;
    private javax.swing.JSpinner jSpinnerNoAlumnosAsignatura1Sem3;
    private javax.swing.JSpinner jSpinnerNoAlumnosAsignatura1Sem4;
    private javax.swing.JSpinner jSpinnerNoAlumnosAsignatura1Sem5;
    private javax.swing.JSpinner jSpinnerNoAlumnosAsignatura1Sem6;
    private javax.swing.JSpinner jSpinnerNoAlumnosAsignatura2Sem1;
    private javax.swing.JSpinner jSpinnerNoAlumnosAsignatura2Sem2;
    private javax.swing.JSpinner jSpinnerNoAlumnosAsignatura2Sem3;
    private javax.swing.JSpinner jSpinnerNoAlumnosAsignatura2Sem4;
    private javax.swing.JSpinner jSpinnerNoAlumnosAsignatura2Sem5;
    private javax.swing.JSpinner jSpinnerNoAlumnosAsignatura2Sem6;
    private javax.swing.JSpinner jSpinnerNoAlumnosAsignatura3Sem1;
    private javax.swing.JSpinner jSpinnerNoAlumnosAsignatura3Sem2;
    private javax.swing.JSpinner jSpinnerNoAlumnosAsignatura3Sem3;
    private javax.swing.JSpinner jSpinnerNoAlumnosAsignatura3Sem4;
    private javax.swing.JSpinner jSpinnerNoAlumnosAsignatura3Sem5;
    private javax.swing.JSpinner jSpinnerNoAlumnosAsignatura3Sem6;
    private javax.swing.JSpinner jSpinnerNoGruposAsignatura1Sem1;
    private javax.swing.JSpinner jSpinnerNoGruposAsignatura1Sem2;
    private javax.swing.JSpinner jSpinnerNoGruposAsignatura1Sem3;
    private javax.swing.JSpinner jSpinnerNoGruposAsignatura1Sem4;
    private javax.swing.JSpinner jSpinnerNoGruposAsignatura1Sem5;
    private javax.swing.JSpinner jSpinnerNoGruposAsignatura1Sem6;
    private javax.swing.JSpinner jSpinnerNoGruposAsignatura2Sem1;
    private javax.swing.JSpinner jSpinnerNoGruposAsignatura2Sem2;
    private javax.swing.JSpinner jSpinnerNoGruposAsignatura2Sem3;
    private javax.swing.JSpinner jSpinnerNoGruposAsignatura2Sem4;
    private javax.swing.JSpinner jSpinnerNoGruposAsignatura2Sem5;
    private javax.swing.JSpinner jSpinnerNoGruposAsignatura2Sem6;
    private javax.swing.JSpinner jSpinnerNoGruposAsignatura3Sem1;
    private javax.swing.JSpinner jSpinnerNoGruposAsignatura3Sem2;
    private javax.swing.JSpinner jSpinnerNoGruposAsignatura3Sem3;
    private javax.swing.JSpinner jSpinnerNoGruposAsignatura3Sem4;
    private javax.swing.JSpinner jSpinnerNoGruposAsignatura3Sem5;
    private javax.swing.JSpinner jSpinnerNoGruposAsignatura3Sem6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldAsignatura1Sem1;
    private javax.swing.JTextField jTextFieldAsignatura1Sem2;
    private javax.swing.JTextField jTextFieldAsignatura1Sem3;
    private javax.swing.JTextField jTextFieldAsignatura1Sem4;
    private javax.swing.JTextField jTextFieldAsignatura1Sem5;
    private javax.swing.JTextField jTextFieldAsignatura1Sem6;
    private javax.swing.JTextField jTextFieldAsignatura2Sem1;
    private javax.swing.JTextField jTextFieldAsignatura2Sem2;
    private javax.swing.JTextField jTextFieldAsignatura2Sem3;
    private javax.swing.JTextField jTextFieldAsignatura2Sem4;
    private javax.swing.JTextField jTextFieldAsignatura2Sem5;
    private javax.swing.JTextField jTextFieldAsignatura2Sem6;
    private javax.swing.JTextField jTextFieldAsignatura3Sem1;
    private javax.swing.JTextField jTextFieldAsignatura3Sem2;
    private javax.swing.JTextField jTextFieldAsignatura3Sem3;
    private javax.swing.JTextField jTextFieldAsignatura3Sem4;
    private javax.swing.JTextField jTextFieldAsignatura3Sem5;
    private javax.swing.JTextField jTextFieldAsignatura3Sem6;
    // End of variables declaration//GEN-END:variables
}
