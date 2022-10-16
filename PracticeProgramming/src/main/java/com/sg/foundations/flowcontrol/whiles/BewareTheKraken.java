/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;
import java.util.Random;

public class BewareTheKraken {
    public static void main(String[] args) {

        System.out.println("Alrighty! Get those flippers and wetsuits on - we're going diving!");
        System.out.println("Here we goooOOooOooo.....! *SPLASH*");
        
        // Declare and initialize variables
        int depthDivedInFt = 0;
        String fish1 = randomFish();
        String fish2 = randomFish();
        String fish3 = randomFish();
        String fish4 = randomFish();
        
        Scanner userInput = new Scanner(System.in);

        // While loop that will stop when the depth reaches 25000 or the user asks to surface
        while(depthDivedInFt < 36200){

            System.out.println("So far, we've descended " + depthDivedInFt + " feet.");
                
                if(depthDivedInFt == 5000) {
                    System.out.println("That looked just like " + fish1 + "!!!");
                }
                if (depthDivedInFt == 10000){
                    System.out.println("Did I just see " + fish2 + "???");
                    System.out.println("Do you want to stop? y/n :"); // Prompt user for input
                    String choice = userInput.nextLine(); // Store user input in variable
                    if (choice.equals("y")) {
                        System.out.println("Alright then! Let's surface!");
                        break; // Break loop if user chooses "y"
                    }
                }
                if (depthDivedInFt == 15000) {
                System.out.println("Was that " + fish3 + "!!!");
                }
                if (depthDivedInFt == 20000) {
                System.out.println("GUYS! I think I just saw " + fish4 + "!!!");
                }
                if(depthDivedInFt >= 25000){
                    System.out.println("Uhhh, I think I see a Kraken, guys ....");
                    System.out.println("TIME TO GO!");
                    break; // Break loop when depth reaches 25000
                }
            depthDivedInFt += 1000; // Increase depth by 1000 with every pass of the loop
            }

        // Print total depth achieved
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
    }
        // Method to return a random sea monster(fish)
        public static String randomFish(){
            Random rnd = new Random();

            int rndFish = rnd.nextInt(5);

            switch(rndFish){
                case 0:
                    return "Nessie";
                case 1:
                    return "a Megalodon";
                case 2:
                    return "a Leviathan";
                case 3:
                    return "a Rusalka";
                case 4:
                    return "a Nixie";
            }
            return null;

        }
}
