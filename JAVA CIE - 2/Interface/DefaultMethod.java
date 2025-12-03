interface Drivable{
    void startEngine();
    void stopEngine();

    // default method
    default void honk(){
        System.out.println("Beep Beep!");
    }
}

class Car implements Drivable{
    @Override
    public void startEngine(){
        System.out.println("Car engine starts.");
    }

    @Override
    public void stopEngine(){
        System.out.println("Car engine stops.");
    }
    // no need to implement the honk() method , we can just use the default one.
}

class Truck implements Drivable{
    @Override
    public void startEngine(){
        System.out.println("Truck engine starts.");
    }

    @Override
    public void stopEngine(){
        System.out.println("Truck engine stops.");
    }

    // the Truck class chooses to override the default method.
    @Override
    public void honk(){
        System.out.println("Honk Honk!");
    }
}

public class DefaultMethod {
    public static void main(String [] args){
        Car myCar = new Car();
        Truck myTruck = new Truck();

        myCar.honk();
        myTruck.honk();
    }
}
