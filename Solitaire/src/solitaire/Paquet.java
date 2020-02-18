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
     * Construit un paquet de carte selon la version encodée en chaîne de caractères d'un autre paquet
     * @param p Chaîne qui représente le paquet d'origine
     */
    public Paquet(String p){
        this.cartes = new ArrayList<>();
        String[] cartesS = p.split(":");
        for(String s : cartesS){
            try{ this.cartes.add(new Carte(Integer.parseInt(s))); } catch(NumberFormatException e){}
        }
    }
    
    /**
     * Retourne la liste de cartes qui compose le paquet
     * @return La liste des cartes
     */
    public ArrayList<Carte> getPaquet(){
        return (ArrayList<Carte>) this.cartes.clone();
    }
    
    /**
     * Retourne une version encodée du paquet sous forme de chaîne de caractères
     * @return Le paquet de carte sous forme de chaîne de caractères
     * Chaque carte est représentée par son identifiant (de 1 à 54)
     * Les cartes sont séparées par le symbole ':'
     */
    public String getPaquetS(){
        String version_str = "";
        
        for(Carte c : this.cartes){
            if(c.getId() < 53 || c.getType() == TYPE_CARTE.JOKER_N) version_str += c.getId() + ':';
            else version_str += 54 + ':';
        }
        
        return version_str;
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
    
    /**
     * Crée une chaîne de caractères d'une certaine taille à utiliser comme masque jetable
     * @param taille Taille du masque jetable (taille du message à encoder)
     * @return Le masque jetable
     */
    public String creerMasqueJetable(int taille){
        String res = "";
        
        for(int i=0; i<taille; i++){
            this.melange();
            res += this.lectureLettreAleatoire();
        }
        
        return res.toUpperCase();
    }
    
    /**
     * Mélange le paquet de carte selon la méthode du solitaire
     */
    public void melange(){
        System.out.println("-- Etape 1 :");
        System.out.println(this.toString());
        this.reculerJokerNoir();
        
        System.out.println("");
        System.out.println("-- Etape 2 :");
        System.out.println(this.toString());
        this.reculerJokerRouge();
        
        System.out.println("");
        System.out.println("-- Etape 3 :");
        System.out.println(this.toString());
        this.doubleCoupe();
        
        System.out.println("");
        System.out.println("-- Etape 4 :");
        System.out.println(this.toString());
        this.coupeSimple();
        
        System.out.println("");
        System.out.println("-- Etape 5 :");
        System.out.println(this.toString());
    }
    
    /**
     * Génère une lettre pseudo-aléatoire en utilisant la méthode du solitaire
     * @return Une lettre générée pseudo-aléatoirement
     */
    private char lectureLettreAleatoire(){
        char c = 'a';
        
        int n = this.lireCarte(0).getId();
        int m = this.lireCarte(n-1).getId();
        
        if(m == 53){
            this.melange();
            c = this.lectureLettreAleatoire();
        }
        else{
            int indiceLettre = m % 26;
            c = (char) (97 + indiceLettre);
        }
        
        return c;
    }
    
    /**
     * Effectue la phase de coupe simple du paquet
     */
    private void coupeSimple(){
        //Etude de la dernière carte
        int n = this.derniereCarte().getId();
        
        //Construction des sous-paquets
        Paquet paquet1, paquet2, paquet3, paquetFinal;
        paquet1 = new Paquet(this, 0, n-1);
        paquet2 = new Paquet(this, n, this.nbCartes-2);
        paquet3 = new Paquet(this, this.nbCartes-1, this.nbCartes-1);
        
        //Fusion pour construction du paquet final
        paquetFinal = new Paquet(paquet2, paquet1);
        paquetFinal = new Paquet(paquetFinal, paquet3);
        this.cartes = paquetFinal.getPaquet();
    }
    /**
     * On interverti les cartes apres le joker au fond et avant le joker a la surface
     */
    private void doubleCoupe(){
        Paquet paquet_debut;
        Paquet paquet_milieu;
        Paquet paquet_fin;
        Paquet paquetRes;
        
        int indiceN = this.findJoker("noir");
        int indiceR = this.findJoker("rouge");
        
        if(indiceN < indiceR) {
            paquet_debut = new Paquet(this, 0, indiceN-1);
            paquet_milieu = new Paquet(this, indiceN, indiceR);
            paquet_fin = new Paquet(this, indiceR+1, nbCartes-1);
        }
        else {
            paquet_debut = new Paquet(this, 0, indiceR-1);
            paquet_milieu = new Paquet(this, indiceR, indiceN);
            paquet_fin = new Paquet(this, indiceN+1, nbCartes-1);
        }
        
        paquetRes = new Paquet(paquet_fin, paquet_milieu);
        paquetRes = new Paquet(paquetRes, paquet_debut);
        this.cartes = paquetRes.getPaquet();
    }
    /**
     * Déplace le joker noir vers le fond du paquet d'un poisition si au milieu
     * ou le met en deuxieme position si au fond
     */
    private void reculerJokerNoir(){
        int indice = this.findJoker("noir");
        if(indice == nbCartes-1) this.permuter(indice, 1);
        else this.permuter(indice, indice+1);
    }
    
    /**
     * Déplace le joker rouge vers le fond du paquet de deux positions (avec retour au début si on dépasse le nombre de cartes)
     */
    private void reculerJokerRouge(){
        int indice = this.findJoker("rouge");
        if(indice >= 0){
            int autre_indice = (indice + 2)%(this.nbCartes-1);
            this.permuter(indice, autre_indice);
        }
    }
    /**
     * Trouve le joker dont la couleur est specifiee comme parametre dans le paquet
     * @param couleur couleur du joker a trouver
     */
    public int findJoker(String couleur){
        boolean trouve = false;
        int i = 0;
        int res = -1;
        
        while (!trouve && i < this.nbCartes) {
            if(this.cartes.get(i).getType() == TYPE_CARTE.JOKER_N && "noir".equals(couleur)) trouve = true;
            if(this.cartes.get(i).getType() == TYPE_CARTE.JOKER_R && "rouge".equals(couleur)) trouve = true;
            i++;
        }
        if(trouve) res = i-1;
        
        return res;
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
    
    @Override
    public String toString() {
        String s ="";
        for(int i = 0; i<nbCartes; i++) {
            s+=i + " | " + this.getPaquet().get(i).getValeur().toString() + "\n";
        }
        return s;
    }
}
