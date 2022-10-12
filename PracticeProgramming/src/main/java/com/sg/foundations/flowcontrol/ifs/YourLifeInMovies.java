/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author LOVE
 */
public class YourLifeInMovies {
    public static void main(String[] args) {
        int birthYear;
        
        // declare and initialize the Scanner
        Scanner myScanner = new Scanner(System.in);
        
        // Ask user for input
        System.out.println("Please provide your birth year:");
        birthYear = myScanner.nextInt();

        // Print appropriate messages after checking whether user
        // input is lower than the values mentioned in the if conditions
        if (birthYear < 2005) {
            System.out.println("Pixar's 'Up' came out over a decade ago");
        }
        
        if (birthYear < 1995) {
            System.out.println("The first Harry Potter came out over 15 years ago");
        }
        
        if (birthYear < 1985) {
            System.out.println("Space Jam came out not last decade, but the one before THAT");
        }
        if (birthYear < 1975) {
            System.out.println("The original Jurassic Park release is closer to the first lunar landing than it is to today.");
        }
        if (birthYear < 1965) {
            System.out.println("MASH TV series has been around for almost half a century!");
        }
        
        
    }
    
}
