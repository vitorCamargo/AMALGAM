/* @author Vitu e Debs */
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Game extends javax.swing.JFrame {

    SuperHero spiderMan = new SuperHero("Spider Man", "Peter Parker", 6);
    SuperHero superMan = new SuperHero("Super Man", "Clark Kent", 16);
    SuperHero capitanAmerica = new SuperHero("Capitan America", "Steven Rogers", 6);
    SuperHero flash = new SuperHero("Flash", "Barry Allen", 5);

    Vilan greenGoblin = new Vilan(5, "Green Goblin", "Norman Osbourne", 5);
    Vilan lexLuthor = new Vilan(10, "Lex Luthor", "Lex Luthor", 5);
    Vilan bizarro = new Vilan(20, "Bizarro", "Bizarro", 16);
    Vilan octopus = new Vilan(7, "Octopus", "Otto Octavius", 5);
    
    public Game() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btFight = new javax.swing.JButton();
        cbSuperHero = new javax.swing.JComboBox();
        cbVilan = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 240, 241));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btFight.setBackground(new java.awt.Color(240, 240, 241));
        btFight.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btFight.setForeground(new java.awt.Color(51, 153, 255));
        btFight.setText("FIGHT");
        btFight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        btFight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFightActionPerformed(evt);
            }
        });

        cbSuperHero.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N

        cbVilan.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        jLabel1.setText("Select the SuperHero");

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        jLabel2.setText("Select the Vilan");

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("AMALGAM");

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel4.setText("Fight Managenment Online");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(142, 142, 142))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(cbSuperHero, 0, 280, Short.MAX_VALUE)
                            .addComponent(cbVilan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btFight, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSuperHero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbVilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btFight, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cbSuperHero.addItem(spiderMan.getName());
        cbSuperHero.addItem(superMan.getName());
        cbSuperHero.addItem(capitanAmerica.getName());
        cbSuperHero.addItem(flash.getName());
        
        cbVilan.addItem(greenGoblin.getName());
        cbVilan.addItem(lexLuthor.getName());
        cbVilan.addItem(bizarro.getName());
        cbVilan.addItem(octopus.getName());
    }//GEN-LAST:event_formWindowOpened

    private void btFightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFightActionPerformed
        Dispute d = new Dispute();
        
        int result = d.fight(convertHero(), convertVilan());
        
        if(result == 1) {
            JOptionPane.showMessageDialog(null, "The Winner is the SuperHero");
        } else if(result == 2) {
            JOptionPane.showMessageDialog(null, "The Winner is the Vilan");
        } else {
            JOptionPane.showMessageDialog(null, "Tieee!");
        }
    }//GEN-LAST:event_btFightActionPerformed
    
    public SuperHero convertHero(){
        if(cbSuperHero.getSelectedIndex() == 0) {
            return spiderMan;
        } else if(cbSuperHero.getSelectedIndex() == 1) {
            return superMan;
        } else if(cbSuperHero.getSelectedIndex() == 2) {
            return capitanAmerica;
        } else {
            return flash;
        }
    }
    
    public Vilan convertVilan(){
        if(cbVilan.getSelectedIndex() == 0) {
            return greenGoblin;
        } else if(cbVilan.getSelectedIndex() == 1) {
            return lexLuthor;
        } else if(cbVilan.getSelectedIndex() == 2) {
            return bizarro;
        } else {
            return octopus;
        }
    }
    
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel( "com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFight;
    private javax.swing.JComboBox cbSuperHero;
    private javax.swing.JComboBox cbVilan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
