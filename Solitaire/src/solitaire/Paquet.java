/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitaire;

import java.util.ArrayList;

/**
 *
 * @author im678382
 */
public class Paquet {
    private ArrayList<Carte> cartes;
    private final int nbCartes = 54;
    
    public Paquet(){
        Carte c;
        
        this.cartes = new ArrayList<>();
        for(int i=1; i<=this.nbCartes; i++){
            c = new Carte(i);
            this.cartes.add(c);
        }
    }
    
    /**
     * Construit un nouveau gros paquet par fusion de deux plus petits
     * @param p1 Premier paquet à fusionner
     * @param p2 Deuxième paquet à fusionner
     */
    public Paquet(Paquet p1, Paquet p2){
        this.cartes = new ArrayList<>();
        if(p1 != null) this.cartes.addAll(p1.getPaquet());
        if(p2 != null) this.cartes.addAll(p2.getPaquet());
    }
    
    /**
     * Construit un sous-paquet de celui passé en paramètre
     * @param p Paquet qu'on souhaite tronquer
     * @param indiceDebut Indice de la première carte du sous-paquet
     * @param indiceFin Indice de la dernière carte du sous-paquet
     */
    public Paquet(Paquet p, int indiceDebut, int indiceFin){
        this.cartes = new ArrayList<>();
        this.cartes.addAll(p.getPaquet().subList(indiceDebut, indiceFin+1));
    }
    
    public ArrayList<Carte> getPaquet(){
        return this.cartes;
    }
    
    public Carte lireCarte(int indice){
        return null;
    }
    
    public Carte derniereCarte(){
        return null;
    }
    
    public String creerMasqueJetable(int taille){
        return "";
    }
    
    private void melange(){
        
    }
    
    private char lectureLettreAleatoire(){
        return 'a';
    }
    
    private void reculJokerNoir(){
        
    }
    
    private void reculJokerRouge(){
        
    }
    
    private void doubleCoupe(){
        
    }
    
    private void coupeSimple(){
        
    }
    
    private void reculer(int indice, int pas){
        
    }
    
    private void avance(int indice, int pas){
        
    }
    
    private void findJoker(String couleur){
        
    }
    
    private void permuter(int indCarte1, int indCarte2){
        
    }
}
