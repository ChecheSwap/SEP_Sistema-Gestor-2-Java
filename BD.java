/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep;

import java.sql.Connection;
import javax.sql.DataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author J.J Navarrete
 */
public class BD {

    // Fuente de datos
    private final DataSource ds;

    // Conexión
    private Connection conn;

    FrmLogin login = new FrmLogin();

    public BD() {

        String usuario = "root";
        String password = "master33";
        String nombreBaseDatos = "sep";
        int numeroPuerto = 3306;
        String nombreServidor = "localhost";

        // Crear fuente de datos MySQL y configurarla:
        MysqlDataSource mds = new MysqlDataSource();
        mds.setUser(usuario);
        mds.setPassword(password);
        mds.setDatabaseName(nombreBaseDatos);
        mds.setPortNumber(numeroPuerto);
        mds.setServerName(nombreServidor);

        // Realizar un casting a una fuente de datos estándar (atributo):
        ds = (DataSource) mds;

    }

    public String probarConexion() {
        try {
            conn = ds.getConnection();
            conn.close();
            return "probar ok";
        } catch (SQLException sqlExp) {
            return sqlExp.getMessage();
        }
    }

    /**
     * Abre la conexión a la base de datos
     *
     * @return "abrir ok" si la conexión fue exitosa, mensaje de error SQL si la
     * apertura de la conexión falló
     */
    public String abrirConexion() {
        try {
            conn = ds.getConnection();
            return "Abrir OK";
        } catch (SQLException sqlExp) {
            return sqlExp.getMessage();
        }
    }

