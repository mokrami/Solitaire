package solitaire;

import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Issam
 */
public class InterfaceAfficherPaquet extends javax.swing.JFrame {
    /**
     * Creates new form Affiche
     */
    public InterfaceAfficherPaquet(Paquet paquet) {
        initComponents();
        this.jLabel1.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(0).getValeur().getValString() + ".gif")));
        this.jLabel2.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(1).getValeur().getValString() + ".gif")));
        this.jLabel3.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(2).getValeur().getValString() + ".gif")));
        this.jLabel4.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(3).getValeur().getValString() + ".gif")));
        this.jLabel5.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(4).getValeur().getValString() + ".gif")));
        this.jLabel6.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(5).getValeur().getValString() + ".gif")));
        this.jLabel7.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(6).getValeur().getValString() + ".gif")));
        this.jLabel8.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(7).getValeur().getValString() + ".gif")));
        this.jLabel9.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(8).getValeur().getValString() + ".gif")));
        this.jLabel10.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(9).getValeur().getValString() + ".gif")));
        this.jLabel11.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(10).getValeur().getValString() + ".gif")));
        this.jLabel12.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(11).getValeur().getValString() + ".gif")));
        this.jLabel13.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(12).getValeur().getValString() + ".gif")));
        this.jLabel14.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(13).getValeur().getValString() + ".gif")));
        this.jLabel15.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(14).getValeur().getValString() + ".gif")));
        this.jLabel16.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(15).getValeur().getValString() + ".gif")));
        this.jLabel17.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(16).getValeur().getValString() + ".gif")));
        this.jLabel18.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(17).getValeur().getValString() + ".gif")));
        this.jLabel19.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(18).getValeur().getValString() + ".gif")));
        this.jLabel20.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(19).getValeur().getValString() + ".gif")));
        this.jLabel21.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(20).getValeur().getValString() + ".gif")));
        this.jLabel22.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(21).getValeur().getValString() + ".gif")));
        this.jLabel23.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(22).getValeur().getValString() + ".gif")));
        this.jLabel24.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(23).getValeur().getValString() + ".gif")));
        this.jLabel25.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(24).getValeur().getValString() + ".gif")));
        this.jLabel26.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(25).getValeur().getValString() + ".gif")));
        this.jLabel27.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(26).getValeur().getValString() + ".gif")));
        this.jLabel28.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(27).getValeur().getValString() + ".gif")));
        this.jLabel29.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(28).getValeur().getValString() + ".gif")));
        this.jLabel30.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(29).getValeur().getValString() + ".gif")));
        this.jLabel31.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(30).getValeur().getValString() + ".gif")));
        this.jLabel32.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(31).getValeur().getValString() + ".gif")));
        this.jLabel33.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(32).getValeur().getValString() + ".gif")));
        this.jLabel34.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(33).getValeur().getValString() + ".gif")));
        this.jLabel35.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(34).getValeur().getValString() + ".gif")));
        this.jLabel36.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(35).getValeur().getValString() + ".gif")));
        this.jLabel37.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(36).getValeur().getValString() + ".gif")));
        this.jLabel38.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(37).getValeur().getValString() + ".gif")));
        this.jLabel39.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(38).getValeur().getValString() + ".gif")));
        this.jLabel40.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(39).getValeur().getValString() + ".gif")));
        this.jLabel41.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(40).getValeur().getValString() + ".gif")));
        this.jLabel42.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(41).getValeur().getValString() + ".gif")));
        this.jLabel43.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(42).getValeur().getValString() + ".gif")));
        this.jLabel44.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(43).getValeur().getValString() + ".gif")));
        this.jLabel45.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(44).getValeur().getValString() + ".gif")));
        this.jLabel46.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(45).getValeur().getValString() + ".gif")));
        this.jLabel47.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(46).getValeur().getValString() + ".gif")));
        this.jLabel48.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(47).getValeur().getValString() + ".gif")));
        this.jLabel49.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(48).getValeur().getValString() + ".gif")));
        this.jLabel50.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(49).getValeur().getValString() + ".gif")));
        this.jLabel51.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(50).getValeur().getValString() + ".gif")));
        this.jLabel52.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(51).getValeur().getValString() + ".gif")));
        this.jLabel53.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(52).getValeur().getValString() + ".gif")));
        this.jLabel54.setIcon(new ImageIcon(getClass().getResource("../cartes/" + paquet.getPaquet().get(53).getValeur().getValString() + ".gif")));
        this.jTextField1.setText(paquet.getPaquetS());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel57 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jPanel55 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Afficher le paquet initial");
        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(1200, 900));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        jPanel57.setBackground(new java.awt.Color(51, 51, 51));
        jPanel57.setLayout(new java.awt.GridLayout());

        jLabel55.setBackground(new java.awt.Color(51, 51, 51));
        jLabel55.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(204, 204, 204));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("MON PAQUET INITIAL");
        jPanel57.add(jLabel55);

        getContentPane().add(jPanel57);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new java.awt.GridLayout(6, 9));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new java.awt.GridLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(71, 86));
        jPanel3.add(jLabel1);

        jPanel1.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new java.awt.GridLayout());

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel4.add(jLabel2);

        jPanel1.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(new java.awt.GridLayout());

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel5.add(jLabel3);

        jPanel1.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setLayout(new java.awt.GridLayout());

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel6.add(jLabel4);

        jPanel1.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setLayout(new java.awt.GridLayout());

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel7.add(jLabel5);

        jPanel1.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setLayout(new java.awt.GridLayout());

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel8.add(jLabel6);

        jPanel1.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setLayout(new java.awt.GridLayout());

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel9.add(jLabel7);

        jPanel1.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setLayout(new java.awt.GridLayout());

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel10.add(jLabel8);

        jPanel1.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setLayout(new java.awt.GridLayout());

        jLabel9.setBackground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel11.add(jLabel9);

        jPanel1.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel12.setLayout(new java.awt.GridLayout());

        jLabel10.setBackground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel12.add(jLabel10);

        jPanel1.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel13.setLayout(new java.awt.GridLayout());

        jLabel11.setBackground(new java.awt.Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel13.add(jLabel11);

        jPanel1.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));
        jPanel14.setLayout(new java.awt.GridLayout());

        jLabel12.setBackground(new java.awt.Color(51, 51, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel14.add(jLabel12);

        jPanel1.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(51, 51, 51));
        jPanel15.setLayout(new java.awt.GridLayout());

        jLabel13.setBackground(new java.awt.Color(51, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel15.add(jLabel13);

        jPanel1.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(51, 51, 51));
        jPanel16.setLayout(new java.awt.GridLayout());

        jLabel14.setBackground(new java.awt.Color(51, 51, 51));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel16.add(jLabel14);

        jPanel1.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(51, 51, 51));
        jPanel17.setLayout(new java.awt.GridLayout());

        jLabel15.setBackground(new java.awt.Color(51, 51, 51));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel17.add(jLabel15);

        jPanel1.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(51, 51, 51));
        jPanel18.setLayout(new java.awt.GridLayout());

        jLabel16.setBackground(new java.awt.Color(51, 51, 51));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel18.add(jLabel16);

        jPanel1.add(jPanel18);

        jPanel19.setBackground(new java.awt.Color(51, 51, 51));
        jPanel19.setLayout(new java.awt.GridLayout());

        jLabel17.setBackground(new java.awt.Color(51, 51, 51));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel19.add(jLabel17);

        jPanel1.add(jPanel19);

        jPanel20.setBackground(new java.awt.Color(51, 51, 51));
        jPanel20.setLayout(new java.awt.GridLayout());

        jLabel18.setBackground(new java.awt.Color(51, 51, 51));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel20.add(jLabel18);

        jPanel1.add(jPanel20);

        jPanel21.setBackground(new java.awt.Color(51, 51, 51));
        jPanel21.setLayout(new java.awt.GridLayout());

        jLabel19.setBackground(new java.awt.Color(51, 51, 51));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel21.add(jLabel19);

        jPanel1.add(jPanel21);

        jPanel22.setBackground(new java.awt.Color(51, 51, 51));
        jPanel22.setLayout(new java.awt.GridLayout());

        jLabel20.setBackground(new java.awt.Color(51, 51, 51));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel22.add(jLabel20);

        jPanel1.add(jPanel22);

        jPanel23.setBackground(new java.awt.Color(51, 51, 51));
        jPanel23.setLayout(new java.awt.GridLayout());

        jLabel21.setBackground(new java.awt.Color(51, 51, 51));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel23.add(jLabel21);

        jPanel1.add(jPanel23);

        jPanel24.setBackground(new java.awt.Color(51, 51, 51));
        jPanel24.setLayout(new java.awt.GridLayout());

        jLabel22.setBackground(new java.awt.Color(51, 51, 51));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel24.add(jLabel22);

        jPanel1.add(jPanel24);

        jPanel25.setBackground(new java.awt.Color(51, 51, 51));
        jPanel25.setLayout(new java.awt.GridLayout());

        jLabel23.setBackground(new java.awt.Color(51, 51, 51));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel25.add(jLabel23);

        jPanel1.add(jPanel25);

        jPanel26.setBackground(new java.awt.Color(51, 51, 51));
        jPanel26.setLayout(new java.awt.GridLayout());

        jLabel24.setBackground(new java.awt.Color(51, 51, 51));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel26.add(jLabel24);

        jPanel1.add(jPanel26);

        jPanel27.setBackground(new java.awt.Color(51, 51, 51));
        jPanel27.setLayout(new java.awt.GridLayout());

        jLabel25.setBackground(new java.awt.Color(51, 51, 51));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel27.add(jLabel25);

        jPanel1.add(jPanel27);

        jPanel28.setBackground(new java.awt.Color(51, 51, 51));
        jPanel28.setLayout(new java.awt.GridLayout());

        jLabel26.setBackground(new java.awt.Color(51, 51, 51));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel28.add(jLabel26);

        jPanel1.add(jPanel28);

        jPanel29.setBackground(new java.awt.Color(51, 51, 51));
        jPanel29.setLayout(new java.awt.GridLayout());

        jLabel27.setBackground(new java.awt.Color(51, 51, 51));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel29.add(jLabel27);

        jPanel1.add(jPanel29);

        jPanel30.setBackground(new java.awt.Color(51, 51, 51));
        jPanel30.setLayout(new java.awt.GridLayout());

        jLabel28.setBackground(new java.awt.Color(51, 51, 51));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel30.add(jLabel28);

        jPanel1.add(jPanel30);

        jPanel31.setBackground(new java.awt.Color(51, 51, 51));
        jPanel31.setLayout(new java.awt.GridLayout());

        jLabel29.setBackground(new java.awt.Color(51, 51, 51));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel31.add(jLabel29);

        jPanel1.add(jPanel31);

        jPanel32.setBackground(new java.awt.Color(51, 51, 51));
        jPanel32.setLayout(new java.awt.GridLayout());

        jLabel30.setBackground(new java.awt.Color(51, 51, 51));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel32.add(jLabel30);

        jPanel1.add(jPanel32);

        jPanel33.setBackground(new java.awt.Color(51, 51, 51));
        jPanel33.setLayout(new java.awt.GridLayout());

        jLabel31.setBackground(new java.awt.Color(51, 51, 51));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel33.add(jLabel31);

        jPanel1.add(jPanel33);

        jPanel34.setBackground(new java.awt.Color(51, 51, 51));
        jPanel34.setLayout(new java.awt.GridLayout());

        jLabel32.setBackground(new java.awt.Color(51, 51, 51));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel34.add(jLabel32);

        jPanel1.add(jPanel34);

        jPanel35.setBackground(new java.awt.Color(51, 51, 51));
        jPanel35.setLayout(new java.awt.GridLayout());

        jLabel33.setBackground(new java.awt.Color(51, 51, 51));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel35.add(jLabel33);

        jPanel1.add(jPanel35);

        jPanel36.setBackground(new java.awt.Color(51, 51, 51));
        jPanel36.setLayout(new java.awt.GridLayout());

        jLabel34.setBackground(new java.awt.Color(51, 51, 51));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel36.add(jLabel34);

        jPanel1.add(jPanel36);

        jPanel37.setBackground(new java.awt.Color(51, 51, 51));
        jPanel37.setLayout(new java.awt.GridLayout());

        jLabel35.setBackground(new java.awt.Color(51, 51, 51));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel37.add(jLabel35);

        jPanel1.add(jPanel37);

        jPanel38.setBackground(new java.awt.Color(51, 51, 51));
        jPanel38.setLayout(new java.awt.GridLayout());

        jLabel36.setBackground(new java.awt.Color(51, 51, 51));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel38.add(jLabel36);

        jPanel1.add(jPanel38);

        jPanel39.setBackground(new java.awt.Color(51, 51, 51));
        jPanel39.setLayout(new java.awt.GridLayout());

        jLabel37.setBackground(new java.awt.Color(51, 51, 51));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel39.add(jLabel37);

        jPanel1.add(jPanel39);

        jPanel40.setBackground(new java.awt.Color(51, 51, 51));
        jPanel40.setLayout(new java.awt.GridLayout());

        jLabel38.setBackground(new java.awt.Color(51, 51, 51));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel40.add(jLabel38);

        jPanel1.add(jPanel40);

        jPanel41.setBackground(new java.awt.Color(51, 51, 51));
        jPanel41.setLayout(new java.awt.GridLayout());

        jLabel39.setBackground(new java.awt.Color(51, 51, 51));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel41.add(jLabel39);

        jPanel1.add(jPanel41);

        jPanel42.setBackground(new java.awt.Color(51, 51, 51));
        jPanel42.setLayout(new java.awt.GridLayout());

        jLabel40.setBackground(new java.awt.Color(51, 51, 51));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel42.add(jLabel40);

        jPanel1.add(jPanel42);

        jPanel43.setBackground(new java.awt.Color(51, 51, 51));
        jPanel43.setLayout(new java.awt.GridLayout());

        jLabel41.setBackground(new java.awt.Color(51, 51, 51));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel43.add(jLabel41);

        jPanel1.add(jPanel43);

        jPanel44.setBackground(new java.awt.Color(51, 51, 51));
        jPanel44.setLayout(new java.awt.GridLayout());

        jLabel42.setBackground(new java.awt.Color(51, 51, 51));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel44.add(jLabel42);

        jPanel1.add(jPanel44);

        jPanel45.setBackground(new java.awt.Color(51, 51, 51));
        jPanel45.setLayout(new java.awt.GridLayout());

        jLabel43.setBackground(new java.awt.Color(51, 51, 51));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel45.add(jLabel43);

        jPanel1.add(jPanel45);

        jPanel46.setBackground(new java.awt.Color(51, 51, 51));
        jPanel46.setLayout(new java.awt.GridLayout());

        jLabel44.setBackground(new java.awt.Color(51, 51, 51));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel46.add(jLabel44);

        jPanel1.add(jPanel46);

        jPanel47.setBackground(new java.awt.Color(51, 51, 51));
        jPanel47.setLayout(new java.awt.GridLayout());

        jLabel45.setBackground(new java.awt.Color(51, 51, 51));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel47.add(jLabel45);

        jPanel1.add(jPanel47);

        jPanel48.setBackground(new java.awt.Color(51, 51, 51));
        jPanel48.setLayout(new java.awt.GridLayout());

        jLabel46.setBackground(new java.awt.Color(51, 51, 51));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel48.add(jLabel46);

        jPanel1.add(jPanel48);

        jPanel49.setBackground(new java.awt.Color(51, 51, 51));
        jPanel49.setLayout(new java.awt.GridLayout());

        jLabel47.setBackground(new java.awt.Color(51, 51, 51));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel49.add(jLabel47);

        jPanel1.add(jPanel49);

        jPanel50.setBackground(new java.awt.Color(51, 51, 51));
        jPanel50.setLayout(new java.awt.GridLayout());

        jLabel48.setBackground(new java.awt.Color(51, 51, 51));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel50.add(jLabel48);

        jPanel1.add(jPanel50);

        jPanel51.setBackground(new java.awt.Color(51, 51, 51));
        jPanel51.setLayout(new java.awt.GridLayout());

        jLabel49.setBackground(new java.awt.Color(51, 51, 51));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel51.add(jLabel49);

        jPanel1.add(jPanel51);

        jPanel52.setBackground(new java.awt.Color(51, 51, 51));
        jPanel52.setLayout(new java.awt.GridLayout());

        jLabel50.setBackground(new java.awt.Color(51, 51, 51));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel52.add(jLabel50);

        jPanel1.add(jPanel52);

        jPanel53.setBackground(new java.awt.Color(51, 51, 51));
        jPanel53.setLayout(new java.awt.GridLayout());

        jLabel51.setBackground(new java.awt.Color(51, 51, 51));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel53.add(jLabel51);

        jPanel1.add(jPanel53);

        jPanel54.setBackground(new java.awt.Color(51, 51, 51));
        jPanel54.setLayout(new java.awt.GridLayout());

        jLabel52.setBackground(new java.awt.Color(51, 51, 51));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel54.add(jLabel52);

        jPanel1.add(jPanel54);

        jPanel55.setBackground(new java.awt.Color(51, 51, 51));
        jPanel55.setLayout(new java.awt.GridLayout());

        jLabel53.setBackground(new java.awt.Color(51, 51, 51));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel55.add(jLabel53);

        jPanel1.add(jPanel55);

        jPanel56.setBackground(new java.awt.Color(51, 51, 51));
        jPanel56.setLayout(new java.awt.GridLayout());

        jLabel54.setBackground(new java.awt.Color(51, 51, 51));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartes/10 de carreau.gif"))); // NOI18N
        jPanel56.add(jLabel54);

        jPanel1.add(jPanel56);

        getContentPane().add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c 2c ");
        jPanel2.add(jTextField1);

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
