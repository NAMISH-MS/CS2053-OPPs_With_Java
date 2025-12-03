// Block Lambda Example in Java
// Question: Factiorial of a number using Block Lambda.

interface Factiorial{
    int calc(int n);
}

public class LambdaExample3 {
    public static void main(String[] args){
        Factiorial f = (n) -> {
            int result = 1;
            for(int i = 1; i<=n; i++){
                result *= i;
            }
            return result;
        };
        System.out.println("Factorial of 5: " + f.calc(5));
    }
}
