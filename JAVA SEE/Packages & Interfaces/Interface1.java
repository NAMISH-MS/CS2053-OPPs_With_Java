interface A{
    void display();
}

class B implements A{
    public void display(){
        System.out.println("Implemented display()");
    }
}

public class Interface1 {
    public static void main(String[] args) {
        new B().display();
    }
}
