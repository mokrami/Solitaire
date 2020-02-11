/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitaire;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author im678382
 */
public class Paquet {
    private ArrayList<Carte> cartes;
    private final int nbCartes = 54;
    
    /**
     * Constructeur qui cree initialise d'abord un paquet de carte dans l'ordre
     * bridge puis les melange de maniere aléatoire pour donner l'état initial
     * du paquet de carte
     */
    public Paquet(){
        Carte c;
        
        this.cartes = new ArrayList<>();
        for(int i=1; i<=this.nbCartes; i++){
            c = new Carte(i);
            this.cartes.add(c);
        }
        
        Collections.shuffle(this.cartes);
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
    
    /**
     * Retourne la liste de cartes qui compose le paquet
     * @return La liste des cartes
     */
    public ArrayList<Carte> getPaquet(){
        return this.cartes;
    }
    
    /**
     * Retourne la carte à l'indice donné
     * @param indice Indice de la carte recherchée
     * @return La carte ou null si l'indice est incorrect
     */
    public Carte lireCarte(int indice){
        Carte res = null;
        if(indice >= 0 && indice < this.nbCartes) res = this.cartes.get(indice);
        return res;
    }
    
    /**
     * Retourne la dernière carte du paquet
     * @return La carte à la dernière position du paquet
     */
    public Carte derniereCarte(){
        return this.lireCarte(nbCartes-1);
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
    
    /**
     * Met la carte 1 à la position de la carte 2 et inversement
     * @param indCarte1 Indice de la première carte à permuter
     * @param indCarte2 Indice de la deuxième carte à permuter
     */
    private void permuter(int indCarte1, int indCarte2){
        if(indCarte1 >= 0 && indCarte2 >= 0 && indCarte1 < this.nbCartes && indCarte2 < this.nbCartes){
            Carte tmp = this.lireCarte(indCarte1);
            this.cartes.set(indCarte1, this.cartes.get(indCarte2));
            this.cartes.set(indCarte2, tmp);
        }
    }
}
