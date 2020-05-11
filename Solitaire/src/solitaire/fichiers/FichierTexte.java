/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitaire.fichiers;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import solitaire.Solitaire;

/**
 *
 * @author alexis
 */
public class FichierTexte implements Fichier {

    @Override
    public byte[] charger(String chemin) {
        byte[] data = null;
        
        try {
            data = Files.readAllBytes(Paths.get(chemin));
            System.out.println("Fichier chargé.");
        } catch (IOException ex) {
            Logger.getLogger(FichierTexte.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Impossible de charger le fichier.");
        }
        
        return data;
    }

    @Override
    public void sauver(String chemin, byte[] contenu) {
        try (FileOutputStream fos2 = new FileOutputStream(chemin)) {
            fos2.write(contenu);
            System.out.println("Nouveau fichier créé.");
        } catch (IOException ioe) {
            System.err.println("Impossible de créer le nouveau fichier.");
            System.err.println(ioe.getMessage());
        }
    }
    
}
