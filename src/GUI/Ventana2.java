/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Miguel
 */
public class Ventana2 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana2
     */
    public Ventana2() {
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
        botonVolver = new javax.swing.JButton();
        ImagenArriba = new javax.swing.JLabel();
        dosjugadores = new javax.swing.JButton();
        unjugador = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
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

        dosjugadores.setBackground(new java.awt.Color(0, 0, 0));
        dosjugadores.setForeground(new java.awt.Color(153, 255, 0));
        dosjugadores.setText("TWO PLAYER");
        dosjugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosjugadoresActionPerformed(evt);
            }
        });
        jPanel1.add(dosjugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 110, 30));

        unjugador.setBackground(new java.awt.Color(0, 0, 0));
        unjugador.setForeground(new java.awt.Color(102, 255, 0));
        unjugador.setText("SINGLE PLAYER");
        unjugador.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        unjugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unjugadorActionPerformed(evt);
            }
        });
        jPanel1.add(unjugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 100, 30));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(102, 255, 0));
        jButton3.setText("1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setForeground(new java.awt.Color(102, 255, 0));
        jButton5.setText("4");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setForeground(new java.awt.Color(102, 255, 0));
        jButton4.setText("2");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setForeground(new java.awt.Color(102, 255, 0));
        jButton6.setText("3");
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 0));
        jLabel2.setText("Numero de partidas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 240, 40));

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
      
        Nombre2 newframe4= new Nombre2();
        newframe4.setVisible(true);
        
        this.dispose();//para que no se acumulen las ventanas         // TODO add your handling code here:
    }//GEN-LAST:event_dosjugadoresActionPerformed

    private void unjugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unjugadorActionPerformed
           // TODO add your handling code here:
          
        Nombres newframe3= new Nombres();
        newframe3.setVisible(true);
        
        this.dispose();//para que no se acumulen las ventanas 
   
        
         
    }//GEN-LAST:event_unjugadorActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_botonVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel ImagenArriba;
    private javax.swing.JButton botonVolver;
    private javax.swing.JButton dosjugadores;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton unjugador;
    // End of variables declaration//GEN-END:variables
}
