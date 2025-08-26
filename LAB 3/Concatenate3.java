public class Concatenate3 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide 3 command line arguments.");
            return;
        }
        String result = args[0] + " " + args[1] + " " + args[2];
        System.out.println("Concatenated string: " + result);
    }
}