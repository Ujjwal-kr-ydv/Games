/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiktaktes;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class tiktaktoe_s extends javax.swing.JFrame {
    private String startGame ="X";
    private int xCount =0;
    private int oCount =0;
    
    public tiktaktoe_s() {
        initComponents();
        setSize(1200, 600);
        setLocationRelativeTo(null);
    }
        private void gameScore(){
                jlblPlayerX.setText(String.valueOf(xCount));
                  jlblPlayerO.setText(String.valueOf(oCount));
                        }
        private void choose_a_player()
        {
            if(startGame.equalsIgnoreCase("X")){
                startGame = "O";
            }
            else {
                startGame = "X";
            }
        }
        private void winningGame(){
           String b1 =  jButton1.getText();
           String b2 =  jButton2.getText();
           String b3 =  jButton3.getText();
           
           String b4 =  jButton4.getText();
           String b5 =  jButton5.getText();
           String b6 =  jButton6.getText();
           
           String b7 =  jButton7.getText();
           String b8 =  jButton8.getText();
           String b9 =  jButton9.getText();
           if(b1 == ("X") && b2 == ("X") && b3 == ("X"))
                   { JOptionPane.showMessageDialog(this, "Player X wins", "TikTakToe",JOptionPane.INFORMATION_MESSAGE);
                   xCount++;
                   gameScore(); 
                   jButton1.setBackground(Color.YELLOW);
                   jButton2.setBackground(Color.YELLOW);
                   jButton3.setBackground(Color.YELLOW);
                   
                   }
           
           if(b4 == ("X") && b5 == ("X") && b6 == ("X"))
                   { JOptionPane.showMessageDialog(this, "Player X wins", "TikTakToe",JOptionPane.INFORMATION_MESSAGE);
                   xCount++;
                   gameScore(); 
                   jButton4.setBackground(Color.CYAN);
                   jButton5.setBackground(Color.CYAN);
                   jButton6.setBackground(Color.CYAN);
                   
                   }
           
           if(b7 == ("X") && b8 == ("X") && b9 == ("X"))
                   { JOptionPane.showMessageDialog(this, "Player X wins", "TikTakToe",JOptionPane.INFORMATION_MESSAGE);
                   xCount++;
                   gameScore(); 
                   jButton7.setBackground(Color.YELLOW);
                   jButton8.setBackground(Color.YELLOW);
                   jButton9.setBackground(Color.YELLOW);
                   
                   }
           if(b1 == ("X") && b4 == ("X") && b7 == ("X"))
                   { JOptionPane.showMessageDialog(this, "Player X wins", "TikTakToe",JOptionPane.INFORMATION_MESSAGE);
                   xCount++;
                   gameScore(); 
                   jButton1.setBackground(Color.YELLOW);
                   jButton4.setBackground(Color.YELLOW);
                   jButton7.setBackground(Color.YELLOW);
                   
                   }
           if(b2 == ("X") && b5 == ("X") && b8 == ("X"))
                   { JOptionPane.showMessageDialog(this, "Player X wins", "TikTakToe",JOptionPane.INFORMATION_MESSAGE);
                   xCount++;
                   gameScore(); 
                   jButton2.setBackground(Color.YELLOW);
                   jButton5.setBackground(Color.YELLOW);
                   jButton8.setBackground(Color.YELLOW);
                   
                   }
           if(b3 == ("X") && b6 == ("X") && b9 == ("X"))
                   { JOptionPane.showMessageDialog(this, "Player X wins", "TikTakToe",JOptionPane.INFORMATION_MESSAGE);
                   xCount++;
                   gameScore(); 
                   jButton3.setBackground(Color.YELLOW);
                   jButton6.setBackground(Color.YELLOW);
                   jButton9.setBackground(Color.YELLOW);
                   
                   }
           if(b1 == ("X") && b5 == ("X") && b9 == ("X"))
                   { JOptionPane.showMessageDialog(this, "Player X wins", "TikTakToe",JOptionPane.INFORMATION_MESSAGE);
                   xCount++;
                   gameScore(); 
                   jButton1.setBackground(Color.YELLOW);
                   jButton5.setBackground(Color.YELLOW);
                   jButton9.setBackground(Color.YELLOW);
                  
                   
                   }
           if(b3 == ("X") && b5 == ("X") && b7 == ("X"))
                   { JOptionPane.showMessageDialog(this, "Player X wins", "TikTakToe",JOptionPane.INFORMATION_MESSAGE);
                   xCount++;
                   gameScore(); 
                   jButton3.setBackground(Color.YELLOW);
                   jButton5.setBackground(Color.YELLOW);
                   jButton7.setBackground(Color.YELLOW);
                   
                   }
            if(b1 == ("O") && b2 == ("O") && b3 == ("O"))
                   { JOptionPane.showMessageDialog(this, "Player O wins", "TikTakToe",JOptionPane.INFORMATION_MESSAGE);
                   oCount++;
                   gameScore(); 
                   jButton1.setBackground(Color.YELLOW);
                   jButton2.setBackground(Color.YELLOW);
                   jButton3.setBackground(Color.YELLOW);
                   
                   }
           
           if(b4 == ("O") && b5 == ("O") && b6 == ("O"))
                   { JOptionPane.showMessageDialog(this, "Player O wins", "TikTakToe",JOptionPane.INFORMATION_MESSAGE);
                   oCount++;
                   gameScore(); 
                   jButton4.setBackground(Color.CYAN);
                   jButton5.setBackground(Color.CYAN);
                   jButton6.setBackground(Color.CYAN);
                   
                   }
           
           if(b7 == ("O") && b8 == ("O") && b9 == ("O"))
                   { JOptionPane.showMessageDialog(this, "Player O wins", "TikTakToe",JOptionPane.INFORMATION_MESSAGE);
                   oCount++;
                   gameScore(); 
                   jButton7.setBackground(Color.YELLOW);
                   jButton8.setBackground(Color.YELLOW);
                   jButton9.setBackground(Color.YELLOW);
                   
                   }
           if(b1 == ("O") && b4 == ("O") && b7 == ("O"))
                   { JOptionPane.showMessageDialog(this, "Player O wins", "TikTakToe",JOptionPane.INFORMATION_MESSAGE);
                   oCount++;
                   gameScore(); 
                   jButton1.setBackground(Color.YELLOW);
                   jButton4.setBackground(Color.YELLOW);
                   jButton7.setBackground(Color.YELLOW);
                   
                   }
           if(b2 == ("O") && b5 == ("O") && b8 == ("O"))
                   { JOptionPane.showMessageDialog(this, "Player O wins", "TikTakToe",JOptionPane.INFORMATION_MESSAGE);
                   oCount++;
                   gameScore(); 
                   jButton2.setBackground(Color.YELLOW);
                   jButton5.setBackground(Color.YELLOW);
                   jButton8.setBackground(Color.YELLOW);
                   
                   }
           if(b3 == ("O") && b6 == ("O") && b9 == ("O"))
                   { JOptionPane.showMessageDialog(this, "Player O wins", "TikTakToe",JOptionPane.INFORMATION_MESSAGE);
                   oCount++;
                   gameScore(); 
                   jButton3.setBackground(Color.YELLOW);
                   jButton6.setBackground(Color.YELLOW);
                   jButton9.setBackground(Color.YELLOW);
                   
                   }
           if(b1 == ("O") && b5 == ("O") && b9 == ("O"))
                   { JOptionPane.showMessageDialog(this, "Player O wins", "TikTakToe",JOptionPane.INFORMATION_MESSAGE);
                   oCount++;
                   gameScore(); 
                   jButton1.setBackground(Color.YELLOW);
                   jButton5.setBackground(Color.YELLOW);
                   jButton9.setBackground(Color.YELLOW);
                  
                   
                   }
           if(b3 == ("O") && b5 == ("O") && b7 == ("O"))
                   { JOptionPane.showMessageDialog(this, "Player O wins", "TikTakToe",JOptionPane.INFORMATION_MESSAGE);
                   oCount++;
                   gameScore(); 
                   jButton3.setBackground(Color.YELLOW);
                   jButton5.setBackground(Color.YELLOW);
                   jButton7.setBackground(Color.YELLOW);
                   
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jlblPlayerX = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jlblPlayerO = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jbtnReset = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tik Tak Toe");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tik Tok Toe");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Player X:");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel19, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jlblPlayerX.setBackground(new java.awt.Color(255, 255, 255));
        jlblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerX.setText("jLabel3");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblPlayerX, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblPlayerX, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel20, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Player O:");
        jPanel11.add(jLabel4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jlblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jlblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerO.setText("jLabel5");
        jPanel12.add(jlblPlayerO, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel18, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel16.add(jbtnReset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel17.add(jbtnExit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
         jButton1.setText(startGame);
        {
            if(startGame.equalsIgnoreCase("X")){
                 jButton1.setForeground(Color.GREEN);
            }
            else {
               jButton1.setForeground(Color.BLUE);
            } 
           choose_a_player();
           winningGame();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
   
    private JFrame frame;
    
    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
       jButton1.setText(null);
       jButton2.setText(null);
       jButton3.setText(null);
       
       jButton4.setText(null);
       jButton5.setText(null);
       jButton6.setText(null);
       
       jButton7.setText(null);
       jButton8.setText(null);
       jButton9.setText(null);
       
       jButton1.setBackground(Color.LIGHT_GRAY);
       jButton2.setBackground(Color.LIGHT_GRAY);
       jButton3.setBackground(Color.LIGHT_GRAY);
       
       jButton4.setBackground(Color.LIGHT_GRAY);
       jButton5.setBackground(Color.LIGHT_GRAY);
       jButton6.setBackground(Color.LIGHT_GRAY);
       
       jButton7.setBackground(Color.LIGHT_GRAY);
       jButton8.setBackground(Color.LIGHT_GRAY);
       jButton9.setBackground(Color.LIGHT_GRAY);
       
       
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you wnt to Exit","Tik Tak Toe",
               JOptionPane.YES_NO_OPTION )== JOptionPane.YES_NO_OPTION );
        {
            System.exit(0);
        }
        
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         jButton2.setText(startGame);
        {
            if(startGame.equalsIgnoreCase("X")){
                 jButton2.setForeground(Color.GREEN);
            }
            else {
               jButton2.setForeground(Color.BLUE);
            } 
           choose_a_player();
           winningGame();
        }
                         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          jButton3.setText(startGame);
        {
            if(startGame.equalsIgnoreCase("X")){
                 jButton3.setForeground(Color.GREEN);
            }
            else {
               jButton3.setForeground(Color.BLUE);
            } 
           choose_a_player();
           winningGame();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
           jButton4.setText(startGame);
        {
            if(startGame.equalsIgnoreCase("X")){
                 jButton4.setForeground(Color.GREEN);
            }
            else {
               jButton4.setForeground(Color.BLUE);
            } 
           choose_a_player();
           winningGame();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
          jButton5.setText(startGame);
        {
            if(startGame.equalsIgnoreCase("X")){
                 jButton5.setForeground(Color.GREEN);
            }
            else {
               jButton5.setForeground(Color.BLUE);
            } 
           choose_a_player();
           winningGame();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         jButton6.setText(startGame);
        {
            if(startGame.equalsIgnoreCase("X")){
                 jButton6.setForeground(Color.GREEN);
            }
            else {
               jButton6.setForeground(Color.BLUE);
            } 
           choose_a_player();
           winningGame();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
          jButton7.setText(startGame);
        {
            if(startGame.equalsIgnoreCase("X")){
                 jButton7.setForeground(Color.GREEN);
            }
            else {
               jButton7.setForeground(Color.BLUE);
            } 
           choose_a_player();
           winningGame();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
           jButton8.setText(startGame);
        {
            if(startGame.equalsIgnoreCase("X")){
                 jButton8.setForeground(Color.GREEN);
            }
            else {
               jButton8.setForeground(Color.BLUE);
            } 
           choose_a_player();
           winningGame();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
          jButton9.setText(startGame);
        {
            if(startGame.equalsIgnoreCase("X")){
                 jButton9.setForeground(Color.GREEN);
            }
            else {
               jButton9.setForeground(Color.BLUE);
            } 
           choose_a_player();
           winningGame();
        }
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(tiktaktoe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tiktaktoe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tiktaktoe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tiktaktoe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tiktaktoe_s().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JLabel jlblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    // End of variables declaration//GEN-END:variables
}
