/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecucion;


import data.*;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import ui.UI;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.*;
import juegos.Juegos;
import ui.Principal;
import ui.UI;

/**
 *
 * @author Felipe
 */
public class Main extends JFrame {
    private static UI ui;
    public static ArrayList<usuario> listaUsuarios = new ArrayList<usuario>();


    private static void selectUI() {
        ui = new UI();//Llamado a UI
    }
    
    public void unit() throws FileNotFoundException{
      
        add(new Juegos());
        setSize(500, 500);
        setResizable(true);
       
        setTitle("LABERINTO MATIC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
    }
    public static void main(String[] args) throws FileNotFoundException {
        
        ui.Principal principal = new  Principal();
        principal.setVisible(true);
        //new Juegos();
    }
    
    //Arreglos para las listas de objetos
    public static ArrayList<usuario> listaPersonas = new ArrayList<usuario>();
     //Funciones que se llaman desde UI
    public static void agregarUsuario(String nombre,String nick,String edad) {
        listaPersonas.add(new usuario(nombre, nick, edad));
    }
   
    
    public static ArrayList<usuario> getPersonas() {
        return listaPersonas;
    }
    
}
