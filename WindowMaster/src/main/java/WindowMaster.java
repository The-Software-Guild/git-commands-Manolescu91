
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LOVE
 */
public class WindowMaster {
    public static void main(String [] args) {
        // declare variables for height and width
        float heigth;
        float width;
        
        // declare String variables to hold the user's height and
        // width input
        String stringHeigth;
        String stringWidth;
        
        // declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        
        // declare and initialize the Scanner
        Scanner myScanner = new Scanner(System.in);
        
        // get input from the user
        System.out.println("Please enter window heigth:");
        stringHeigth = myScanner.nextLine();
        System.out.println("Please enter window width:");
        stringWidth = myScanner.nextLine();
        
        // convert String values of height and width to float values
        heigth = Float.parseFloat(stringHeigth);
        width = Float.parseFloat(stringWidth);
        
        // calculate the area of the window
        areaOfWindow = heigth * width;
        
        // calculate the perimeter of the window
        perimeterOfWindow = 2 * (heigth + width);
        
        // calculate the total cost - use a hard-coded value
        // for material cost
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
        
        // display the results to the user
        System.out.println("Window height = " + stringHeigth);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost =  " + cost);
    }
    
}
