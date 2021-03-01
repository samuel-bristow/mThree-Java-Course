/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bd.interestcalculator;

import java.util.Scanner;

/**
 *
 * @author Samuel Bristow
 */
public class InterestCalculator {
    
    public static void main(String[] args) {
        
        double currentBalance;
        int years;
        double interestRate;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("How much do you want to invest?");
        currentBalance = Double.parseDouble(input.nextLine());
        
        System.out.println("How many years are you investing?");
        years = Integer.parseInt(input.nextLine());
        
        System.out.println("What is the annual interest rate?");
        interestRate = Double.parseDouble(input.nextLine());
        
        System.out.println("");
        System.out.println("Calculating...");
        
        for (int i=1; i<=years; i++){
            System.out.println("Year " + i + ":");
            currentBalance = oneYear(currentBalance, interestRate);
        }
        
        
    }
    
    public static double oneYear(double initial, double interestRate ){
        
        double endWith = initial * (Math.pow((1 + (interestRate / 400)),4));
        System.out.println("Began with: £" + initial);
        System.out.println("Earned: £" + (endWith - initial));
        System.out.println("Ended With: £" + endWith);
        System.out.println("");
        
        return endWith;
        
    }
    
}
