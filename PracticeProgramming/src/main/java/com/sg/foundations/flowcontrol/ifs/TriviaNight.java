/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class TriviaNight {
    public static void main(String [] args) {
        
        // initialize variables to store user input
        int answerQuestion1;
        int answerQuestion2;
        int answerQuestion3;
        
        // initialize counter variables
        int correctCounter = 0;
        int numberOfQuestions = 3;
        
        // declare and initialize the Scanner
        Scanner myScanner = new Scanner(System.in);
        
        // use system.out.println to print the questions to user
        System.out.println("It's TRIVIA NIGHT! GOOD LUCK!");
        
        System.out.println("\nQUESTION 1");
        System.out.println("In which continent are Chile, Argentina and Brazil?"
        + "\n 1 - Europe"
        + "\n 2 - North America"
        + "\n 3 - Africa"
        + "\n 4 - South America");
        
        System.out.println("Your Answer:"); // ask user for answer
        
        // assign user's input to variable
        answerQuestion1 = myScanner.nextInt();
        
        // conditional block to check whether user's answer is correct or not
        // and display to user whether the answer is correct or not
        // if the answer is correct, the correct answers counter will increase
        // after every question, the questions counter will decrease
        if(answerQuestion1 == 4) {
            System.out.println("CORRECT!");
            correctCounter += 1;
            numberOfQuestions -= 1;
            System.out.println("Correct answers:" + correctCounter);
            System.out.println("Number of remaining questions: " + numberOfQuestions);
        } else {
            System.out.println("INCORRECT!");
            numberOfQuestions -= 1;
            System.out.println("Correct answers:" + correctCounter);
            System.out.println("Number of remaining questions: " + numberOfQuestions);
        }
        
        System.out.println("\nQUESTION 2");
        System.out.println("The Mad Hatter and the Cheshire Cat are characters in which famous book?"
        + "\n 1 - Winne-the-Pooh"
        + "\n 2 - Charlotte's Web"
        + "\n 3 - Alice in Wonderland"
        + "\n 4 - Charlie and the Chocolate Factory");
        
        System.out.println("Your Answer:"); // ask user for answer
        
        // assign user's input to variable
        answerQuestion2 = myScanner.nextInt();
        
        // conditional block to check whether user's answer is correct or not
        // and display to user whether the answer is correct or not
        // if the answer is correct, the correct answers counter will increase
        // after every question, the questions counter will decrease
        if(answerQuestion2 == 3) {
            System.out.println("CORRECT!");
            correctCounter += 1;
            numberOfQuestions -= 1;
            System.out.println("Correct answers:" + correctCounter);
            System.out.println("Number of remaining questions: " + numberOfQuestions);
        } else {
            System.out.println("INCORRECT!");
            numberOfQuestions -= 1;
            System.out.println("Correct answers:" + correctCounter);
            System.out.println("Number of remaining questions: " + numberOfQuestions);
        }
        
        System.out.println("\nQUESTION 3");
        System.out.println("Which artist famously cut off his own ear?"
        + "\n 1 - Vincent Van Gogh"
        + "\n 2 - Claude Monet"
        + "\n 3 - Salvador Dali"
        + "\n 4 - Pablo Picasso");
        
        System.out.println("Your Answer:"); // ask user for answer
        
        // assign user's input to variable
        answerQuestion3 = myScanner.nextInt();
        
        // conditional block to check whether user's answer is correct or not
        // and display to user whether the answer is correct or not
        // if the answer is correct, the correct answers counter will increase
        // after every question, the questions counter will decrease
        if(answerQuestion3 == 1) {
            System.out.println("CORRECT!");
            correctCounter += 1;
            numberOfQuestions -= 1;
            System.out.println("Correct answers:" + correctCounter);
            System.out.println("Number of remaining questions: " + numberOfQuestions);
        } else {
            System.out.println("INCORRECT!");
            numberOfQuestions -= 1;
            System.out.println("Correct answers:" + correctCounter);
            System.out.println("Number of remaining questions: " + numberOfQuestions);
        }
        
        // conditional block to display message to user according to the number
        // of questions correctly answered
        if(correctCounter == 3){
            System.out.println("\nYou're a smart cookie! You got " + correctCounter + " out of 3!");
        } else if(correctCounter == 2) {
            System.out.println("\nYou almost had it! You got " + correctCounter + " out of 3!");
        } else if(correctCounter == 1) {
            System.out.println("\nJust getting by! You got " + correctCounter + " out of 3!");
        } else {
            System.out.println("\nTry again! You got " + correctCounter + " out of 3!");
        }
    }
    
}
