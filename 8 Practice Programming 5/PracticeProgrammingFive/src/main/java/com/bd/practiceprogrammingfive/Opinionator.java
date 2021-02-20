/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bd.practiceprogrammingfive;

import java.util.Random;

/**
 *
 * @author Samuel Bristow
 */
public class Opinionator {
    
    public static void main(String[] args) {
        
        Random rand = new Random();
        System.out.println("I can't decide what animal I like the best.");
        System.out.println("I know! Random can decide for me!");
        
        int x = rand.nextInt(5);
        
        System.out.println("The number we chose was: " + x);
        
        switch (x){
            case 0:
                System.out.println("Llamas are the best!");
                break;
            case 1:
                System.out.println("Dodos are the best!");
                break;
            case 2:
                System.out.println("Wooly mammoths are the best!");
                break;
            case 3:
                System.out.println("Sharks are the best!");
                break;
            case 4:
                System.out.println("Cockatoos are the best!");
                break;
            case 5:
                System.out.println("Naked mole rats are the best!"); // This will never be called as the random int will only ever be between 0 and 4
                break;
        }
        
        System.out.println("Thanks random, maybe you're the best!");
    }
    
}
