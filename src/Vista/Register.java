/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Control.Usuario;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author Antonella
 */
public class Register extends javax.swing.JFrame {

    /** Creates new form Register */
    public Register() {
        initComponents();
        this.setSize(new Dimension(100,100));
    }
    
    public void limpiarCampos(){
        txtNombre.setText("");
        txtUser.setText("");
        txtPass.setText("");
    }

      public boolean VerificarCampos(){
       
        if(txtUser.getText().isEmpty()){
            // lblnombre.setVisible(true);  
            return true;
        } 
        if(txtUser.getText().isEmpty()){
           //  lbluser.setVisible(true);
           return true;
        } 
        if(txtPass.getText().isEmpty()){
           // lblpass.setVisible(true);
           return true;
        } 
        
        return false;
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        icon = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 370));
        setMinimumSize(new java.awt.Dimension(550, 370));
        setResizable(false);
        setSize(new java.awt.Dimension(550, 370));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registrar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 50, 142, 45);

        jLabel5.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel5.setText("Nombre");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 140, 70, 21);

        jLabel7.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel7.setText("Usuario");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(220, 180, 54, 21);

        jLabel8.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel8.setText("Contraseña");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(220, 220, 79, 21);

        txtNombre.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(340, 140, 130, 24);

        txtUser.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        getContentPane().add(txtUser);
        txtUser.setBounds(340, 180, 130, 24);

        txtPass.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtPass.setText("jPasswordField2");
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPassMouseClicked(evt);
            }
        });
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        getContentPane().add(txtPass);
        txtPass.setBounds(340, 220, 130, 22);

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        getContentPane().add(icon);
        icon.setBounds(60, 120, 128, 128);

        btnRegistrar.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(270, 270, 100, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Register.JPG"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(550, 370));
        jLabel1.setMinimumSize(new java.awt.Dimension(550, 370));
        jLabel1.setPreferredSize(new java.awt.Dimension(550, 370));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 550, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        if(!VerificarCampos()){

            byte reg = (Usuario.registrarUsuario(txtNombre.getText(), txtUser.getText(), txtPass.getText()));

            if(reg == 0 ){
                JOptionPane.showMessageDialog(null, "Usuario Registrado exitosamente");
                this.setVisible(false);
                new Auth().setVisible(true);
            }
            if (reg == 1 ){
               //lblUser.setVisible(true);
               //lblUser.setText(Usuario ya existe);
                JOptionPane.showMessageDialog(null, "Usuario ya existe");
            }

        }
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        
        //lblpass.setVisible(false); 
    }//GEN-LAST:event_txtPassKeyPressed

    private void txtPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMouseClicked
        
        //lblpass.setVisible(false); 
        byte cont=0;
        cont++;
        if (cont==1){
            txtPass.setText("");
        }   
    }//GEN-LAST:event_txtPassMouseClicked

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

}
