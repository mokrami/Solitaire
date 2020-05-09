/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitaire;

import java.text.Normalizer;
import java.util.HashMap;
import java.util.regex.Pattern;

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
        String msg = this.formatte(message);
        Message res = new Message(msg);
        String message_resultat = "";
        String masque_jetable = this.getPaquet().creerMasqueJetable(msg.length());
        res.setMasqueJetable(masque_jetable);
        
        int valeurChar = 0;
        for(int i=0; i<msg.length(); i++) {
            valeurChar = (msg.charAt(i) - 65) + (masque_jetable.charAt(i) - 65);
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
        Message res = new Message(message.toUpperCase());
        String message_resultat = "";
        String masque_jetable = this.getPaquet().creerMasqueJetable(message.length());
        res.setMasqueJetable(masque_jetable);
        
        int valeurChar = 0;
        for(int i=0; i<message.length(); i++) {
            valeurChar = (message.charAt(i) - 65) - (masque_jetable.charAt(i) - 65);
            if(valeurChar >= 0) message_resultat+=(char)((valeurChar) + 65);
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
   
    public String formatte(String s) 
    {
        HashMap<Character,String> dico = new HashMap<>();
        //source : http://java.mesexemples.com/java-basic/formatage-de-sortie/java-remplacer-les-accents-dun-chaine-de-caractere/
        String strTemp = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        
        dico.put('.', "POINT");
        dico.put('!', "EXCLAMATION");
        dico.put(',', "VIRGULE");
        dico.put(':', "DEUXPOINTS");
        dico.put('?', "INTERROGATION");
        dico.put('-', "TIRET");
        dico.put('_', "UNDERSCORE");
        dico.put('=', "EGAL");
        dico.put('\'', "APOSTROPHE");
        dico.put('&', "ET");
        dico.put('~', "TILDE");
        dico.put('+', "PLUS");
        dico.put('@', "AROBASE");
        dico.put('(', "PARENTHESE");
        dico.put(')', "PARENTHESE");
        dico.put('[', "CROCHET");
        dico.put(']', "CROCHET");
        dico.put('€', "EURO");
        dico.put('$', "DOLLAR");
        dico.put('£', "LIVRE");
        dico.put('%', "POURCENTS");
        dico.put('*', "ETOILE");
        dico.put('/', "SLASH");
        dico.put('>', "SUPERIEUR");
        dico.put('<', "INFERIEUR");
        dico.put('0', "ZERO");
        dico.put('1', "UN");
        dico.put('2', "DEUX");
        dico.put('3', "TROIS");
        dico.put('4', "QUATRE");
        dico.put('5', "CINQ");
        dico.put('6', "SIX");
        dico.put('7', "SEPT");
        dico.put('8', "HUIT");
        dico.put('9', "NEUF");
        
        String tmp = pattern.matcher(strTemp).replaceAll("");
        String chaine = "";
        String corres;
        for(char c : tmp.toCharArray()){
            corres = dico.get(c);
            chaine += (corres != null) ? corres : c;
        }
        chaine = chaine.replaceAll("[^\\w]","");
        
        return chaine.toUpperCase();
    }
 
}
