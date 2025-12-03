// Q6. Method Overriding in Multilevel Inheritance

class A{
    void display(){
        System.out.println("Message from Class A");
    }
}

class B extends A{
    @Override
    void display(){
        System.out.println("Message from class B");
    }
}

class C extends B{
    @Override
    void display(){
        System.out.println("Message from class C");
    }
}

public class OverrideMultilevelInhertanceExample {
    public static void main(String[] args){
        A obj;

        obj = new A();
        obj.display();

        obj = new B();
        obj.display();

        obj = new C();
        obj.display();
    }
}
