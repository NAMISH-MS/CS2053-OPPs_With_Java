import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class InvaildAgeException {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            if(age < 5 || age >18){
                throw new InvalidAgeException("Age must be in between 5 and 18.");
            }
            System.out.println("Valid Age: " + age);
        } 
        catch (InvalidAgeException e)
        {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program Continues...");
        sc.close();
    }
}
