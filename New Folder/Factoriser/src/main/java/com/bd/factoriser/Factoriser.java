/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bd.factoriser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Samuel Bristow
 */
public class Factoriser {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        List<Integer> factors = new ArrayList<>();

        System.out.println("Please enter a number you wish to factorise: ");
        number = Integer.parseInt(input.nextLine());

        System.out.println("The factors of " + number + " are:");

        factors = factorise(number);
        System.out.println(factors);

        int length = factors.size();

        System.out.println(number + " has " + length + " factors");

        boolean perfect = checkPerfect(factors);

        if (perfect == true) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is not a perfect number");
        }

        if (length == 2) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

    }

    public static boolean checkPerfect(List<Integer> factors) {

        int total = 0;

        for (int i = 0; i < factors.size() - 1; i++) {
            total += factors.get(i);
        }

        return total == factors.get(factors.size() - 1);
    }

    public static List<Integer> factorise(int num) {

        List<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                factors.add(i);
            }
        }

        return factors;
    }

}
