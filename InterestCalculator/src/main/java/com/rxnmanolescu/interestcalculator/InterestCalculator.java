/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rxnmanolescu.interestcalculator;

/**
 *
 * @author Roxana Manolescu <rxn_manolescu@yahoo.com>
 */

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        // Ask user for amount of investment and store it in a variable
        System.out.println("How much do you want to invest? ");
        double initialPrinciple = userInput.nextDouble();
        
        // Ask user for the number of years of the investment and store it
        // in a variable
        System.out.println("How many years is the investment for? ");
        double numberOfYears = userInput.nextDouble();

        // Ask user for the annual interest rate
        System.out.println("What is the annual interest rate %?");
        double intRate = userInput.nextDouble(); // Store annual int rate
        double quarterlyIntRatePercentage = intRate / (100*4); // Quarterly int rate
        
        double currentBalance = initialPrinciple; // Variable to store current balance
        double interestEarned = 0; // Variable to store the interest earned
        
        // Loop to iterate over the years of the investment and print statistics
        for( int i = 1; i <= numberOfYears; i++) {
            double totalInterest = 0; // Variable to store total interest yearly
            System.out.println("YEAR " + i);
            System.out.printf("Began with: " + "%,.2f",currentBalance);
            
            // Loop to iterate over every quarter of a year and calculate interest earned,
            // current balance and total interest
            for (int j = 1; j <= 4; j++){
                interestEarned = currentBalance * quarterlyIntRatePercentage;
                currentBalance += interestEarned;
                totalInterest += interestEarned;
            }
            System.out.printf("\nEarned: " + "%,.2f",totalInterest);
            System.out.printf("\nEnded with " + "%,.2f",currentBalance);
            System.out.println("\n");
        }
    }
}
