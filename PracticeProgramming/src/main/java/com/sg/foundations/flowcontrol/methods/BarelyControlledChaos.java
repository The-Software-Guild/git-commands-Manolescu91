/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.methods;

import java.util.Random;

public class BarelyControlledChaos {

    public static void main(String[] args) {

        String color = getRandomColour();
        String animal = getRandomAnimal();
        String colorAgain = getRandomColour();
        int weight = getRandomNumber(5, 200); 
        int distance = getRandomNumber(10, 20); 
        int number = getRandomNumber(10000, 20000);
        int time = getRandomNumber(2, 6);
               

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");

    }
        // Method to return a randomly chosen color
        public static String getRandomColour(){
            Random rndCol = new Random();
            int rnd = rndCol.nextInt(4) + 1;
            switch(rnd) {
                case 1:
                    return "white";
                case 2:
                    return "black";
                case 3:
                    return "green";
                case 4:
                    return "blue";
                case 5:
                    return "pink";
            }
            return null;
        }
        
        // Method to return a randomly chosen animal
        public static String getRandomAnimal(){
            Random rndAnm = new Random();
            int rnd = rndAnm.nextInt(4) + 1;
            switch(rnd) {
                case 1:
                    return "coyote";
                case 2:
                    return "swan";
                case 3:
                    return "leopard";
                case 4:
                    return "cat";
                case 5:
                    return "horse";
            }
            return null;
        }
        
        // Method to return a random integer with a range of min/max including
        public static int getRandomNumber(int s, int e) {
            Random rndNum = new Random();
            int start = s;
            int end = e;
            int rnd = rndNum.nextInt((end + 1) - start) + 1;
            return rnd;
        }
}
