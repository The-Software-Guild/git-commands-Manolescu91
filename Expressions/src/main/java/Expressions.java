/**
 *@author Roxana Manolescu
 * email: rxn.manolescu@gmail.com
 * date: 11.10.2022
 * Purpose: Understand operators, operands and operations
 */
public class Expressions {
    public static void main(String[] args) {
        // Declare variables
        int result;
        int operand1;
        int operand2;
        int operand3;
        
        // Initialize result with the value of 0
        result = 0;
        
        // Initialize the operands
        operand1 = 5;
        operand2 = 7;
        
        // Assign the value of operand2 to operand3
        operand3 = operand2;
        
        
        //
        // Addition
        //
        // Addition of two literals
        result = 42 + 53; // result is now 95
        
        // Addition of two variables
        result = operand1 + operand2; // result is now 12
        
        // Additions of a combination of variables and literals
        result = 1 + operand1; // result is now 6
        result = 1 + operand1 + operand2 + operand3; // result is now 22
        
        // The += operator is used to add a value to a variable
        // result += operand1 is equivalent to result = result + operand1
        
        result = 2; // set result to 2
        result += 4; // result is now 6 (2 + 4)
        result += operand1; // result is now equal to 11 (6 + 5)
        
        
        //
        // Subtraction
        //
        // Subtraction of two literals
        result = 9-5; // result is now 4
        
        // Subtraction of two variables
        result = operand1 - operand2; // result is now -2
        
        // Subtraction of a combination of variables and literals
        result = 15 - operand1; // result is now 10
        result = 19 - operand1 - operand2 - operand3; // result is now 0
        
        // The -= operator is used to subtract a value from a variable
        // result -= operand1 is equivalent to result = result - operand1
        result = 2; // set result to 2
        result -= 4; // result is now -2 (2 - 4)
        result -= operand1; // result is now -7 (-2 - 5)
        
        
        //
        // Multiplication
        // Multiplication of two literals
        result = 2 * 3; // result is now 6
        
        // Multiplication of two variables
        result = operand1 * operand2; // result is now 35
        
        // Multiplication of a combination of variables and literals
        result = 2 * operand1; // result is now 10
        result = 2 * operand1 * operand2 * operand3; // result is now 490
        
        // The *= operator is used to multiply a variable with a value
        // result *= operand1 is equivalent to result = result * operand1
        result = 2; // set result to 2
        result *= 4; // result is now 8 (2 * 4)
        result *= operand1; // result is now 40 (8 * 5)
        
        
        //
        // Division and Modulus
        //
        // Division of two literals
        result = 6 / 3; // result is now 2
        
        // Division of two variables
        result = operand1 / operand2; // result is now 0
        
        // We use the modulus operator (%) to get the remainder:
        result = operand1 % operand2; // result is now 5
        
        // Division of a combination of variables and literals
        result = 20 / operand1; // result is now 4
        result = 245 / operand1 / operand2 / operand3; // result is now 1
        
        // The /= operator is used to divise a variable by a value
        // result /= operand1 is equivalent to result = result / operand1
        result = 40; // set result to 40
        result /= 4; // result is now 10 (40 / 4)
        result /= operand1; // result is now 2 (10 / 5)
    }
}
