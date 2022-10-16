/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.arrays;


public class FruitsBasket {
    
    public static void main(String[] args) {
        String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
            "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
            "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
            "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
            "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
            "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
            "Dragonfruit", "Apple", "Orange", "Orange"};

        int numOranges = 0;
        int numApples = 0;
        int numOtherFruit = 0;
        
        // For loop to count how many apples, oranges and other fruit there is in the array
        for(int i = 0; i < fruitBasket.length; i++) {
            if (fruitBasket[i].equals("Orange")) {
                numOranges += 1;
            } else if (fruitBasket[i].equals("Apple")) {
                numApples += 1;
            } else {
                numOtherFruit += 1;
            }
        }
            // Printing out the results
            System.out.println("Total number of Fruits in Basket: " + fruitBasket.length);
            System.out.println("Number of Apples: " + numApples);
            System.out.println("Number of Oranges: " + numOranges);
            System.out.println("Number of Other Fruit: " + numOtherFruit);

    }
}
