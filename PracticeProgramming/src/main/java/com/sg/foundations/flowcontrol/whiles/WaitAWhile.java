/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;


public class WaitAWhile {
    public static void main(String[] args) {
        
        // Initialize variables
        int timeNow = 5;
        int bedTime = 10;
        
        // Create while loop that will stop when condition becomes false
        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            timeNow++; // Time passes
        }
        
        System.out.println("Oh, it's " + timeNow + " o'clock!");
        System.out.println("Guess I should go to bed ...");
    }
}

// If bedTime is changed to 11, the loop will run one more time before the
// condition becomes false and code exits loop

// If bedtime is 10 but timeNow is set to 11, the loop is skipped as the 
// condition is false from the start and only the statements after the loop
// will be printed

// If timeNow = 5 and bedTime = 10 and timeNow++ in loop is commented out,
// the loop is infinite