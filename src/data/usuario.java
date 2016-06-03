/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class usuario implements Serializable {//Crea clase USUARIO 
    private String nombre;
    private String edad;
    private String nick;

    
    public usuario(String nombre) {
        this.nombre = nombre;
    }

    public usuario( String nombre,String nick,String edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nick = nick;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }


    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
    
}
