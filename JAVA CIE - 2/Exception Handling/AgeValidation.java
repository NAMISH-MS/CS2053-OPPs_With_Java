import java.util.Scanner;

class AgeValidationException extends Exception{
    public AgeValidationException(String message){
        super (message);
    }
}

public class AgeValidation {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            if(age < 18){
                throw new AgeValidationException("Age must be at least 18 years old!");
            }
            System.out.println("Valid Age: " + age);
        } 
        catch (AgeValidationException e) 
        {
            System.out.println("Error:" + e.getMessage());
        }
        System.out.println("Program Continues...");
        sc.close();
    }
}
