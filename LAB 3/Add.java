// Using menthod overloading

public class Add {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.print("Enter first integer: ");
            int int1 = scanner.nextInt();
            System.out.print("Enter second integer: ");
            int int2 = scanner.nextInt();
            int intSum = add(int1, int2);
            System.out.println("Integer Sum: " + intSum);

            System.out.print("Enter first double: ");
            double double1 = scanner.nextDouble();
            System.out.print("Enter second double: ");
            double double2 = scanner.nextDouble();
            double doubleSum = add(double1, double2);
            System.out.println("Double Sum: " + doubleSum);
        }
    }
}
