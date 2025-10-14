public class WrapperClassAutoBoxingAutoUnboxing {
    public static void main(String[] args) {
        // Wrapper Class Example
        Integer intObj = Integer.valueOf(100); // Boxing using valueOf()
        Double doubleObj = Double.valueOf(55.5);

        System.out.println("Wrapper Integer object: " + intObj);
        System.out.println("Wrapper Double object: " + doubleObj);

        // Autoboxing Example (primitive to Wrapper automatically)
        int a = 50;
        Integer autoBoxedInt = a; // Autoboxing
        System.out.println("Autoboxed Integer: " + autoBoxedInt);

        // Auto-unboxing Example (Wrapper to primitive automatically)
        Integer b = 200;
        int autoUnboxedInt = b; // Auto-unboxing
        System.out.println("Auto-unboxed int: " + autoUnboxedInt);

        // Using Wrapper objects in expressions (auto-unboxing in action)
        Integer x = 10, y = 20;
        int sum = x + y; // x and y are auto-unboxed
        System.out.println("Sum using Wrapper objects: " + sum);
    }
}