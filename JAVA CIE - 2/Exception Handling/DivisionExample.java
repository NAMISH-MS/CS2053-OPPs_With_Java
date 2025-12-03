// Write a Java program that divides two numbers. If the divisor is zero, the program should catch
// the exception and display a friendly message.

import java.util.Scanner;

public class DivisionExample {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator:");
        int numerator = sc.nextInt();
        System.out.print("Enter Denomiator:");
        int denominator = sc.nextInt();

        try {
                int result = numerator / denominator;
                System.out.println("Result:" + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        System.out.println("Program Continues...");
        sc.close();
    }
}
