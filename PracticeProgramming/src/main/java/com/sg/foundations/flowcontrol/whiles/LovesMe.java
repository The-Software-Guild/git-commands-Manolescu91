/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;


public class LovesMe {
    public static void main(String[] args) {
        int petals = 0;
        int start = 1;
        
//        while (start <= petals) {
//            if (start % 2 == 0) {
//                System.out.println("It LOVES me!");
//            } else {
//                System.out.println("It LOVES me NOT!");
//            }
//            start++;
//        }

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
}


// When using a while loop, if there are no petals in the flower, there is no message
// When using a do while loop, even if there are no petas in the flower, a message is displayed
// as the loop runs once even if the condition is false