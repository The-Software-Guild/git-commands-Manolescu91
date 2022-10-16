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
        int highest = 0;
        
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("How many dollars do you have?");
        money = userInput.nextInt();
        maxMoney = money;
        
        Random randNum = new Random();
        
        die1 = randNum.nextInt(6) + 1;
        die2 = randNum.nextInt(6) + 1;
        
        while (money >= 1) {
            rolls++;
            if(money > maxMoney) {
                maxMoney = money;
                highest = die1 + die2;
                maxRoll = rolls - 1;
            }
            die1 = randNum.nextInt(6) + 1;
            die2 = randNum.nextInt(6) + 1;
            
            System.out.println("Roll #"+rolls+". You have $"+money);
            System.out.println("\nDie 1 rolled a "+die1);
            System.out.println("Die 2 rolled a "+die2);
            System.out.println("The total is: "+(die1+die2));
            
            if (die1 + die2 == 7) {
                money += 4;
                System.out.println("You won $4");
            } else {
                money -= 1;
                System.out.println("You lost $1");
            }
        }
        System.out.println("\nYou went broke on Roll "+rolls);
        System.out.println("\nYou should of quit after "+maxRoll+" rolls. When you had $"+maxMoney);
    }
}
