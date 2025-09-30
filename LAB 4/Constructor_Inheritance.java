class A {
    A() {
        System.out.println("Hello I'm A");
    }
}

class B extends A {
    B() {
        System.out.println("Hello I'm B");
    }
}

class C extends B {
    C() {
        System.out.println("Hello I'm C");
    }
}

public class Constructor_Inheritance {
    public static void main(String[] args) {
        C obj = new C();
    }
}