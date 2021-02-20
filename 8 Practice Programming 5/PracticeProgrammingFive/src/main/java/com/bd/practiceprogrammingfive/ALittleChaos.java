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
public class ALittleChaos {
    
    public static void main(String[] args) {
        
        Random randomiser = new Random();
        
        System.out.println("Random can make integers: " + randomiser.nextInt());
        System.out.println("Or a double: " + randomiser.nextDouble());
        System.out.println("Or even a boolean: " + randomiser.nextBoolean());
        
        int num = randomiser.nextInt(100);
        System.out.println("You can store a randomised result: " + num);
        System.out.println("And use it over and over again: " + num + "," + num);
        
        System.out.println("Or keep geneating new values");
        System.out.println("Here are a bunch of numbers from 0 - 100: ");
        
        System.out.println(randomiser.nextInt(101));
        System.out.println(randomiser.nextInt(101));
        System.out.println(randomiser.nextInt(101));
        System.out.println(randomiser.nextInt(101));
        System.out.println(randomiser.nextInt(101));
        System.out.println(randomiser.nextInt(101));
    }
    
}
