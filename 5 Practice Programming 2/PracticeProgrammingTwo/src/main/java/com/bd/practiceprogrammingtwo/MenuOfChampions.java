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
public class MenuOfChampions {
    
    public static void main(String[] args) {
        
        String optionOneName = "Pizza";
        String optionTwoName = "Burger";
        String optionThreeName = "Fish and Chips";
        
        float optionOnePrice = 8.50f;
        float optionTwoPrice = 10.0f;
        float optionThreePrice = 12.50f;
        
        System.out.println("============================");
        System.out.println("MENU");
        System.out.println("============================");
        System.out.println(optionOneName + ":    $" + optionOnePrice);
        System.out.println(optionTwoName + ":    $" + optionTwoPrice);
        System.out.println(optionThreeName + ":    $" + optionThreePrice);
        
    }
    
}
