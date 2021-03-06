/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ReciclarControlador;
import Entidades.Organico;
import Entidades.Reciclar;
import java.util.Iterator;

/**
 *
 * @author Antonella
 */
public class TipoOrganico extends javax.swing.JFrame {

    /**
     * Creates new form TipoOrganico
     */
    ReciclarControlador rec = new ReciclarControlador();
   
    Auth a = new Auth();
    
    public TipoOrganico() {
        initComponents();
        txtCorreo.setVisible(false);
        titulo();
        txtCorreo.setText(a.correo);
    }

    
    public void titulo(){
         for(Iterator<String> it= Organico.getTipo_organico().listIterator();it.hasNext();){
             lbl_fruta.setText(it.next());
             lbl_pan.setText(it.next());
             lbl_comida.setText(it.next());
             lbl_huevo.setText(it.next());
             lbl_verduras.setText(it.next());
             lbl_otro.setText(it.next());
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

        jLabel1 = new javax.swing.JLabel();
        lbl_fruta = new javax.swing.JLabel();
        lbl_pan = new javax.swing.JLabel();
        lbl_comida = new javax.swing.JLabel();
        lbl_huevo = new javax.swing.JLabel();
        lbl_verduras = new javax.swing.JLabel();
        lbl_otro = new javax.swing.JLabel();
        btn_fruta = new javax.swing.JButton();
        btn_pan = new javax.swing.JButton();
        btn_comida = new javax.swing.JButton();
        btn_huevo = new javax.swing.JButton();
        btn_verduras = new javax.swing.JButton();
        btn_otro = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Selecciona el tipo de residuo organico");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 10, 320, 40);

        lbl_fruta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_fruta.setText("jLabel2");
        getContentPane().add(lbl_fruta);
        lbl_fruta.setBounds(30, 210, 150, 20);

        lbl_pan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_pan.setText("jLabel3");
        getContentPane().add(lbl_pan);
        lbl_pan.setBounds(250, 210, 50, 14);

        lbl_comida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_comida.setText("jLabel4");
        getContentPane().add(lbl_comida);
        lbl_comida.setBounds(370, 210, 150, 14);

        lbl_huevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_huevo.setText("jLabel5");
        getContentPane().add(lbl_huevo);
        lbl_huevo.setBounds(30, 380, 120, 20);

        lbl_verduras.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_verduras.setText("jLabel6");
        getContentPane().add(lbl_verduras);
        lbl_verduras.setBounds(200, 400, 150, 20);

        lbl_otro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_otro.setText("jLabel7");
        getContentPane().add(lbl_otro);
        lbl_otro.setBounds(410, 390, 60, 20);

        btn_fruta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fruta.JPG"))); // NOI18N
        btn_fruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_frutaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_fruta);
        btn_fruta.setBounds(40, 90, 127, 110);

        btn_pan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pan.JPG"))); // NOI18N
        btn_pan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_panActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pan);
        btn_pan.setBounds(210, 80, 120, 120);

        btn_comida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comida.JPG"))); // NOI18N
        btn_comida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comidaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_comida);
        btn_comida.setBounds(370, 90, 120, 110);

        btn_huevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/huevo.JPG"))); // NOI18N
        btn_huevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_huevoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_huevo);
        btn_huevo.setBounds(40, 260, 110, 110);

        btn_verduras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verduras.JPG"))); // NOI18N
        btn_verduras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verdurasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_verduras);
        btn_verduras.setBounds(200, 250, 140, 140);

        btn_otro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/otro.PNG"))); // NOI18N
        btn_otro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_otroActionPerformed(evt);
            }
        });
        getContentPane().add(btn_otro);
        btn_otro.setBounds(370, 250, 120, 120);
        getContentPane().add(txtCorreo);
        txtCorreo.setBounds(430, 20, 90, 20);

        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(490, 420, 90, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tipoOrganico.jpg"))); // NOI18N
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 590, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_frutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_frutaActionPerformed
        int id= 31;
        Reciclar re = new Reciclar(id, 1);
        
        rec.agregarDes(re, txtCorreo.getText());
        System.out.println("CASCARAS DE FRUTA");
    }//GEN-LAST:event_btn_frutaActionPerformed

    private void btn_panActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_panActionPerformed
        int id= 32;
        Reciclar re = new Reciclar(id, 1);
        
        rec.agregarDes(re, txtCorreo.getText());
        System.out.println("PAN");
    }//GEN-LAST:event_btn_panActionPerformed

    private void btn_comidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comidaActionPerformed
        int id= 33;
        Reciclar re = new Reciclar(id, 1);
        
        rec.agregarDes(re, txtCorreo.getText());
        System.out.println("RESTOS DE COMIDA");
    }//GEN-LAST:event_btn_comidaActionPerformed

    private void btn_huevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_huevoActionPerformed
        int id=34;
        Reciclar re = new Reciclar(id, 1);
        
        rec.agregarDes(re, txtCorreo.getText());
        System.out.println("CASCARON DE HUEVO");
    }//GEN-LAST:event_btn_huevoActionPerformed

    private void btn_verdurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verdurasActionPerformed
        int id= 35;
        Reciclar re = new Reciclar(id, 1);
        
        rec.agregarDes(re, txtCorreo.getText());
        System.out.println("VERDURAS Y HORTALIZAS");
    }//GEN-LAST:event_btn_verdurasActionPerformed

    private void btn_otroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_otroActionPerformed
        int id=36;
        Reciclar re = new Reciclar(id, 1);
        
        rec.agregarDes(re, txtCorreo.getText());
        System.out.println("OTRO");
    }//GEN-LAST:event_btn_otroActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        new TipoOrganico().setVisible(false);
        new Seleccion().setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(TipoOrganico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoOrganico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoOrganico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoOrganico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipoOrganico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btn_comida;
    private javax.swing.JButton btn_fruta;
    private javax.swing.JButton btn_huevo;
    private javax.swing.JButton btn_otro;
    private javax.swing.JButton btn_pan;
    private javax.swing.JButton btn_verduras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_comida;
    private javax.swing.JLabel lbl_fruta;
    private javax.swing.JLabel lbl_huevo;
    private javax.swing.JLabel lbl_otro;
    private javax.swing.JLabel lbl_pan;
    private javax.swing.JLabel lbl_verduras;
    public javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
