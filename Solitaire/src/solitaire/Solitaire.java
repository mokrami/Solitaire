/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitaire;

import javax.swing.ImageIcon;

/**
 *
 * @author im678382
 */
public class Solitaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InterfaceGraphique appU1 = new InterfaceGraphique();
        appU1.setVisible(true);
        
        InterfaceGraphique appU2 = new InterfaceGraphique();
        appU2.setVisible(true);
               
        Paquet p = new Paquet();
        System.out.println(p.getPaquetS());
        Afficher a = new Afficher(p);
        a.setVisible(true);

             
    }
    
}
