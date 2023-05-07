/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import Jugador.Jugador;

 /*
 * @author Usuario
 */
public class VentanaUnJugador extends javax.swing.JFrame {
    
    Jugador jugador;
    
    public VentanaUnJugador(Jugador jugador) {
        this.jugador = jugador;
        initComponents();
    }
    
    public VentanaUnJugador() {
        initComponents();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonPlay = new javax.swing.JButton();
        nombreDigitado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonJugar.png"))); // NOI18N
        botonPlay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPlayActionPerformed(evt);
            }
        });
        jPanel1.add(botonPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 80, 50));

        nombreDigitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreDigitadoActionPerformed(evt);
            }
        });
        jPanel1.add(nombreDigitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 280, 30));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setText("PLAYER 1 :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setText("WRITE YOU NAME:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Madera.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 290));

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

    private void botonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPlayActionPerformed
        //Jugador jugadosr = new Jugador();
        String nombreDigitado1 = nombreDigitado.getText();
        jugador.nombre1 = nombreDigitado1;
        System.out.println("NOMBRE EN ATRIBUTO = " + jugador.nombre1);

        VentanaJuego ventanaJuego = new VentanaJuego(jugador);
        ventanaJuego.setVisible(true);
        ventanaJuego.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_botonPlayActionPerformed

    private void nombreDigitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreDigitadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreDigitadoActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonPlay;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreDigitado;
    // End of variables declaration//GEN-END:variables
}
