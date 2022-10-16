/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        
        System.out.println("How many units of fizzing and buzzing do you need in your life?");
        
        Scanner userInput = new Scanner(System.in);
        
        String tempNumber = userInput.nextLine();
        int userNumber = Integer.parseInt(tempNumber); // Variable to store user input
        int wordCount = 0; // Counter variable
        
        // For loop that starts at 0, increases i by 1 at every iterations and
        // will stop when condition is met
        for(int i = 0; ; i++ ) {
            // Condition to check if number is divisible by 3 and 5, a word is printed
            // and its count is added to the wordCount variable. 
            if ( i % 3 == 0 && i % 5 == 0 && i != 0) {
            System.out.println("fizz buzz");
            wordCount += 1;
            // Condition to check if number is divisible by 3, a word is printed
            // and its count is added to the wordCount variable. 
            } else if (i % 3 == 0 && i != 0) {
                System.out.println("fizz");
                wordCount += 1;
            // Condition to check if number is divisible by 5, a word is printed
            // and its count is added to the wordCount variable.
            } else if ( i % 5 == 0 && i != 0) {
                System.out.println("buzz");
                wordCount += 1;
            // Condition to print the number itself if the number is not divisible
            // by 3 or 5
            } else {
                System.out.println(i);
            }
            // Condition to exit loop when the counter variable equals the user's number
            if (wordCount == userNumber) {
                System.out.println("TRADITION!");
                break;
            }
        }
    }
}
