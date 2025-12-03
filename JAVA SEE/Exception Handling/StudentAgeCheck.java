// Simplified Custom Exception Example

// Check if a student’s age is valid (between 5 and 18). If not, throw a simple custom
// exception.

import java.util.*;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class StudentAgeCheck {
    public static void main(String[] args) throws InvalidAgeException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Studnet's Age: ");
        int age  = sc.nextInt();
       try{ 
            if (age < 5 || age > 18){
                throw new InvalidAgeException("Age must be between 5 and 18.");
            }else{
                System.out.println("The age is valid: " + age);
            }
            
        }catch(InvalidAgeException e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Program ended.");
    }
}
