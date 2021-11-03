/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lottery;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author sophie
 */
public class Tolo {
    
    private ArrayList<Integer> drawNumbers;
    private int luckyNumber ;
    private Bet bet;
    
    public Tolo(){
        this.bet = null;
    }
    
    public Bet createBet(int firstNum, int secondNum, int thirdNum, int fourthNum, int betFee){
        this.bet = new Bet(firstNum, secondNum, thirdNum, fourthNum,  betFee);
        return this.bet;
    }
    
    public Bet createBet(int firstNum, int secondNum, int thirdNum, int fourthNum, int luckyNum, int betFee) {
        this.bet  =  new SuperBet(firstNum, secondNum, thirdNum, fourthNum, luckyNum, betFee);
        return this.bet;
    }
    
    public ArrayList<Integer> drawRanNumbers(){
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> ranDrawnNumbers = new ArrayList();
        Random drawRanNumber = new Random();
        
        for (int i = 1; i <= 20; i++)
               numbers.add(i); //add number 1 to 20 to the array list
        
        
        
        for (int j = 1; j <= 4; j++) {
                int drawLottoNum = drawRanNumber.nextInt(numbers.size());
                ranDrawnNumbers.add(numbers.get(drawLottoNum));
                numbers.remove(drawLottoNum);
           }
        
        this.drawNumbers = ranDrawnNumbers; 
        return this.drawNumbers;
    }
    
    public int drawLuckyNumber(){
        
        Random rand = new Random();
        
        this.luckyNumber = rand.nextInt(10);
        
        if (this.luckyNumber == 0)
            
            this.luckyNumber += 1;
        
        return this.luckyNumber;
    }
    
    
    
    public int playBet(){
        this.drawRanNumbers();
        this.drawLuckyNumber();
        return this.bet.computeGain(this.getTotalMatchedNumbers(), this.luckyNumber);
    }
    
    
    public int getTotalMatchedNumbers(){
        ArrayList<Integer> matchedNumbers = new ArrayList();
        
        for (Integer i : this.drawNumbers) {
            if(bet.getUserNumber().contains(i))
                matchedNumbers.add(i);
        }
        
        return matchedNumbers.size();
    }
    
    
    
    public ArrayList<Integer> getDrawNumbers() {
        return drawNumbers;
    }
        
    
}
