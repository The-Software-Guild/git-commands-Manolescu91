/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rxnmanolescu.rockpaperscissors;

/**
 *
 * @author Roxana Manolescu
 */


import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        int rounds = 0; // Variable to store user's request for number of rounds
        int userWins = 0; // Variable to store user wins
        int compWins = 0; // Variable to store computer wins
        int tie = 0; // Variable to store ties
        
        Scanner userInput = new Scanner(System.in);
        Random compInput = new Random();
        
        // Do while loop that asks user whether they want to play again or not
        // and stops when user chooses "no"
        do {
            System.out.println("How many rounds would you like to play from 1 to 10? ");
            rounds = userInput.nextInt();
            
            if (rounds < 1 || rounds > 10) { // Check whether user input is within 1 and 10 inclusive
                System.out.println("Sorry, the number you entered is not valid!");
                break; // loop to stop if user input invalid
            } else {
                // for loop that will run the number of rounds the user chose
                for (int i = 0; i < rounds; i++) {
                    System.out.println("Please choose 1 for Rock, 2 for Paper, 3 for Scissors: ");
                    int userChoice = userInput.nextInt();
                    int compChoice = compInput.nextInt(3) + 1;
                    
                    if (userChoice == 1) { // If user chooses 1 = rock
                        if (compChoice == 1){ // If computer chooses rock
                            System.out.println("Your opponent chose Rock. It's a TIE!");
                            tie += 1; // Increase ties counter
                         
                        } else if(compChoice == 2) { // If comp chooses paper
                            System.out.println("Your opponent chose Paper. You LOSE!");
                            compWins += 1; // Increase computer wins counter
                        
                        } else if (compChoice == 3) { // If comp chooses scrissors
                            System.out.println("Your opponent chose Scissors. You WIN!");
                            userWins += 1; // Increase user wins counter
                        }
                    } else if (userChoice == 2) { // If user chooses 2 = paper
                        if (compChoice == 1){ // If computer chooses rock
                            System.out.println("Your opponent chose Rock. You WIN!");
                            userWins += 1; // Increase user wins counter
                        } else if(compChoice == 2) { // If comp chooses paper
                            System.out.println("Your opponent chose Paper. It's a TIE!");
                            tie += 1; // Increase ties counter
                        } else if (compChoice == 3) { // If comp chooses scrissors
                            System.out.println("Your opponent chose Scissors. You LOSE!");
                            compWins += 1;  // Increase computer wins counter
                        }
                    } else if (userChoice == 3) { // If user chooses scrissors
                        if (compChoice == 1){ // If computer chooses rock
                            System.out.println("Your opponent chose Rock. You LOSE!");
                            compWins += 1;  // Increase computer wins counter
                        } else if(compChoice == 2) { // If comp chooses paper
                            System.out.println("Your opponent chose Paper. You WIN!");
                            userWins += 1; // Increase user wins counter
                        } else if (compChoice == 3) { // If comp chooses scrissors
                            System.out.println("Your opponent chose Scissors. It's a TIE!");
                            tie += 1; // Increase ties counter
                        }
                    }
                }
            }
            // Display statistics regarding the number of user wins, computer wins and ties
            System.out.println("Total user wins: " + userWins);
            System.out.println("Total computer wins: " + compWins);
            System.out.println("Total ties: " + tie);
            

            if (userWins > compWins) { // If user wins, print message
                System.out.println("YOU WIN!");
            }
            if (userWins < compWins) { // If computer wins, print message
                System.out.println("YOU LOSE!");
            }
            if (userWins == compWins) { // if tie, print message
                System.out.println("IT'S A TIE!");
            }
            
            Scanner usrAns = new Scanner(System.in);
            
            // Ask user if they want to play again and repeat loop
            // if User chooses "no", break loop
            System.out.println("Would you like to play again? yes or no?");
            String userAnswer = usrAns.nextLine();
            if (userAnswer.equalsIgnoreCase("no")) {
                System.out.println("Goodbye!");
                break;
            }
        }while(true); // end of do while loop
    }
}
