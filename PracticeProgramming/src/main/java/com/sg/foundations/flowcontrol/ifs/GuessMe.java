/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args) {
        
        int number = 20;
        int numberInput;
        
        System.out.println("I've chosen a number. Betcha can't guess it!");

        // declare and initialize the Scanner
        Scanner myScanner = new Scanner(System.in);
        
        // get input from the user
        System.out.println("Please pick a number:");
        numberInput = myScanner.nextInt();
        
        // Print user input
        System.out.println("Your guess: " + numberInput);
        
        // Block of conditions to print message after comparing user input
        // with chosen variable value
        if (numberInput == number) {
            System.out.println("Wow, nice guess! That was it!");
        }
        
        if (numberInput < number) {
            System.out.println("Ha, nice try - too low! I chose is " + number);
        }
        
        if (numberInput > number) {
            System.out.println("Too bad, way too high. I chose is " + number);
        }
    }
}
