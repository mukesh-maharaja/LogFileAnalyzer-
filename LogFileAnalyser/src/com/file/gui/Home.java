package com.file.gui;


/**
 *
 * @author mukes
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    boolean flag = false;
    public Home() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lowerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PanelMenu = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(320, 140, 0, 0);

        jPanel2.setBackground(new java.awt.Color(255, 240, 209));

        lowerPanel.setBackground(new java.awt.Color(121, 87, 87));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 240, 209));
        jLabel1.setText("`Your data holds answers`");

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 240, 209));
        jLabel4.setText("reveals them.");

        jLabel5.setFont(new java.awt.Font("Algerian", 1, 70)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(59, 48, 48));
        jLabel5.setText("LogLens");

        jLabel7.setBackground(new java.awt.Color(255, 240, 209));
        jLabel7.setFont(new java.awt.Font("Algerian", 0, 60)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 240, 209));
        jLabel7.setText("Reveals Them.");

        PanelMenu.setBackground(new java.awt.Color(255, 240, 209));

        jButton2.setBackground(new java.awt.Color(102, 67, 67));
        jButton2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 240, 209));
        jButton2.setText("HOME");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(59, 48, 48)));

        jButton3.setBackground(new java.awt.Color(102, 67, 67));
        jButton3.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 240, 209));
        jButton3.setText("ABOUT US");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(59, 48, 48)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 67, 67));
        jButton5.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 240, 209));
        jButton5.setText("CONTACT");
        jButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(59, 48, 48)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(102, 67, 67));
        jButton6.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 240, 209));
        jButton6.setText("EXPLORE");
        jButton6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(59, 48, 48)));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 67, 67));
        jButton4.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 240, 209));
        jButton4.setText("ANALYZE");
        jButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(59, 48, 48)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
                PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelMenuLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton3)
                                        .addComponent(jButton4))
                                .addContainerGap(43, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuLayout.createSequentialGroup()
                                                .addComponent(jButton2)
                                                .addGap(29, 29, 29))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuLayout.createSequentialGroup()
                                                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jButton5)
                                                        .addComponent(jButton6))
                                                .addGap(19, 19, 19))))
        );
        PanelMenuLayout.setVerticalGroup(
                PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelMenuLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jButton2)
                                .addGap(92, 92, 92)
                                .addComponent(jButton3)
                                .addGap(90, 90, 90)
                                .addComponent(jButton6)
                                .addGap(97, 97, 97)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                                .addComponent(jButton5)
                                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout lowerPanelLayout = new javax.swing.GroupLayout(lowerPanel);
        lowerPanel.setLayout(lowerPanelLayout);
        lowerPanelLayout.setHorizontalGroup(
                lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(lowerPanelLayout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(jLabel4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(lowerPanelLayout.createSequentialGroup()
                                .addGroup(lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(lowerPanelLayout.createSequentialGroup()
                                                .addGap(651, 651, 651)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(lowerPanelLayout.createSequentialGroup()
                                                .addGap(106, 106, 106)
                                                .addComponent(jLabel1))
                                        .addGroup(lowerPanelLayout.createSequentialGroup()
                                                .addGap(148, 148, 148)
                                                .addGroup(lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        lowerPanelLayout.setVerticalGroup(
                lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(lowerPanelLayout.createSequentialGroup()
                                .addGroup(lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(lowerPanelLayout.createSequentialGroup()
                                                .addGap(113, 113, 113)
                                                .addComponent(jLabel3)
                                                .addGap(102, 102, 102)
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(lowerPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(704, 704, 704)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\mukes\\Downloads\\LogLens (1).png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 67, 67));
        jLabel2.setText(">HOME");

        jButton1.setBackground(new java.awt.Color(255, 240, 209));
        jButton1.setForeground(new java.awt.Color(121, 87, 87));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\mukes\\Downloads\\icons8-menu-50.png")); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 240, 209));
        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\mukes\\Downloads\\icons8-menu-50.png")); // NOI18N
        jButton7.setBorder(null);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.setFocusPainted(false);
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(lowerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(1062, 1062, 1062)
                                                .addComponent(jButton7)
                                                .addGap(291, 291, 291)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lowerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(176, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1540, 960);

        pack();
    }// </editor-fold>

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Explore ex = new Explore();
        ex.setVisible(true);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Analyze analyze = new Analyze();
        analyze.setVisible(true);
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        PanelMenu.setVisible(!flag);
        flag = !flag;
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Home h = new Home();
        AboutUs ab = new AboutUs();
        ab.setVisible(true);
        h.setVisible(false);
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        ContactUs cont = new ContactUs();
        cont.setVisible(true);
    }



    // Variables declaration - do not modify
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel lowerPanel;
    // End of variables declaration
}

