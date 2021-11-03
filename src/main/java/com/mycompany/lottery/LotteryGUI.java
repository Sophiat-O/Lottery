/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lottery;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author sophie
 */
public class LotteryGUI extends javax.swing.JFrame {

    ArrayList<Integer> userNum;
    //ArrayList<Integer> matchedNum;
   

    /**
     * Creates new form LotteryGUI
     */
    public LotteryGUI() {
        initComponents();
        userNum = new ArrayList();
        //matchedNum = new ArrayList();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        firstNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        secondNumber = new javax.swing.JTextField();
        thirdNumber = new javax.swing.JTextField();
        fourthNumber = new javax.swing.JTextField();
        luckyNumber = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        betAmount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        drawBet = new javax.swing.JButton();

        jDialog1.setPreferredSize(new java.awt.Dimension(617, 300));
        jDialog1.setSize(new java.awt.Dimension(600, 408));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9.setText("jLabel9");

        jLabel10.setText("Gain =");

        jLabel11.setText("jLabel11");

        jLabel12.setText("€");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel12))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(61, 61, 61))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TOLO");

        firstNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNumberFocusLost(evt);
            }
        });

        jLabel1.setText("Choose your numbers");

        secondNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                secondNumberFocusLost(evt);
            }
        });

        thirdNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                thirdNumberFocusLost(evt);
            }
        });

        fourthNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fourthNumberFocusLost(evt);
            }
        });

        luckyNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                luckyNumberFocusLost(evt);
            }
        });

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Super Bet");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Super bet number");

        jLabel3.setText("Bet");

        jLabel4.setText("€");

        drawBet.setText("Draw Number");
        drawBet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawBetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(firstNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(secondNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(thirdNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fourthNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jCheckBox1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(betAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(luckyNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21)))
                    .addComponent(drawBet, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(luckyNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thirdNumber)
                    .addComponent(firstNumber)
                    .addComponent(secondNumber)
                    .addComponent(fourthNumber))
                .addGap(75, 75, 75)
                .addComponent(jCheckBox1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(betAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(drawBet, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(!jCheckBox1.isSelected()){
            luckyNumber.setVisible(false);
            jLabel2.setVisible(false);
        }
        else if(jCheckBox1.isSelected()){
            luckyNumber.setVisible(true);
            jLabel2.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void firstNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNumberFocusLost
        // TODO add your handling code here:
        if(Integer.parseInt(firstNumber.getText()) > 20 || Integer.parseInt(firstNumber.getText()) == 0){
            JOptionPane.showMessageDialog(null,"Choose a number that is not used between 1 - 20","Error", JOptionPane.ERROR_MESSAGE);
        }
        else
            userNum.add(Integer.parseInt(firstNumber.getText().trim()));
        
    }//GEN-LAST:event_firstNumberFocusLost

    private void secondNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_secondNumberFocusLost
        // TODO add your handling code here:
        if(Integer.parseInt(secondNumber.getText()) > 20 || userNum.contains(Integer.parseInt(secondNumber.getText())) 
                || Integer.parseInt(secondNumber.getText()) == 0 ){
            JOptionPane.showMessageDialog(null,"Choose a number that is not used between 1 - 20","Error", JOptionPane.ERROR_MESSAGE);
        }
        else
            userNum.add(Integer.parseInt(secondNumber.getText().trim()));
    }//GEN-LAST:event_secondNumberFocusLost

    private void thirdNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_thirdNumberFocusLost
        // TODO add your handling code here:
        if(Integer.parseInt(thirdNumber.getText()) > 20 || userNum.contains(Integer.parseInt(thirdNumber.getText())) || Integer.parseInt(thirdNumber.getText()) == 0 ){
            JOptionPane.showMessageDialog(null,"Choose a number that is not used between 1 - 20","Error", JOptionPane.ERROR_MESSAGE);
        }
        else
            userNum.add(Integer.parseInt(thirdNumber.getText().trim()));
    }//GEN-LAST:event_thirdNumberFocusLost

    private void fourthNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fourthNumberFocusLost
        // TODO add your handling code here:
        if(Integer.parseInt(fourthNumber.getText()) > 20 || userNum.contains(Integer.parseInt(fourthNumber.getText())) || Integer.parseInt(fourthNumber.getText()) == 0 ){
            JOptionPane.showMessageDialog(null,"Choose a number that is not used between 1 - 20","Error", JOptionPane.ERROR_MESSAGE);
        }
        else
            userNum.add(Integer.parseInt(fourthNumber.getText().trim()));
    }//GEN-LAST:event_fourthNumberFocusLost

    private void luckyNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_luckyNumberFocusLost
        // TODO add your handling code here:
        if(Integer.parseInt(luckyNumber.getText()) > 10  || Integer.parseInt(luckyNumber.getText()) == 0 ){
            JOptionPane.showMessageDialog(null,"Choose a number that is not used between 1 - 10","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_luckyNumberFocusLost

    private void drawBetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawBetActionPerformed
        // TODO add your handling code here:
        Tolo placeNewBet = new Tolo();
        
        ArrayList<Integer> ranNumber = new ArrayList();
        
        jDialog1.setVisible(true);
        
        if(jCheckBox1.isSelected()){
            
            jLabel9.setVisible(true);
            
            
            placeNewBet.createBet(userNum.get(0), userNum.get(1), userNum.get(2), userNum.get(3), Integer.parseInt(luckyNumber.getText().trim()), Integer.parseInt(betAmount.getText().trim()));
            
            jLabel11.setText(Integer.toString(placeNewBet.playBet()));
            
            jLabel5.setText(Integer.toString(placeNewBet.drawRanNumbers().get(0)));
            jLabel6.setText(Integer.toString(placeNewBet.drawRanNumbers().get(1)));
            jLabel7.setText(Integer.toString(placeNewBet.drawRanNumbers().get(2)));
            jLabel8.setText(Integer.toString(placeNewBet.drawRanNumbers().get(3)));
            jLabel9.setText(Integer.toString(placeNewBet.drawLuckyNumber()));
                
        }
        
        else if(!jCheckBox1.isSelected()){
            
            jLabel9.setVisible(false);
            
            placeNewBet.createBet(userNum.get(0), userNum.get(1), userNum.get(2), userNum.get(3), Integer.parseInt(betAmount.getText().trim()));
            
            jLabel11.setText(Integer.toString(placeNewBet.playBet()));
            
            jLabel5.setText(Integer.toString(placeNewBet.drawRanNumbers().get(0)));
            jLabel6.setText(Integer.toString(placeNewBet.drawRanNumbers().get(1)));
            jLabel7.setText(Integer.toString(placeNewBet.drawRanNumbers().get(2)));
            jLabel8.setText(Integer.toString(placeNewBet.drawRanNumbers().get(3)));    
        
        }
       
    }//GEN-LAST:event_drawBetActionPerformed

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
            java.util.logging.Logger.getLogger(LotteryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LotteryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LotteryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LotteryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LotteryGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField betAmount;
    private javax.swing.JButton drawBet;
    private javax.swing.JTextField firstNumber;
    private javax.swing.JTextField fourthNumber;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField luckyNumber;
    private javax.swing.JTextField secondNumber;
    private javax.swing.JTextField thirdNumber;
    // End of variables declaration//GEN-END:variables
}