    /**
     * Cierra la conexión a la base de datos
     *
     * @return "cerrar ok" si el cierre fue exitoso, mensaje de error SQL si el
     * cierre falló
     */
    public String cerrarConexion() {
        try {
            if (conn != null) {
                conn.close();
            }
            return "Cerrar Ok";
        } catch (SQLException sqlExp) {
            return sqlExp.getMessage();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Metodo Inico de Sesion">
    public String IniciarSesionAdmin(String user, String pass) {
        String usuario = user;
        String password = pass;
        String consulta = "";
        String tmpUsuario = "";
        String tmpPassword = "";
        abrirConexion();

        if (conn != null) {
            try {
                // Crear consulta preparada:
                String query = "SELECT * FROM usuarios WHERE usuario=?";

                PreparedStatement stmt = conn.prepareStatement(query);
                // Asignar valor al parámetro:
                stmt.setString(1, usuario);

                // Ejecutar consulta:
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    tmpUsuario = rs.getString("usuario");
                    tmpPassword = rs.getString("password");

                }                

                if (tmpUsuario.equals(usuario) && tmpPassword.equals(String.valueOf(password))) {
                    consulta = "Exito";
                }
                // Cerrar objeto de consulta:
                stmt.close();

                // Cerrar conexión:
                cerrarConexion();

            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return consulta;

    }

    public String IniciarSesionDocente(String curp, String pass) {
        String CURP = curp;
        String password = pass;
        String consulta = "";
        String tmpCurp = "";
        String tmpPassword = "";
        abrirConexion();

        if (conn != null) {
            try {
                // Crear consulta preparada:
                String query = "SELECT * FROM usuarios WHERE curp=?";

                PreparedStatement stmt = conn.prepareStatement(query);
                // Asignar valor al parámetro:
                stmt.setString(1, CURP);

                // Ejecutar consulta:
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    tmpCurp = rs.getString("curp");
                    tmpPassword = rs.getString("password");

                }

                if (tmpCurp.equals(curp) && tmpPassword.equals(String.valueOf(password))) {
                    consulta = "Exito";
                }
                // Cerrar objeto de consulta:
                stmt.close();

                // Cerrar conexión:
                cerrarConexion();

            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return consulta;

    }
//</editor-fold>  

    public String[] obtenerDatosDocente(String curp) {
        String Curp = curp;
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

        abrirConexion();
        if (conn != null) {
            try {
                // Crear consulta preparada:
                String query = "SELECT * FROM datos_generales WHERE curp=?";

                PreparedStatement stmt = conn.prepareStatement(query);
                // Asignar valor al parámetro:
                stmt.setString(1, Curp);

                // Ejecutar consulta:
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    estatus = rs.getString("estatus");
                    apellido_p = rs.getString("apellido_p");
                    apellido_m = rs.getString("apellido_m");
                    nombre1 = rs.getString("nombre1");
                    nombre2 = rs.getString("nombre2");
                    sexo = rs.getString("sexo");
                    fechaNacimiento = rs.getString("fecha_nacimiento");
                    rfc = rs.getString("rfc");
                    telLocal = rs.getString("telefono_local");
                    cel = rs.getString("telefono_cel");
                    estado = rs.getString("edo_nacimiento");
                    email = rs.getString("e_mail");
                    nacionalidad = rs.getString("nacionalidad");
                    estadoCivil = rs.getString("edo_civil");
                    computadora = rs.getString("tiene_computadora");
                    internet = rs.getString("tiene_internet");
                    calle = rs.getString("calle");
                    numeroExt = rs.getString("num_ext");
                    numeroInt = rs.getString("num_int");
                    localidad = rs.getString("localidad");
                    cp = rs.getString("cp");
                    municipioResidencia = rs.getString("municipio_residencia");
                    estadoResidencia = rs.getString("estado_residencia");
                    comentarioDomicilio = rs.getString("comentario_domicilio");
                }
                // Cerrar objeto de consulta:
                stmt.close();
                // Cerrar conexión:
                cerrarConexion();
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }
        return new String[]{estatus, apellido_p, apellido_m, nombre1, nombre2,
            sexo, fechaNacimiento, rfc, telLocal, cel, estado,
            email, nacionalidad, estadoCivil, computadora,
            internet, calle, numeroExt, numeroInt, localidad,
            cp, municipioResidencia, estadoResidencia, comentarioDomicilio};
    }

    public String[] obtenerDatosPlantel(String curp) {
        String Curp = curp;
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

        abrirConexion();
        if (conn != null) {
            try {
                // Crear consulta preparada:
                String query = "SELECT * FROM plantel_adscripcion WHERE curp=?";

                PreparedStatement stmt = conn.prepareStatement(query);
                // Asignar valor al parámetro:
                stmt.setString(1, Curp);

                // Ejecutar consulta:
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    subsistema = rs.getString("subsistema");
                    tipo_sostenimiento = rs.getString("tipo_sostenimiento");
                    nombre_plantel = rs.getString("nombre_plantel");
                    clave_plantel = rs.getString("clave_plantel");
                    cargo = rs.getString("cargo_ocupacion");
                    fechaCaptura = rs.getString("fecha_captura");
                    antiguedadAños = rs.getString("antiguedad_años");
                    antiguedadMeses = rs.getString("antiguedad_meses");
                    hrsGrupo = rs.getString("hrs_frente_grupo");
                    tipoContratacion = rs.getString("tipo_contratacion");
                    calle = rs.getString("calle_plantel");
                    numero = rs.getString("num_plantel");
                    colonia = rs.getString("colonia_plantel");
                    municipio = rs.getString("municipio_plantel");
                    cp = rs.getString("cp_plantel");

                }
                // Cerrar objeto de consulta:
                stmt.close();
                // Cerrar conexión:
                cerrarConexion();
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }

        }
        return new String[]{subsistema, tipo_sostenimiento, nombre_plantel,
            clave_plantel, cargo, fechaCaptura, antiguedadAños, antiguedadMeses,
            hrsGrupo, tipoContratacion, calle, numero, colonia, municipio, cp};
    }

    public String[] obtenerDatosAsignaturas(String curp) {
        String Curp = curp;
        String asignatura1Semestre1 = "";
        String asignatura1Semestre2 = "";
        String asignatura1Semestre3 = "";
        String asignatura1Semestre4 = "";
        String asignatura1Semestre5 = "";
        String asignatura1Semestre6 = "";

        String asignatura2Semestre1 = "";
        String asignatura2Semestre2 = "";
        String asignatura2Semestre3 = "";
        String asignatura2Semestre4 = "";
        String asignatura2Semestre5 = "";
        String asignatura2Semestre6 = "";

        String asignatura3Semestre1 = "";
        String asignatura3Semestre2 = "";
        String asignatura3Semestre3 = "";
        String asignatura3Semestre4 = "";
        String asignatura3Semestre5 = "";
        String asignatura3Semestre6 = "";

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

        abrirConexion();
        if (conn != null) {
            try {
                // Crear consulta preparada:
                String query = "SELECT * FROM asignatura_semestre WHERE curp=?";

                PreparedStatement stmt = conn.prepareStatement(query);
                // Asignar valor al parámetro:
                stmt.setString(1, Curp);

                // Ejecutar consulta:
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    asignatura1Semestre1 = rs.getString("asignatura11");
                    asignatura1Semestre2 = rs.getString("asignatura12");
                    asignatura1Semestre3 = rs.getString("asignatura13");
                    asignatura1Semestre4 = rs.getString("asignatura14");
                    asignatura1Semestre5 = rs.getString("asignatura15");
                    asignatura1Semestre6 = rs.getString("asignatura16");

                    asignatura2Semestre1 = rs.getString("asignatura21");
                    asignatura2Semestre2 = rs.getString("asignatura22");
                    asignatura2Semestre3 = rs.getString("asignatura23");
                    asignatura2Semestre4 = rs.getString("asignatura24");
                    asignatura2Semestre5 = rs.getString("asignatura25");
                    asignatura2Semestre6 = rs.getString("asignatura26");

                    asignatura3Semestre1 = rs.getString("asignatura31");
                    asignatura3Semestre2 = rs.getString("asignatura32");
                    asignatura3Semestre3 = rs.getString("asignatura33");
                    asignatura3Semestre4 = rs.getString("asignatura34");
                    asignatura3Semestre5 = rs.getString("asignatura35");
                    asignatura3Semestre6 = rs.getString("asignatura36");

                    numeroGruposAtendidosAsignatura1Semestre1 = rs.getString("num_grupos_atendidos11");
                    numeroGruposAtendidosAsignatura1Semestre2 = rs.getString("num_grupos_atendidos12");
                    numeroGruposAtendidosAsignatura1Semestre3 = rs.getString("num_grupos_atendidos13");
                    numeroGruposAtendidosAsignatura1Semestre4 = rs.getString("num_grupos_atendidos14");
                    numeroGruposAtendidosAsignatura1Semestre5 = rs.getString("num_grupos_atendidos15");
                    numeroGruposAtendidosAsignatura1Semestre6 = rs.getString("num_grupos_atendidos16");

                    numeroGruposAtendidosAsignatura2Semestre1 = rs.getString("num_grupos_atendidos21");
                    numeroGruposAtendidosAsignatura2Semestre2 = rs.getString("num_grupos_atendidos22");
                    numeroGruposAtendidosAsignatura2Semestre3 = rs.getString("num_grupos_atendidos23");
                    numeroGruposAtendidosAsignatura2Semestre4 = rs.getString("num_grupos_atendidos24");
                    numeroGruposAtendidosAsignatura2Semestre5 = rs.getString("num_grupos_atendidos25");
                    numeroGruposAtendidosAsignatura2Semestre6 = rs.getString("num_grupos_atendidos26");

                    numeroGruposAtendidosAsignatura3Semestre1 = rs.getString("num_grupos_atendidos31");
                    numeroGruposAtendidosAsignatura3Semestre2 = rs.getString("num_grupos_atendidos32");
                    numeroGruposAtendidosAsignatura3Semestre3 = rs.getString("num_grupos_atendidos33");
                    numeroGruposAtendidosAsignatura3Semestre4 = rs.getString("num_grupos_atendidos34");
                    numeroGruposAtendidosAsignatura3Semestre5 = rs.getString("num_grupos_atendidos35");
                    numeroGruposAtendidosAsignatura3Semestre6 = rs.getString("num_grupos_atendidos36");

                    numeroAlumnosGrupoAsignatura1Semestre1 = rs.getString("num_alumnos_grupo11");
                    numeroAlumnosGrupoAsignatura1Semestre2 = rs.getString("num_alumnos_grupo12");
                    numeroAlumnosGrupoAsignatura1Semestre3 = rs.getString("num_alumnos_grupo13");
                    numeroAlumnosGrupoAsignatura1Semestre4 = rs.getString("num_alumnos_grupo14");
                    numeroAlumnosGrupoAsignatura1Semestre5 = rs.getString("num_alumnos_grupo15");
                    numeroAlumnosGrupoAsignatura1Semestre6 = rs.getString("num_alumnos_grupo16");

                    numeroAlumnosGrupoAsignatura2Semestre1 = rs.getString("num_alumnos_grupo21");
                    numeroAlumnosGrupoAsignatura2Semestre2 = rs.getString("num_alumnos_grupo22");
                    numeroAlumnosGrupoAsignatura2Semestre3 = rs.getString("num_alumnos_grupo23");
                    numeroAlumnosGrupoAsignatura2Semestre4 = rs.getString("num_alumnos_grupo24");
                    numeroAlumnosGrupoAsignatura2Semestre5 = rs.getString("num_alumnos_grupo25");
                    numeroAlumnosGrupoAsignatura2Semestre6 = rs.getString("num_alumnos_grupo26");

                    numeroAlumnosGrupoAsignatura3Semestre1 = rs.getString("num_alumnos_grupo31");
                    numeroAlumnosGrupoAsignatura3Semestre2 = rs.getString("num_alumnos_grupo32");
                    numeroAlumnosGrupoAsignatura3Semestre3 = rs.getString("num_alumnos_grupo33");
                    numeroAlumnosGrupoAsignatura3Semestre4 = rs.getString("num_alumnos_grupo34");
                    numeroAlumnosGrupoAsignatura3Semestre5 = rs.getString("num_alumnos_grupo35");
                    numeroAlumnosGrupoAsignatura3Semestre6 = rs.getString("num_alumnos_grupo36");

                }
                // Cerrar objeto de consulta:
                stmt.close();
                // Cerrar conexión:
                cerrarConexion();
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }

        }
        return new String[]{asignatura1Semestre1, asignatura1Semestre2, asignatura1Semestre3,
            asignatura1Semestre4, asignatura1Semestre5, asignatura1Semestre6, asignatura2Semestre1,
            asignatura2Semestre2, asignatura2Semestre3, asignatura2Semestre4, asignatura2Semestre5,
            asignatura2Semestre6, asignatura3Semestre1, asignatura3Semestre2, asignatura3Semestre3,
            asignatura3Semestre4, asignatura3Semestre5, asignatura3Semestre6, numeroGruposAtendidosAsignatura1Semestre1,
            numeroGruposAtendidosAsignatura1Semestre2, numeroGruposAtendidosAsignatura1Semestre3,
            numeroGruposAtendidosAsignatura1Semestre4, numeroGruposAtendidosAsignatura1Semestre5,
            numeroGruposAtendidosAsignatura1Semestre6, numeroGruposAtendidosAsignatura2Semestre1,
            numeroGruposAtendidosAsignatura2Semestre2, numeroGruposAtendidosAsignatura2Semestre3,
            numeroGruposAtendidosAsignatura2Semestre4, numeroGruposAtendidosAsignatura2Semestre5,
            numeroGruposAtendidosAsignatura2Semestre6, numeroGruposAtendidosAsignatura3Semestre1,
            numeroGruposAtendidosAsignatura3Semestre2, numeroGruposAtendidosAsignatura3Semestre3,
            numeroGruposAtendidosAsignatura3Semestre4, numeroGruposAtendidosAsignatura3Semestre5,
            numeroGruposAtendidosAsignatura3Semestre6, numeroAlumnosGrupoAsignatura1Semestre1,
            numeroAlumnosGrupoAsignatura1Semestre2, numeroAlumnosGrupoAsignatura1Semestre3,
            numeroAlumnosGrupoAsignatura1Semestre4, numeroAlumnosGrupoAsignatura1Semestre5,
            numeroAlumnosGrupoAsignatura1Semestre6, numeroAlumnosGrupoAsignatura2Semestre1,
            numeroAlumnosGrupoAsignatura2Semestre2, numeroAlumnosGrupoAsignatura2Semestre3,
            numeroAlumnosGrupoAsignatura2Semestre4, numeroAlumnosGrupoAsignatura2Semestre5,
            numeroAlumnosGrupoAsignatura2Semestre6, numeroAlumnosGrupoAsignatura3Semestre1,
            numeroAlumnosGrupoAsignatura3Semestre2, numeroAlumnosGrupoAsignatura3Semestre3,
            numeroAlumnosGrupoAsignatura3Semestre4, numeroAlumnosGrupoAsignatura3Semestre5,
            numeroAlumnosGrupoAsignatura3Semestre6};
    }

    public String[] obtenerDatosDiplomado(String curp) {
        String Curp = curp;
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

        abrirConexion();
        if (conn != null) {
            try {
                // Crear consulta preparada:
                String query = "SELECT * FROM diplomado_profordems WHERE curp=?";

                PreparedStatement stmt = conn.prepareStatement(query);
                // Asignar valor al parámetro:
                stmt.setString(1, Curp);

                // Ejecutar consulta:
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    institucionDirector = rs.getString("institucion_diplomado_dir");
                    generacionDirector = rs.getString("generacion_diplomado_dir");
                    diplomadoAcreditadoDirector = rs.getString("diplomado_acreditado_dir");
                    certificadoDirector = rs.getString("certificado_diplomado_dir");

                    institucionDocente = rs.getString("institucion_diplomado_docente");
                    generacionDocente = rs.getString("generacion_diplomado_docente");
                    diplomadoAcreditadoDocente = rs.getString("diplomado_acreditado_docente");
                    certificadoDocente = rs.getString("certificado_diplomado_docente");

                    institucionCarreraConcluida = rs.getString("institucion_diplomado_carrera_concluida");
                    generacionCarreraConcluida = rs.getString("generacion_diplomado_carrera_concluida");
                    diplomadoAcreditadoCarreraConcluida = rs.getString("diplomado_acreditado_carrera_concluida");
                    certificadoCarreraConcluida = rs.getString("certificado_diplomado_carrera_concluida");

                    institucionCarreraTrunca = rs.getString("institucion_diplomado_carrera_trunca");
                    generacionCarreraTrunca = rs.getString("generacion_diplomado_carrera_trunca");
                    diplomadoAcreditadoCarreraTrunca = rs.getString("diplomado_acreditado_carrera_trunca");
                    certificadoCarreraTrunca = rs.getString("certificado_diplomado_carrera_trunca");

                    institucionBachillerato = rs.getString("institucion_diplomado_bachillerato");
                    generacionBachillerato = rs.getString("generacion_diplomado_bachillerato");
                    diplomadoAcreditadoBachillerato = rs.getString("diplomado_acreditado_bachillerato");
                    certificadoBachillerato = rs.getString("certificadio_diplomado_bachillerato");

                }
                // Cerrar objeto de consulta:
                stmt.close();
                // Cerrar conexión:
                cerrarConexion();
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }

        }
        return new String[]{institucionDirector, generacionDirector, diplomadoAcreditadoDirector,
            certificadoDirector, institucionDocente, generacionDocente, diplomadoAcreditadoDocente,
            certificadoDocente, institucionCarreraConcluida, generacionCarreraConcluida, diplomadoAcreditadoCarreraConcluida,
            certificadoCarreraConcluida, institucionCarreraTrunca, generacionCarreraTrunca, diplomadoAcreditadoCarreraTrunca,
            certificadoCarreraTrunca, institucionBachillerato, generacionBachillerato, diplomadoAcreditadoBachillerato, certificadoBachillerato};
    }

    public String[] obtenerDatosEstudiosRealizados(String curp) {
        String Curp = curp;
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

        abrirConexion();
        if (conn != null) {
            try {
                // Crear consulta preparada:
                String query = "SELECT * FROM estudios_realizados WHERE curp=?";

                PreparedStatement stmt = conn.prepareStatement(query);
                // Asignar valor al parámetro:
                stmt.setString(1, Curp);

                // Ejecutar consulta:
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {

                    gradoBachilleratoCarrera = rs.getString("grado_obtenido_bachillerato");
                    gradoLicenciatura = rs.getString("grado_obtenido_licenciatura");
                    gradoMaestria = rs.getString("grado_obtenido_maestria");
                    gradoDoctorado = rs.getString("grado_obtenido_doctorado");

                    estudiosRealizadosBachilleratoCarrera = rs.getString("estudios_realizados_bachillerato");
                    estudiosRealizadosLicenciatura = rs.getString("estudios_realizados_licenciatura");
                    estudiosRealizadosMaestria = rs.getString("estudios_realizados_maestria");
                    estudiosRealizadosDoctorado = rs.getString("estudios_realizados_doctorado");

                    campoDisciplinardoBachilleratoCarrera = rs.getString("campo_disciplinar_bachillerato");
                    campoDisciplinarLicenciatura = rs.getString("campo_disciplinar_licenciatura");
                    campoDisciplinarMaestria = rs.getString("campo_disciplinar_maestria");
                    campoDisciplinarDoctorado = rs.getString("campo_disciplinar_doctorado");

                    institucionBachilleratoCarrera = rs.getString("institucion_bachillerato");
                    institucionLicenciatura = rs.getString("institucion_licenciatura");
                    institucionMaestria = rs.getString("institucion_maestria");
                    institucionDoctorado = rs.getString("institucion_doctorado");

                    comicionadoSabatinoDe = rs.getString("comisionado_sabatino_de");
                    comicionadoSabatinoA = rs.getString("comisionado_sabatino_a");

                }
                // Cerrar objeto de consulta:
                stmt.close();
                // Cerrar conexión:
                cerrarConexion();
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }

        }
        return new String[]{gradoBachilleratoCarrera, gradoLicenciatura, gradoMaestria, gradoDoctorado,
            estudiosRealizadosBachilleratoCarrera, estudiosRealizadosLicenciatura, estudiosRealizadosMaestria, estudiosRealizadosDoctorado,
            campoDisciplinardoBachilleratoCarrera, campoDisciplinarLicenciatura, campoDisciplinarMaestria, campoDisciplinarDoctorado,
            institucionBachilleratoCarrera, institucionLicenciatura, institucionMaestria, institucionDoctorado,
            comicionadoSabatinoDe, comicionadoSabatinoA};
    }

    public String[] obtenerDatosIdiomas(String curp) {
        String Curp = curp;
        String lenguaMaterna = "";

        String idioma1 = "";
        String lecturaIdioma1 = "";
        String escrituraIdioma1 = "";
        String habladoIdioma1 = "";

        String idioma2 = "";
        String lecturaIdioma2 = "";
        String escrituraIdioma2 = "";
        String habladoIdioma2 = "";

        abrirConexion();
        if (conn != null) {
            try {
                // Crear consulta preparada:
                String query = "SELECT * FROM idiomas WHERE curp=?";

                PreparedStatement stmt = conn.prepareStatement(query);
                // Asignar valor al parámetro:
                stmt.setString(1, Curp);

                // Ejecutar consulta:
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {

                    lenguaMaterna = rs.getString("lengua_materna");
                    idioma1 = rs.getString("idioma1");
                    lecturaIdioma1 = rs.getString("lectura1");
                    escrituraIdioma1 = rs.getString("escritura1");
                    habladoIdioma1 = rs.getString("hablado1");
                    idioma2 = rs.getString("idioma2");
                    lecturaIdioma2 = rs.getString("lectura2");
                    escrituraIdioma2 = rs.getString("escritura2");
                    habladoIdioma2 = rs.getString("hablado2");

                }
                // Cerrar objeto de consulta:
                stmt.close();
                // Cerrar conexión:
                cerrarConexion();
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }

        }
        return new String[]{lenguaMaterna, idioma1, lecturaIdioma1, escrituraIdioma1,
            habladoIdioma1, idioma2, lecturaIdioma2, escrituraIdioma2,
            habladoIdioma2};
    }

    public String[] obtenerDatosOtraInstitucion(String curp) {
        String Curp = curp;
        String institucion = "";
        String nivelEducativo = "";
        String subsistema = "";
        String tipoSostenimiento = "";
        String asignatura = "";
        String horasAsignadas = "";

        abrirConexion();
        if (conn != null) {
            try {
                // Crear consulta preparada:
                String query = "SELECT * FROM otra_institucion WHERE curp=?";

                PreparedStatement stmt = conn.prepareStatement(query);
                // Asignar valor al parámetro:
                stmt.setString(1, Curp);

                // Ejecutar consulta:
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {

                    institucion = rs.getString("institucion_otra_ins");
                    nivelEducativo = rs.getString("nivel_educativo_otra_ins");
                    subsistema = rs.getString("subsistema_otra_ins");
                    tipoSostenimiento = rs.getString("tipo_sostenimiento_otra_ins");
                    asignatura = rs.getString("asignatura_otra_ins");
                    horasAsignadas = rs.getString("horas_impartidas_otra_ins");

                }
                // Cerrar objeto de consulta:
                stmt.close();
                // Cerrar conexión:
                cerrarConexion();
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }

        }
        return new String[]{institucion, nivelEducativo, subsistema, tipoSostenimiento, asignatura, horasAsignadas};
    }

    public String[] obtenerDatosExperienciaLaboral(String curp) {
        String Curp = curp;
        String nombreInstitucion = "";
        String puesto = "";
        String añosLaborados = "";

        abrirConexion();
        if (conn != null) {
            try {
                // Crear consulta preparada:
                String query = "SELECT * FROM experiencia_laboral WHERE curp=?";

                PreparedStatement stmt = conn.prepareStatement(query);
                // Asignar valor al parámetro:
                stmt.setString(1, Curp);

                // Ejecutar consulta:
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {

                    nombreInstitucion = rs.getString("nom_institucion_laboral");
                    puesto = rs.getString("puesto_laboral");
                    añosLaborados = rs.getString("años_laboral");

                }

                // Cerrar objeto de consulta:
                stmt.close();
                // Cerrar conexión:
                cerrarConexion();
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }

        }
        return new String[]{nombreInstitucion, puesto, añosLaborados};
    }

    public String[] obtenerDatosDocenteComentario(String curp) {
        String Curp = curp;
        String nombre1 = "";
        String apellidop = "";
        String apellidom = "";
        String nombre2 = "";
        String email = "";

        abrirConexion();
        if (conn != null) {
            try {
                // Crear consulta preparada:
                String query = "SELECT nombre1, nombre2, apellido_p, apellido_m, e_mail FROM datos_generales WHERE curp=?";

                PreparedStatement stmt = conn.prepareStatement(query);
                // Asignar valor al parámetro:
                stmt.setString(1, Curp);

                // Ejecutar consulta:
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {

                    nombre1 = rs.getString("nombre1");
                    nombre2 = rs.getString("nombre2");
                    apellidop = rs.getString("apellido_p");
                    apellidom = rs.getString("apellido_m");
                    email = rs.getString("e_mail");

                }

                // Cerrar objeto de consulta:
                stmt.close();
                // Cerrar conexión:
                cerrarConexion();
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }

        }
        return new String[]{nombre1, nombre2, apellidop, apellidom, email};
    }

    public String[] obtenerDatosDocenteComentarioPlantel(String curp) {

        String Curp = curp;
        String subsistema = "";
        String plantel = "";

        abrirConexion();
        if (conn != null) {
            try {
                // Crear consulta preparada:
                String query = "SELECT subsistema, nombre_plantel FROM plantel_adscripcion WHERE curp=?";

                PreparedStatement stmt = conn.prepareStatement(query);
                // Asignar valor al parámetro:
                stmt.setString(1, subsistema);
                stmt.setString(1, plantel);
                stmt.setString(1, Curp);

                // Ejecutar consulta:
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {

                    subsistema = rs.getString("subsistema");
                    plantel = rs.getString("nombre_plantel");
                }

                // Cerrar objeto de consulta:
                stmt.close();
                // Cerrar conexión:
                cerrarConexion();
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }

        }
        return new String[]{subsistema, plantel};
    }

    public String enviarComentario(String[] datosComentario) {
        String[] datos = datosComentario;
        String Curp = datos[0];
        String nombre1 = datos[1];
        String nombre2 = datos[2];
        String apellidop = datos[3];
        String apellidom = datos[4];
        String email = datos[5];
        String subsistema = datos[6];
        String nombrePlantel = datos[7];
        String comentario = datos[8];
        String estado = datos[9];
        String nombre = nombre1.concat(" ").concat(nombre2);

        java.util.Date fecha = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());

        abrirConexion();
        if (conn != null) {
            try {
                // Crear consulta preparada:
                String queryInsert = "INSERT INTO comentarios(fecha, nombre, ap_paterno, ap_materno, curp, e_mail, subsistema, nombre_plantel, comentario, estado) "
                        + "VALUES(?,?,?,?,?,?,?,?,?,?)";

                PreparedStatement stmtInsert;
                stmtInsert = conn.prepareStatement(queryInsert);
                // Asignar valor al parámetro:
                stmtInsert.setDate(1, sqlDate);
                stmtInsert.setString(2, nombre);
                stmtInsert.setString(3, apellidop);
                stmtInsert.setString(4, apellidom);
                stmtInsert.setString(5, Curp);
                stmtInsert.setString(6, email);
                stmtInsert.setString(7, subsistema);
                stmtInsert.setString(8, nombrePlantel);
                stmtInsert.setString(9, comentario);
                stmtInsert.setString(10, estado);

                stmtInsert.addBatch();
                //Ejecutar Consulta
                stmtInsert.executeBatch();
                // Cerrar objeto de consulta:
                stmtInsert.close();
                // Cerrar conexión:
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
                estado = "Error";
            }

        }
        return estado;
    }

