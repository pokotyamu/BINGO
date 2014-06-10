package Bingo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class View extends javax.swing.JFrame {

    Bingo bin;
    


    public View() {
        initComponents();
        jFrame2.setBackground(Color.WHITE);
        bin = new Bingo(this);
        this.btnchange(true);
       // it = new ImageThread(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jMenuItem1 = new javax.swing.JMenuItem();
        btnStart = new javax.swing.JButton();
        imageLab = new javax.swing.JLabel();
        nowNumbox = new javax.swing.JTextField();
        btnB = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        imageLAB = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bingoTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnO1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        org.jdesktop.layout.GroupLayout jFrame1Layout = new org.jdesktop.layout.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout jFrame2Layout = new org.jdesktop.layout.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CDRビンゴ");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.white);

        btnStart.setFont(new java.awt.Font("MS Mincho", 0, 30)); // NOI18N
        btnStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/start.png"))); // NOI18N
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        nowNumbox.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        nowNumbox.setForeground(new java.awt.Color(255, 51, 51));
        nowNumbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nowNumboxActionPerformed(evt);
            }
        });

        btnB.setFont(new java.awt.Font("MS Mincho", 0, 50)); // NOI18N
        btnB.setForeground(new java.awt.Color(0, 255, 102));
        btnB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/B.png"))); // NOI18N
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });

        btnI.setFont(new java.awt.Font("MS Mincho", 0, 50)); // NOI18N
        btnI.setForeground(new java.awt.Color(9, 243, 228));
        btnI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/I.png"))); // NOI18N
        btnI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIActionPerformed(evt);
            }
        });

        btnN.setBackground(new java.awt.Color(0, 0, 0));
        btnN.setFont(new java.awt.Font("MS Mincho", 0, 50)); // NOI18N
        btnN.setForeground(new java.awt.Color(249, 227, 101));
        btnN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/N.png"))); // NOI18N
        btnN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNActionPerformed(evt);
            }
        });

        btnG.setFont(new java.awt.Font("MS Mincho", 0, 50)); // NOI18N
        btnG.setForeground(new java.awt.Color(255, 51, 0));
        btnG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/G.png"))); // NOI18N
        btnG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGActionPerformed(evt);
            }
        });

        btnO.setFont(new java.awt.Font("MS Mincho", 0, 50)); // NOI18N
        btnO.setForeground(new java.awt.Color(0, 204, 255));
        btnO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/O.png"))); // NOI18N
        btnO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOActionPerformed(evt);
            }
        });

        bingoTable.setAutoCreateRowSorter(true);
        bingoTable.setFont(new java.awt.Font("MS PMincho", 0, 20)); // NOI18N
        bingoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "B", "I", "N", "G", "O"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bingoTable.setRowHeight(20);
        bingoTable.setSize(new java.awt.Dimension(450, 100));
        jScrollPane2.setViewportView(bingoTable);
        if (bingoTable.getColumnModel().getColumnCount() > 0) {
            bingoTable.getColumnModel().getColumn(0).setResizable(false);
            bingoTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            bingoTable.getColumnModel().getColumn(1).setResizable(false);
            bingoTable.getColumnModel().getColumn(1).setPreferredWidth(30);
            bingoTable.getColumnModel().getColumn(2).setResizable(false);
            bingoTable.getColumnModel().getColumn(2).setPreferredWidth(30);
            bingoTable.getColumnModel().getColumn(3).setResizable(false);
            bingoTable.getColumnModel().getColumn(3).setPreferredWidth(30);
            bingoTable.getColumnModel().getColumn(4).setResizable(false);
            bingoTable.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N

        btnO1.setFont(new java.awt.Font("MS Mincho", 0, 50)); // NOI18N
        btnO1.setForeground(new java.awt.Color(0, 204, 255));
        btnO1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bounenn.png"))); // NOI18N
        btnO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnO1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel2.setText("1個前；");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(257, 257, 257)
                        .add(btnStart, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 282, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(248, 248, 248))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(layout.createSequentialGroup()
                                .add(18, 18, 18)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel2)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(nowNumbox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 193, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .add(layout.createSequentialGroup()
                                        .add(btnB, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 57, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(49, 49, 49)
                                        .add(btnI, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(53, 53, 53)
                                        .add(btnN)
                                        .add(46, 46, 46)
                                        .add(btnG)
                                        .add(31, 31, 31)))
                                .add(btnO, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(53, 53, 53)
                                .add(btnO1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 231, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(60, 60, 60)
                                .add(imageLAB, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 260, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 412, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 56, Short.MAX_VALUE)
                .add(imageLab)
                .add(0, 114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(105, 105, 105)
                        .add(imageLab, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(16, 16, 16)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(btnO, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 57, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, btnO1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 57, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(17, 17, 17)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(btnB, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(btnI, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .add(77, 77, 77)
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 316, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(17, 17, 17)
                                .add(btnN))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(16, 16, 16)
                                .add(btnG, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 59, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(4, 4, 4)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(layout.createSequentialGroup()
                                .add(imageLAB, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 250, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(nowNumbox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 85, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel2)))
                            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 341, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(btnStart, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        ImageThread it = new ImageThread(this);
        it.setBingocode("0");
        this.btnchange(false);
        it.start();
        
    }//GEN-LAST:event_btnStartActionPerformed

    private void nowNumboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nowNumboxActionPerformed
    }//GEN-LAST:event_nowNumboxActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        ImageThread it = new ImageThread(this);
        it.setBingocode("1");
        this.btnchange(false);
        it.start();
    }//GEN-LAST:event_btnBActionPerformed

    private void btnIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIActionPerformed
        ImageThread it = new ImageThread(this);
        it.setBingocode("2");
        this.btnchange(false);
        it.start();
    }//GEN-LAST:event_btnIActionPerformed

    private void btnNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNActionPerformed
        ImageThread it = new ImageThread(this);
        it.setBingocode("3");
        this.btnchange(false);
        it.start();
    }//GEN-LAST:event_btnNActionPerformed

    private void btnGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGActionPerformed
        ImageThread it = new ImageThread(this);
        it.setBingocode("4");
        this.btnchange(false);
        it.start();
    }//GEN-LAST:event_btnGActionPerformed

    private void btnOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOActionPerformed
        ImageThread it = new ImageThread(this);
        it.setBingocode("5");
        this.btnchange(false);
        it.start();
    }//GEN-LAST:event_btnOActionPerformed

    private void btnO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnO1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bingoTable;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnG;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnO1;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel imageLAB;
    private javax.swing.JLabel imageLab;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nowNumbox;
    // End of variables declaration//GEN-END:variables

    public void paintlab(ImageIcon icon) {
        //Image img = createImage(icon.getImage().getHeight(this),icon.getImage().getWidth(this));//空の画像領域を作る
        Image img = createImage(1000, 1000);//空の画像領域を作る
        Graphics g = img.getGraphics();
        g.drawImage(icon.getImage(), 0, 0, this);
        g.dispose();
        //imageLab.setSize(icon.getIconHeight(), icon.getIconWidth());
        imageLAB.setIcon(icon);
    }

    void paintTxt(Image image, String num) {
        Image img = createImage(image.getWidth(this), image.getHeight(this));//空の画像領域を作る
        Graphics g = img.getGraphics();

        g.setFont(new Font("Apple Braille", Font.BOLD, 70));
        g.drawImage(image, 0, 0, this);
        g.setColor(Color.RED);
        if(num.length()>1){
            g.drawString(num, 80, 170);
        }else{
            g.drawString(num, 100, 170);    
        }
        g.dispose();
        ImageIcon icon = new ImageIcon(img);
        imageLAB.setIcon(icon);
        
        Font[] f = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
        try {
            Thread.sleep(1000);
            this.btnchange(true);
        } catch (InterruptedException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void appendNownum(BingoBall bingoball) {
        nowNumbox.setText(bingoball.getName() + "の" + bingoball.getNum());
        this.setTable(bingoball);
    }

    private void setTable(BingoBall bingoball) {
        int width = 0;
        int hight = 0;
        switch (bingoball.getName()) {
            case "B":
                width = 0;
                break;
            case "I":
                width = 1;
                break;
            case "N":
                width = 2;
                break;
            case "G":
                width = 3;
                break;
            case "O":
                width = 4;
                break;
        }
        hight = bingoball.getNum() - (width * 15) - 1;
        bingoTable.setValueAt(bingoball.getNum(), hight, width);
    }

    public void btnchange(boolean change) {
        File f = new File("");
        String url = f.getAbsolutePath()+"/src/image/";
        ImageIcon ig = new ImageIcon(url + "B.png");
        btnB.setDisabledIcon(ig);
        btnB.setEnabled(change);
        ig = new ImageIcon(url + "I.png");
        btnI.setDisabledIcon(ig);
        btnI.setEnabled(change);
        ig = new ImageIcon(url + "N.png");
        btnN.setDisabledIcon(ig);
        btnN.setEnabled(change);
        ig = new ImageIcon(url + "G.png");
        btnG.setDisabledIcon(ig);
        btnG.setEnabled(change);
        ig = new ImageIcon(url + "O.png");
        btnO.setDisabledIcon(ig);
        btnO.setEnabled(change);
        ig = new ImageIcon(url + "start.png");
        btnStart.setDisabledIcon(ig);
        btnStart.setEnabled(change);
    }
}
