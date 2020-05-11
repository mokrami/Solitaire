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
public interface Fichier {
    public byte[] charger(String chemin);
    public void sauver(String chemin, byte[] contenu);
}
