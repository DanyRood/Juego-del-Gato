/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_del_gato;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public final class Controlador implements ActionListener{
    
    private final Interfaz Object;
    public int variable = 1, Fin = 0;
    
    public int conx1 = 0, conx2 = 0, conx3 = 0, conx4 = 0, conx5 = 0, conx6 = 0, conx7 = 0, conx8 = 0;
    public int cono1 = 0, cono2 = 0, cono3 = 0, cono4 = 0, cono5 = 0, cono6 = 0, cono7 = 0, cono8 = 0;
    
    public String Sel;
    
    public Controlador(Interfaz object){
        Object = object;
        JOptionPane.showMessageDialog(null, "Bienvenido jugemos un juego");
        JOptionPane.showMessageDialog(null, "El jugador 1 empieza juego, si no se elije X o O, se tomara automaticamente la X");
        Object.N1.setEnabled(false);
        Object.N2.setEnabled(false);
        Object.X.setEnabled(false);
        Object.O.setEnabled(false);        
        Object.Emp_Jue.setEnabled(false);
        
        Object.B1.setEnabled(false);
        Object.B2.setEnabled(false);
        Object.B3.setEnabled(false);
        Object.B4.setEnabled(false);
        Object.B5.setEnabled(false);
        Object.B6.setEnabled(false);
        Object.B7.setEnabled(false);
        Object.B8.setEnabled(false);
        Object.B9.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        switch (event.getActionCommand()) {
            case "B1":
                Object.B1.setEnabled(false);
                Object.B1.setText(Seleccion());
                if(Sel.equals("X")){
                    conx1 = conx1 + 1;
                    conx4 = conx4 + 1;
                    conx7 = conx7 + 1;
                }else{
                    cono1 = cono1 + 1;
                    cono4 = cono4 + 1;
                    cono7 = cono7 + 1;
                }
                Fin++;
                Validacion();
                break;
            case "B2":
                Object.B2.setEnabled(false);
                Object.B2.setText(Seleccion());
                if(Sel.equals("X")){
                    conx1 = conx1 + 1;
                    conx5 = conx5 + 1;
                }else{
                    cono1 = cono1 + 1;
                    cono5 = cono5 + 1;
                }
                Fin++;
                Validacion();
                break;
            case "B3":
                Object.B3.setEnabled(false);
                Object.B3.setText(Seleccion());
                if(Sel.equals("X")){
                    conx1 = conx1 + 1;
                    conx6 = conx6 + 1;
                    conx8 = conx8 + 1;
                }else{
                    cono1 = cono1 + 1;
                    cono6 = cono6 + 1;
                    cono8 = cono8 + 1;
                }
                Fin++;
                Validacion();
                break;
            case "B4":
                Object.B4.setEnabled(false);
                Object.B4.setText(Seleccion());
                if(Sel.equals("X")){
                    conx2 = conx2 + 1;
                    conx4 = conx4 + 1;
                }else{
                    cono2 = cono2 + 1;
                    cono4 = cono4 + 1;
                }
                Fin++;
                Validacion();
                break;
            case "B5":
                Object.B5.setEnabled(false);
                Object.B5.setText(Seleccion());
                if(Sel.equals("X")){
                    conx2 = conx2 + 1;
                    conx5 = conx5 + 1;
                    conx6 = conx6 + 1;
                    conx7 = conx7 + 1;
                    conx8 = conx8 + 1;
                }else{
                    cono2 = cono2 + 1;
                    cono5 = cono5 + 1;
                    cono6 = cono6 + 1;
                    cono7 = cono7 + 1;
                    cono8 = cono8 + 1;
                }
                Fin++;
                Validacion();
                break;
            case "B6":
                Object.B6.setEnabled(false);
                Object.B6.setText(Seleccion());
                if(Sel.equals("X")){
                    conx2 = conx2 + 1;
                    conx6 = conx6 + 1;
                }else{
                    cono2 = cono2 + 1;
                    cono6 = cono6 + 1;
                }
                Fin++;
                Validacion();
                break;
            case "B7":
                Object.B7.setEnabled(false);
                Object.B7.setText(Seleccion());
                if(Sel.equals("X")){
                    conx3 = conx3 + 1;
                    conx4 = conx4 + 1;
                    conx8 = conx8 + 1;
                }else{
                    cono3 = cono3 + 1;
                    cono4 = cono4 + 1;
                    cono8 = cono8 + 1;
                }
                Fin++;
                Validacion();
                break;
            case "B8":
                Object.B8.setEnabled(false);
                Object.B8.setText(Seleccion());
                if(Sel.equals("X")){
                    conx3 = conx3 + 1;
                    conx5 = conx5 + 1;
                }else{
                    cono3 = cono3 + 1;
                    cono5 = cono5 + 1;
                }
                Fin++;
                Validacion();
                break;
            case "B9":
                Object.B9.setEnabled(false);
                Object.B9.setText(Seleccion());
                if(Sel.equals("X")){
                    conx3 = conx3 +1;
                    conx6 = conx6 +1;
                    conx7 = conx7 +1;
                }else{
                    cono3 = cono3 +1;
                    cono6 = cono6 +1;
                    cono7 = cono7 +1;
                }
                Fin++;
                Validacion();
                break;
            case "Comenzar":
                Vacio();
                break;
            case "JuegoNuevo":
                Object.N1.setEnabled(true);
                Object.N2.setEnabled(true);
                Object.Emp_Jue.setEnabled(true);
                Object.Emp_Nue.setEnabled(false);
                Object.X.setEnabled(true);
                Object.O.setEnabled(true); 
                
                Object.B1.setEnabled(false);
                Object.B2.setEnabled(false);
                Object.B3.setEnabled(false);
                Object.B4.setEnabled(false);
                Object.B5.setEnabled(false);
                Object.B6.setEnabled(false);
                Object.B7.setEnabled(false);
                Object.B8.setEnabled(false);
                Object.B9.setEnabled(false);
                
                Object.B1.setText("");
                Object.B2.setText("");
                Object.B3.setText("");
                Object.B4.setText("");
                Object.B5.setText("");
                Object.B6.setText("");
                Object.B7.setText("");
                Object.B8.setText("");
                Object.B9.setText("");
                break;
            case "X":
                Object.X.setEnabled(false);
                Object.O.setEnabled(false);
                variable = 1;
                break;
            case "O":
                Object.X.setEnabled(false);
                Object.O.setEnabled(false);
                variable = 2;
                break;
        }
    }
    
    public String Seleccion (){
        if(variable == 1){
            Sel = "X";
            variable = 2;
        }else{
            Sel = "O";
            variable = 1;
        }
        return Sel;
    }
    
    public void Validacion(){
        if (conx1 == 3 || conx2 == 3 || conx3 == 3 || conx4 == 3 || conx5 == 3 || conx6 == 3 || conx7 == 3 || conx8 == 3){
            JOptionPane.showMessageDialog(null, "Felicidades Gano Jugador 1: " + Object.N1.getText());
            Inicializacion();
        }
        if (cono1 == 3 || cono2 == 3 || cono3 == 3 || cono4 == 3 || cono5 == 3 || cono6 == 3 || cono7 == 3 || cono8 == 3){
            JOptionPane.showMessageDialog(null, "Felicidades Gano Jugador 2: " + Object.N2.getText());
            Inicializacion();
        }
        if (Fin == 9){
            JOptionPane.showMessageDialog(null, "Nadie gano suerte para la proxima");
            Inicializacion();
        }
    }
    
    public void Inicializacion (){
        cono1 = 0; 
        cono2 = 0;
        cono3 = 0;
        cono4 = 0; 
        cono5 = 0;
        cono6 = 0;
        cono7 = 0;
        cono8 = 0;
        conx1 = 0; 
        conx2 = 0;
        conx3 = 0;
        conx4 = 0; 
        conx5 = 0;
        conx6 = 0;
        conx7 = 0;
        conx8 = 0;
        
        Object.B1.setEnabled(false);
        Object.B2.setEnabled(false);
        Object.B3.setEnabled(false);
        Object.B4.setEnabled(false);
        Object.B5.setEnabled(false);
        Object.B6.setEnabled(false);
        Object.B7.setEnabled(false);
        Object.B8.setEnabled(false);
        Object.B9.setEnabled(false);
        
        variable = 1;
        Fin =0;
    }
    
    public void Vacio(){
        if(Object.N1.getText().equals("") || Object.N2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Llene cuadros vacios");        
        }else{
            Object.Emp_Nue.setEnabled(true);
            Object.N1.setEnabled(false);
            Object.N2.setEnabled(false);
            Object.Emp_Jue.setEnabled(false);
            Object.X.setEnabled(false);
            Object.O.setEnabled(false);
                
            Object.B1.setEnabled(true);
            Object.B2.setEnabled(true);
            Object.B3.setEnabled(true);
            Object.B4.setEnabled(true);
            Object.B5.setEnabled(true);
            Object.B6.setEnabled(true);
            Object.B7.setEnabled(true);
            Object.B8.setEnabled(true);
            Object.B9.setEnabled(true);
        }
    }
}
