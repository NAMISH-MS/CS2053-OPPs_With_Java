//Q2. Show method overriding with super keyword

class Vehicle{
    void run(){
    System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle{
    @Override
    void run(){
        super.run(); // calling the parent class method
        System.out.println("Bike is running safely");
    }
}

public class OverrideExample2 {
    public static void main(String[] args){
        Bike myBike = new Bike();
        myBike.run();
    }
}
