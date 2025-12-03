interface Check{
    boolean test(int n);
}

public class BlockLambda {
    public static void main(String[] args){
        Check isEven = (n) -> {
            if(n % 2 == 0)
                return true;
            else
                return false;
        };

        System.out.println("Is 10 even? " + isEven.test(10));
        System.out.println("Is 7 even? " + isEven.test(7));
    }
}
