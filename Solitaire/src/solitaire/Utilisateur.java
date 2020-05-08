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
    
    public Utilisateur(){
        this.paquet = new Paquet();
    }
    
    /**
     * Crypte le message donné par l'utilisateur
     * @param message message a crypter
     * @return message crypté
     */
    public Message crypter(String message) {
        Message res = new Message(message);
        String message_resultat = "";
        String masque_jetable = this.getPaquet().creerMasqueJetable(message.length());
        res.setMasqueJetable(masque_jetable);
        
        int valeurChar = 0;
        for(int i=0; i<message.length(); i++) {
            valeurChar = (message.toUpperCase().charAt(i) - 65) + (masque_jetable.charAt(i) - 65);
            if(valeurChar < 26) message_resultat+=(char)(valeurChar + 65);
            else message_resultat+=(char)((valeurChar -26) + 65);
        }
        res.setMessageArrivee(message_resultat);
        
        return res;
    }
    
    /**
     * Décrypte le message reçu par l'utilisateur
     * @param message message a decrypter
     * @return message décrypté
     */
    public Message decrypter(String message) {
        Message res = new Message(message);
        String message_resultat = "";
        String masque_jetable = this.getPaquet().creerMasqueJetable(message.length());
        res.setMasqueJetable(masque_jetable);
        
        int valeurChar = 0;
        for(int i=0; i<message.length(); i++) {
            valeurChar = (message.toUpperCase().charAt(i) - 65) - (masque_jetable.toUpperCase().charAt(i) - 65);
            if(valeurChar > 0) message_resultat+=(char)((valeurChar) + 65);
            else message_resultat+=(char)((valeurChar + 26) + 65);
        }
        res.setMessageArrivee(message_resultat);
        
        return res;
    }
    
    public Paquet getPaquet() {
        return this.paquet;
    }
    
    public void setPaquet(Paquet p) {
        this.paquet = p;
    }
}
