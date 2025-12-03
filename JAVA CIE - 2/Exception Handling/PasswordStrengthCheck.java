import java.util.Scanner;

class PasswordStrengthCheckException extends Exception{
    public PasswordStrengthCheckException(String message){
        super(message);
    }
}

public class PasswordStrengthCheck {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        try {
            if(password.length() < 6){
                throw new PasswordStrengthCheckException("Password is too short! Must be at least 6 chracters.");
            }
            System.out.println("Password accepted.");
        } 
        catch (PasswordStrengthCheckException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Program Continues...");
        sc.close();
    }
}

