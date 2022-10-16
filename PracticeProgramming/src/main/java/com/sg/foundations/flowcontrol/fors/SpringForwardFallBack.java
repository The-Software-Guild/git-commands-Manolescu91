/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;


public class SpringForwardFallBack {
    public static void main(String[] args) {

        System.out.println("It's Spring...!");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ", ");
        }

        System.out.println("\nOh no, it's fall...");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + ", ");
        }
    }
}

// First for loop has a start point of 0 inclusive and an end point of 10 exclusive
// Second for loop has a start point of 10 inclusive and an end point of 0 exclusive
//
// In order for the first loop to print the same output as the second for loop,
// I have changed the start point of the first loop to 1 and the end point to 10 inclusive