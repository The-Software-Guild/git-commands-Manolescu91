/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class ForTimes {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Which times table shall I recite?");
        String tempNum = userInput.nextLine();
        int userNumber = Integer.parseInt(tempNum);
        
        // For loop to print the times table from 1 to 15 inclusive of the number the user inputs
        for(int i = 1; i <= 15; i++) {
            System.out.println(i + " * " + userNumber + " is: " + (i * userNumber));
        }
        
    }
}
