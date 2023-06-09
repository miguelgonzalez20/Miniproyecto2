
package GUI;

import Jugador.Jugador;

public class Ventana2 extends javax.swing.JFrame {

    int cantidadPartidas1 = 0;
    
    public Ventana2() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonVolver = new javax.swing.JButton();
        ImagenArriba = new javax.swing.JLabel();
        dosjugadores = new javax.swing.JButton();
        unjugador = new javax.swing.JButton();
        UnaPartida = new javax.swing.JButton();
        CuatroPartidas = new javax.swing.JButton();
        DosPartidas = new javax.swing.JButton();
        TresPartidas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonVolver1.png"))); // NOI18N
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 60, 40));

        ImagenArriba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen1.png"))); // NOI18N
        ImagenArriba.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(ImagenArriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 170, 40));

        dosjugadores.setText("TWO PLAYER");
        dosjugadores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dosjugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosjugadoresActionPerformed(evt);
            }
        });
        jPanel1.add(dosjugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 110, 30));

        unjugador.setText("SINGLE PLAYER");
        unjugador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        unjugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unjugadorActionPerformed(evt);
            }
        });
        jPanel1.add(unjugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 110, 30));

        UnaPartida.setText("1");
        UnaPartida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UnaPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnaPartidaActionPerformed(evt);
            }
        });
        jPanel1.add(UnaPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 40, 30));

        CuatroPartidas.setText("4");
        CuatroPartidas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CuatroPartidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuatroPartidasActionPerformed(evt);
            }
        });
        jPanel1.add(CuatroPartidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 40, 30));

        DosPartidas.setText("2");
        DosPartidas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DosPartidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DosPartidasActionPerformed(evt);
            }
        });
        jPanel1.add(DosPartidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 40, 30));

        TresPartidas.setText("3");
        TresPartidas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TresPartidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TresPartidasActionPerformed(evt);
            }
        });
        jPanel1.add(TresPartidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 40, 30));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 0));
        jLabel2.setText("Numero de partidas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 240, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Madera.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -20, 520, 370));

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

    private void dosjugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosjugadoresActionPerformed
        Jugador jugador = new Jugador();
        jugador.numeroPartidas = cantidadPartidas1;
    
        VentanaDosJugadores ventanaNombre2= new VentanaDosJugadores(jugador);
        ventanaNombre2.setVisible(true);
        ventanaNombre2.setLocationRelativeTo(null);
        
        this.dispose();//para que no se acumulen las ventanas        
    }//GEN-LAST:event_dosjugadoresActionPerformed

    private void unjugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unjugadorActionPerformed
           // TODO add your handling code here:
        Jugador jugador = new Jugador();
        jugador.numeroPartidas = cantidadPartidas1;
        jugador.machine = true;
        VentanaUnJugador ventanaNombre1 = new VentanaUnJugador(jugador);
        
        ventanaNombre1.setVisible(true);
        ventanaNombre1.setLocationRelativeTo(null);
        this.dispose();//para que no se acumulen las ventanas 
   
        
         
    }//GEN-LAST:event_unjugadorActionPerformed

    private void UnaPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnaPartidaActionPerformed
        
        cantidadPartidas1 = 1;
    }//GEN-LAST:event_UnaPartidaActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_botonVolverActionPerformed

    private void DosPartidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DosPartidasActionPerformed
        cantidadPartidas1 = 2;
    }//GEN-LAST:event_DosPartidasActionPerformed

    private void TresPartidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TresPartidasActionPerformed

        cantidadPartidas1 = 3;
    }//GEN-LAST:event_TresPartidasActionPerformed

    private void CuatroPartidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuatroPartidasActionPerformed
        cantidadPartidas1 = 4;
    }//GEN-LAST:event_CuatroPartidasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CuatroPartidas;
    private javax.swing.JButton DosPartidas;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel ImagenArriba;
    private javax.swing.JButton TresPartidas;
    private javax.swing.JButton UnaPartida;
    private javax.swing.JButton botonVolver;
    private javax.swing.JButton dosjugadores;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton unjugador;
    // End of variables declaration//GEN-END:variables
}
