/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;


public class ForAndTwentyBlackBirds {
    public static void main(String[] args) {
        int birdsInPie = 0;
        
        // For loop to iterate through every bird and store the number in a variable 
        // that increases with every pass of the loop
        for (int i = 1; i < 25; i++) {
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }
        
        // Display message with the total number of birds
        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
    }
}


// In order to print up to 24 birds, I changed the stop condition from 20 to 25 exclusive
// In order to print from number 1, I changed the initialization from 0 to 1