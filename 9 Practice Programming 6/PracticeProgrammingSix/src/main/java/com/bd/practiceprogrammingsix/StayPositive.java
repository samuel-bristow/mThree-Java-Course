/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bd.practiceprogrammingsix;

import java.util.Scanner;

/**
 *
 * @author Samuel Bristow
 */
public class StayPositive {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int start;
        
        System.out.println("Please enter a starting number: ");
        
        start = Integer.parseInt(input.nextLine());
        
        while (start >= 0) {
            System.out.println(start);
            start--;
        }
        
        System.out.println("BLAST OFF!");
    }
    
}
