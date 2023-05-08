
package GUI;

import Jugador.Jugador;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import java.util.Random;


public class VentanaJuego extends javax.swing.JFrame implements KeyListener{
    // ATRIBUTOS
    int x,y;
  
    public int posicion;
   
   
        
    boolean maquina = false;
    
    boolean estado = true; 
    String nextGame = "O";
    int contadorPartidas = 0;
    
    int victoriasJugador1 = 0;
    int victoriasJugador2 = 0;
    String turno = "X";
    JLabel lbs[] = new JLabel[9];       
    Jugador jugador;
    int combinacionesGanador[][] = {
        {1,2,3}, 
        {4,5,6},  // HORIZONALTES
        {7,8,9},
        
        {1,4,7},
        {2,5,8},  // VERTICALES
        {3,6,9},
        
        {3,5,7},  // DIAGONAL
        {1,5,9},
 
    };
    
    
    public VentanaJuego(Jugador jugador) {
        this.jugador = jugador;
        
        initComponents();
        
        lbs[0] = jLabel1;
        lbs[1] = jLabel2;
        lbs[2] = jLabel3;
        lbs[3] = jLabel4;
        lbs[4] = jLabel5;
        lbs[5] = jLabel6;
        lbs[6] = jLabel7;
        lbs[7] = jLabel8;
        lbs[8] = jLabel9;
       
    }
    
    public VentanaJuego() {
        
        initComponents();
       // jLabel10.setFocusable(true);
    }

