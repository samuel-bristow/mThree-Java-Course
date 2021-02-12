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
public class PassingTheTuringTest {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
           
        String name;
        String colour;
        String food;
        double number;
        double squared;
        
        System.out.println("Hello there!");
        System.out.println("What is your name? ");
        name = input.nextLine();
        
        System.out.println("Hi " + name + " i'm Jarvis!");
        System.out.println("What is your favourite color " + name + "?");
        colour = input.nextLine();
        System.out.println("Oh, " + colour + "! mine is orange!");
        
        System.out.println("What is your favourite food " + name + "?");
        food = input.nextLine();
        System.out.println("Oh, " + food + "! That sounds delicious!");
        
        System.out.println("What is your favourite number " + name + "?");
        number = Double.parseDouble(input.nextLine());
        squared = number*number;
        System.out.println("Oh, " + number + "! Did you know if you square " + number + " you get " + squared);
        
        System.out.println("Well thanks for talking to me!");
        
        
        
        
        
    }
    
}
