// 6. Program to Reverse a String from CLI
public class ReverseString {
    public static void main(String [] args){
        String s = args[0];
        String rev = "";
        for(int i = s.length() -1; i >= 0; i--){
            rev += s.charAt(i);
        }
        System.out.println("Reversed String: " + rev);
    }
}
