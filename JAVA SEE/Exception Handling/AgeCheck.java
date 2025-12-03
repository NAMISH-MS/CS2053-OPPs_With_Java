// Write a program that asks the user to enter their age. If the age is less than 18, throw a custom
// exception called UnderAgeException with a message "You must be at least 18 years
// old!".

import java.util.*;

class UnderAgeException extends Exception{
    public UnderAgeException(String message){
        super(message);
    }
}

public class AgeCheck {
    public static void main(String[] args) throws UnderAgeException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        try {
            if(age < 18){
                throw new UnderAgeException("You must be at least 18 years old!");
            }else{
                System.out.println("Valid age: " + age);
            }
        } catch (UnderAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Program ended.");
    }
}