    public String registrarAdministrador(String[] datos) {

        String nombre = datos[0];
        String dependencia = datos[1];
        String email = datos[2];
        String telefono = datos[3];
        String usuario = datos[4];
        String contraseña = datos[5];
        String tipoUsuario = "Administrador";
        String estado = "";
        abrirConexion();
        if (conn != null) {
            try {
                // Crear consulta preparada:
                String queryInsert = "INSERT INTO usuarios(nombre, dependencia, e_mail, telefono, tipo_usuario, usuario, password) "
                        + "VALUES(?,?,?,?,?,?,?)";

                PreparedStatement stmtInsert;
                stmtInsert = conn.prepareStatement(queryInsert);
                // Asignar valor al parámetro:
                stmtInsert.setString(1, nombre);
                stmtInsert.setString(2, dependencia);
                stmtInsert.setString(3, email);
                stmtInsert.setString(4, telefono);
                stmtInsert.setString(5, tipoUsuario);
                stmtInsert.setString(6, usuario);
                stmtInsert.setString(7, contraseña);

                stmtInsert.addBatch();
                //Ejecutar Consulta
                stmtInsert.executeBatch();
                // Cerrar objeto de consulta:
                stmtInsert.close();
                // Cerrar conexión:
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
                estado = "Error";
            }

        }
        return estado;
    }

