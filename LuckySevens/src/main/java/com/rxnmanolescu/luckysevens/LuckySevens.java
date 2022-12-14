/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rxnmanolescu.luckysevens;

import java.util.Scanner;
import java.util.Random;

public class LuckySevens {
    public static void main(String[] args) {
        int die1;
        int die2;
        int money;
        int maxMoney = 0;
        int rolls = 0;
        int maxRoll = 0;

        Scanner userInput = new Scanner(System.in);
        
        System.out.println("How many dollars do you have?");
        money = userInput.nextInt();
        maxMoney = money;
        
        Random randNum = new Random();
        
        // While loop that will run as long as the user still has money
        while (money >= 1) {
            rolls++;
            if(money > maxMoney) {
                maxMoney = money;
                maxRoll = rolls - 1;
            }
            
            // Generate random dice
            die1 = randNum.nextInt(6) + 1;
            die2 = randNum.nextInt(6) + 1;
            
            // If the sum of the two dice is 7, the user wins $5
            // else, the user loses $1
            if (die1 + die2 == 7) {
                money += 4;
            } else {
                money -= 1;
            }
        }
        
        // Display statistics
        System.out.println("\nYou are broke after " + rolls + " rolls.");
        System.out.println("\nYou should have quit after " + maxRoll 
                           + " rolls when you had $" + maxMoney);
    }
}