    public void presionar(int posicion){
        

        int contador = 0;
       
         
        if (lbs[ posicion - 1 ].getText().equals("") && estado == true){
            lbs[ posicion - 1 ].setText(turno);
            comprobarGanador();
            cambiarTurno();
            if(maquina == true){
                Random rand = new Random();
                
                while(contador == 0){
                    int numeroAleatorio = rand.nextInt(9);
                    if (lbs[ numeroAleatorio ].getText().equals("") && estado == true){
                        lbs[numeroAleatorio].setText(turno);
                        comprobarGanador();
                        cambiarTurno();
                        contador = 1;
                    }
                    
                
                }
                    
            }
               
        }
        
    }
    public void cambiarTurno(){
        if (turno == "X"){
            turno = "O";
        }
        else{
            turno = "X";
        }
    }
    public void revisarTablero(){
        
    }
    public void comprobarGanador(){
        
        for ( int i = 0; i < combinacionesGanador.length; i++){
            if( lbs[combinacionesGanador[i][0] - 1 ].getText().equals("X") && 
                    lbs[combinacionesGanador[i][1] - 1 ].getText().equals("X")&&
                    lbs[combinacionesGanador[i][2] - 1 ].getText().equals("X")){
                
                victoriasJugador1++; // SI GANA X LE SUMA 1 A victoriasJugador1
                
                lbs[combinacionesGanador[i][0] - 1 ].setForeground(Color.green);
                lbs[combinacionesGanador[i][1] - 1 ].setForeground(Color.green);
                lbs[combinacionesGanador[i][2] - 1 ].setForeground(Color.green);
                
                estado = false;
            }
            if( lbs[combinacionesGanador[i][0] - 1 ].getText().equals("O") && 
                    lbs[combinacionesGanador[i][1] - 1 ].getText().equals("O") &&
                    lbs[combinacionesGanador[i][2] - 1 ].getText().equals("O") ){
                
                    victoriasJugador2++; // SI GANA O LE SUMA 1 A victoriasJugador2
                    
                lbs[combinacionesGanador[i][0] - 1 ].setForeground(Color.green);
                lbs[combinacionesGanador[i][1] - 1 ].setForeground(Color.green);
                lbs[combinacionesGanador[i][2] - 1 ].setForeground(Color.green);
                
                estado = false;
            }
            
        }
            
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonStartGame = new javax.swing.JButton();
        nextGameButton = new javax.swing.JButton();
        labelWinsPlayer = new javax.swing.JLabel();
        labelWinsPlayer2 = new javax.swing.JLabel();
        Rondas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelTablero = new javax.swing.JLabel();
        labelCPU = new javax.swing.JLabel();
        labelPlayerName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonStartGame.setText("START GAME");
        botonStartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonStartGameActionPerformed(evt);
            }
        });
        jPanel1.add(botonStartGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 160, -1));

        nextGameButton.setText("NEXT GAME");
        nextGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextGameButtonActionPerformed(evt);
            }
        });
        jPanel1.add(nextGameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        labelWinsPlayer.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        labelWinsPlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelWinsPlayer.setText("0");
        labelWinsPlayer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(labelWinsPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 70, 40));

        labelWinsPlayer2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        labelWinsPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelWinsPlayer2.setText("0");
        labelWinsPlayer2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(labelWinsPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 70, 40));

        Rondas.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jPanel1.add(Rondas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jLabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel1KeyPressed(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 60, 50));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jLabel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel2KeyPressed(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 60, 50));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 60, 50));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 60, 50));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 60, 50));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 60, 50));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 60, 50));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 60, 50));

        jLabel10.setBackground(new java.awt.Color(255, 51, 51));
        jLabel10.setForeground(new java.awt.Color(255, 51, 0));
        jLabel10.setText("jLabel10");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        jLabel10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel10KeyPressed(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 80, 60));

        labelTablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoJuego.png"))); // NOI18N
        jPanel1.add(labelTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 280, 200));

        labelCPU.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jPanel1.add(labelCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        labelPlayerName.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jPanel1.add(labelPlayerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 70, 60));

        Fondo.setBackground(new java.awt.Color(255, 0, 0));
        Fondo.setForeground(new java.awt.Color(255, 51, 0));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Madera.jpg"))); // NOI18N
        Fondo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FondoKeyPressed(evt);
            }
        });
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 370));

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

    private void botonStartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonStartGameActionPerformed
        if(jugador.machine == true){
            maquina = true;
        }
        labelPlayerName.setText(jugador.nombre1);
        labelCPU.setText(jugador.nombre2);
        Rondas.setText("RONDA # " + Integer.toString(contadorPartidas+1));
    }//GEN-LAST:event_botonStartGameActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        presionar(1);
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        presionar(2);
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        presionar(4);
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        presionar(5);
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        presionar(6);
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        presionar(7);
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        presionar(8);
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        presionar(9);
    }//GEN-LAST:event_jLabel9MousePressed

   
    private void nextGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextGameButtonActionPerformed
        if(victoriasJugador1 == 0 && victoriasJugador2 == 0){
            contadorPartidas--;
        } // CONDICIONAL PARA CUANDO NADIE GANA CUANDO ES SOLO UNA PARTIDA
        estado = true;  
        turno = nextGame;
        if (nextGame.equals("O")){
            nextGame = "X";
        }
        else{
            nextGame = "O";
        }
        contadorPartidas++;
        Rondas.setText("RONDA # " + Integer.toString(contadorPartidas+1));
  
        System.out.println("VICTORIAS JUGADOR 1 = "+jugador.WinsPlayer1);
        System.out.println("VICTORIAS JUGADOR 2 = "+jugador.WinsPlayer2);
        jugador.WinsPlayer1 = victoriasJugador1;
        jugador.WinsPlayer2 = victoriasJugador2;
        System.out.println("VICTORIAS JUGADOR 1 = "+jugador.WinsPlayer1);
        System.out.println("VICTORIAS JUGADOR 2 = "+jugador.WinsPlayer2);
        labelWinsPlayer.setText(Integer.toString(jugador.WinsPlayer1));
        labelWinsPlayer2.setText(Integer.toString(jugador.WinsPlayer2));
        if (contadorPartidas < jugador.numeroPartidas){
            for( int i = 0; i < lbs.length; i ++){
                lbs[i].setText("");
                lbs[i].setForeground(Color.black);
            }
        }
        else{
            VentanaEstadisticas ventanaEstadisticas = new VentanaEstadisticas(jugador);
            ventanaEstadisticas.setVisible(true);
            ventanaEstadisticas.setLocationRelativeTo(null);
            this.setVisible(false);
        }
            
    }//GEN-LAST:event_nextGameButtonActionPerformed

    private void jLabel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel1KeyPressed
        // TODO add your handling code here:
      
        
    }//GEN-LAST:event_jLabel1KeyPressed

    private void jLabel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel2KeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jLabel2KeyPressed

    private void jLabel10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel10KeyPressed
       
        // TODO add your handling code here:
      
       
       /*switch(e.getKeyChar()){
            case 'a':label.setLocation(label.getX()-1,label.getY());
                break;
            case 'w':label.setLocation(label.getX(),label.getY()-1);
                break;
            case 's':label.setLocation(label.getX(),label.getY()+1);
                break;
            case 'd':label.setLocation(label.getX()+1,label.getY());
                break;*/
       
       
          
    }//GEN-LAST:event_jLabel10KeyPressed

    private void FondoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FondoKeyPressed
        // TODO add your handling code here:
        
       /* x=jLabel10.getX();
        y=jLabel10.getY();
        System.out.println(jLabel10.getLocation());
        switch(evt.getExtendedKeyCode()){
            case KeyEvent.VK_UP :jLabel10.setLocation(x,y-2);
                break;
            case KeyEvent.VK_DOWN :jLabel10.setLocation(x,y+2);
                break;
            case KeyEvent.VK_LEFT :jLabel10.setLocation(x-2,y);
                break;
            case KeyEvent.VK_RIGHT :jLabel10.setLocation(x+2,y);*/
        
        
        
    }//GEN-LAST:event_FondoKeyPressed

    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Rondas;
    private javax.swing.JButton botonStartGame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCPU;
    private javax.swing.JLabel labelPlayerName;
    private javax.swing.JLabel labelTablero;
    private javax.swing.JLabel labelWinsPlayer;
    private javax.swing.JLabel labelWinsPlayer2;
    private javax.swing.JButton nextGameButton;
    // End of variables declaration//GEN-END:variables


    /*@Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar()){
            case 'a':jLabel10.setLocation(jLabel10.getX()-1,jLabel10.getY());
                break;
            case 'w':jLabel10.setLocation(jLabel10.getX(),jLabel10.getY()-1);
                break;
            case 's':jLabel10.setLocation(jLabel10.getX(),jLabel10.getY()+1);
                break;
            case 'd':jLabel10.setLocation(jLabel10.getX()+1,jLabel10.getY());
                break;
        }
    }

    public void keyPressed(KeyEvent e) {
        switch(e.getKeyChar()){
            case 'a':jLabel10.setLocation(jLabel10.getX()-1,jLabel10.getY());
                break;
            case 'w':jLabel10.setLocation(jLabel10.getX(),jLabel10.getY()-1);
                break;
            case 's':jLabel10.setLocation(jLabel10.getX(),jLabel10.getY()+1);
                break;
            case 'd':jLabel10.setLocation(jLabel10.getX()+1,jLabel10.getY());
                break;
        }
    }
    

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You relased key char:"+e.getKeyChar());
    }*/

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
    
}
