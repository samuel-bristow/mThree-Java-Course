/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bd.practiceprogrammingfour;

import java.util.Scanner;

/**
 *
 * @author Samuel Bristow
 */
public class GuessMe {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int target = 4;
        int userNumber;

        System.out.println("Choose a number between 1 and 10: ");
        userNumber = Integer.parseInt(input.nextLine());

        System.out.println("Your Guess: " + userNumber);

        if (userNumber == target) {
            System.out.println("Wow thats correct I chose " + target + " too!");
        } else if (userNumber < target) {
            System.out.println("Thats too low! I chose " + target);
        } else {
            System.out.println("Thats too high! I chose " + target);
        }
        
    }

}


