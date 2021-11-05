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
    
    //Initialize bet by creating a new bet with the user inputting four numbers
    public Bet createBet(int firstNum, int secondNum, int thirdNum, int fourthNum, int betFee){
        this.bet = new Bet(firstNum, secondNum, thirdNum, fourthNum,  betFee);
        return this.bet;
    }
    
    public Bet createBet(int firstNum, int secondNum, int thirdNum, int fourthNum, int luckyNum, int betFee) {
        this.bet  =  new SuperBet(firstNum, secondNum, thirdNum, fourthNum, luckyNum, betFee);
        return this.bet;
    }
    
    public ArrayList<Integer> drawRanNumbers(){
        
        ArrayList<Integer> ranDrawnNumbers = new ArrayList();
        Random drawRanNumber = new Random();
        
      
        
        while(ranDrawnNumbers.size() < 4){
            int drawLottoNum = drawRanNumber.nextInt(20); //generate random numbers from 1 - 20
            if(!ranDrawnNumbers.contains(drawLottoNum) && drawLottoNum !=0 )  // check if the number already exist in the array and if the number is equal to 0.
              ranDrawnNumbers.add(drawLottoNum); // add the random generated to the array list when all checks pass
            
      	} 
        
        //System.out.println(ranDrawnNumbers);
        
        this.drawNumbers = ranDrawnNumbers; 
        return this.drawNumbers;
    }
    
    public int drawLuckyNumber(){  // generate one random number that is not equal to zero.
        
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
            if(bet.getUserNumber().contains(i)) // a check to see if user inputted number are in the drawn numbers
                matchedNumbers.add(i);          // if inputted number is seen in drawn numbers then we add to a new array
        }
        
        return matchedNumbers.size();           // return the array size as the total number of matched bet.
    }
    
        
    
}
