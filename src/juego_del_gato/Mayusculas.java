/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_del_gato;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author gary9
 */
public class Mayusculas implements KeyListener{
    
    public void keyTyped(KeyEvent evt) {
        char c = evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad = (""+c).toUpperCase();
            c=cad.charAt(0);
            evt.setKeyChar(c);
        }
    }
    
     @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
}
