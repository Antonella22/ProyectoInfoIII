/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Antonella
 */
public class Seleccion extends javax.swing.JFrame {

    /**
     * Creates new form SeleccionUser
     */
    public Seleccion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPapel = new javax.swing.JButton();
        btnVidrio = new javax.swing.JButton();
        btnOrganico = new javax.swing.JButton();
        btnPlastico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        btnEstadisticasT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(640, 510));
        setMinimumSize(new java.awt.Dimension(640, 510));
        setResizable(false);
        setSize(new java.awt.Dimension(640, 510));
        getContentPane().setLayout(null);

        btnPapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/papel.png"))); // NOI18N
        btnPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapelActionPerformed(evt);
            }
        });
        getContentPane().add(btnPapel);
        btnPapel.setBounds(48, 91, 165, 154);

        btnVidrio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vidrio.png"))); // NOI18N
        btnVidrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVidrioActionPerformed(evt);
            }
        });
        getContentPane().add(btnVidrio);
        btnVidrio.setBounds(308, 91, 156, 154);

        btnOrganico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/organico.PNG"))); // NOI18N
        btnOrganico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrganicoActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrganico);
        btnOrganico.setBounds(48, 310, 165, 158);

        btnPlastico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/plastico.PNG"))); // NOI18N
        btnPlastico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlasticoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlastico);
        btnPlastico.setBounds(308, 310, 161, 158);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("InteliT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(236, 11, 107, 48);

        btnLogout.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout);
        btnLogout.setBounds(522, 440, 90, 27);

        btnEstadisticas.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        btnEstadisticas.setText("Estadisticas");
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });
        getContentPane().add(btnEstadisticas);
        btnEstadisticas.setBounds(500, 67, 110, 30);

        btnEstadisticasT.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        btnEstadisticasT.setText("Estadistica Total");
        btnEstadisticasT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasTActionPerformed(evt);
            }
        });
        getContentPane().add(btnEstadisticasT);
        btnEstadisticasT.setBounds(500, 110, 115, 31);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seleccion.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(640, 500));
        jLabel2.setMinimumSize(new java.awt.Dimension(640, 500));
        jLabel2.setPreferredSize(new java.awt.Dimension(640, 500));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 640, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapelActionPerformed
       
        Tipo.setSel(0);
        this.setVisible(false);
         new Tipo().setVisible(true);

        int id=1;
        //Usuario.Seleccion(id);
        JOptionPane.showMessageDialog(this,"");
        //System.out.println("PAPEL");

    }//GEN-LAST:event_btnPapelActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void btnEstadisticasTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstadisticasTActionPerformed

    private void btnVidrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVidrioActionPerformed
        Tipo.setSel(1);
        this.setVisible(false);
        new Tipo().setVisible(true);
    }//GEN-LAST:event_btnVidrioActionPerformed

    private void btnOrganicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrganicoActionPerformed
        Tipo.setSel(2);
        this.setVisible(false);
        new Tipo().setVisible(true);
    }//GEN-LAST:event_btnOrganicoActionPerformed

    private void btnPlasticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlasticoActionPerformed
        Tipo.setSel(3);
        this.setVisible(false);
        new Tipo().setVisible(true);
    }//GEN-LAST:event_btnPlasticoActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnEstadisticasT;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnOrganico;
    private javax.swing.JButton btnPapel;
    private javax.swing.JButton btnPlastico;
    private javax.swing.JButton btnVidrio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
