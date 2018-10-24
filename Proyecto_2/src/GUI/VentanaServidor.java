/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import sockets.Servidor;

/**
 *
 * @author Manuel Arias & Justin Bogantes
 * @since 23/10/18
 * @version 1.0
 */
public class VentanaServidor extends javax.swing.JFrame {
    
    private Servidor miServidor = new Servidor(this);

    /**
     * Creates new form VentanaServidor
     */
    public VentanaServidor() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        areaVentana = new javax.swing.JTextArea();
        lblServidor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaVentana.setColumns(20);
        areaVentana.setRows(5);
        jScrollPane1.setViewportView(areaVentana);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 590, 380));

        lblServidor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblServidor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblServidor.setText("Servidor de Manuel Arias Medina & Justin Bogantes");
        jPanel1.add(lblServidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 70));

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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        VentanaServidor miVentana = new VentanaServidor();
        miVentana.setVisible(true);
        miVentana.miServidor.runServer();
    }
    
    public void agregarMensaje(String mensaje){
        areaVentana.append("\n"+mensaje);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaVentana;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblServidor;
    // End of variables declaration//GEN-END:variables
}
