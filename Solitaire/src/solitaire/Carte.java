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
public class Carte {
    private TYPE_CARTE type;
    private Valeur_Carte valeur;
    
    public Carte(int indice){
        if(indice > 0 && indice < 14){
            this.type = TYPE_CARTE.TREFLE;
            this.valeur = new Valeur_Carte(indice, indice, "de trèfle");
        }
        else if(indice > 13 && indice < 27){
            this.type = TYPE_CARTE.CARREAU;
            this.valeur = new Valeur_Carte(indice, indice-13, "de carreau");
        }
        else if(indice > 26 && indice < 40){
            this.type = TYPE_CARTE.COEUR;
            this.valeur = new Valeur_Carte(indice, indice-26, "de coeur");
        }
        else if(indice > 39 && indice < 53){
            this.type = TYPE_CARTE.PIQUE;
            this.valeur = new Valeur_Carte(indice, indice-39, "de pique");
        }
        else if(indice == 53){
            this.type = TYPE_CARTE.JOKER_N;
            this.valeur = new Valeur_Carte(indice, -1, "joker noir");
        }
        else if(indice == 54){
            this.type = TYPE_CARTE.JOKER_R;
            this.valeur = new Valeur_Carte(indice, -1, "joker rouge");
        }
    }
    
    public TYPE_CARTE getType() {
        return this.type;
    }
    
    public Valeur_Carte getValeur() {
        return this.valeur;
    } 
}
