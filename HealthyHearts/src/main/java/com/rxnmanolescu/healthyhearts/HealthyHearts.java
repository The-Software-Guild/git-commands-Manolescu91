/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rxnmanolescu.healthyhearts;

/**
 *
 * @author Roxana Manolescu <rxn_manolescu@yahoo.com>
 */

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        
        System.out.println("What is your age?");
        int userAge = userInput.nextInt(); // Variable to store user's age
        int heartRate = 220 - userAge; // Variable to store the maximum heart rate
        int minTargetRate = (50 * heartRate) / 100; // Variable to store minimum target rate
        int maxTargetRate = (85 * heartRate) / 100; // Variable to store maximum target rate
        
        
        // Display statistics to user regarding their maximum heart rate 
        // and the min and max target rate
        System.out.println("Your maximum heart rate should be " + heartRate + " beats per minute");
        System.out.println("Your target HR Zone is " + minTargetRate 
                           + " - " + maxTargetRate + " beats per minute");
        
        
    }
}
