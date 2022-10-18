/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rxnmanolescu.doggenetics;

/**
 *
 * @author Roxana Manolescu
 */

import java.util.Scanner;
import java.util.Random;

public class DogGenetics {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("What is your dog's name? ");
        String dogName = userInput.nextLine();
        
        System.out.println("Well then, I have this highly reliable report on " 
                           + dogName + "'s prestigious background right here. ");

        Random rndNum = new Random();
        
        int rand1 = rndNum.nextInt(100 + 1);
        int rand2 = rndNum.nextInt(100 + 1- rand1) ;
        int rand3 = rndNum.nextInt(100 + 1- rand1 - rand2) ;
        int rand4 = rndNum.nextInt(100 + 1- rand1 - rand2 - rand3);
        int rand5 = 100 - rand1 - rand2 - rand3 - rand4;

        String[] dogBreed = new String[] {"Dalmatian", "Pug", "Labrador", "Husky", "Poodle"};
        int[] breedPercentage = new int[] {rand1, rand2, rand3, rand4, rand5};
        
        System.out.println(dogName + " is: ");
        
        for (int i = 0; i < 5; i++) {
            System.out.println(breedPercentage[i] + " % " + dogBreed[i]);
        }
    }
}
