/* @author Vitu e Debs */
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Jogo extends javax.swing.JFrame {

    SuperHeroi homemaranha = new SuperHeroi("Homem-Aranha", "Peter Parker", 6);
    SuperHeroi superhomem = new SuperHeroi("Super-Homem", "Clark Kent", 16);
    SuperHeroi capitaoamerica = new SuperHeroi("Capitão-América", "Steven Rogers", 6);
    SuperHeroi flash = new SuperHeroi("Flash", "Barry Allen", 5);

    Vilao duendeverde = new Vilao(5, "Duende-Verde", "Norman Osbourne", 5);
    Vilao lexluthor = new Vilao(10, "Lex Luthor", "Lex Luthor", 5);
    Vilao bizarro = new Vilao(20, "Bizarro", "Bizarro", 16);
    Vilao octopus = new Vilao(7, "Octuopus", "Otto Octavius", 5);
    
        
    public Jogo() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btDisputar = new javax.swing.JButton();
        cbSuperHeroi = new javax.swing.JComboBox();
        cbVilao = new javax.swing.JComboBox();
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

        btDisputar.setBackground(new java.awt.Color(240, 240, 241));
        btDisputar.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btDisputar.setForeground(new java.awt.Color(51, 153, 255));
        btDisputar.setText("DISPUTAR");
        btDisputar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        btDisputar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDisputar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDisputarActionPerformed(evt);
            }
        });

        cbSuperHeroi.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N

        cbVilao.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        jLabel1.setText("Selecione Super Heroi");

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        jLabel2.setText("Selecione Vilão");

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("AMALGAM");

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel4.setText("Gerenciador de Disputas On-Line");

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
                            .addComponent(cbSuperHeroi, 0, 280, Short.MAX_VALUE)
                            .addComponent(cbVilao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btDisputar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(cbSuperHeroi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbVilao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btDisputar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cbSuperHeroi.addItem(homemaranha.getNome());
        cbSuperHeroi.addItem(superhomem.getNome());
        cbSuperHeroi.addItem(capitaoamerica.getNome());
        cbSuperHeroi.addItem(flash.getNome());
        
        cbVilao.addItem(duendeverde.getNome());
        cbVilao.addItem(lexluthor.getNome());
        cbVilao.addItem(bizarro.getNome());
        cbVilao.addItem(octopus.getNome());
    }//GEN-LAST:event_formWindowOpened

    private void btDisputarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDisputarActionPerformed
        Confronto c = new Confronto();
        
        int result = c.executar(converterHeroi(), converterVilao());
        
        if(result == 1) {
            JOptionPane.showMessageDialog(null, "O vencedor do duelo é o Super Herói");
        } else if(result == 2) {
            JOptionPane.showMessageDialog(null, "O vencedor do duelo é o Vilão");
        } else {
            JOptionPane.showMessageDialog(null, "Houve empate no duelo!");
        }
    }//GEN-LAST:event_btDisputarActionPerformed
    
    public SuperHeroi converterHeroi(){
        if(cbSuperHeroi.getSelectedIndex() == 0) {
            return homemaranha;
        } else if(cbSuperHeroi.getSelectedIndex() == 1) {
            return superhomem;
        } else if(cbSuperHeroi.getSelectedIndex() == 2) {
            return capitaoamerica;
        } else {
            return flash;
        }
    }
    
    public Vilao converterVilao(){
        if(cbVilao.getSelectedIndex() == 0) {
            return duendeverde;
        } else if(cbVilao.getSelectedIndex() == 1) {
            return lexluthor;
        } else if(cbVilao.getSelectedIndex() == 2) {
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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel( "com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDisputar;
    private javax.swing.JComboBox cbSuperHeroi;
    private javax.swing.JComboBox cbVilao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
