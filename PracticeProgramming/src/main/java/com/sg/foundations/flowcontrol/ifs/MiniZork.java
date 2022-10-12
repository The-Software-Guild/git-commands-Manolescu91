/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class MiniZork {
    public static void main(String [] args) {
        
        // Declare and initialize Scanner
        Scanner userInput = new Scanner(System.in);

        // Display choices to user
        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.println("Next to the house there is a lake...");
        System.out.println("Go to the house, open the mailbox or go to the lake? ");

        // Assign a variable to store user input
        String action = userInput.nextLine();

        // Block of nested conditions to check user input and further prompt user for input
        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.println("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.println("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) {
                System.out.println("You feel something moving...");
                System.out.println("Run away or keep searching?");
                action = userInput.nextLine();
                
                if (action.equals("keep searching")) {
                    System.out.println("Yikes! That's a venomous snake!");
                    System.out.println("You've been bit and are about to die!");
                } else if (action.equals("run away")) {
                    System.out.println("What a scaredy cat!");
                    System.out.println("Surely you won't go back there soon!");
                }
            }
        } else if (action.equals("go to the house")) {
            System.out.println("The door is boarded!");
            System.out.println("However, some of the windows are broken!");
            System.out.println("Break door or climb windows?");
            action = userInput.nextLine();
            
            if (action.equals("break door")) {
                System.out.println("You are quite loud...");
                System.out.println("You hear noises in the house!");
                System.out.println("Give up or keep going?");
                action = userInput.nextLine();
                
                if (action.equals("keep going")) {
                    System.out.println("Finally! You're in!");
                    System.out.println("You see movement under the table");
                    System.out.println("Guess what? A family of puppies lives here!");
                    System.out.println("Now you've got some friends to keep you company!");
                } else if (action.equals("give up")) {
                    System.out.println("It's okay to be scared!");
                    System.out.println("However, now you will never find out what the noise was!");
                    System.out.println("I could never live with that incertitude!");
                    System.out.println("But hey! That's me! I am sure you're not that curious!");
                }
                
            } else if (action.equals("climb windows")) {
                System.out.println("This windows are quite small...");
                System.out.println("Ah, you've now cut your hand in broken glass!");
                System.out.println("There is blood everywhere");
                System.out.println("Let it bleed or go to hospital?");
                action = userInput.nextLine();
                
                if (action.equals("let it bleed")){
                    System.out.println("You manage to enter the house");
                    System.out.println("You see a chest FULL OF GOLD!");
                    System.out.println("You grab as much as you can and...");
                    System.out.println("Just before you exit the window, you DIE!");
                    System.out.println("I guess you should've stopped the bleeding first!");
                } else if (action.equals("go to hospital")) {
                    System.out.println("Well, that was disappointing!");
                    System.out.println("Not sure why come so far if you're giving up so easily");
                    System.out.println("I guess I should not have expectations from people!");
                    System.out.println("Get better soon!");
                }
                      
            }
        } else if (action.equals("go to the lake")) {
            System.out.println("It's getting dark now...");
            System.out.println("There is a BIG CHEST on the other side of the lake...");
            System.out.println("You wonder what it could be...");    
            System.out.println("There is a boat on the lake,");
            System.out.println("There is also an old wooden bridge over it.");
            System.out.println("Take the boat or walk on bridge?");
            action = userInput.nextLine();
            
            if (action.equals("take the boat")) {
                System.out.println("You start paddling");
                System.out.println("One of your paddles falls over!");
                System.out.println("Lean over or let it go>");
                action = userInput.nextLine();
                
                if (action.equals("lean over")) {
                    System.out.println("The paddle is farther than you thought...");
                    System.out.println("You try to reach it with both of your hands and...");
                    System.out.println("You let go of your other paddle by mistake!");
                    System.out.println("Now you don't have a paddle and you can't swim!");
                    System.out.println("If only you would have had a life jacket...!");          
                } else if (action.equals("let it go")) {
                    System.out.println("You grab the other paddle with both hands,");
                    System.out.println("and you alternate paddling on both sides!");
                    System.out.println("You are quite confident in your skills...");
                    System.out.println("You reach the other side of the lake and...");
                    System.out.println("The chest is FULL of GOLD!");
                    System.out.println("All your hard work paid out!!! ENJOY!");
                }
                
            } else if (action.equals("walk on bridge")) {
                System.out.println("Half way through the bridge it becomes quite shaky");
                System.out.println("You did not expect it to be in such bad shape...");
                System.out.println("If you cross it, you might not make it back...");
                System.out.println("But you really want to see what's inside that CHEST");
                System.out.println("Cross it or turn back?");
                action = userInput.nextLine();
                
                if (action.equals("cross it")) {
                    System.out.println("You see the bridge falling apart behind you...");
                    System.out.println("You start walking faster and faster");
                    System.out.println("Now you are running...");
                    System.out.println("Aaaaaand, you made it!!!");
                    System.out.println("You open the chest and it is empty!");
                    System.out.println("You are now stranded and it started raining!");
                    System.out.println("I would say \"Try again\" but you may be here for a while");
                } else if (action.equals("turn back")){
                    System.out.println("Maybe someone should have taken swimming lessons");
                    System.out.println("This way, you wouldn't have been scared to try!");
                    System.out.println("But who am I to judge?");
                    System.out.println("Grab some friends and come back another time!");
                }     
            }
        }
        
    }
}
