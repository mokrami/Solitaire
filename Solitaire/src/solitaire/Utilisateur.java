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
public class Utilisateur {
    
    private Paquet paquet;
    
    /**
     * Crypte le message donné par l'utilisateur
     * @param message message a crypter
     * @return message crypté
     */
    public String crypter(String message) {
        String message_resultat = "";
        String masque_jetable = this.getPaquet().creerMasqueJetable(message.length());
        int valeurChar = 0;
        for(int i=0; i<message.length(); i++) {
            System.out.println(message.toUpperCase().charAt(i) + " : " + (message.toUpperCase().charAt(i) - 65));
            System.out.println(masque_jetable.charAt(i) + " : " + (masque_jetable.charAt(i) - 65));
            valeurChar = (message.toUpperCase().charAt(i) - 65) + (masque_jetable.charAt(i) - 65);
            System.out.println("VALEUR : " + valeurChar);
            if(valeurChar < 26) message_resultat+=(char)(valeurChar + 65);
            else message_resultat+=(char)((valeurChar -26) + 65);
        }
        return message_resultat;
    }
    
    /**
     * Décrypte le message reçu par l'utilisateur
     * @param message message a decrypter
     * @return message décrypté
     */
    public String decrypter(String message) {
        String message_resultat = "";
        String masque_jetable = this.getPaquet().creerMasqueJetable(message.length());
        int valeurChar = 0;
        for(int i=0; i<message.length(); i++) {
            System.out.println(message.toUpperCase().charAt(i) + " : " + (message.toUpperCase().charAt(i) - 65));
            System.out.println(masque_jetable.charAt(i) + " : " + (masque_jetable.charAt(i) - 65));
            valeurChar = (message.toUpperCase().charAt(i) - 65) - (masque_jetable.charAt(i) - 65);
            System.out.println("VALEUR : " + valeurChar);
            if(valeurChar < 26) message_resultat+=(char)(valeurChar + 65);
            else message_resultat+=(char)((valeurChar -26) + 65);
        }
        return message_resultat;
    }
    
    public Paquet getPaquet() {
        return this.paquet;
    }
    
    public void setPaquet(Paquet p) {
        this.paquet = p;
    }
}
