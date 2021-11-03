/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lottery;

/**
 *
 * @author sophie
 */
public class SuperBet extends Bet{
    
    private int luckyNumber;
    
    public SuperBet(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int _luckyNumber, int betFee) {
        super(firstNumber, secondNumber, thirdNumber, fourthNumber, betFee);
        this.luckyNumber = _luckyNumber;
    }

    public int getLuckyNumber() {
        return luckyNumber;
    }
    
    @Override
    public int computeGain(int allMatchedNumbers, int luckyNum){
        
        int gain = super.computeGain(allMatchedNumbers, luckyNumber);
                
        if(luckyNumber == this.getLuckyNumber()){
            gain = gain * 5 ;
        }
        
        return gain;  
    }
    
    
}
