package GUI;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;
import napakalaki.CultistPlayer;
import napakalaki.Napakalaki;
import napakalaki.Player;
import napakalaki.Treasure;

public class PlayerView extends javax.swing.JPanel {

    private Player playerModel;
    private Napakalaki napakalakiModel;
            
    public PlayerView() {
        initComponents();
    }

    public void setNapakalakiModel(Napakalaki napakalaki) {
        napakalakiModel = napakalaki;
    }
    
    public void setPlayer(Player p) {
        playerModel = p;
        this.name.setText("Name: " + playerModel.getName());
        this.level.setText("Level: " + 
                Integer.toString(playerModel.getLevels()));
        this.death.setText("Dead: " + 
                Boolean.toString(playerModel.isDead()));
        this.canISteal.setText("CanISteal: " + 
                Boolean.toString(playerModel.canISteal()));
        this.enemy.setText("Enemy: " + playerModel.getEnemyName());
        this.cultist.setText("Cultist: " + 
                Boolean.toString(p instanceof CultistPlayer));
        
        if (p.getPendingBadConsequence() == null) {
            this.pendingBadConsequenceView.setVisible(false);
        } else {
            this.pendingBadConsequenceView.setPendingBadConsequence(
                p.getPendingBadConsequence());
            this.pendingBadConsequenceView.setVisible(true);
        }
        fillTreasurePanel(visibleTreasures, playerModel.getVisibleTreasures());
        fillTreasurePanel(hiddenTreasures, playerModel.getHiddenTreasures());        
        repaint();
        revalidate();
    }
    
    private void fillTreasurePanel (JPanel aPanel, ArrayList<Treasure> aList) {
        // Se elimina la información antigua
        aPanel.removeAll();
        // Se recorre la lista de tesoros construyendo y añadiendo sus vistas
        // al panel
        for (Treasure t : aList) {
            TreasureView aTreasureView = new TreasureView();
            aTreasureView.setTreasure (t);
            aTreasureView.setVisible (true);
            aPanel.add (aTreasureView);
        }
        // Se fuerza la actualización visual del panel
        aPanel.repaint();
        aPanel.revalidate();
    }
    
    private ArrayList<Treasure> getSelectedTreasures(JPanel aPanel) {
        // Se recorren los tesoros que contiene el panel,
        // almacenando en un vector aquellos que están seleccionados.
        // Finalmente se devuelve dicho vector.
        TreasureView tv;
        ArrayList<Treasure> output = new ArrayList();
        for (Component c : aPanel.getComponents()) {
            tv = (TreasureView) c;
            if ( tv.isSelected() )
                output.add ( tv.getTreasure() );
        }
        return output;
    }
    
    public void setStealTreasureButton (boolean b) {
        stealTreasureButton.setEnabled(b && playerModel.canISteal());
    }
    
    public void setMakeVisibleButton (boolean b) {
        makeVisibleButton.setEnabled(b);
    }
    
    public void setDiscardTreasuresButtons (boolean b) {
        discardAllTreasuresButton.setEnabled(b);
        discardTreasuresButton.setEnabled(b);
    }
    
