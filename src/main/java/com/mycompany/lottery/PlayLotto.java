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
public class PlayLotto {
    
    int betFee;
    
    public PlayLotto(int _betFee){
        this.betFee = _betFee;
    }
    
    
    int getBetAmount(){
        return this.betFee;
    }
    
    
    public ArrayList<Integer> getRanMatchNumber() {
        
        ArrayList<Integer> genRanNumbers;
        ArrayList<Integer> chooseRanNumber;
        
        chooseRanNumber = new ArrayList();
        genRanNumbers = new ArrayList();
        Random drawRanNumber = new Random();


           for (int i = 1; i <= 20; i++)
                chooseRanNumber.add(i); //add number 1 to 20 to the array list

           for (int j = 1; j <= 4; j++) {
               int drawLottoNum = drawRanNumber.nextInt(chooseRanNumber.size());
               genRanNumbers.add(chooseRanNumber.get(drawLottoNum));
               chooseRanNumber.remove(drawLottoNum);
           }
           
        return genRanNumbers;
    
    }
    
    
    public int getSuperBet(){
        
        Random rand = new Random();
        int drawSuperBet = rand.nextInt(10);
        
        if (drawSuperBet == 0)
            
            drawSuperBet += 1;
        
        return drawSuperBet;
    }
}
