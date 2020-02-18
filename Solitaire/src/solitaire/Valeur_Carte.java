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
public class Valeur_Carte {
    private int id;
    private int val_num;
    private String val_str;
    
    public String toString() {
        return val_str;
    }
        
    public Valeur_Carte(int _id, int num, String str){
        this.id = _id;
        this.val_num = num;

        switch(num){
            case 1:
                this.val_str = "As " + str;
            break;
            case 11:
                this.val_str = "Valet " + str;
            break;
            case 12:
                this.val_str = "Dame " + str;
            break;
            case 13:
                this.val_str = "Roi " + str;
            break;
            case -1:
                this.val_str = str;
            break;
            default:
                this.val_str = num + " " + str;
            break;
        }
    }
    
    public int getId() {
        return this.id;
    }
    
    public int getValNum() {
        return this.val_num;
    }
    
    public String getValString() {
        return this.val_str;
    }
}
