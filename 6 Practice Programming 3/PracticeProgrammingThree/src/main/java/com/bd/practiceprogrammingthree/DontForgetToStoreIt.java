/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bd.practiceprogrammingthree;

import java.util.Scanner;

/**
 *
 * @author Samuel Bristow
 */
public class DontForgetToStoreIt {
    
    public static void main(String[] args) {
        
        int meaningOfLife = 42;
        double pi = 3.14159;
        String cheese, colour;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Give me pi to at least 5 decimal places: ");
        pi = Double.parseDouble(inputReader.nextLine());
        
        System.out.println("What is the meaning of life, the universe & everything? ");
        meaningOfLife = Integer.parseInt(inputReader.nextLine());

        System.out.println("What is your favorite kind of cheese? ");
         cheese = inputReader.nextLine();

        System.out.println("Do you like the color red or blue more? ");
        colour = inputReader.nextLine();
        
        System.out.println("Oooh, " + colour + " " + cheese + " sounds delicious!");
        System.out.println("The circumference of life is " + (2 * pi * meaningOfLife));
    }
    
}
