/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rxnmanolescu.summativesums;

/**
 *
 * @author Roxana Manolescu <rxn_manolescu@yahoo.com>
 */
public class SummativeSums {
    public static void main(String[] args) {
        
        // Initializing arrays
        int[] array1 = new int[] {1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] array2 = new int[] {999, -60, -77, 14, 160, 301 };
        int[] array3 = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
                                 140, 150, 160, 170, 180, 190, 200, -99 };
        
        // Display the sum of each array by calling the method sumElements()
        System.out.println("#1 Array sum: " + sumElements(array1));
        System.out.println("#2 Array sum: : " + sumElements(array2));
        System.out.println("#3 Array sum: : " + sumElements(array3));
    }
    
    // Method to sum the elements of an array by iterating through the length of it
    public static int sumElements(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }   

}
