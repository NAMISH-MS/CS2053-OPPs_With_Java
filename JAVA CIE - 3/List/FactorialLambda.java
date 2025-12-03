interface MathFunc{
    int calculate(int n);
} 

public class FactorialLambda {
    public static void main(String[] args){
        MathFunc fact = (n) -> {
            int result = 1;
            for(int i = 1; i<=n; i++){
                result *= i;
            }
            return result;    
        };
        System.out.println("Factorial: " + fact.calculate(5));
    }
}
