/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitaire;

import java.math.BigInteger;
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
    
    public byte[] crypter(byte[] message){
        byte[] message_resultat = new byte[message.length];
        int masque;
        int a, b;    
        
        for(int i=0; i<message.length; i++){
            int octet = message[i] & 0xFF;
            a = (this.getPaquet().genererUneLettreAleatoire()-65)%16;
            b = (this.getPaquet().genererUneLettreAleatoire()-65)%16;
            masque = 16*a+b;
            message_resultat[i] = (byte) ((octet + masque)%255);
        }
        
        return message_resultat;
    }
    
    public Message crypterAvecBytes(String msg){
        byte[] message = msg.getBytes();
        int masque;
        int a, b;    
        String version_binaire = "";
        String masque_jetable = "";
        
        for(int i=0; i<message.length; i++){
            int octet = message[i] & 0xFF;
            a = (this.getPaquet().genererUneLettreAleatoire()-65)%16;
            b = (this.getPaquet().genererUneLettreAleatoire()-65)%16;
            masque = 16*a+b;
            masque_jetable += String.format("%8s", Integer.toBinaryString(masque & 0xFF)).replace(' ', '0');
            version_binaire += String.format("%8s", Integer.toBinaryString((byte) ((octet + masque)%255) & 0xFF)).replace(' ', '0');
        }
        
        Message res = new Message(msg);
        res.setMasqueJetable(masque_jetable);
        res.setMessageArrivee(version_binaire);
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
    
    public byte[] decrypter(byte[] message){
        byte[] message_resultat = new byte[message.length];
        int masque;
        int a, b;       
        
        for(int i=0; i<message.length; i++){
            int octet = message[i] & 0xFF;
            a = (this.getPaquet().genererUneLettreAleatoire()-65)%16;
            b = (this.getPaquet().genererUneLettreAleatoire()-65)%16;
            masque = 16*a+b;
            message_resultat[i] = (byte) (Math.floorMod(octet-masque, 255));
        }
        
        return message_resultat;
    }
    
    public Message decrypterAvecBytes(String suiteBinaire){
        byte[] message = new byte[suiteBinaire.length()/8];
        for(int i=0; i<message.length; i++) message[i] = (byte)(int)Integer.valueOf(suiteBinaire.substring(i*8, i*8+8), 2);
        byte[] message_resultat = new byte[message.length];
        int masque;
        int a, b;    
        String masque_jetable = "";
        
        for(int i=0; i<message.length; i++){
            int octet = message[i] & 0xFF;
            a = (this.getPaquet().genererUneLettreAleatoire()-65)%16;
            b = (this.getPaquet().genererUneLettreAleatoire()-65)%16;
            masque = 16*a+b;
            masque_jetable += String.format("%8s", Integer.toBinaryString(masque & 0xFF)).replace(' ', '0');
            message_resultat[i] = (byte) (Math.floorMod(octet-masque, 255));
        }
        
        Message res = new Message(suiteBinaire);
        res.setMasqueJetable(masque_jetable);
        res.setMessageArrivee(new String(message_resultat));
        return res;
    }
    
    public Paquet getPaquet() {
        return this.paquet;
    }
    
    public void setPaquet(Paquet p) {
        this.paquet = p;
    }
   
    private String formatte(String s) 
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
