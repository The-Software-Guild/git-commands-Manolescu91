/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

public class LazyTeenager {
    public static void main(String[] args) {
        boolean roomDirty = true;
        int requestMade = 0;
        int randChance = rndNum(1, 10);
          
        // Hidden statement to print random number for throubleshooting code
//        System.out.println(randChance); 
        
        do {
            requestMade += 1;
            System.out.println("Clean your room!" + "(x" + requestMade + ")");
            if (requestMade >=7) {
                System.out.println("That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            } else if (requestMade < 7 && requestMade == randChance) {
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
                roomDirty = false;
                break;
            }
            
        }while(roomDirty);
    }
    
    public static int rndNum(int s, int e) {
      Random rnd = new Random();
      
      int start = s;
      int end = e;
      int rand = rnd.nextInt((end + 1) - start) + start;
      return rand;
    }
}


