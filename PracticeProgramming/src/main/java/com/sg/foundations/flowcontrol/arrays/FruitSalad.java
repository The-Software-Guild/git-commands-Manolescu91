/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.arrays;

import java.util.Arrays;
public class FruitSalad {

    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", 
                        "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", 
                        "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", 
                        "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", 
                        "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", 
                        "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad = new String[12];
        
        int fruitCounter = 0;
        int appleCounter = 0;
        int orangeCounter = 0;
        
        
       for (int i = 0; i < fruitSalad.length; i++) {
           do {
               if (fruit[i].contains("berry")) {
                   fruitSalad[i]= fruit[i];
               } else if (fruit[i].contains("apple")) {
                   if (appleCounter < 3) {
                       fruitSalad[i] = fruit[i];
                       appleCounter += 1;
                       fruitCounter +=1;
                   }
               } else if (fruit[i].contains("orange")) {
                   if (orangeCounter < 2) {
                       fruitSalad[i] = fruit[i];
                       fruitCounter +=1;
                   }
               } else if (!fruit[i].contains("tomato")) {
                   fruitSalad[i] = fruit[i];
                   fruitCounter +=1;
               } else {
                   fruitSalad[i] = fruit[i];
                   fruitCounter += 1;
               }
           }while(fruitCounter < 12);
           System.out.println(Arrays.toString(fruitSalad));
       }
        System.out.println("My fruit salad contains " + fruitCounter + "fruits: " + Arrays.toString(fruitSalad));
    }
}
