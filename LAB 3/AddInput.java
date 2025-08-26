public class AddInput{
    public static void main(String[] args){
        //check if two arguments are provided
        if(args.length < 2){
            System.out.println("Please provide two integers as command line arguments.");
            return;
        }

        // convert command line arguments from string to integer
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        //perform addition
        int sum = num1 + num2;

        //Print result
        System.out.println("The Sum of: " + num1 + " and " + num2 + " is: " + sum);
    }
}
