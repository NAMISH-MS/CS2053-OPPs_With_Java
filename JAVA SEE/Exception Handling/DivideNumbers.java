// Exercise 1: Basic Exception Handling

// Write a Java program that divides two numbers. If the divisor is zero, the program should catch
// the exception and display a friendly message.

import java.util.*;

public class DivideNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Numerator: ");
        int num = sc.nextInt();

        System.out.println("Enter the Denominator: ");
        int den = sc.nextInt();

        try {
            int result = num/den;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        System.out.println("Program continues normally . . .");
        sc.close();
    }
}