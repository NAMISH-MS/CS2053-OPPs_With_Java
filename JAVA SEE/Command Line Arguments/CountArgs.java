// 4. Program to Count Command-Line Arguments

public class CountArgs {
    public static void main(String[] args){
        System.out.println("Total Arguments: " + args.length);

        for(int i = 0; i < args.length; i++){
            System.out.println("Arguments " + i + ": " + args[i]);
        }
    }
}
