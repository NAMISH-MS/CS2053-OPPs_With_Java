// 2. Program to Find the Largest Number from Command-Line Arguments

public class Largest {
    public static void main(String[] args){
        int largest = Integer.parseInt(args[0]);

        for(int i = 1; i < args.length; i++){
            int n = Integer.parseInt(args[i]);
            if (n > largest){
                largest = n;
            }
        }
        System.out.println("Largest: " + largest);
    }
}
