/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;


public class BirthStones {
    public static void main(String[] args) {
        
        // initialize variable to store user input
        int number;
        
        // print introductory question
        System.out.println("What month's birthstone do you want to know?");
        
        
        // declare and initialize the scanner
        Scanner myScanner = new Scanner(System.in);
        
        // ask user for input
        System.out.println("Please enter a number between 1 and 12:");
        
        // assign user input to the initialized variable
        number = myScanner.nextInt();
        
        
        // Block of conditions where only one of the messages will be printed
        // as only one statement can be true at a time
        if(number == 1) {
            System.out.println("January's birthstone is Garnet");
        }else if(number == 2) {
            System.out.println("February's birthstone is Amethyst");
        }else if(number == 3) {
            System.out.println("March's birthstone is Aquamarine");
        }else if(number == 4) {
            System.out.println("April's birthstone is Diamond");
        }else if(number == 5) {
            System.out.println("May's birthstone is Emerald");
        }else if(number == 6) {
            System.out.println("June's birthstone is Pearl");
        }else if(number == 7) {
            System.out.println("July's birthstone is Ruby");
        }else if(number == 8) {
            System.out.println("August's birthstone is Peridot");
        }else if(number == 9) {
            System.out.println("September's birthstone is Sapphire");
        }else if(number == 10) {
            System.out.println("October's birthstone is Opal");
        }else if(number == 11) {
            System.out.println("November's birthstone is Topaz");
        }else if(number == 12) {
            System.out.println("December's birthstone is Turquoise");
        }else {
        System.out.println("Sorry, the number you entered is invalid!");
        }
        
        
    }
    
}
