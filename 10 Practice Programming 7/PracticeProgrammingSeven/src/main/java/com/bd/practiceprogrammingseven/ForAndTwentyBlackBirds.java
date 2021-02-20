/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bd.practiceprogrammingseven;

/**
 *
 * @author Samuel Bristow
 */
public class ForAndTwentyBlackBirds {
    
    public static void main(String[] args) {
        
        int birdsInPie = 0;
        for (int i =1; i < 21; i++){
            System.out.println("Blackbird #" + i + "goes in the pie!");
            birdsInPie++;
            
        }
        
        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
    }
    
}
