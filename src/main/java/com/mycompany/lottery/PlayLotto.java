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
    

    /* Michael:  Time complexity: O(n)
     Space Complexity: O(n) */
    
    public ArrayList<Integer> getRanMatchNumber() {
          

        /* Michael: Big O for .remove at worstcase is O(n) however, 
       //I can see that the iterative operation is within a constant which makes it forgivable within the loop
       //So hence the timecomplexity is  still O(n)
       //Is there any reason that the nth term of j and i would increase significantly, if yes then you might have to refactor cos that could affect performance. */


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
    
    /* Michael:  Time complexity: O(1)
     Space Complexity: O(1) */
    
    public int getSuperBet(){
        
        Random rand = new Random();
        int drawSuperBet = rand.nextInt(10);
        
        if (drawSuperBet == 0)  drawSuperBet += 1;
        
        return drawSuperBet;
    }
}
