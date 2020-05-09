/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitaire;

import java.util.Base64;

/**
 *
 * @author im678382
 */
public class Solitaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*InterfaceGraphique appU1 = new InterfaceGraphique();
        appU1.setVisible(true);
        
        InterfaceGraphique appU2 = new InterfaceGraphique();
        appU2.setVisible(true);
        
        byte[] bytes = "hello world".getBytes();*/
 
        //Convert byte[] to String
        //String s = Base64.getEncoder().encodeToString(bytes);

        //byte b1 = (byte) 255;
        //String s1 = String.format("%8s", Integer.toBinaryString(b1 & 0xFF)).replace(' ', '0');
        //System.out.println(Math.floorMod(-63,255)); // 10000001
                
        Utilisateur u1 = new Utilisateur();
        Utilisateur u2 = new Utilisateur();
        u2.setPaquet(new Paquet(u1.getPaquet().getPaquetS()));
        //byte[] tmp = u1.crypter("A,Z".getBytes());
        //String res = new String(u2.decrypter(tmp));
        Message m1 = u1.crypterAvecBytes("S,a1ut ?");
        Message m2 = u2.decrypterAvecBytes(m1.getMessageArrivee());
        System.out.println(m2.getMessageArrivee());
        
    }
    
}
