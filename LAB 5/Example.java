// public class Example{
//     public static void main(String[] args){
//         int x = 20/0;
//         System.out.print("This will not run.");
//     }
// }

public class Example{
    public static void main(String [] args){
        try {
            int x = 20/0;
            System.out.println("Result:" + x);
        } catch (ArithmeticException e) {
            System.out.println("Error:" + e );
        }
        System.out.println("Program continues after Handling Exception");
    }
}