    public void setAllButtons (boolean b) {
        setStealTreasureButton(b);
        makeVisibleButton.setEnabled(b);
        setDiscardTreasuresButtons(b);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        treasureView1 = new GUI.TreasureView();
        treasureView2 = new GUI.TreasureView();
        name = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        death = new javax.swing.JLabel();
        canISteal = new javax.swing.JLabel();
        enemy = new javax.swing.JLabel();
        cultist = new javax.swing.JLabel();
        visibleTreasures = new javax.swing.JPanel();
        hiddenTreasures = new javax.swing.JPanel();
        stealTreasureButton = new javax.swing.JButton();
        makeVisibleButton = new javax.swing.JButton();
        discardTreasuresButton = new javax.swing.JButton();
        discardAllTreasuresButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pendingBadConsequenceView = new GUI.PendingBadConsequenceView();
        jLabel1 = new javax.swing.JLabel();

        name.setText("Name");

        level.setText("Level");

        death.setText("Death");

        canISteal.setText("CanISteal");

        enemy.setText("Enemy");

        cultist.setText("Cultist");

        visibleTreasures.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        hiddenTreasures.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        stealTreasureButton.setText("Steal Treasure");
        stealTreasureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stealTreasureButtonActionPerformed(evt);
            }
        });

        makeVisibleButton.setText("Make Visible");
        makeVisibleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeVisibleButtonActionPerformed(evt);
            }
        });

        discardTreasuresButton.setText("Discard Treasures");
        discardTreasuresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardTreasuresButtonActionPerformed(evt);
            }
        });

        discardAllTreasuresButton.setText("Discard All Treasures");
        discardAllTreasuresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardAllTreasuresButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Visible Treasures");

        jLabel3.setText("Hidden Treasures");

        pendingBadConsequenceView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Pending Bad Consequence");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(death)
                            .addComponent(canISteal)
                            .addComponent(enemy)
                            .addComponent(cultist)
                            .addComponent(level)
                            .addComponent(name))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pendingBadConsequenceView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(discardTreasuresButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(discardAllTreasuresButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(makeVisibleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stealTreasureButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(visibleTreasures, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(64, 64, 64)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(113, 113, 113))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hiddenTreasures, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(32, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name)
                            .addComponent(jLabel1))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(level)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(death)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(canISteal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(enemy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cultist))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(pendingBadConsequenceView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(makeVisibleButton)
                            .addComponent(stealTreasureButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(discardAllTreasuresButton)
                            .addComponent(discardTreasuresButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(visibleTreasures, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hiddenTreasures, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void stealTreasureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stealTreasureButtonActionPerformed
        playerModel.stealTreasure();
        setPlayer (napakalakiModel.getCurrentPlayer());
        stealTreasureButton.setEnabled(playerModel.canISteal());
    }//GEN-LAST:event_stealTreasureButtonActionPerformed

    private void makeVisibleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeVisibleButtonActionPerformed
        ArrayList<Treasure> selHidden = getSelectedTreasures (hiddenTreasures);
        napakalakiModel.makeTreasuresVisible (selHidden);
        setPlayer (napakalakiModel.getCurrentPlayer());
    }//GEN-LAST:event_makeVisibleButtonActionPerformed

    private void discardTreasuresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardTreasuresButtonActionPerformed
        ArrayList<Treasure> sel = getSelectedTreasures (hiddenTreasures);
        napakalakiModel.discardHiddenTreasures(sel);
        sel = getSelectedTreasures (visibleTreasures);
        napakalakiModel.discardVisibleTreasures(sel);
        setPlayer (napakalakiModel.getCurrentPlayer());
    }//GEN-LAST:event_discardTreasuresButtonActionPerformed

    private void discardAllTreasuresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardAllTreasuresButtonActionPerformed
        playerModel.discardAllTreasures();
        setPlayer (napakalakiModel.getCurrentPlayer());
    }//GEN-LAST:event_discardAllTreasuresButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel canISteal;
    private javax.swing.JLabel cultist;
    private javax.swing.JLabel death;
    private javax.swing.JButton discardAllTreasuresButton;
    private javax.swing.JButton discardTreasuresButton;
    private javax.swing.JLabel enemy;
    private javax.swing.JPanel hiddenTreasures;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel level;
    private javax.swing.JButton makeVisibleButton;
    private javax.swing.JLabel name;
    private GUI.PendingBadConsequenceView pendingBadConsequenceView;
    private javax.swing.JButton stealTreasureButton;
    private GUI.TreasureView treasureView1;
    private GUI.TreasureView treasureView2;
    private javax.swing.JPanel visibleTreasures;
    // End of variables declaration//GEN-END:variables
}
