// 2. Lambda with Parameters
// Question:

// Write a lambda function to add two numbers and multipy two numbers.

interface Operation{
    int compute(int a, int b);
}

public class LambdaExample2 {
    public static void main(String[] args){
        Operation add = (a, b) -> a + b;
        Operation mul = (a, b) -> a * b;

        System.out.println("Sum: " + add.compute(10, 20));
        System.out.println("Product: " + mul.compute(10, 20));
    }
}
