import java.util.*;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 15, 20, 25, 30);
        nums.forEach(n -> {
            if (n % 2 == 0)
                System.out.println("Even: " + n);
        });
    }
}