    public synchronized String registrarDocente(String[] datos) {
        String curp = datos[0];
        String nombre = datos[1];
        String dependencia = datos[2];
        String email = datos[3];
        String telefono = datos[4];
        String contraseña = datos[5];
        String tipoUsuario = "Docente";
        String estado = "";

        abrirConexion();
        if (conn != null) {
            try {
                // Crear consulta preparada:
                String queryInsert = "INSERT INTO usuarios(nombre, dependencia, e_mail, telefono, tipo_usuario, curp, password) "
                        + "VALUES(?,?,?,?,?,?,?)";

                String queryCurpAsignaturas = "INSERT INTO asignatura_semestre(curp) VALUES(?)";
                String queryCurpDatosGenerales = "INSERT INTO datos_generales(curp) VALUES(?)";
                String queryCurpDiplomado = "INSERT INTO diplomado_profordems(curp) VALUES(?)";
                String queryCurpEstudiosRealizados = "INSERT INTO estudios_realizados(curp) VALUES(?)";
                String queryCurpExperienciaLaboral = "INSERT INTO experiencia_laboral(curp) VALUES(?)";
                String queryCurpIdiomas = "INSERT INTO idiomas(curp) VALUES(?)";
                String queryCurpOtraIns = "INSERT INTO otra_institucion(curp) VALUES(?)";
                String queryCurpPlantel = "INSERT INTO plantel_adscripcion(curp) VALUES(?)";

                PreparedStatement stmtInsert = conn.prepareStatement(queryInsert);
                PreparedStatement stmtInsertCurpAsignaturas = conn.prepareStatement(queryCurpAsignaturas);
                PreparedStatement stmtInsertDatosGenerales = conn.prepareStatement(queryCurpDatosGenerales);
                PreparedStatement stmtInsertDiplomado = conn.prepareStatement(queryCurpDiplomado);
                PreparedStatement stmtInsertEstudiosRealizados = conn.prepareStatement(queryCurpEstudiosRealizados);
                PreparedStatement stmtInsertExperienciaLaboral = conn.prepareStatement(queryCurpExperienciaLaboral);
                PreparedStatement stmtInsertidiomas = conn.prepareStatement(queryCurpIdiomas);
                PreparedStatement stmtInserOtraIns = conn.prepareStatement(queryCurpOtraIns);
                PreparedStatement stmtInserPlantel = conn.prepareStatement(queryCurpPlantel);

                // Asignar valor al parámetro:
                stmtInsert.setString(1, nombre);
                stmtInsert.setString(2, dependencia);
                stmtInsert.setString(3, email);
                stmtInsert.setString(4, telefono);
                stmtInsert.setString(5, tipoUsuario);
                stmtInsert.setString(6, curp);
                stmtInsert.setString(7, contraseña);

                stmtInsertCurpAsignaturas.setString(1, curp);
                stmtInsertDatosGenerales.setString(1, curp);
                stmtInsertDiplomado.setString(1, curp);
                stmtInsertEstudiosRealizados.setString(1, curp);
                stmtInsertExperienciaLaboral.setString(1, curp);
                stmtInsertidiomas.setString(1, curp);
                stmtInserOtraIns.setString(1, curp);
                stmtInserPlantel.setString(1, curp);

                stmtInsert.addBatch();
                stmtInsertCurpAsignaturas.addBatch();
                stmtInsertDatosGenerales.addBatch();
                stmtInsertDiplomado.addBatch();
                stmtInsertEstudiosRealizados.addBatch();
                stmtInsertExperienciaLaboral.addBatch();
                stmtInsertidiomas.addBatch();
                stmtInserOtraIns.addBatch();
                stmtInserPlantel.addBatch();
                //Ejecutar Consulta
                stmtInsertDatosGenerales.executeBatch();
                stmtInsert.executeBatch();
                stmtInsertCurpAsignaturas.executeBatch();
                stmtInsertDiplomado.executeBatch();
                stmtInsertEstudiosRealizados.executeBatch();
                stmtInsertExperienciaLaboral.executeBatch();
                stmtInsertidiomas.executeBatch();
                stmtInserOtraIns.executeBatch();
                stmtInserPlantel.executeBatch();

                // Cerrar objeto de consulta:
                stmtInsert.close();
                stmtInsertCurpAsignaturas.close();
                stmtInsertDatosGenerales.close();
                stmtInsertDiplomado.close();
                stmtInsertEstudiosRealizados.close();
                stmtInsertExperienciaLaboral.close();
                stmtInsertidiomas.close();
                stmtInserOtraIns.close();
                stmtInserPlantel.close();
                // Cerrar conexión:
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
                estado = "Error";
            }

        }
        return estado;
    }

