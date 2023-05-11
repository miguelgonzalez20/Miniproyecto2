package GUI;

import Jugador.Jugador;

/**
 *
 * @author Miguel
 */
public class VentanaEstadisticas extends javax.swing.JFrame {

    Jugador jugador;
    
    public VentanaEstadisticas(Jugador jugador) {
        this.jugador = jugador;
        initComponents();
    }
    
    public VentanaEstadisticas() {
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
        jLabel4 = new javax.swing.JLabel();
        statsButton = new javax.swing.JButton();
        winsPlayer2 = new javax.swing.JTextField();
        winsPlayer1 = new javax.swing.JTextField();
        P2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        P1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen1.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 160, 30));

        statsButton.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        statsButton.setText("SHOW STATS");
        statsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(statsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        winsPlayer2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        winsPlayer2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(winsPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 80, 40));

        winsPlayer1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        winsPlayer1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(winsPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 80, 40));

        P2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        P2.setText("PLAYER 2");
        jPanel1.add(P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setText("WINS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        P1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        P1.setText("PLAYER 1");
        jPanel1.add(P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Madera.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 300));

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

    private void statsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statsButtonActionPerformed
        P1.setText(jugador.nombre1);
        P2.setText(jugador.nombre2);
        String wins1 = Integer.toString(jugador.WinsPlayer1);
        String wins2 = Integer.toString(jugador.WinsPlayer2);
        winsPlayer1.setText(wins1);
        winsPlayer2.setText(wins2);
    }//GEN-LAST:event_statsButtonActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel P1;
    private javax.swing.JLabel P2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton statsButton;
    private javax.swing.JTextField winsPlayer1;
    private javax.swing.JTextField winsPlayer2;
    // End of variables declaration//GEN-END:variables
}
