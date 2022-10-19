/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.arrays;

/**
 *
 * @author Roxana Manolescu
 */

import java.util.Arrays;

public class FruitSalad {
    
    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", 
            "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple",
            "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  
            "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", 
            "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple",
            "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};
        
        String[] fruitSalad = new String[12];

        int appleCounter = 0;
        int orangeCounter = 0;
        int fruitsCounter = 0;
        int j = 0;
        
        for (int i = 0; i < fruitSalad.length; i++) {
            do {
                
                if (fruit[j].contains("berry")) {
                    fruitSalad[i] = fruit[j];
                    fruitsCounter++;
                    j++;
                }
                else if (fruit[j].contains("Apple")) {
                    if (appleCounter < 3) {
                          fruitSalad[i] = fruit[j];
                          appleCounter += 1;
                          fruitsCounter++;
                          j++;
                    }
                    else {
                        j++;
                    }
                } 
                else if (fruit[j].contains("Orange")) {
                    if (orangeCounter < 2) {
                          fruitSalad[i] = fruit[j];
                          orangeCounter += 1;
                          fruitsCounter++;
                          j++;
                    } else {
                        j++;
                    }
                } 
                else if (!fruit[j].contains("Tomato")) {
                      fruitSalad[i] = fruit[j];
                      fruitsCounter++;
                      j++;
                }
                else {
                    j++;
                }
            } while(fruitSalad[i] == null && j < fruit.length);
        }
        
        System.out.println(Arrays.toString(fruitSalad));
        System.out.println("Apples" + appleCounter);
        System.out.println("Oranges" + orangeCounter);
        System.out.println("Fruits" + fruitsCounter);
    }
}

