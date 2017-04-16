/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep;

/**
 *
 * @author J.JNAVARRETE
 */
public class Usuarios {

    public String id;
    public String nombre;
    public String dependencia;
    public String email;
    public String telefono;
    public String tipoUsuario;
    public String curp;
    public String usuario;

    public Usuarios(String id, String nombre, String dependencia, String email, String telefono, String tipoUsuario, String curp, String usuario) {
        this.id=id;
        this.nombre = nombre;
        this.dependencia = dependencia;
        this.email = email;
        this.telefono = telefono;
        this.tipoUsuario = tipoUsuario;
        this.curp = curp;
        this.usuario = usuario;
    }
    
    

}
