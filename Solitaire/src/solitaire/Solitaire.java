/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitaire;

/**
 *
 * @author im678382
 */
public class Solitaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paquet paquet;
        paquet =  new Paquet();
        //System.out.println(paquet.creerMasqueJetable(5));
        Utilisateur utilisateur1 = new Utilisateur();
        Utilisateur utilisateur2 = new Utilisateur();
        utilisateur1.setPaquet(paquet);
        utilisateur2.setPaquet(paquet);
        String message = utilisateur1.crypter("bonjour");
        System.out.println(message);
        System.out.println("*==========================*");
        message = utilisateur2.decrypter(message);
        System.out.println(message);
    }
    
}
