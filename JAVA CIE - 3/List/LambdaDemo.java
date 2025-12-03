interface Operation{ //functional interface
    int compute(int a, int b);  // abstract method
}

public class LambdaDemo { //main class
    public static void main(String [] args){ //main method
        Operation add = (a, b) -> a + b; // lambda expression for addition
        Operation mul = (a, b) -> a * b; // lambda expression for multiplication

        System.out.println("Sum: " + add.compute(10,20)); // invoking addition
        System.out.println("Product: " + mul.compute(10, 20)); // invoking multiplication
    }
}
