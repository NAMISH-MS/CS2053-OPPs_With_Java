// Exercise 2: Password Strength Check
// Problem:
// Create a program that asks the user to enter a password. If the password length is less than 6
// characters, throw a custom exception called WeakPasswordException with a message
// "Password too short! Must be at least 6 characters.".

import java.util.*;

class WeakPasswordException extends Exception{
    public WeakPasswordException(String message){
        super(message);
    }
}

public class PasswordCheck {
    public static void main(String[] args) throws WeakPasswordException{
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = sc.nextLine();

        try {
            if(password.length() < 6){
                throw new WeakPasswordException("Password too short! Must be at least 6 characters.");
            }else{
                System.out.println("Password accepted. " + password);
            }
        } catch (WeakPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Program ended.");
    }
}
