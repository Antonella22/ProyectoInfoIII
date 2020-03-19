/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.UsuarioControlador;
import Entidades.Reciclar;
import Entidades.Usuario;
import java.awt.Dimension;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Antonella
 */
public class Auth extends javax.swing.JFrame {

    private UsuarioControlador uC;
    String correo;
    
    public Auth() {
        initComponents();
        lbluser.setVisible(false); 
        lblpass.setVisible(false); 
        uC = new UsuarioControlador();
    }

    public void limpiarCampos(){
        txtCorreo.setText("");
        txtPassword.setText("");
    }
    
    public boolean VerificarCampos(){
       
        if(txtCorreo.getText().isEmpty()){
            lbluser.setVisible(true);
            return true;
        }else if(txtPassword.getText().isEmpty()){       
            lblpass.setVisible(true);
            return true;
        }else{
            return false;
        }      
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        lbPass = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnRegistro = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lbluser = new javax.swing.JLabel();
        lblpass = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(459, 469));
        setResizable(false);
        setSize(new java.awt.Dimension(459, 469));
        getContentPane().setLayout(null);

        lbTitulo.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        lbTitulo.setText("InteliT");
        getContentPane().add(lbTitulo);
        lbTitulo.setBounds(190, 30, 115, 65);

        jlabel.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jlabel.setText("Correo");
        getContentPane().add(jlabel);
        jlabel.setBounds(60, 260, 80, 21);

        lbPass.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        lbPass.setText("Contraseña");
        getContentPane().add(lbPass);
        lbPass.setBounds(60, 310, 79, 21);

        txtCorreo.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCorreoMouseClicked(evt);
            }
        });
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCorreoKeyPressed(evt);
            }
        });
        getContentPane().add(txtCorreo);
        txtCorreo.setBounds(180, 260, 130, 27);

        btnLogin.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(190, 390, 80, 27);

        btnRegistro.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        btnRegistro.setText("Registarse");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistro);
        btnRegistro.setBounds(335, 400, 110, 27);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(180, 100, 128, 128);

        txtPassword.setText("jPasswordField1");
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        getContentPane().add(txtPassword);
        txtPassword.setBounds(180, 310, 130, 30);

        lbluser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbluser.setForeground(new java.awt.Color(255, 51, 51));
        lbluser.setText("Ingresar usuario");
        getContentPane().add(lbluser);
        lbluser.setBounds(180, 290, 100, 15);

        lblpass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblpass.setForeground(new java.awt.Color(255, 0, 0));
        lblpass.setText("Ingresar Contraseña");
        getContentPane().add(lblpass);
        lblpass.setBounds(180, 340, 130, 20);

        lblCorreo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCorreo.setText("@unicauca.edu.co");
        getContentPane().add(lblCorreo);
        lblCorreo.setBounds(320, 260, 120, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo1.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(459, 469));
        jLabel1.setMinimumSize(new java.awt.Dimension(459, 469));
        jLabel1.setPreferredSize(new java.awt.Dimension(459, 469));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 480, 469);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyPressed

        //lbluser.setVisible(false)
    }//GEN-LAST:event_txtCorreoKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
       
        //lblpass.setVisible(false); 
        /*byte cont=0;
        cont++;
        if (cont==1){
            txtPassword.setText("");
        }  */  
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        if(!VerificarCampos()){
            
            correo = txtCorreo.getText()+lblCorreo.getText();
            
            if(uC.loginAuth(txtCorreo.getText()+lblCorreo.getText(),txtPassword.getText())){
                limpiarCampos();
                this.setVisible(false);
                new Seleccion().setVisible(true);    
            }else{
                JOptionPane.showMessageDialog(null,"Usuario no registrado");
            }
            
        }  
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        lblpass.setVisible(false); 
        byte cont=0;
        cont++;
        if (cont==1){
            txtPassword.setText("");
        }         
    }//GEN-LAST:event_txtPasswordMouseClicked

    private void txtCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMouseClicked
        lbluser.setVisible(false); 
    }//GEN-LAST:event_txtCorreoMouseClicked

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
           this.setVisible(false);
           new Register().setVisible(true);
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

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
            java.util.logging.Logger.getLogger(Auth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Auth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Auth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Auth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Auth().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JToggleButton btnRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblpass;
    private javax.swing.JLabel lbluser;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
