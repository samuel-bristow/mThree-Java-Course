/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bd.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Samuel Bristow
 */
public class RockPaperScissors {

    public static void main(String[] args) {
        
        //Declaring variables
        boolean isPlaying = true; //Whether the user wants to play
        int numberOfRounds = 0; //Number of rounds to be played
        
        
        do{
           int[] totalScore = {0,0,0}; // Total score of the game {W,D,L}
           numberOfRounds = requestRoundNumber(); //Returns the number of rounds the user wants to play
           
           // For each round the user plays a round and the score of that round is returned
           for (int i = 0; i < numberOfRounds; i++){
                int[] roundScore = playARound();
                
                // The score for that round is added to the total score
               for (int j = 0; j < totalScore.length; j++){
                   totalScore[j] = totalScore[j]+roundScore[j];
               }
           }
           
           //Display the amount of Wins, rounds drawn and losses
           System.out.println("Thats the game!");
           System.out.println("Games Won: " + totalScore[0]);
           System.out.println("Games Drew: " + totalScore[1]);
           System.out.println("Games Lost: " + totalScore[2]);
           
           //Display who won overall
           if (totalScore[0] == totalScore[2]){
               System.out.println("You have drawn with the computer!");
           } else if (totalScore[0] < totalScore[2]){
               System.out.println("Oh no! The computer beat you!");
           }else if (totalScore[0] > totalScore[2]){
               System.out.println("Congratulations! you won!");
           }
           
           // Whether the user wants to play again or not is returned
           isPlaying =  checkReplay();
        }while (isPlaying);
        
        
        // Thanks the user for playing 
        System.out.println("Thank you for playing!"); 

    }

    public static int[] playARound() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean isValid = false;
        String stringUserGuess = "";
        String stringComputerGuess = "";
        int intResult;
        int computerGuess;
        int[] roundScore = new int[3];
        int userGuess = 0;

        do {

            System.out.println("Please choose 'rock', 'paper' or 'scissors' (all lower case - no spaces)");
            stringUserGuess = scanner.nextLine();

            switch (stringUserGuess) {
                case "rock":
                    userGuess = 1;
                    isValid = true;
                    break;
                case "paper":
                    userGuess = 2;
                    isValid = true;
                    break;
                case "scissors":
                    userGuess = 3;
                    isValid = true;
                    break;
                default:
                    System.out.println("That wasnt a valid option");
            }
        } while (!isValid);

        computerGuess = random.nextInt(3) + 1;

        switch (computerGuess) {
            case 1:
                stringComputerGuess = "rock";
                break;
            case 2:
                stringComputerGuess = "paper";
                break;
            case 3:
                stringComputerGuess = "scissors";
                break;
        }

        if (userGuess == computerGuess) {
            intResult = 1;
            System.out.println("You picked " + stringUserGuess + " and the Computer picked " + stringComputerGuess);
            System.out.println("You drew!");
        } else {
            if (userGuess == 1) {
                if (computerGuess == 2) {
                    intResult = 2;
                    System.out.println("You picked " + stringUserGuess + " and the Computer picked " + stringComputerGuess);
                    System.out.println("You Lost!");
                } else {
                    intResult = 0;
                    System.out.println("You picked " + stringUserGuess + " and the Computer picked " + stringComputerGuess);
                    System.out.println("You Won!");
                }
            } else if (userGuess == 2) {
                if (computerGuess == 3) {
                    intResult = 2;
                    System.out.println("You picked " + stringUserGuess + " and the Computer picked " + stringComputerGuess);
                    System.out.println("You Lost!");
                } else {
                    intResult = 0;
                    System.out.println("You picked " + stringUserGuess + " and the Computer picked " + stringComputerGuess);
                    System.out.println("You Won!");
                }
            } else {
                if (computerGuess == 1) {
                    intResult = 2;
                    System.out.println("You picked " + stringUserGuess + " and the Computer picked " + stringComputerGuess);
                    System.out.println("You Lost!");
                } else {
                    intResult = 0;
                    System.out.println("You picked " + stringUserGuess + " and the Computer picked " + stringComputerGuess);
                    System.out.println("You Won!");
                }
            }
        }

        roundScore[intResult] = 1;

        return roundScore;
    }
    
    public static int requestRoundNumber(){
        
       //Initialising Scanner
        Scanner scanner = new Scanner(System.in);
        
        //Declaring Variables
        boolean isValid = false; // Validates user input
        int numberRounds = 0; // Number of Rounds 
        
        //Prompts user to enter how many rounds and checks it is valid and in range
        do{
           try {
                System.out.println("How many rounds would you like to play? (Must be between 1-10)");
                String stringNumberRounds = scanner.nextLine();
                numberRounds = Integer.parseInt(stringNumberRounds);
               
                if (numberRounds < 1){
                    System.out.println("Thats not enough rounds!");
                } else if (numberRounds > 10){
                    System.out.println("Thats too many rounds!");
                } else {
                    isValid = true;
                }
                
            } catch(NumberFormatException ex) {
                System.out.println("That wasn't a valid number (must be a whole number between 1-10)");
            }
           
        } while(!isValid);
        //Returns number of rounds 
        return numberRounds;
    }
    
    // The following method checks wether the user would like to play again or not
    public static boolean checkReplay(){
        
        //Initialising Scanner
        Scanner scanner = new Scanner(System.in);
        
        //Declaring Variables
        boolean isValid = false; // Validates user input
        boolean playAgain = true; //Return Vatiable for method 
        do{
            //Prompts user for answer 
            System.out.println("Would you like to play again? Please enter 'yes' or 'no'");
            String stringReplay = scanner.nextLine();
            
            //Checking for each user input case
            switch (stringReplay) {
                case "yes": // If the user inputs yes, validate input and leave return variable as true
                    isValid = true;
                    break;
                case "no": // If no , validate input and change return variable to false
                    playAgain = false;
                    isValid = true;
                    break;
                default: // If any other input prompt user it isnt a valid input
                    System.out.println("That wasn't a valid answer, make sure it is all lower cases and no spaces");
                    
            }
        } while(!isValid); // continue asking for input until a valid one is given 
        
        return playAgain;
    }

}
