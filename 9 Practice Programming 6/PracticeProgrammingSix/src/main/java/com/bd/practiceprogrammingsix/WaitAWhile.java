/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bd.practiceprogrammingsix;

/**
 *
 * @author Samuel Bristow
 */
public class WaitAWhile {
    
    public static void main(String[] args) {
        
        int timeNow = 5;
        int bedTime = 10;
        
        while ( timeNow <  bedTime ){
            System.out.println("Its only "+ timeNow + " o'clock!");
            System.out.println("I think I wil stay up a liiiiittle while longer.....");
            timeNow++;
            
        }
        
        System.out.println("Oh. Its " + timeNow + " o'clock");
        System.out.println("Guess I should go to bed ...");
    }
    
}
