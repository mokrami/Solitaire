/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitaire.fichiers;

/**
 *
 * @author alexis
 */
public class FabriqueFichier {
    public static Fichier creerFichier(String chemin){
        Fichier f = null;
        if(chemin.contains(".txt")) f = new FichierTexte();
        else if(chemin.contains(".bin")) f = new FichierTexte();
        
        return f;
    }
}
