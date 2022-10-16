/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;
        
public class MaybeItLovesMe {
    public static void main(String[] args) {
        int petals = petalRandom(13, 89);
        int start = 1;
        
        do {
            if (start % 2 == 0){
                System.out.println("It LOVES me!");
            } else {
                System.out.println("It LOVES me NOT!");
            }
            start++;
            } while (start <= petals);
        
        if (petals > 0 && petals % 2 == 0){
                System.out.println("I knew it! It LOVES me!");
            } else if (petals > 0 && petals % 2 != 0) {
                System.out.println("Oh no! It DOESN'T LOVE me!");
            }
        
    }
    
    public static int petalRandom(int s, int e){
        Random rndNum = new Random();
        
        int start = s;
        int end = e;
        int rnd = rndNum.nextInt((end + 1) - start) + 1;
        
        return rnd;
    } 
}
