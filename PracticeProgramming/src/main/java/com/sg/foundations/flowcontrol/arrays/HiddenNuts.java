/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.arrays;

/**
 *
 * @author Roxana Manolescu <rxn_manolescu@yahoo.com>
 */

import java.util.Random;
import java.util.Arrays;

public class HiddenNuts {
    public static void main(String[] args) {
        
        String[] hidingSpots = new String[100];
        
        Random squirrel = new Random();
        
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        
        System.out.println("The nut has been hidden ...");
        
        // Loop that will iterate through all elements of the array
        // and will find the nut in the spot which value's is not null
        for (int i = 0; i < hidingSpots.length; i++) {
            if (hidingSpots[i] != null){
                System.out.println("Found it! It's in spot# " + i);
            }
        }

    }
}
