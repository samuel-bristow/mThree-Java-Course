/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bd.luckysevens;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Samuel Bristow
 */
public class LuckySevens {
    
    public static void main(String[] args) {
        
        int money;
        int maxMoney;
        int rolls;
        int maxRolls;
        
        int diceOne;
        int diceTwo;
        int rollTotal;
        
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        
        System.out.println("How much money would you like to bet?");
        money = Integer.parseInt(input.nextLine());
        maxMoney = money;
        maxRolls = 0;
        rolls  = 0;
        
        while(money > 0){
            
            diceOne = rnd.nextInt(6) + 1;
            diceTwo = rnd.nextInt(6) + 1;
            rollTotal = diceOne + diceTwo;
            rolls++;
            
            if(rollTotal == 7){
                money += 4;
                
            }else {
                money --;
            }
            
            if(money > maxMoney) {
                maxMoney = money;
                maxRolls = rolls;
            }
            
            
        }
        
        System.out.println("You are broke after " + rolls + " rolls");
        System.out.println("You should have quit after " + maxRolls + " rolls when you had £" + maxMoney);
               
    }
    
}
