/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

public class DoOrDoNot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Should I do it? (y/n) ");
        String choice = input.nextLine();
        boolean doIt;

        if (choice.equals("y")) {
            doIt = true; // DO IT!
        } else {
            doIt = false; // DONT YOU DARE!
        }

        boolean iDidIt = false;

//        do {
//            iDidIt = true;
//            break;
//        } while (doIt);

        while (doIt){
            iDidIt = true;
            break;
        }

        if (doIt && iDidIt) {
            System.out.println("I did it!");
        } else if (!doIt && iDidIt) {
            System.out.println("I know you said not to ... but I totally did anyways.");
        } else {
            System.out.println("Don't look at me, I didn't do anything!");
        }
    }
}


// If I tell it to do it in do while,  prints the message from condition "if (doIt && iDidIt)"
// If I tell it to not do ii in do while, prints the message from condition "else if (!doIt && iDidIt)"
// because loop runs once and then the condition becomes false
//
// If do while is replaced by a while loop only, when I tell it to not do it, it prints the
// message from condition "else" as the condition is false from the beginning