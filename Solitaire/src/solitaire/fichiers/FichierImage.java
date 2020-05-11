/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitaire.fichiers;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 * Source : https://www.tutorialspoint.com/How-to-convert-Byte-Array-to-Image-in-java
 * @author alexis
 */
public class FichierImage implements Fichier {

    @Override
    public byte[] charger(String chemin) {
        byte[] contenu = null;
        BufferedImage bImage;
        try {
            bImage = ImageIO.read(new File(chemin));
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            String[] extension = chemin.split("\\.");
            ImageIO.write(bImage, extension[extension.length-1], bos );
            contenu = bos.toByteArray();
        } catch (IOException ex) {
            System.err.println("Impossible de charger l'image.");
            Logger.getLogger(FichierImage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return contenu;
    }

    @Override
    public void sauver(String chemin, byte[] contenu) {
        ByteArrayInputStream bis = new ByteArrayInputStream(contenu);
        BufferedImage bImage2;
        try {
            bImage2 = ImageIO.read(bis);
            String[] extension = chemin.split("\\.");
            ImageIO.write(bImage2, extension[extension.length-1], new File(chemin) );
            System.out.println("Nouvelle image créée.");
        } catch (IOException ex) {
            System.err.println("Impossible de créer l'image résultat.");
            Logger.getLogger(FichierImage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
