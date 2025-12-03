// Q4. Demonstrate Dynamic Method Dispatch using Overriding

class Parent{
    void show(){
        System.out.println("Parent class show()");
    }
}

class Child extends Parent{
    @Override
    void show(){
        System.out.println("Child class show()");
    }
}


public class OverrideExample4 {
    public static void main(String[] args) {
        Parent p;

        p = new Parent();
        p.show();

        p = new Child();
        p.show();
        
    }
}