    public List<Usuarios> cargarUsuariosAdministadores() {

        List<Usuarios> listaUsuarios = new ArrayList();

        //Abrir conexión:
        abrirConexion();

        //Si la conexión fue exitosa:
        if (conn != null) {
            try {
                Statement stmt = conn.createStatement();
                String query = "SELECT * FROM usuarios WHERE tipo_usuario='Administrador'";
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    listaUsuarios.add(new Usuarios(rs.getString("id_usuario"),
                            rs.getString("nombre"),
                            rs.getString("dependencia"),
                            rs.getString("e_mail"),
                            rs.getString("telefono"),
                            rs.getString("tipo_usuario"),
                            rs.getString("curp"),
                            rs.getString("usuario")));
                }

                //Cerrar objetos de resultados y consulta:
                rs.close();
                stmt.close();

            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        //Cerrar conexión:
        cerrarConexion();

        return listaUsuarios;
    }

    public List<Usuarios> cargarUsuariosDocentes() {

        List<Usuarios> listaUsuarios = new ArrayList();

        //Abrir conexión:
        abrirConexion();

        //Si la conexión fue exitosa:
        if (conn != null) {
            try {
                Statement stmt = conn.createStatement();
                String query = "SELECT * FROM usuarios WHERE tipo_usuario='Docente'";
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    listaUsuarios.add(new Usuarios(rs.getString("id_usuario"),
                            rs.getString("nombre"),
                            rs.getString("dependencia"),
                            rs.getString("e_mail"),
                            rs.getString("telefono"),
                            rs.getString("tipo_usuario"),
                            rs.getString("curp"),
                            rs.getString("usuario")));
                }

                //Cerrar objetos de resultados y consulta:
                rs.close();
                stmt.close();

            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        //Cerrar conexión:
        cerrarConexion();

        return listaUsuarios;
    }

    public String eliminarUsuario(String ID) {
        String estado = "";
        String Id = ID;
        // Abrir conexión:
        abrirConexion();

        // Si la conexión fue exitosa:
        if (conn != null) {
            try {

                // Crear consulta preparada:
                String query = "DELETE FROM usuarios WHERE id_usuario = ?";
                PreparedStatement stmt = conn.prepareStatement(query);

                // Asignar valor al parámetro:
                stmt.setString(1, Id);

                // Ejecutar consulta:
                int rs = stmt.executeUpdate();

                // Cerrar objeto de consulta:
                stmt.close();

                // Cerrar conexión:
                cerrarConexion();

                estado = "Ok";
            } catch (SQLException sqlExp) {
                return sqlExp.getMessage();
            }
        }

        // Cerrar conexión:
        cerrarConexion();
        return estado;
    }

    public String eliminarUsuarioDocente(String curp) {
        String estado = "";
        String Curp = curp;

        // Abrir conexión:
        abrirConexion();

        // Si la conexión fue exitosa:
        if (conn != null) {
            try {

                // Crear consulta preparada:
                String query = "DELETE FROM datos_generales WHERE curp = ?";
                PreparedStatement stmt = conn.prepareStatement(query);

                // Asignar valor al parámetro:
                stmt.setString(1, Curp);

                // Ejecutar consulta:
                int rs = stmt.executeUpdate();

                // Cerrar objeto de consulta:
                stmt.close();

                // Cerrar conexión:
                cerrarConexion();

                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        // Cerrar conexión:
        cerrarConexion();
        return estado;
    }

    public List<Docentes> cargarDocentes() {

        List<Docentes> listaDocentes = new ArrayList();

        //Abrir conexión:
        abrirConexion();

        //Si la conexión fue exitosa:
        if (conn != null) {
            try {
                Statement stmt = conn.createStatement();
                String query = "SELECT curp,estatus,apellido_p, apellido_m, nombre1, nombre2, sexo, telefono_local, municipio_residencia, estado_residencia FROM datos_generales";
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    listaDocentes.add(new Docentes(rs.getString("curp"),
                            rs.getString("estatus"),
                            rs.getString("apellido_p"),
                            rs.getString("apellido_m"),
                            rs.getString("nombre1"),
                            rs.getString("nombre2"),
                            rs.getString("sexo"),
                            rs.getString("telefono_local"),
                            rs.getString("municipio_residencia"),
                            rs.getString("estado_residencia")));
                }

                //Cerrar objetos de resultados y consulta:
                rs.close();
                stmt.close();

            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        //Cerrar conexión:
        cerrarConexion();

        return listaDocentes;
    }

    public String actualizarDatosPersonalesDatosGenerales(String[] datos) {
        String estado = "";
        String estatusNuevo = datos[0];
        String curp = datos[1];
        String rfcNuevo = datos[2];
        String apellidoPNuevo = datos[3];
        String apellidoMNuevo = datos[4];
        String nombre1Nuevo = datos[5];
        String nombre2Nuevo = datos[6];
        String fecha = datos[7];
        String estadoNacimientoNuevo = datos[8];
        String nacionalidadNueva = datos[9];
        String sexoNuevo = datos[10];
        String estadoCivilNuevo = datos[11];
        System.out.println("Estado: " + estadoNacimientoNuevo);
        abrirConexion();
        // Si la conexión fue exitosa:
        if (conn != null) {
            try {
                String queryUpdate = "UPDATE datos_generales SET estatus= ?,rfc= ?, apellido_p= ?, apellido_m= ?, nombre1= ?, nombre2= ?, fecha_nacimiento= ?, edo_nacimiento = ?, nacionalidad= ?, sexo= ?,   edo_civil= ? WHERE curp = ?";
                PreparedStatement stmtUpdate;
                stmtUpdate = conn.prepareStatement(queryUpdate);

                stmtUpdate.setString(1, estatusNuevo);
                stmtUpdate.setString(2, rfcNuevo);
                stmtUpdate.setString(3, apellidoPNuevo);
                stmtUpdate.setString(4, apellidoMNuevo);
                stmtUpdate.setString(5, nombre1Nuevo);
                stmtUpdate.setString(6, nombre2Nuevo);
                stmtUpdate.setString(7, fecha);
                stmtUpdate.setString(8, estadoNacimientoNuevo);
                stmtUpdate.setString(9, nacionalidadNueva);
                stmtUpdate.setString(10, sexoNuevo);
                stmtUpdate.setString(11, estadoCivilNuevo);
                stmtUpdate.setString(12, curp);

                stmtUpdate.addBatch();
                stmtUpdate.executeBatch();

                // Cerrar objetos de resultados y consulta:
                stmtUpdate.close();
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return estado;

    }

    public String actualizarDatosPersonalesDomicilio(String[] datos) {
        String estado = "";
        String estadoResidenciaNuevo = datos[0];
        String municipioNuevo = datos[1];
        String colonia = datos[2];
        String calleNuevo = datos[3];
        String noExtNuevo = datos[4];
        String noIntNuevo = datos[5];
        String cpNuevo = datos[6];
        String comentarioNuevo = datos[7];
        String Curp = datos[8];

        abrirConexion();
        // Si la conexión fue exitosa:
        if (conn != null) {
            try {
                String queryUpdate = "UPDATE datos_generales SET estado_residencia=?, municipio_residencia=?, localidad=?, calle=?, num_ext=?, num_int=?, cp=?, comentario_domicilio=? WHERE curp = ?";
                PreparedStatement stmtUpdate;
                stmtUpdate = conn.prepareStatement(queryUpdate);

                stmtUpdate.setString(1, estadoResidenciaNuevo);
                stmtUpdate.setString(2, municipioNuevo);
                stmtUpdate.setString(3, colonia);
                stmtUpdate.setString(4, calleNuevo);
                stmtUpdate.setString(5, noExtNuevo);
                stmtUpdate.setString(6, noIntNuevo);
                stmtUpdate.setString(7, cpNuevo);
                stmtUpdate.setString(8, comentarioNuevo);
                stmtUpdate.setString(9, Curp);

                stmtUpdate.addBatch();
                stmtUpdate.executeBatch();

                // Cerrar objetos de resultados y consulta:
                stmtUpdate.close();
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return estado;

    }

    public String actualizarDatosPersonalesInfoAdicional(String[] datos) {
        String estado = "";
        String email = datos[0];
        String tel = datos[1];
        String cel = datos[2];
        String pc = datos[3];
        String internet = datos[4];
        String curp = datos[5];

        abrirConexion();
        // Si la conexión fue exitosa:
        if (conn != null) {
            try {
                String queryUpdate = "UPDATE datos_generales SET e_mail=?, telefono_local=?, telefono_cel=?,tiene_computadora=?, tiene_internet=? WHERE curp = ?";
                PreparedStatement stmtUpdate;
                stmtUpdate = conn.prepareStatement(queryUpdate);

                stmtUpdate.setString(1, email);
                stmtUpdate.setString(2, tel);
                stmtUpdate.setString(3, cel);
                stmtUpdate.setString(4, pc);
                stmtUpdate.setString(5, internet);
                stmtUpdate.setString(6, curp);

                stmtUpdate.addBatch();
                stmtUpdate.executeBatch();

                // Cerrar objetos de resultados y consulta:
                stmtUpdate.close();
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return estado;

    }

    public String actualizarDatosPlantel(String[] datos) {
        String estado = "";
        String subsistemaNuevo = datos[0];
        String tipo_sostenimientoNuevo = datos[1];
        String nombre_plantelNuevo = datos[2];
        String clave_plantelNuevo = datos[3];
        String cargoNuevo = datos[4];
        String fechaSeleccionada = datos[5];
        String antiguedadAñosNuevo = datos[6];
        String antiguedadMesesNuevo = datos[7];
        String hrsGrupoNuevo = datos[8];
        String tipoContratacionNuevo = datos[9];
        String Curp = datos[10];

        abrirConexion();
        // Si la conexión fue exitosa:
        if (conn != null) {
            try {
                String queryUpdate = "UPDATE plantel_adscripcion SET subsistema=?, tipo_sostenimiento=?, nombre_plantel=?, clave_plantel=?, cargo_ocupacion=?, fecha_captura=?, antiguedad_años=?, antiguedad_meses=?, hrs_frente_grupo=?, tipo_contratacion=?  WHERE curp = ?";
                PreparedStatement stmtUpdate;
                stmtUpdate = conn.prepareStatement(queryUpdate);

                stmtUpdate.setString(1, subsistemaNuevo);
                stmtUpdate.setString(2, tipo_sostenimientoNuevo);
                stmtUpdate.setString(3, nombre_plantelNuevo);
                stmtUpdate.setString(4, clave_plantelNuevo);
                stmtUpdate.setString(5, cargoNuevo);
                stmtUpdate.setString(6, fechaSeleccionada);
                stmtUpdate.setString(7, antiguedadAñosNuevo);
                stmtUpdate.setString(8, antiguedadMesesNuevo);
                stmtUpdate.setString(9, hrsGrupoNuevo);
                stmtUpdate.setString(10, tipoContratacionNuevo);
                stmtUpdate.setString(11, Curp);

                stmtUpdate.addBatch();
                stmtUpdate.executeBatch();

                // Cerrar objetos de resultados y consulta:
                stmtUpdate.close();
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return estado;

    }

    public String actualizarDatosPlantelDomicilio(String[] datos) {
        String estado = "";
        String calleNuevo = datos[0];
        String numeroNuevo = datos[1];
        String coloniaNuevo = datos[2];
        String municipioNuevo = datos[3];
        String cpNuevo = datos[4];
        String curp = datos[5];
        abrirConexion();
        // Si la conexión fue exitosa:
        if (conn != null) {
            try {
                String queryUpdate = "UPDATE plantel_adscripcion SET calle_plantel=?, num_plantel=?, colonia_plantel=?, municipio_plantel=?, cp_plantel=?  WHERE curp = ?";
                PreparedStatement stmtUpdate;
                stmtUpdate = conn.prepareStatement(queryUpdate);

                stmtUpdate.setString(1, calleNuevo);
                stmtUpdate.setString(2, numeroNuevo);
                stmtUpdate.setString(3, coloniaNuevo);
                stmtUpdate.setString(4, municipioNuevo);
                stmtUpdate.setString(5, cpNuevo);
                stmtUpdate.setString(6, curp);

                stmtUpdate.addBatch();
                stmtUpdate.executeBatch();

                // Cerrar objetos de resultados y consulta:
                stmtUpdate.close();
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return estado;

    }

    public String actualizarDatosDiplomadoDirector(String[] datos) {
        String institucionDirectorNuevo = datos[0];
        String generacionDirectorNuevo = datos[1];
        String diplomadoAcreditadoDirectorNuevo = datos[2];
        String certificadoDiplomadoNuevo = datos[3];
        String curp = datos[4];
        String estado = "";
        abrirConexion();
        // Si la conexión fue exitosa:
        if (conn != null) {
            try {
                String queryUpdate = "UPDATE diplomado_profordems SET institucion_diplomado_dir=?, generacion_diplomado_dir=?, diplomado_acreditado_dir=?, certificado_diplomado_dir=? WHERE curp = ?";
                PreparedStatement stmtUpdate;
                stmtUpdate = conn.prepareStatement(queryUpdate);

                stmtUpdate.setString(1, institucionDirectorNuevo);
                stmtUpdate.setString(2, generacionDirectorNuevo);
                stmtUpdate.setString(3, diplomadoAcreditadoDirectorNuevo);
                stmtUpdate.setString(4, certificadoDiplomadoNuevo);
                stmtUpdate.setString(5, curp);

                stmtUpdate.addBatch();
                stmtUpdate.executeBatch();

                // Cerrar objetos de resultados y consulta:
                stmtUpdate.close();
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return estado;

    }

    public String actualizarDatosDiplomadoDocente(String[] datos) {
        String institucionDocenteNuevo = datos[0];
        String generacionDocenteNuevo = datos[1];
        String diplomadoAcreditadoDocenteNuevo = datos[2];
        String certificadoDiplomadoNuevo = datos[3];
        String curp = datos[4];
        String estado = "";
        abrirConexion();
        // Si la conexión fue exitosa:
        if (conn != null) {
            try {
                String queryUpdate = "UPDATE diplomado_profordems SET institucion_diplomado_docente=?, generacion_diplomado_docente=?, diplomado_acreditado_docente=?, certificado_diplomado_docente=? WHERE curp = ?";
                PreparedStatement stmtUpdate;
                stmtUpdate = conn.prepareStatement(queryUpdate);

                stmtUpdate.setString(1, institucionDocenteNuevo);
                stmtUpdate.setString(2, generacionDocenteNuevo);
                stmtUpdate.setString(3, diplomadoAcreditadoDocenteNuevo);
                stmtUpdate.setString(4, certificadoDiplomadoNuevo);
                stmtUpdate.setString(5, curp);

                stmtUpdate.addBatch();
                stmtUpdate.executeBatch();

                // Cerrar objetos de resultados y consulta:
                stmtUpdate.close();
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return estado;

    }

    public String actualizarDatosDiplomadoCarrera(String[] datos) {
        String institucionCarreraNuevo = datos[0];
        String generacionCarreraNuevo = datos[1];
        String diplomadoAcreditadoCarreraNuevo = datos[2];
        String certificadoDiplomadoNuevo = datos[3];
        String curp = datos[4];
        String estado = "";
        abrirConexion();
        // Si la conexión fue exitosa:
        if (conn != null) {
            try {
                String queryUpdate = "UPDATE diplomado_profordems SET institucion_diplomado_carrera_concluida=?, generacion_diplomado_carrera_concluida=?, diplomado_acreditado_carrera_concluida=?, certificado_diplomado_carrera_concluida=? WHERE curp = ?";
                PreparedStatement stmtUpdate;
                stmtUpdate = conn.prepareStatement(queryUpdate);

                stmtUpdate.setString(1, institucionCarreraNuevo);
                stmtUpdate.setString(2, generacionCarreraNuevo);
                stmtUpdate.setString(3, diplomadoAcreditadoCarreraNuevo);
                stmtUpdate.setString(4, certificadoDiplomadoNuevo);
                stmtUpdate.setString(5, curp);

                stmtUpdate.addBatch();
                stmtUpdate.executeBatch();

                // Cerrar objetos de resultados y consulta:
                stmtUpdate.close();
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return estado;

    }

    public String actualizarDatosDiplomadoCarreraTrunca(String[] datos) {
        String institucionCarreraTruncaNuevo = datos[0];
        String generacionCarreraTruncaNuevo = datos[1];
        String diplomadoAcreditadoCarreraTruncaNuevo = datos[2];
        String certificadoDiplomadoNuevo = datos[3];
        String curp = datos[4];
        String estado = "";
        abrirConexion();
        // Si la conexión fue exitosa:
        if (conn != null) {
            try {
                String queryUpdate = "UPDATE diplomado_profordems SET institucion_diplomado_carrera_trunca=?, generacion_diplomado_carrera_trunca=?, diplomado_acreditado_carrera_trunca=?, certificado_diplomado_carrera_trunca=? WHERE curp = ?";
                PreparedStatement stmtUpdate;
                stmtUpdate = conn.prepareStatement(queryUpdate);

                stmtUpdate.setString(1, institucionCarreraTruncaNuevo);
                stmtUpdate.setString(2, generacionCarreraTruncaNuevo);
                stmtUpdate.setString(3, diplomadoAcreditadoCarreraTruncaNuevo);
                stmtUpdate.setString(4, certificadoDiplomadoNuevo);
                stmtUpdate.setString(5, curp);

                stmtUpdate.addBatch();
                stmtUpdate.executeBatch();

                // Cerrar objetos de resultados y consulta:
                stmtUpdate.close();
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return estado;

    }

    public String actualizarDatosDiplomadoBachillerato(String[] datos) {
        String institucionBachilleratoNuevo = datos[0];
        String generacionBachilleratoNuevo = datos[1];
        String diplomadoAcreditadoBachilleratoNuevo = datos[2];
        String certificadoDiplomadoNuevo = datos[3];
        String curp = datos[4];
        String estado = "";
        abrirConexion();
        // Si la conexión fue exitosa:
        if (conn != null) {
            try {
                String queryUpdate = "UPDATE diplomado_profordems SET institucion_diplomado_bachillerato=?, generacion_diplomado_bachillerato=?, diplomado_acreditado_bachillerato=?, certificadio_diplomado_bachillerato=? WHERE curp = ?";
                PreparedStatement stmtUpdate;
                stmtUpdate = conn.prepareStatement(queryUpdate);

                stmtUpdate.setString(1, institucionBachilleratoNuevo);
                stmtUpdate.setString(2, generacionBachilleratoNuevo);
                stmtUpdate.setString(3, diplomadoAcreditadoBachilleratoNuevo);
                stmtUpdate.setString(4, certificadoDiplomadoNuevo);
                stmtUpdate.setString(5, curp);

                stmtUpdate.addBatch();
                stmtUpdate.executeBatch();

                // Cerrar objetos de resultados y consulta:
                stmtUpdate.close();
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return estado;

    }

    public String actualizarDatosEstudiosRealizadosBachillerato(String[] datos) {
        String gradoObtenidoBachillerato = datos[0];
        String estudiosRealizadosBachillerato = datos[1];
        String campoDisciplinarBachillerato = datos[2];
        String institucionBachillerato = datos[3];
        String curp = datos[4];
        String estado = "";
        abrirConexion();
        // Si la conexión fue exitosa:
        if (conn != null) {
            try {
                String queryUpdate = "UPDATE estudios_realizados SET grado_obtenido_bachillerato=?, estudios_realizados_bachillerato=?, campo_disciplinar_bachillerato=?, institucion_bachillerato=? WHERE curp = ?";
                PreparedStatement stmtUpdate;
                stmtUpdate = conn.prepareStatement(queryUpdate);

                stmtUpdate.setString(1, gradoObtenidoBachillerato);
                stmtUpdate.setString(2, estudiosRealizadosBachillerato);
                stmtUpdate.setString(3, campoDisciplinarBachillerato);
                stmtUpdate.setString(4, institucionBachillerato);
                stmtUpdate.setString(5, curp);

                stmtUpdate.addBatch();
                stmtUpdate.executeBatch();

                // Cerrar objetos de resultados y consulta:
                stmtUpdate.close();
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return estado;

    }

    public String actualizarDatosEstudiosRealizadosLicenciatura(String[] datos) {
        String gradoObtenidoLicenciatura = datos[0];
        String estudiosRealizadosLicenciatura = datos[1];
        String campoDisciplinarLicenciatura = datos[2];
        String institucionLicenciatura = datos[3];
        String curp = datos[4];
        String estado = "";
        abrirConexion();
        // Si la conexión fue exitosa:
        if (conn != null) {
            try {
                String queryUpdate = "UPDATE estudios_realizados SET grado_obtenido_licenciatura=?, estudios_realizados_licenciatura=?, campo_disciplinar_licenciatura=?, institucion_licenciatura=? WHERE curp = ?";
                PreparedStatement stmtUpdate;
                stmtUpdate = conn.prepareStatement(queryUpdate);

                stmtUpdate.setString(1, gradoObtenidoLicenciatura);
                stmtUpdate.setString(2, estudiosRealizadosLicenciatura);
                stmtUpdate.setString(3, campoDisciplinarLicenciatura);
                stmtUpdate.setString(4, institucionLicenciatura);
                stmtUpdate.setString(5, curp);

                stmtUpdate.addBatch();
                stmtUpdate.executeBatch();

                // Cerrar objetos de resultados y consulta:
                stmtUpdate.close();
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return estado;

    }

    public String actualizarDatosEstudiosRealizadosMaestria(String[] datos) {
        String gradoObtenidoMaestria = datos[0];
        String estudiosRealizadosMaestria = datos[1];
        String campoDisciplinarMaestria = datos[2];
        String institucionMaestria = datos[3];
        String curp = datos[4];
        String estado = "";
        abrirConexion();
        // Si la conexión fue exitosa:
        if (conn != null) {
            try {
                String queryUpdate = "UPDATE estudios_realizados SET grado_obtenido_maestria=?, estudios_realizados_maestria=?, campo_disciplinar_maestria=?, institucion_maestria=? WHERE curp = ?";
                PreparedStatement stmtUpdate;
                stmtUpdate = conn.prepareStatement(queryUpdate);

                stmtUpdate.setString(1, gradoObtenidoMaestria);
                stmtUpdate.setString(2, estudiosRealizadosMaestria);
                stmtUpdate.setString(3, campoDisciplinarMaestria);
                stmtUpdate.setString(4, institucionMaestria);
                stmtUpdate.setString(5, curp);

                stmtUpdate.addBatch();
                stmtUpdate.executeBatch();

                // Cerrar objetos de resultados y consulta:
                stmtUpdate.close();
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return estado;

    }

    public String actualizarDatosEstudiosRealizadosDoctorado(String[] datos) {
        String gradoObtenidoDoctorado = datos[0];
        String estudiosRealizadosDoctorado = datos[1];
        String campoDisciplinarDoctorado = datos[2];
        String institucionDoctorado = datos[3];
        String curp = datos[4];
        String estado = "";
        abrirConexion();
        // Si la conexión fue exitosa:
        if (conn != null) {
            try {
                String queryUpdate = "UPDATE estudios_realizados SET grado_obtenido_doctorado=?, estudios_realizados_doctorado=?, campo_disciplinar_doctorado=?, institucion_doctorado=? WHERE curp = ?";
                PreparedStatement stmtUpdate;
                stmtUpdate = conn.prepareStatement(queryUpdate);

                stmtUpdate.setString(1, gradoObtenidoDoctorado);
                stmtUpdate.setString(2, estudiosRealizadosDoctorado);
                stmtUpdate.setString(3, campoDisciplinarDoctorado);
                stmtUpdate.setString(4, institucionDoctorado);
                stmtUpdate.setString(5, curp);

                stmtUpdate.addBatch();
                stmtUpdate.executeBatch();

                // Cerrar objetos de resultados y consulta:
                stmtUpdate.close();
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return estado;

    }

    public String actualizarDatosEstudiosRealizadosComisionado(String[] datos) {
        String comisionadoSabatinoFechaDe = datos[0];
        String comisionadoSabatinoFechaA = datos[1];
        String curp = datos[2];

        String estado = "";

        abrirConexion();
        // Si la conexión fue exitosa:
        if (conn != null) {
            try {
                String queryUpdate = "UPDATE estudios_realizados SET comisionado_sabatino_de=?, comisionado_sabatino_a=? WHERE curp = ?";
                PreparedStatement stmtUpdate;
                stmtUpdate = conn.prepareStatement(queryUpdate);

                stmtUpdate.setString(1, comisionadoSabatinoFechaDe);
                stmtUpdate.setString(2, comisionadoSabatinoFechaA);
                stmtUpdate.setString(3, curp);

                stmtUpdate.addBatch();
                stmtUpdate.executeBatch();

                // Cerrar objetos de resultados y consulta:
                stmtUpdate.close();
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return estado;

    }

    public String actualizarDatosAsignaturasSem1(String[] datos) {
        String asignatura1Sem1 = datos[0];
        String noGruposAtendidos1Sem1 = datos[1];
        String noAlumnosGrupo1Sem1 = datos[2];

        String asignatura2Sem1 = datos[3];
        String noGruposAtendidos2Sem1 = datos[4];
        String noAlumnosGrupo2Sem1 = datos[5];

        String asignatura3Sem1 = datos[6];
        String noGruposAtendidos3Sem1 = datos[7];
        String noAlumnosGrupo3Sem1 = datos[8];
        String curp = datos[9];
        String estado = "";

        abrirConexion();
        // Si la conexión fue exitosa:
        if (conn != null) {
            try {
                String queryUpdate = "UPDATE asignatura_semestre SET asignatura11=?, num_grupos_atendidos11=?, num_alumnos_grupo11=?, asignatura21=?, num_grupos_atendidos21=?, num_alumnos_grupo21=?, asignatura31=?, num_grupos_atendidos31=?, num_alumnos_grupo31=? WHERE curp = ?";
                PreparedStatement stmtUpdate;
                stmtUpdate = conn.prepareStatement(queryUpdate);

                stmtUpdate.setString(1, asignatura1Sem1);
                stmtUpdate.setString(2, noGruposAtendidos1Sem1);
                stmtUpdate.setString(3, noAlumnosGrupo1Sem1);
                stmtUpdate.setString(4, asignatura2Sem1);
                stmtUpdate.setString(5, noGruposAtendidos2Sem1);
                stmtUpdate.setString(6, noAlumnosGrupo2Sem1);
                stmtUpdate.setString(7, asignatura3Sem1);
                stmtUpdate.setString(8, noGruposAtendidos3Sem1);
                stmtUpdate.setString(9, noAlumnosGrupo3Sem1);
                stmtUpdate.setString(10, curp);

                stmtUpdate.addBatch();
                stmtUpdate.executeBatch();

                // Cerrar objetos de resultados y consulta:
                stmtUpdate.close();
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return estado;

    }

    public String actualizarDatosAsignaturasSem2(String[] datos) {
        String asignatura1Sem2 = datos[0];
        String noGruposAtendidos1Sem2 = datos[1];
        String noAlumnosGrupo1Sem2 = datos[2];

        String asignatura2Sem2 = datos[3];
        String noGruposAtendidos2Sem2 = datos[4];
        String noAlumnosGrupo2Sem2 = datos[5];

        String asignatura3Sem2 = datos[6];
        String noGruposAtendidos3Sem2 = datos[7];
        String noAlumnosGrupo3Sem2 = datos[8];
        String curp = datos[9];
        String estado = "";

        abrirConexion();
        // Si la conexión fue exitosa:
        if (conn != null) {
            try {
                String queryUpdate = "UPDATE asignatura_semestre SET asignatura12=?, num_grupos_atendidos12=?, num_alumnos_grupo12=?, asignatura22=?, num_grupos_atendidos22=?, num_alumnos_grupo22=?, asignatura32=?, num_grupos_atendidos32=?, num_alumnos_grupo32=? WHERE curp = ?";
                PreparedStatement stmtUpdate;
                stmtUpdate = conn.prepareStatement(queryUpdate);

                stmtUpdate.setString(1, asignatura1Sem2);
                stmtUpdate.setString(2, noGruposAtendidos1Sem2);
                stmtUpdate.setString(3, noAlumnosGrupo1Sem2);
                stmtUpdate.setString(4, asignatura2Sem2);
                stmtUpdate.setString(5, noGruposAtendidos2Sem2);
                stmtUpdate.setString(6, noAlumnosGrupo2Sem2);
                stmtUpdate.setString(7, asignatura3Sem2);
                stmtUpdate.setString(8, noGruposAtendidos3Sem2);
                stmtUpdate.setString(9, noAlumnosGrupo3Sem2);
                stmtUpdate.setString(10, curp);

                stmtUpdate.addBatch();
                stmtUpdate.executeBatch();

                // Cerrar objetos de resultados y consulta:
                stmtUpdate.close();
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return estado;

    }

    public String actualizarDatosAsignaturasSem3(String[] datos) {
        String asignatura1Sem3 = datos[0];
        String noGruposAtendidos1Sem3 = datos[1];
        String noAlumnosGrupo1Sem3 = datos[2];

        String asignatura2Sem3 = datos[3];
        String noGruposAtendidos2Sem3 = datos[4];
        String noAlumnosGrupo2Sem3 = datos[5];

        String asignatura3Sem3 = datos[6];
        String noGruposAtendidos3Sem3 = datos[7];
        String noAlumnosGrupo3Sem3 = datos[8];
        String curp = datos[9];
        String estado = "";

        abrirConexion();
        // Si la conexión fue exitosa:
        if (conn != null) {
            try {
                String queryUpdate = "UPDATE asignatura_semestre SET asignatura13=?, num_grupos_atendidos13=?, num_alumnos_grupo13=?, asignatura23=?, num_grupos_atendidos23=?, num_alumnos_grupo23=?, asignatura33=?, num_grupos_atendidos33=?, num_alumnos_grupo33=? WHERE curp = ?";
                PreparedStatement stmtUpdate;
                stmtUpdate = conn.prepareStatement(queryUpdate);

                stmtUpdate.setString(1, asignatura1Sem3);
                stmtUpdate.setString(2, noGruposAtendidos1Sem3);
                stmtUpdate.setString(3, noAlumnosGrupo1Sem3);
                stmtUpdate.setString(4, asignatura2Sem3);
                stmtUpdate.setString(5, noGruposAtendidos2Sem3);
                stmtUpdate.setString(6, noAlumnosGrupo2Sem3);
                stmtUpdate.setString(7, asignatura3Sem3);
                stmtUpdate.setString(8, noGruposAtendidos3Sem3);
                stmtUpdate.setString(9, noAlumnosGrupo3Sem3);
                stmtUpdate.setString(10, curp);

                stmtUpdate.addBatch();
                stmtUpdate.executeBatch();

                // Cerrar objetos de resultados y consulta:
                stmtUpdate.close();
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return estado;

    }

    public String actualizarDatosAsignaturasSem4(String[] datos) {
        String asignatura1Sem4 = datos[0];
        String noGruposAtendidos1Sem4 = datos[1];
        String noAlumnosGrupo1Sem4 = datos[2];

        String asignatura2Sem4 = datos[3];
        String noGruposAtendidos2Sem4 = datos[4];
        String noAlumnosGrupo2Sem4 = datos[5];

        String asignatura3Sem4 = datos[6];
        String noGruposAtendidos3Sem4 = datos[7];
        String noAlumnosGrupo3Sem4 = datos[8];
        String curp = datos[9];
        String estado = "";

        abrirConexion();
        // Si la conexión fue exitosa:
        if (conn != null) {
            try {
                String queryUpdate = "UPDATE asignatura_semestre SET asignatura14=?, num_grupos_atendidos14=?, num_alumnos_grupo14=?, asignatura24=?, num_grupos_atendidos24=?, num_alumnos_grupo24=?, asignatura34=?, num_grupos_atendidos34=?, num_alumnos_grupo34=? WHERE curp = ?";
                PreparedStatement stmtUpdate;
                stmtUpdate = conn.prepareStatement(queryUpdate);

                stmtUpdate.setString(1, asignatura1Sem4);
                stmtUpdate.setString(2, noGruposAtendidos1Sem4);
                stmtUpdate.setString(3, noAlumnosGrupo1Sem4);
                stmtUpdate.setString(4, asignatura2Sem4);
                stmtUpdate.setString(5, noGruposAtendidos2Sem4);
                stmtUpdate.setString(6, noAlumnosGrupo2Sem4);
                stmtUpdate.setString(7, asignatura3Sem4);
                stmtUpdate.setString(8, noGruposAtendidos3Sem4);
                stmtUpdate.setString(9, noAlumnosGrupo3Sem4);
                stmtUpdate.setString(10, curp);

                stmtUpdate.addBatch();
                stmtUpdate.executeBatch();

                // Cerrar objetos de resultados y consulta:
                stmtUpdate.close();
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return estado;

    }

    public String actualizarDatosAsignaturasSem5(String[] datos) {
        String asignatura1Sem5 = datos[0];
        String noGruposAtendidos1Sem5 = datos[1];
        String noAlumnosGrupo1Sem5 = datos[2];

        String asignatura2Sem5 = datos[3];
        String noGruposAtendidos2Sem5 = datos[4];
        String noAlumnosGrupo2Sem5 = datos[5];

        String asignatura3Sem5 = datos[6];
        String noGruposAtendidos3Sem5 = datos[7];
        String noAlumnosGrupo3Sem5 = datos[8];
        String curp = datos[9];
        String estado = "";

        abrirConexion();
        // Si la conexión fue exitosa:
        if (conn != null) {
            try {
                String queryUpdate = "UPDATE asignatura_semestre SET asignatura15=?, num_grupos_atendidos15=?, num_alumnos_grupo15=?, asignatura25=?, num_grupos_atendidos25=?, num_alumnos_grupo25=?, asignatura35=?, num_grupos_atendidos35=?, num_alumnos_grupo35=? WHERE curp = ?";
                PreparedStatement stmtUpdate;
                stmtUpdate = conn.prepareStatement(queryUpdate);

                stmtUpdate.setString(1, asignatura1Sem5);
                stmtUpdate.setString(2, noGruposAtendidos1Sem5);
                stmtUpdate.setString(3, noAlumnosGrupo1Sem5);
                stmtUpdate.setString(4, asignatura2Sem5);
                stmtUpdate.setString(5, noGruposAtendidos2Sem5);
                stmtUpdate.setString(6, noAlumnosGrupo2Sem5);
                stmtUpdate.setString(7, asignatura3Sem5);
                stmtUpdate.setString(8, noGruposAtendidos3Sem5);
                stmtUpdate.setString(9, noAlumnosGrupo3Sem5);
                stmtUpdate.setString(10, curp);

                stmtUpdate.addBatch();
                stmtUpdate.executeBatch();

                // Cerrar objetos de resultados y consulta:
                stmtUpdate.close();
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return estado;

    }

    public String actualizarDatosAsignaturasSem6(String[] datos) {
        String asignatura1Sem6 = datos[0];
        String noGruposAtendidos1Sem6 = datos[1];
        String noAlumnosGrupo1Sem6 = datos[2];

        String asignatura2Sem6 = datos[3];
        String noGruposAtendidos2Sem6 = datos[4];
        String noAlumnosGrupo2Sem6 = datos[5];

        String asignatura3Sem6 = datos[6];
        String noGruposAtendidos3Sem6 = datos[7];
        String noAlumnosGrupo3Sem6 = datos[8];
        String curp = datos[9];
        String estado = "";

        abrirConexion();
        // Si la conexión fue exitosa:
        if (conn != null) {
            try {
                String queryUpdate = "UPDATE asignatura_semestre SET asignatura16=?, num_grupos_atendidos16=?, num_alumnos_grupo16=?, asignatura26=?, num_grupos_atendidos26=?, num_alumnos_grupo26=?, asignatura36=?, num_grupos_atendidos36=?, num_alumnos_grupo36=? WHERE curp = ?";
                PreparedStatement stmtUpdate;
                stmtUpdate = conn.prepareStatement(queryUpdate);

                stmtUpdate.setString(1, asignatura1Sem6);
                stmtUpdate.setString(2, noGruposAtendidos1Sem6);
                stmtUpdate.setString(3, noAlumnosGrupo1Sem6);
                stmtUpdate.setString(4, asignatura2Sem6);
                stmtUpdate.setString(5, noGruposAtendidos2Sem6);
                stmtUpdate.setString(6, noAlumnosGrupo2Sem6);
                stmtUpdate.setString(7, asignatura3Sem6);
                stmtUpdate.setString(8, noGruposAtendidos3Sem6);
                stmtUpdate.setString(9, noAlumnosGrupo3Sem6);
                stmtUpdate.setString(10, curp);

                stmtUpdate.addBatch();
                stmtUpdate.executeBatch();

                // Cerrar objetos de resultados y consulta:
                stmtUpdate.close();
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return estado;

    }

    public String actualizarDatosIdioma(String[] datos) {
        String lenguaMaternaNuevo = datos[0];

        String idioma1Nuevo = datos[1];
        String lecturaIdioma1Nuevo = datos[2];
        String escrituraIdioma1Nuevo = datos[3];
        String habladoIdioma1Nuevo = datos[4];

        String idioma2Nuevo = datos[5];
        String lecturaIdioma2Nuevo = datos[6];
        String escrituraIdioma2Nuevo = datos[7];
        String habladoIdioma2Nuevo = datos[8];
        String curp = datos[9];
        String estado = "";

        abrirConexion();
        // Si la conexión fue exitosa:
        if (conn != null) {
            try {
                String queryUpdate = "UPDATE idiomas SET lengua_materna=?, idioma1=?, lectura1=?, escritura1=?, hablado1=?, idioma2=?, lectura2=?, escritura2=?, hablado2=? WHERE curp = ?";
                PreparedStatement stmtUpdate;
                stmtUpdate = conn.prepareStatement(queryUpdate);

                stmtUpdate.setString(1, lenguaMaternaNuevo);
                stmtUpdate.setString(2, idioma1Nuevo);
                stmtUpdate.setString(3, lecturaIdioma1Nuevo);
                stmtUpdate.setString(4, escrituraIdioma1Nuevo);
                stmtUpdate.setString(5, habladoIdioma1Nuevo);
                stmtUpdate.setString(6, idioma2Nuevo);
                stmtUpdate.setString(7, lecturaIdioma2Nuevo);
                stmtUpdate.setString(8, escrituraIdioma2Nuevo);
                stmtUpdate.setString(9, habladoIdioma2Nuevo);
                stmtUpdate.setString(10, curp);

                stmtUpdate.addBatch();
                stmtUpdate.executeBatch();

                // Cerrar objetos de resultados y consulta:
                stmtUpdate.close();
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return estado;

    }

    public String actualizarDatosOtraInstitucion(String[] datos) {
        String institucionNuevo = datos[0];
        String nivelEducativoNuevo = datos[1];
        String subsistemaNuevo = datos[2];
        String tipoSostenimientoNuevo = datos[3];
        String asignaturaNuevo = datos[4];
        String horasAsignadasNuevo = datos[5];
        String curp = datos[6];
        String estado = "";

        abrirConexion();
        // Si la conexión fue exitosa:
        if (conn != null) {
            try {
                String queryUpdate = "UPDATE otra_institucion SET institucion_otra_ins=?, nivel_educativo_otra_ins=?, subsistema_otra_ins=?, tipo_sostenimiento_otra_ins=?, asignatura_otra_ins=?, horas_impartidas_otra_ins=? WHERE curp = ?";
                PreparedStatement stmtUpdate;
                stmtUpdate = conn.prepareStatement(queryUpdate);

                stmtUpdate.setString(1, institucionNuevo);
                stmtUpdate.setString(2, nivelEducativoNuevo);
                stmtUpdate.setString(3, subsistemaNuevo);
                stmtUpdate.setString(4, tipoSostenimientoNuevo);
                stmtUpdate.setString(5, asignaturaNuevo);
                stmtUpdate.setString(6, horasAsignadasNuevo);
                stmtUpdate.setString(7, curp);

                stmtUpdate.addBatch();
                stmtUpdate.executeBatch();

                // Cerrar objetos de resultados y consulta:
                stmtUpdate.close();
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return estado;

    }

    public String actualizarDatosExperienciaLaboral(String[] datos) {
        String nombreInstitucionNuevo = datos[0];
        String puestoNuevo = datos[1];
        String añosLaboradosNuevo = datos[2];
        String curp = datos[3];
        String estado = "";

        abrirConexion();
        // Si la conexión fue exitosa:
        if (conn != null) {
            try {
                String queryUpdate = "UPDATE experiencia_laboral SET nom_institucion_laboral=?, puesto_laboral=?, años_laboral=? WHERE curp = ?";
                PreparedStatement stmtUpdate;
                stmtUpdate = conn.prepareStatement(queryUpdate);

                stmtUpdate.setString(1, nombreInstitucionNuevo);
                stmtUpdate.setString(2, puestoNuevo);
                stmtUpdate.setString(3, añosLaboradosNuevo);
                stmtUpdate.setString(4, curp);

                stmtUpdate.addBatch();
                stmtUpdate.executeBatch();

                // Cerrar objetos de resultados y consulta:
                stmtUpdate.close();
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return estado;

    }

    public List<Comentarios> cargarComentarios(String estado) {
        String status = estado;

        List<Comentarios> listaComentarios = new ArrayList();

        switch (status) {
            case "todos":
                //Abrir conexión:
                abrirConexion();

                //Si la conexión fue exitosa:
                if (conn != null) {
                    try {
                        Statement stmt = conn.createStatement();
                        String query = "SELECT * FROM comentarios";
                        ResultSet rs = stmt.executeQuery(query);
                        while (rs.next()) {
                            listaComentarios.add(new Comentarios(rs.getString("id_comentarios"),
                                    rs.getString("fecha"),
                                    rs.getString("nombre"),
                                    rs.getString("ap_paterno"),
                                    rs.getString("ap_materno"),
                                    rs.getString("curp"),
                                    rs.getString("e_mail"),
                                    rs.getString("subsistema"),
                                    rs.getString("nombre_plantel"),
                                    rs.getString("comentario"),
                                    rs.getString("estado")));
                        }

                        //Cerrar objetos de resultados y consulta:
                        rs.close();
                        stmt.close();

                    } catch (SQLException sqlExp) {
                        System.out.println(sqlExp.getMessage());
                    }
                }

                //Cerrar conexión:
                cerrarConexion();

                break;

            case "pendientes":
                //Abrir conexión:
                abrirConexion();

                //Si la conexión fue exitosa:
                if (conn != null) {
                    try {
                        Statement stmt = conn.createStatement();
                        String query = "SELECT * FROM comentarios WHERE estado='Pendiente'";
                        ResultSet rs = stmt.executeQuery(query);
                        while (rs.next()) {
                            listaComentarios.add(new Comentarios(rs.getString("id_comentarios"),
                                    rs.getString("fecha"),
                                    rs.getString("nombre"),
                                    rs.getString("ap_paterno"),
                                    rs.getString("ap_materno"),
                                    rs.getString("curp"),
                                    rs.getString("e_mail"),
                                    rs.getString("subsistema"),
                                    rs.getString("nombre_plantel"),
                                    rs.getString("comentario"),
                                    rs.getString("estado")));
                        }

                        //Cerrar objetos de resultados y consulta:
                        rs.close();
                        stmt.close();

                    } catch (SQLException sqlExp) {
                        System.out.println(sqlExp.getMessage());
                    }
                }

                //Cerrar conexión:
                cerrarConexion();
                break;

            case "atendidos":
                //Abrir conexión:
                abrirConexion();

                //Si la conexión fue exitosa:
                if (conn != null) {
                    try {
                        Statement stmt = conn.createStatement();
                        String query = "SELECT * FROM comentarios WHERE estado='Atendido'";
                        ResultSet rs = stmt.executeQuery(query);
                        while (rs.next()) {
                            listaComentarios.add(new Comentarios(rs.getString("id_comentarios"),
                                    rs.getString("fecha"),
                                    rs.getString("nombre"),
                                    rs.getString("ap_paterno"),
                                    rs.getString("ap_materno"),
                                    rs.getString("curp"),
                                    rs.getString("e_mail"),
                                    rs.getString("subsistema"),
                                    rs.getString("nombre_plantel"),
                                    rs.getString("comentario"),
                                    rs.getString("estado")));
                        }

                        //Cerrar objetos de resultados y consulta:
                        rs.close();
                        stmt.close();

                    } catch (SQLException sqlExp) {
                        System.out.println(sqlExp.getMessage());
                    }
                }

                //Cerrar conexión:
                cerrarConexion();
                break;

        }

        return listaComentarios;
    }

    public String marcarComentarioVisto(String id) {
        String estado = "";
        String ID = id;
        abrirConexion();
        // Si la conexión fue exitosa:
        if (conn != null) {
            try {
                String queryUpdate = "UPDATE comentarios SET estado=? WHERE id_comentarios = ?";
                PreparedStatement stmtUpdate;
                stmtUpdate = conn.prepareStatement(queryUpdate);

                stmtUpdate.setString(1, "Atendido");
                stmtUpdate.setString(2, ID);

                stmtUpdate.addBatch();
                stmtUpdate.executeBatch();

                // Cerrar objetos de resultados y consulta:
                stmtUpdate.close();
                cerrarConexion();
                estado = "Ok";
            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        return estado;

    }

    public List<Docentes> busquedaDocentesCurp(String criterio) {
        String busqueda = criterio;
        List<Docentes> listaDocentes = new ArrayList();

        //Abrir conexión:
        abrirConexion();

        //Si la conexión fue exitosa:
        if (conn != null) {
            try {

                String query = "SELECT curp,estatus,apellido_p, apellido_m, nombre1, nombre2, sexo, telefono_local, municipio_residencia, estado_residencia FROM datos_generales WHERE curp LIKE ?";
                PreparedStatement stmt = conn.prepareStatement(query);

                stmt.setString(1, busqueda + "%");
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    listaDocentes.add(new Docentes(rs.getString("curp"),
                            rs.getString("estatus"),
                            rs.getString("apellido_p"),
                            rs.getString("apellido_m"),
                            rs.getString("nombre1"),
                            rs.getString("nombre2"),
                            rs.getString("sexo"),
                            rs.getString("telefono_local"),
                            rs.getString("municipio_residencia"),
                            rs.getString("estado_residencia")));
                }

                //Cerrar objetos de resultados y consulta:
                rs.close();
                stmt.close();

            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        //Cerrar conexión:
        cerrarConexion();

        return listaDocentes;
    }

    public List<Comentarios> cargarComentariosCurpDocentes(String curp) {
        String Curp = curp;

        List<Comentarios> listaComentarios = new ArrayList();
        //Abrir conexión:
        abrirConexion();

        //Si la conexión fue exitosa:
        if (conn != null) {
            try {

                String query = "SELECT * FROM comentarios WHERE curp=?";
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, Curp);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    listaComentarios.add(new Comentarios(rs.getString("id_comentarios"),
                            rs.getString("fecha"),
                            rs.getString("nombre"),
                            rs.getString("ap_paterno"),
                            rs.getString("ap_materno"),
                            rs.getString("curp"),
                            rs.getString("e_mail"),
                            rs.getString("subsistema"),
                            rs.getString("nombre_plantel"),
                            rs.getString("comentario"),
                            rs.getString("estado")));
                }

                //Cerrar objetos de resultados y consulta:
                rs.close();
                stmt.close();

            } catch (SQLException sqlExp) {
                System.out.println(sqlExp.getMessage());
            }
        }

        //Cerrar conexión:
        cerrarConexion();

        return listaComentarios;
    }
}
