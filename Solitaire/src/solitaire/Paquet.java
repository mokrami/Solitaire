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
    
    public Paquet(){
        this.cartes = new ArrayList<>();
    }
    
    public Paquet(Paquet p1, Paquet p2){
        
    }
    
    public Paquet(Paquet p, int indiceDebut, int indiceFin){
        
    }
    
    public ArrayList<Carte> getPaquet(){
        return null;
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
