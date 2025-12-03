public class Addition {
    int add(int a, int b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }
    double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args){
        Addition addition = new Addition();
        System.out.println("Add two integers: " + addition.add(5, 10));
        System.out.println("Add three integers: " + addition.add(10, 20, 30));
        System.out.println("Add two doubles: " + addition.add(15.25, 25.75));
    }
}
