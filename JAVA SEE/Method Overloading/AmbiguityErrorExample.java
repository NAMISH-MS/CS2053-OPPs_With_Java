public class AmbiguityErrorExample {
    void test(int a, double b){
        System.out.println("int and double");
    }
    void test(double a, int b){
        System.out.println("double and int");
    }  
    public static void main(String[] args) {
        AmbiguityErrorExample example = new AmbiguityErrorExample();
        
        // this line caues ambiguity:
        // example.test(5, 10);
        // Bothe methods are vaild (int, int can covert in 2 ways)

        example.test(10, 10.5);// calls test(int, double)
        example.test(10.5, 10);// calls test(double, int)
    }
}
