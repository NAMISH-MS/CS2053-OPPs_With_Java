// 5. Program to Check Even or Odd (Using CLI)

public class EvenOdd {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        if (n % 2 == 0){
            System.out.println(n + " is Even");
        }else{
            System.out.println(n + " is Odd");
        }
    }
}
