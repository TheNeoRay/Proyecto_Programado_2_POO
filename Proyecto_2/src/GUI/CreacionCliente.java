/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import UI.Empezar;
import UI.Game;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import sockets.GameState;

/**
 *
 * @author Manuel Arias & Justin Bogantes
 * @since 16/10/18
 */

public class CreacionCliente extends javax.swing.JFrame {

    /**
     * Creates new form CreacionCliente
     */
    public CreacionCliente() {
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

        jPanel1 = new javax.swing.JPanel();
        nombreCliente = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        fondoCrearCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreCliente.setText("JugadorAnonimo");
        nombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreClienteActionPerformed(evt);
            }
        });
        jPanel1.add(nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 310, 60));

        btnCrear.setText("Crear Usuario!");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/volver.png"))); // NOI18N
        regresar.setContentAreaFilled(false);
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        fondoCrearCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/wallpaper2you_100499.jpg"))); // NOI18N
        jPanel1.add(fondoCrearCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreClienteActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        try {
            Socket misocket = new Socket("192.168.1.4", 7777);
            DataOutputStream flujo_salida = new DataOutputStream(misocket.getOutputStream());
            String msg = nombreCliente.getText();
            if (msg == "JugadorAnonimo"){
                msg += GameState.contadorJA;
                GameState.contadorJA++;
            }
            flujo_salida.writeUTF(msg);
            flujo_salida.close();
            
            Empezar obj = new Empezar();
            obj.setVisible(true);
            dispose();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        Game obj = new Game();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_regresarActionPerformed

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
            java.util.logging.Logger.getLogger(CreacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreacionCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel fondoCrearCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreCliente;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
