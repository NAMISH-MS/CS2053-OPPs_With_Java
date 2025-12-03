// Command line argument in java
public class CommandLineExample {
    public static void main(String[] args){
        System.out.println("Number of Arguments: " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }    
}
