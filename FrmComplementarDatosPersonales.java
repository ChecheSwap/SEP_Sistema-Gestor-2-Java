/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 *@author JJ.NAVARRETE
 */
public class FrmComplementarDatosPersonales extends javax.swing.JFrame {

    String curp = "";
    String estatus = "";
    String apellido_p = "";
    String apellido_m = "";
    String nombre1 = "";
    String nombre2 = "";
    String sexo = "";
    String fechaNacimiento = "";
    String rfc = "";
    String telLocal = "";
    String cel = "";
    String estado = "";
    String email = "";
    String nacionalidad = "";
    String estadoCivil = "";
    String computadora = "";
    String internet = "";
    String calle = "";
    String numeroExt = "";
    String numeroInt = "";
    String localidad = "";
    String cp = "";
    String municipioResidencia = "";
    String estadoResidencia = "";
    String comentarioDomicilio = "";

    /**
     * Creates new form FrmDatosPersonales
     */
    public FrmComplementarDatosPersonales(String curp) {
        this.curp = curp;
        initComponents();
        cargarDatos();
        jTextFieldCurp.setEditable(false);
    }

    private synchronized void cargarDatos() {
        BD bd = new BD();
        String[] datos = bd.obtenerDatosDocente(this.curp);
        this.estatus = datos[0];
        this.apellido_p = datos[1];
        this.apellido_m = datos[2];
        this.nombre1 = datos[3];
        this.nombre2 = datos[4];
        this.sexo = datos[5];
        this.fechaNacimiento = datos[6];
        this.rfc = datos[7];
        this.telLocal = datos[8];
        this.cel = datos[9];
        this.estado = datos[10];
        this.email = datos[11];
        this.nacionalidad = datos[12];
        this.estadoCivil = datos[13];
        this.computadora = datos[14];
        this.internet = datos[15];
        this.calle = datos[16];
        this.numeroExt = datos[17];
        this.numeroInt = datos[18];
        this.localidad = datos[19];
        this.cp = datos[20];
        this.municipioResidencia = datos[21];
        this.estadoResidencia = datos[22];
        this.comentarioDomicilio = datos[23];
        try {
            jTextFieldCurp.setText(curp);
            jTextFieldEstatus.setText(estatus);
            jTextFieldApellidoP.setText(apellido_p);
            jTextFieldApellidoM.setText(apellido_m);
            jTextFieldNombre1.setText(nombre1);
            jTextFieldNombre2.setText(nombre2);

            switch (sexo) {
                case "Masculino":
                    jRadioButtonMasculino.setSelected(true);
                    break;
                case "Femenino":
                    jRadioButtonFemenino.setSelected(true);
                    break;
            }

            switch (estadoCivil) {
                case "Casado":
                    jRadioButtonCasado.setSelected(true);
                    break;
                case "Soltero":
                    jRadioButtonSoltero.setSelected(true);
                    break;
            }

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            if (fechaNacimiento != null) {
                try {

                    Date date = formatter.parse(fechaNacimiento);
                    jDateChooserFecha.setDate(date);

                } catch (ParseException e) {

                }
            }
            
            jComboBoxEstadoNacimiento.setSelectedItem(estado);

            jTextFieldRFC.setText(rfc);
            jTextFieldTel.setText(telLocal);
            jTextFieldCel.setText(cel);

            jComboBoxNacionalidad.setSelectedItem(nacionalidad);

            switch (computadora) {
                case "Si":
                    jRadioButtonPcSi.setSelected(true);
                    break;
                case "No":
                    jRadioButtonPcNo.setSelected(true);
                    break;
            }

            switch (internet) {
                case "Si":
                    jRadioButtonInternetSi.setSelected(true);
                    break;
                case "No":
                    jRadioButtonInternetNo.setSelected(true);
                    break;
            }

            jTextFieldCalle.setText(calle);
            jTextFieldNoExt.setText(numeroExt);
            jTextFieldNoInt.setText(numeroInt);
            jTextFieldColonia.setText(localidad);
            jTextFieldCP.setText(cp);
            jTextFieldMunicipio.setText(municipioResidencia);

            jComboBoxEstado.setSelectedItem(estadoResidencia);

            jTextFieldEmail.setText(email);

            jTextAreaComentario.setText(comentarioDomicilio);
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

        buttonGroupSexo = new javax.swing.ButtonGroup();
        buttonGroupEstadoCivil = new javax.swing.ButtonGroup();
        buttonGroupPC = new javax.swing.ButtonGroup();
        buttonGroupInternet = new javax.swing.ButtonGroup();
        jTabbedPaneDatosGenerales = new javax.swing.JTabbedPane();
        jPanelDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldEstatus = new javax.swing.JTextField();
        jLabelCurp = new javax.swing.JLabel();
        jTextFieldCurp = new javax.swing.JTextField();
        jLabelRFC = new javax.swing.JLabel();
        jTextFieldRFC = new javax.swing.JTextField();
        jLabelApellidoP = new javax.swing.JLabel();
        jTextFieldApellidoP = new javax.swing.JTextField();
        jLabelApellidoM = new javax.swing.JLabel();
        jTextFieldApellidoM = new javax.swing.JTextField();
        jLabelNombre1 = new javax.swing.JLabel();
        jTextFieldNombre1 = new javax.swing.JTextField();
        jLabelNombre2 = new javax.swing.JLabel();
        jTextFieldNombre2 = new javax.swing.JTextField();
        jLabelFechaNacimiento = new javax.swing.JLabel();
        jLabelEstadoNacimiento = new javax.swing.JLabel();
        jComboBoxEstadoNacimiento = new javax.swing.JComboBox();
        jLabelNacionalidad = new javax.swing.JLabel();
        jComboBoxNacionalidad = new javax.swing.JComboBox();
        jLabelSexo = new javax.swing.JLabel();
        jRadioButtonMasculino = new javax.swing.JRadioButton();
        jRadioButtonFemenino = new javax.swing.JRadioButton();
        jLabelEstadoCivil = new javax.swing.JLabel();
        jRadioButtonSoltero = new javax.swing.JRadioButton();
        jRadioButtonCasado = new javax.swing.JRadioButton();
        jDateChooserFecha = new com.toedter.calendar.JDateChooser();
        jButtonGuardar = new javax.swing.JButton();
        jPanelDomicilio = new javax.swing.JPanel();
        jLabelEstado = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox();
        jLabelEstadoMunicipio = new javax.swing.JLabel();
        jLabelColonia = new javax.swing.JLabel();
        jTextFieldColonia = new javax.swing.JTextField();
        jLabelCalle = new javax.swing.JLabel();
        jTextFieldCalle = new javax.swing.JTextField();
        jLabelNoExt = new javax.swing.JLabel();
        jTextFieldNoExt = new javax.swing.JTextField();
        jLabelNoInt = new javax.swing.JLabel();
        jTextFieldNoInt = new javax.swing.JTextField();
        jLabelCP = new javax.swing.JLabel();
        jTextFieldCP = new javax.swing.JTextField();
        jLabelComentario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaComentario = new javax.swing.JTextArea();
        jTextFieldMunicipio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanelInfoAdicional = new javax.swing.JPanel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelTel = new javax.swing.JLabel();
        jTextFieldTel = new javax.swing.JTextField();
        jLabelCel = new javax.swing.JLabel();
        jTextFieldCel = new javax.swing.JTextField();
        jLabelPC = new javax.swing.JLabel();
        jRadioButtonPcSi = new javax.swing.JRadioButton();
        jRadioButtonPcNo = new javax.swing.JRadioButton();
        jLabelInternet = new javax.swing.JLabel();
        jRadioButtonInternetSi = new javax.swing.JRadioButton();
        jRadioButtonInternetNo = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Complementar Datos Personales");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Estatus:");

        jLabelCurp.setText("CURP:");

        jLabelRFC.setText("RFC:");

        jLabelApellidoP.setText("Apellido Paterno:");

        jLabelApellidoM.setText("Apellido Materno:");

        jLabelNombre1.setText("Primer Nombre:");

        jLabelNombre2.setText("Segundo Nombre:");

        jLabelFechaNacimiento.setText("Fecha Nacimiento:");

        jLabelEstadoNacimiento.setText("Estado Nacimiento:");

        jComboBoxEstadoNacimiento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Otro--", "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Coahuila", "Colima", "Chiapas", "Chihuahua", "Distrito Federal", "Durango", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "México", "Michoacán de Ocampo", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas" }));

        jLabelNacionalidad.setText("Nacionalidad:");

        jComboBoxNacionalidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Argentina", "Arubana", "Bahameña", "Barbadense", "Beliceña", "Boliviana", "Brasileña", "Canadiense", "Chilena", "Colombiana", "Costarricense", "Cubana", "Dominicana", "Dominiquesa", "Ecuatoriana", "Estadounidense", "Guatemalteca", "Guyanesa", "Haitiana", "Hondureña", "Jamaiquina", "Mexicana", "Nicaragüense", "Panameña", "Paraguaya", "Peruana", "Puertorriqueña", "Salvadoreña", "Sancristobaleña", "Santaluciana", "Sanvicentina", "Surinamesa", "Uruguaya", "Venzolana" }));

        jLabelSexo.setText("Sexo:");

        buttonGroupSexo.add(jRadioButtonMasculino);
        jRadioButtonMasculino.setText("Masculino");

        buttonGroupSexo.add(jRadioButtonFemenino);
        jRadioButtonFemenino.setText("Femenino");

        jLabelEstadoCivil.setText("Estado Civil:");

        buttonGroupEstadoCivil.add(jRadioButtonSoltero);
        jRadioButtonSoltero.setText("Soltero");
        jRadioButtonSoltero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSolteroActionPerformed(evt);
            }
        });

        buttonGroupEstadoCivil.add(jRadioButtonCasado);
        jRadioButtonCasado.setText("Casado");
        jRadioButtonCasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCasadoActionPerformed(evt);
            }
        });

        jDateChooserFecha.setDateFormatString("yyyy-MM-dd");

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelSexo)
                            .addComponent(jLabelEstadoCivil))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonMasculino)
                            .addComponent(jRadioButtonSoltero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonCasado)
                            .addComponent(jRadioButtonFemenino)
                            .addComponent(jButtonGuardar)))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosLayout.createSequentialGroup()
                                .addComponent(jLabelNombre2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosLayout.createSequentialGroup()
                                .addComponent(jLabelFechaNacimiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooserFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosLayout.createSequentialGroup()
                                .addComponent(jLabelApellidoM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosLayout.createSequentialGroup()
                                .addComponent(jLabelApellidoP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosLayout.createSequentialGroup()
                                .addComponent(jLabelRFC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosLayout.createSequentialGroup()
                                .addComponent(jLabelCurp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosLayout.createSequentialGroup()
                                .addComponent(jLabelNombre1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosLayout.createSequentialGroup()
                                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelNacionalidad)
                                    .addComponent(jLabelEstadoNacimiento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxEstadoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCurp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRFC)
                    .addComponent(jTextFieldRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellidoP)
                    .addComponent(jTextFieldApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellidoM)
                    .addComponent(jTextFieldApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre1)
                    .addComponent(jTextFieldNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFechaNacimiento)
                    .addComponent(jDateChooserFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstadoNacimiento)
                    .addComponent(jComboBoxEstadoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNacionalidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSexo)
                    .addComponent(jRadioButtonMasculino)
                    .addComponent(jRadioButtonFemenino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstadoCivil)
                    .addComponent(jRadioButtonSoltero)
                    .addComponent(jRadioButtonCasado))
                .addGap(18, 18, 18)
                .addComponent(jButtonGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneDatosGenerales.addTab("Datos Generales", jPanelDatos);

        jLabelEstado.setText("Estado:");

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Otro--", "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Coahuila", "Colima", "Chiapas", "Chihuahua", "Distrito Federal", "Durango", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "México", "Michoacán de Ocampo", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas" }));

        jLabelEstadoMunicipio.setText("Municipio:");

        jLabelColonia.setText("Colonia:");

        jLabelCalle.setText("Calle:");

        jLabelNoExt.setText("No. Ext:");

        jLabelNoInt.setText("No. Int:");

        jLabelCP.setText("CP:");

        jLabelComentario.setText("Comentario Domicilio:");

        jTextAreaComentario.setColumns(20);
        jTextAreaComentario.setLineWrap(true);
        jTextAreaComentario.setRows(5);
        jScrollPane1.setViewportView(jTextAreaComentario);

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDomicilioLayout = new javax.swing.GroupLayout(jPanelDomicilio);
        jPanelDomicilio.setLayout(jPanelDomicilioLayout);
        jPanelDomicilioLayout.setHorizontalGroup(
            jPanelDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDomicilioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanelDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelDomicilioLayout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(jPanelDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelDomicilioLayout.createSequentialGroup()
                                    .addComponent(jLabelNoInt)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldNoInt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelDomicilioLayout.createSequentialGroup()
                                        .addComponent(jLabelEstado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelDomicilioLayout.createSequentialGroup()
                                        .addGroup(jPanelDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelCalle)
                                            .addComponent(jLabelColonia)
                                            .addComponent(jLabelEstadoMunicipio))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanelDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldColonia, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                            .addComponent(jTextFieldCalle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldMunicipio)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDomicilioLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabelNoExt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNoExt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanelDomicilioLayout.createSequentialGroup()
                            .addGroup(jPanelDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelComentario)
                                .addComponent(jLabelCP))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldCP)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanelDomicilioLayout.setVerticalGroup(
            jPanelDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDomicilioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstado)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstadoMunicipio)
                    .addComponent(jTextFieldMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelColonia)
                    .addComponent(jTextFieldColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCalle)
                    .addComponent(jTextFieldCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoExt)
                    .addComponent(jTextFieldNoExt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNoInt)
                    .addComponent(jTextFieldNoInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCP)
                    .addComponent(jTextFieldCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDomicilioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelComentario)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneDatosGenerales.addTab("Domicilio", jPanelDomicilio);

        jLabelEmail.setText("E-Mail:");

        jLabelTel.setText("Tel:");

        jLabelCel.setText("Cel:");

        jLabelPC.setText("Cuenta con PC:");

        buttonGroupPC.add(jRadioButtonPcSi);
        jRadioButtonPcSi.setText("Si");

        buttonGroupPC.add(jRadioButtonPcNo);
        jRadioButtonPcNo.setText("No");

        jLabelInternet.setText("Cuenta con Internet:");

        buttonGroupInternet.add(jRadioButtonInternetSi);
        jRadioButtonInternetSi.setText("Si");

        buttonGroupInternet.add(jRadioButtonInternetNo);
        jRadioButtonInternetNo.setText("No");

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInfoAdicionalLayout = new javax.swing.GroupLayout(jPanelInfoAdicional);
        jPanelInfoAdicional.setLayout(jPanelInfoAdicionalLayout);
        jPanelInfoAdicionalLayout.setHorizontalGroup(
            jPanelInfoAdicionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoAdicionalLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelInfoAdicionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelInternet)
                    .addComponent(jLabelEmail)
                    .addComponent(jLabelTel)
                    .addComponent(jLabelCel)
                    .addComponent(jLabelPC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoAdicionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInfoAdicionalLayout.createSequentialGroup()
                        .addGroup(jPanelInfoAdicionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldTel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelInfoAdicionalLayout.createSequentialGroup()
                                .addComponent(jRadioButtonPcSi)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonPcNo)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(470, 470, 470))
                    .addGroup(jPanelInfoAdicionalLayout.createSequentialGroup()
                        .addComponent(jRadioButtonInternetSi)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonInternetNo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanelInfoAdicionalLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelInfoAdicionalLayout.setVerticalGroup(
            jPanelInfoAdicionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoAdicionalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoAdicionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoAdicionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTel)
                    .addComponent(jTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoAdicionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCel)
                    .addComponent(jTextFieldCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoAdicionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPC)
                    .addComponent(jRadioButtonPcSi)
                    .addComponent(jRadioButtonPcNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoAdicionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInternet)
                    .addComponent(jRadioButtonInternetSi)
                    .addComponent(jRadioButtonInternetNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        jTabbedPaneDatosGenerales.addTab("Información Adicional", jPanelInfoAdicional);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoSEP.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneDatosGenerales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabelLogo)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneDatosGenerales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonSolteroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSolteroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonSolteroActionPerformed

    private void jRadioButtonCasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonCasadoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        DateFormat fechaFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = jDateChooserFecha.getDate();
        String fechaSeleccionada = "";

        String estatusNuevo = jTextFieldEstatus.getText();
        String rfcNuevo = jTextFieldRFC.getText();
        String apellidoPNuevo = jTextFieldApellidoP.getText();
        String apellidoMNuevo = jTextFieldApellidoM.getText();
        String nombre1Nuevo = jTextFieldNombre1.getText();
        String nombre2Nuevo = jTextFieldNombre2.getText();
        String sexoNuevo = "";
        String estadoCivilNuevo = "";

        String estadoNacimientoNuevo = jComboBoxEstadoNacimiento.getSelectedItem().toString();
        
        String nacionalidadNueva = jComboBoxNacionalidad.getSelectedItem().toString();

        if (jRadioButtonMasculino.isSelected()) {
            sexoNuevo = "Masculino";
        }
        if (jRadioButtonFemenino.isSelected()) {
            sexoNuevo = "Femenino";
        }

        if (jRadioButtonCasado.isSelected()) {
            estadoCivilNuevo = "Casado";
        }
        if (jRadioButtonSoltero.isSelected()) {
            estadoCivilNuevo = "Soltero";
        }

        if (fecha != null) {
            try {
                fechaSeleccionada = fechaFormat.format(fecha);
            } catch (Exception e) {
            }
        }

        String[] datos = {estatusNuevo, curp, rfcNuevo, apellidoPNuevo, apellidoMNuevo, nombre1Nuevo, nombre2Nuevo, fechaSeleccionada, estadoNacimientoNuevo, nacionalidadNueva, sexoNuevo, estadoCivilNuevo};
        BD bd = new BD();
        String consulta = bd.actualizarDatosPersonalesDatosGenerales(datos);
        if (consulta.equals("Ok")) {
            JOptionPane.showMessageDialog(this, "Datos guardados correctamente", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos", "Advertencia", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        cerrar();
    }//GEN-LAST:event_formWindowClosed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String estadoResidenciaNuevo = jComboBoxEstado.getSelectedItem().toString();
        String municipioNuevo = jTextFieldMunicipio.getText();
        String colonia = jTextFieldColonia.getText();
        String calleNuevo = jTextFieldCalle.getText();
        String noExtNuevo = jTextFieldNoExt.getText();
        String noIntNuevo = jTextFieldNoInt.getText();
        String cpNuevo = jTextFieldCP.getText();
        String comentarioNuevo = jTextAreaComentario.getText();

        String[] datos = {estadoResidenciaNuevo, municipioNuevo, colonia, calleNuevo, noExtNuevo, noIntNuevo, cpNuevo, comentarioNuevo, curp};
        BD bd = new BD();
        String consulta = bd.actualizarDatosPersonalesDomicilio(datos);

        if (consulta.equals("Ok")) {
            JOptionPane.showMessageDialog(this, "Datos guardados correctamente", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos", "Advertencia", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String emailN = jTextFieldEmail.getText();
        String telN = jTextFieldTel.getText();
        String celN = jTextFieldCel.getText();
        String pc = "";
        String internetN = "";
        if (jRadioButtonPcSi.isSelected()) {
            pc = "Si";
        }

        if (jRadioButtonPcNo.isSelected()) {
            pc = "No";
        }

        if (jRadioButtonInternetSi.isSelected()) {
            internetN = "Si";
        }

        if (jRadioButtonInternetNo.isSelected()) {
            internetN = "No";
        }

        BD bd = new BD();
        String[] datos = {emailN, telN, celN, pc, internetN, curp};
        String consulta = bd.actualizarDatosPersonalesInfoAdicional(datos);
        if (consulta.equals("Ok")) {
            JOptionPane.showMessageDialog(this, "Datos guardados correctamente", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos", "Advertencia", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public synchronized void cerrar() {
        FrmAdminDocente.instancia.dispose();
        FrmAdminDocente frmAdminDocente = new FrmAdminDocente(curp);
        frmAdminDocente.setLocationRelativeTo(null);
        frmAdminDocente.setVisible(true);
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
            java.util.logging.Logger.getLogger(FrmComplementarDatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmComplementarDatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmComplementarDatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmComplementarDatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmComplementarDatosPersonales("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupEstadoCivil;
    private javax.swing.ButtonGroup buttonGroupInternet;
    private javax.swing.ButtonGroup buttonGroupPC;
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox jComboBoxEstado;
    private javax.swing.JComboBox jComboBoxEstadoNacimiento;
    private javax.swing.JComboBox jComboBoxNacionalidad;
    private com.toedter.calendar.JDateChooser jDateChooserFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApellidoM;
    private javax.swing.JLabel jLabelApellidoP;
    private javax.swing.JLabel jLabelCP;
    private javax.swing.JLabel jLabelCalle;
    private javax.swing.JLabel jLabelCel;
    private javax.swing.JLabel jLabelColonia;
    private javax.swing.JLabel jLabelComentario;
    private javax.swing.JLabel jLabelCurp;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelEstadoCivil;
    private javax.swing.JLabel jLabelEstadoMunicipio;
    private javax.swing.JLabel jLabelEstadoNacimiento;
    private javax.swing.JLabel jLabelFechaNacimiento;
    private javax.swing.JLabel jLabelInternet;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNacionalidad;
    private javax.swing.JLabel jLabelNoExt;
    private javax.swing.JLabel jLabelNoInt;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelNombre2;
    private javax.swing.JLabel jLabelPC;
    private javax.swing.JLabel jLabelRFC;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelDomicilio;
    private javax.swing.JPanel jPanelInfoAdicional;
    private javax.swing.JRadioButton jRadioButtonCasado;
    private javax.swing.JRadioButton jRadioButtonFemenino;
    private javax.swing.JRadioButton jRadioButtonInternetNo;
    private javax.swing.JRadioButton jRadioButtonInternetSi;
    private javax.swing.JRadioButton jRadioButtonMasculino;
    private javax.swing.JRadioButton jRadioButtonPcNo;
    private javax.swing.JRadioButton jRadioButtonPcSi;
    private javax.swing.JRadioButton jRadioButtonSoltero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneDatosGenerales;
    private javax.swing.JTextArea jTextAreaComentario;
    private javax.swing.JTextField jTextFieldApellidoM;
    private javax.swing.JTextField jTextFieldApellidoP;
    private javax.swing.JTextField jTextFieldCP;
    private javax.swing.JTextField jTextFieldCalle;
    private javax.swing.JTextField jTextFieldCel;
    private javax.swing.JTextField jTextFieldColonia;
    private javax.swing.JTextField jTextFieldCurp;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEstatus;
    private javax.swing.JTextField jTextFieldMunicipio;
    private javax.swing.JTextField jTextFieldNoExt;
    private javax.swing.JTextField jTextFieldNoInt;
    private javax.swing.JTextField jTextFieldNombre1;
    private javax.swing.JTextField jTextFieldNombre2;
    private javax.swing.JTextField jTextFieldRFC;
    private javax.swing.JTextField jTextFieldTel;
    // End of variables declaration//GEN-END:variables
}
