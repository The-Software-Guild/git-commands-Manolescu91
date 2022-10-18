/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rxnmanolescu.factorizer;

/**
 *
 * @author Roxana Manolescu <rxn_manolescu@yahoo.com>
 */

import java.util.Scanner;

public class Factorizer {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("What number would you like to factor?");
        int userNum = userInput.nextInt();
        
        System.out.println("The factors of " + userNum + " are: ");
        
        boolean isPrime = true;
        boolean perfect = isPerfect(userNum);

        // For loop to iterate through all integers up to the user's number
        for (int i = 2; i < userNum; i++) {
            // If the number has other divisors, isPrime becomes false
            if (userNum % i == 0) { 
                isPrime = false;
            }
        }
        
        if (isPrime) {
            System.out.println(userNum + " is a Prime number");
        } else {
            System.out.println(userNum + " is not a Prime number");
        }
        if (perfect) {
            System.out.println(userNum + " is a Perfect number");
        } else {
            System.out.println(userNum + " is not a Perfect number");
        }
    }
    
    // Method to determine whether a number is perfect
    public static boolean isPerfect(int number) {
        
        int factorsSum = 0; // Variable to store sum of all factors
        int factorsCount = 1; // Variable to store number of factors, including user input
        
        // Loop to iterate through all integers up to user number
        for(int i = 1; i < number; i++) {
            if (number % i == 0) {
                factorsSum += i; // Increate sum by the factor found
                factorsCount += 1; // Increase count of factors
                if (i < number) {
                    System.out.print(i + " "); // Print all factors, excluding user input
                }
            }
        }
        
        System.out.println("");
        System.out.println("Number " + number + " has " + factorsCount + " factors");
        
        // If the user number is equal to the sum of its factors.
        // user number is perfect number
        if (number == factorsSum) {
            return true;
        } else { // else, user number is not a perfect number
            return false;
        }
        
    }

    
}
