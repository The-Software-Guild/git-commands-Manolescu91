/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;


public class StayPositive {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        while(true){
            System.out.println("Please choose a positive number: ");
            int number = Integer.parseInt(userInput.nextLine());
            if (number < 0){
                System.out.println("That is not a positive number!");
            }else {
               int lineCount = 0;
        
                // Loop to display 10 values per line and then start a new line.
                while(number >= 0) {
                    if (lineCount < 10){
                        lineCount++;
                    } else {
                        System.out.println();
                        lineCount = 1;
                    }
                    System.out.print(number + " ");
                    number--;
                }
            break;
            }
        }
    }
}       
