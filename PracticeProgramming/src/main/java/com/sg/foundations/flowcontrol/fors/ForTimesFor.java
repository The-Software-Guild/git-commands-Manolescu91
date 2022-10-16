/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class ForTimesFor {
    public static void main(String[] args) {
        int userNumber; // Variable to store user input of number for times table
        int userAnswer; // Variable to store user input of result of multiplication
        int correctAnswers = 0; // Variable to store the number of correct answers
        int totalAnswers = 0; // Variable to store the number of total answers possible
        int totalCorrect ; // Variable to store the percentage of correct answers

        Scanner userInput = new Scanner(System.in);
        
        // Ask user to input a number to calculte the times tables for
        System.out.println("Which times table shall I recite?");
        String tempNum = userInput.nextLine();
        userNumber = Integer.parseInt(tempNum);
        
        // For loop to prompt user to provide answers for multiplications
        for ( int i = 1; i <= 15; i++) {
            System.out.println(i + " * " + userNumber + " is: " );
            userAnswer = userInput.nextInt();
            if (userAnswer == (i * userNumber)){
                System.out.println("Correct!");
                correctAnswers += 1; // Increment the variable, when the answer is correct
                totalAnswers += 1; // Increment the variable with every pass of the loop
            } else if (userAnswer != (i * userNumber)){
                System.out.println("Sorry no, the answer is " + (i * userNumber));
                totalAnswers += 1; // Increment the variable with every pass of the loop

            }
        }
        
        // Dispplay message of total correct answers
        System.out.println("You got " + correctAnswers + " correct!");
        
        // Conditional statements to calculate the percentage of correct answers by avoiding
        // division by 0
        if (totalAnswers > 0) {
            if (correctAnswers > 0) {
                totalCorrect = (correctAnswers * 100) / totalAnswers;
                // Display appropriate message if user answers less than 50% of the questions correct
                if (totalCorrect < 50) {
                    System.out.println("You need to study more!");
                }
                 // Display appropriate message if user answers more than 90% of the questions correct
                if (totalCorrect > 90){
                    System.out.println("Congratulations! You're a smart cookie!");
                }
            } else {
                System.out.println("You need to study more!");
            }
        }

    }
}
