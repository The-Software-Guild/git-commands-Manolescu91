/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class KnockKnock {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Knock Knock! Guess who!! :");
        String nameGuess = inputReader.nextLine();
        
        
        // Changing .equals() to == , comparison between string and user input
        // is not possible and the else message is displayed
        //
        // .equals() does not work when user's input is capitalized differently
        // and the else message is displayed
        //
        // Changing .equals() to .equalsIgnoreCase allows the string and user
        // input to be compared making abstraction of the case sensitivity
        if(nameGuess.equalsIgnoreCase("Marty McFly")) {
            System.out.println("\"Hey! That's right! I'm back!\"");
            
            System.out.println("... from the Future.");
        } else {
            System.out.println("Dude, do I look like " + nameGuess);
        }
    }
    
}
