/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lottery;

import java.util.ArrayList;

/**
 *
 * @author sophie
 */
public class Bet {
    int fee;
    ArrayList<Integer> userNumber;
    
    public Bet(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int betFee){
        this.fee = betFee;
        userNumber = new ArrayList();
        userNumber.add(firstNumber);
        userNumber.add(secondNumber);
        userNumber.add(thirdNumber);
        userNumber.add(fourthNumber);
        
    }
    
    public int getBetFee(){
        return this.fee;
    }
    
    public ArrayList<Integer> getUserNumber(){
        return this.userNumber;
    }
    
    public int computeGain(int allMatchedNumbers, int luckyNumb){
        int gain = 0;
        
        if(allMatchedNumbers == 3){
            gain = this.getBetFee() * 5 ;
        }
        
        if(allMatchedNumbers == 4){
            gain = this.getBetFee() * 50 ;
        }
        
        return gain;  
    }
}
