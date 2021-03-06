/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import NapakalakiGame.CombatResult;
import NapakalakiGame.Napakalaki;

/**
 *
 * @author Ocete
 */
public class NapakalakiView extends javax.swing.JFrame {
    
    Napakalaki napakalakiModel;
    
    public void setNapakalaki(Napakalaki n) {
        napakalakiModel = n;
        currentPlayerView.setNapakalakiModel(napakalakiModel);
        newTurn();
    }
    
    private void printCombatResult(CombatResult cR) {
        String message = null;
        switch (cR) {
            case WINGAME :                
                message = "HAS GANADO EL JUEGO";
                break;
            case WIN :
                message = "Ganaste";
                break;
            case LOSE :
                message = "Perdiste";
                break;
            case LOSEANDCONVERT :
                message = "Perdiste y ahora eres cultista";
        }
        combatResultLabel.setText("Combat result: " + message);
    }
    
    private void newTurn() {
        currentPlayerView.setPlayer(napakalakiModel.getCurrentPlayer());
        monsterView.setVisible(false);
        combatResultLabel.setVisible(false);
        combatButton.setEnabled(false);
        nextTurnButton.setEnabled(false);
        meetTheMonsterButton.setEnabled(true);
        currentPlayerView.setStealTreasureButton(false);
        currentPlayerView.setDiscardTreasuresButtons(false);
        repaint();
        revalidate();
    }
    
    public NapakalakiView() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        monsterView = new GUI.MonsterView();
        jLabel1 = new javax.swing.JLabel();
        meetTheMonsterButton = new javax.swing.JButton();
        combatButton = new javax.swing.JButton();
        nextTurnButton = new javax.swing.JButton();
        combatResultLabel = new javax.swing.JLabel();
        currentPlayerView = new GUI.PlayerView();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        monsterView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Current Monster");

        meetTheMonsterButton.setText("Meet the monster");
        meetTheMonsterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meetTheMonsterButtonActionPerformed(evt);
            }
        });

        combatButton.setText("Combat");
        combatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combatButtonActionPerformed(evt);
            }
        });

        nextTurnButton.setText("Next turn");
        nextTurnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextTurnButtonActionPerformed(evt);
            }
        });

        combatResultLabel.setText("Combat Result");

        currentPlayerView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        currentPlayerView.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                currentPlayerViewKeyPressed(evt);
            }
        });

        jLabel2.setText("Current Player");

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(currentPlayerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(monsterView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combatButton)
                                .addGap(18, 18, 18)
                                .addComponent(combatResultLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(meetTheMonsterButton)
                                .addGap(18, 18, 18)
                                .addComponent(nextTurnButton)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(371, 371, 371)
                .addComponent(jLabel2)
                .addGap(516, 516, 516)
                .addComponent(jLabel1)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(monsterView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(meetTheMonsterButton)
                            .addComponent(nextTurnButton)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(combatButton)
                            .addComponent(combatResultLabel)))
                    .addComponent(currentPlayerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combatButtonActionPerformed
        CombatResult cR = napakalakiModel.developCombat();
        printCombatResult(cR);
        combatResultLabel.setVisible(true);
        nextTurnButton.setEnabled(true);
        combatButton.setEnabled(false);
        currentPlayerView.setPlayer(napakalakiModel.getCurrentPlayer());
        currentPlayerView.setAllButtons(true);
        repaint();
        revalidate();
        if (cR == CombatResult.WINGAME) {
            combatResultLabel.setBackground(Color.ORANGE);
            repaint();
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(NapakalakiView.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.exit(0);
        }
    }//GEN-LAST:event_combatButtonActionPerformed

    private void meetTheMonsterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meetTheMonsterButtonActionPerformed
        monsterView.setMonster(napakalakiModel.getCurrentMonster());
        monsterView.setVisible(true);
        combatButton.setEnabled(true);
        meetTheMonsterButton.setEnabled(false);
        currentPlayerView.setPlayer(napakalakiModel.getCurrentPlayer());
        currentPlayerView.setMakeVisibleButton(false);
        currentPlayerView.setDiscardTreasuresButtons(false);
        repaint();
        revalidate();
    }//GEN-LAST:event_meetTheMonsterButtonActionPerformed

    private void currentPlayerViewKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_currentPlayerViewKeyPressed
        // No sabemos quitar este método de aquí
    }//GEN-LAST:event_currentPlayerViewKeyPressed

    private void nextTurnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextTurnButtonActionPerformed
        if (napakalakiModel.nextTurn()) {
            newTurn();
        }
    }//GEN-LAST:event_nextTurnButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void showView() {
        this.setVisible(true);
        repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton combatButton;
    private javax.swing.JLabel combatResultLabel;
    private GUI.PlayerView currentPlayerView;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton meetTheMonsterButton;
    private GUI.MonsterView monsterView;
    private javax.swing.JButton nextTurnButton;
    // End of variables declaration//GEN-END:variables
}
