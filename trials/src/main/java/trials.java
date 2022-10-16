/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LOVE
 */
public class trials {
    public static void jaggedArray() {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49}; // 12 numbers
        int[] secondHalf = {51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100}; // also 12!
        
        
    }
    public int[] GrowArray(int[] original, int [] updated)
{
    int[] newArray = new int[original.length + updated.length);

    for (int i = 0; i < original.length; i++)
    {
        // copy the element at the current index
        // from original to newArray
        newArray[i] = original[i];
    }

    return newArray;
}
} 
