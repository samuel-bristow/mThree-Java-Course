/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bd.practiceprogrammingtwo;

/**
 *
 * @author Samuel Bristow
 */
public class TheOrderOfThings {
    
    public static void main(String[] args) {
        
        double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;
        
        number = 5.0;
        opinion = "AWESOME";
        size = "teensy-weensy";
        age = "new";
        shape = "oblong";
        color = "yellow";
        origin = "Martian";
        material = "platinum";
        purpose = "good";

        noun = "dragons";
        
        System.out.println(number + " " + opinion + " " + size + " " + age + " " + shape
                 + " " + color + " " + origin + " " + material + " " + purpose + " " + noun);
        
        System.out.println(opinion + " " + number + " " + age + " " + size + " " + shape
                 + " " + color + " " + material + " " + origin + " " + purpose + " " + noun);
    }
    
}
