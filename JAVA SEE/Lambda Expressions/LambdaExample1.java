// 1. Lambda for a Simple Functional Interface
// Question:

// Create a functional interface and implement it using a lambda expression.


@FunctionalInterface
interface Greeting{
    void sayHello();
}

public class LambdaExample1 {
    public static void main(String[] args){
        Greeting g = () -> System.out.println("Hello, World!");
        g.sayHello();
    }
}
