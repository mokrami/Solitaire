/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitaire;

/**
 *
 * @author alexis
 */
public class Message {
    private String msg_depart;
    private String masque_jetable;
    private String msg_arrivee;
    
    public Message(String message_depart){
        this.msg_depart = message_depart;
        this.masque_jetable = "";
        this.msg_arrivee = "";
    }
    
    public void setMasqueJetable(String masque){
        this.masque_jetable = masque;
    }
    
    public void setMessageArrivee(String message){
        this.msg_arrivee = message;
    }
    
    public String getMessageDepart(){
        return this.msg_depart;
    }
    
    public String getMasqueJetable(){
        return this.masque_jetable;
    }
    
    public String getMessageArrivee(){
        return this.msg_arrivee;
    }
}
