// Exercise 2: Custom Exception Handling

// Create a program that checks a student’s marks. If marks are negative or greater than 100, throw
// a custom exception InvalidMarksException.

import java.util.*;

class InvalidMarksException extends Exception{
    public InvalidMarksException(String message){
        super(message);
    }
}

public class StudentMarks {
    public static void main(String[] args) throws InvalidMarksException{
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Student's Marks: ");
        int marks = sc.nextInt();

        try {
            if(marks < 0 || marks >100){
                throw new InvalidMarksException("Marks must be between 0 to 100.");
            }else{
                System.out.println("The marks are valid: " + marks);
            }
        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program ended.");

    }
}
