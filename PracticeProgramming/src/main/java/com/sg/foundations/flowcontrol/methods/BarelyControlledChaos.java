/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.methods;

import java.util.Random;

public class BarelyControlledChaos {

    public static void main(String[] args) {

        String color = randomColor(); // call color method here
        ??? animal = ???; // call animal method again here
        ??? colorAgain = ???; // call color method again here
        ??? weight = ???; // call number method,
            // with a range between 5 - 200
        ??? distance = ???; // call number method,
            // with a range between 10 - 20
        ??? number = ???; // call number method,
            // with a range between 10000 - 20000
        ??? time = ???; // call number method,
            // with a range between 2 - 6            

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
        public static String randomColor(){
            Random random = new Random();
            int x = random.nextInt();
            }

    }
}
