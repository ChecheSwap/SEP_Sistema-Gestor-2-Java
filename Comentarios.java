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
public class Comentarios {

    String id;
    String fecha;
    String nombre;
    String apellidoP;
    String apellidoM;
    String curp;
    String email;
    String subsistema;
    String plantel;
    String comentario;
    String estado;

    public Comentarios(String id, String fecha, String nombre, String apellidoP, String apellidoM, String curp, String email, String subsistema, String plantel, String comentario, String estado) {
        this.id = id;
        this.fecha = fecha;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.curp = curp;
        this.email = email;
        this.subsistema = subsistema;
        this.plantel = plantel;
        this.comentario = comentario;
        this.estado = estado;
    }

}
