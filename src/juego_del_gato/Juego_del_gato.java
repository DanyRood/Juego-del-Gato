/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_del_gato;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import juego_del_gato.Interfaz;

public class Juego_del_gato {
    
    //permite crear mensajes para el seguimiento o registro de la ejecución de una aplicación
    private static final Logger LOG = Logger.getLogger(Juego_del_gato.class.getName());
    
    public static void main(String[] args) {
        try{
            //que determina el Look-and-Fee, es decir, la apariencia en pantalla y funcionamiento, que van a tener los Componentes Swing de ese ejecutable
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");   
            //registrar un mensaje.
            LOG.info("Inicio de Juego del Gato");
            //Lammada clases INterfaz y controlador
            Interfaz view = new Interfaz();
            Controlador controller = new Controlador(view);
            view.Controlador(controller);
            view.setVisible(true);
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex){
            Logger.getLogger(Juego_del_gato.class.getName()).log(Level.SEVERE, "Error de ejecución");
        }
    }
    
    @Override
    public String toString(){
        return "Created by DanyV_JD smart pataforma: Start_Juego de gato{" + '}';
    }
    
}
