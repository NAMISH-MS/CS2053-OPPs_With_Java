class A {
    void add(int a, int b) {
        System.out.println("Sum of integers: " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Sum of doubles: " + (a + b));
    }
}

class B extends A {
    void add(String s1, String s2) {
        System.out.println("Concatenated strings: " + (s1 + s2));
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.add(5, 10);
        obj.add(3.5, 2.5);
        obj.add("Hello, ", "World!");
    }
}
