/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB7-PC6-USER
 */
public class FormacionPrimosSuma {
    public static boolean esPrimo(int numero) {
       //int cont=2;
        boolean resp=true;
        for(int i=2; i<numero-1; i++){
           if(numero%i==0){
               resp=false;
           }
       }
        return resp;
    }
    public static void todosPrimos() {
        int tope=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tope"));
        //String acu=" ";
        ArrayList<Integer> acu=new ArrayList<>();
        for(int i=0; i<tope; i++){
            if(esPrimo(i)==true){
                //acu+=" "+1;
                acu.add(i);
            }
        }
        JOptionPane.showMessageDialog(null, Arrays.toString(acu.toArray()));
    }
    public static void menu() {
        String opciones="1.- Es primo\n"
                + "2.- Salir";
        int op=Integer.parseInt(JOptionPane.showInputDialog(opciones));
        switch(op){
            case 1:
                JOptionPane.showMessageDialog(null,"¿es primo:?"+ esPrimo(Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"))));
                break;
            case 2:
                break;
        }
    }
        
}
