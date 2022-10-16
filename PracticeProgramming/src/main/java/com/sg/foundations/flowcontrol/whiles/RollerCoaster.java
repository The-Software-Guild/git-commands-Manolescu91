/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

public class RollerCoaster {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("We're going to go on a roller coaster...");
        System.out.println("Let me know when you want to get off...!");

        String keepRiding = "y";
        int loopsLooped = 0;
        
//        while (keepRiding.equals("y")) {
//            System.out.println("WHEEEEEEEEEEEEEeEeEEEEeEeeee.....!!!");
//            System.out.println("Want to keep going? (y/n) :");
//            keepRiding = userInput.nextLine();
//            loopsLooped++;
//        }
        while (keepRiding.equals("n")) {
            System.out.println("WHEEEEEEEEEEEEEeEeEEEEeEeeee.....!!!");
            System.out.println("Want to keep going? (y/n) :");
            keepRiding = userInput.nextLine();
            loopsLooped++;
        }

        System.out.println("Wow, that was FUN!");
        System.out.println("We looped that loop " + loopsLooped + " times!!");
    }
}

// When the user enters a value that is neither "y" or "n", the loop ends as the
// condition is no longer true
//
// When we change the condition to check for "n" instead of "y", the loop does not
// execute as the condition is false from the beginning