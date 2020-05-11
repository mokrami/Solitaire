/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitaire;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import solitaire.fichiers.FabriqueFichier;
import solitaire.fichiers.Fichier;

/**
 *
 * @author im678382
 */
public class Solitaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InterfaceGraphique appU1 = new InterfaceGraphique();
        appU1.setVisible(true);
        
        InterfaceGraphique appU2 = new InterfaceGraphique();
        appU2.setVisible(true);
        
        /*Utilisateur u1 = new Utilisateur();
        Utilisateur u2 = new Utilisateur();
        u2.setPaquet(new Paquet(u1.getPaquet().getPaquetS()));
        String path = "11.jpg";
        Fichier f = FabriqueFichier.creerFichier(path);
        byte[] data = f.charger(path);
        byte[] res = u1.crypter(data);
        byte[] ndata = u2.decrypter(res);
        
        int i=0;
        boolean ok = true;
        while(i<data.length && ok){
            ok = data[i] == ndata[i];
            i++;
        }
        System.out.println(ok);*/
    }
    
}
