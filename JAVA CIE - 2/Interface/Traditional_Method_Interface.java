// Traditional method interface
interface Drivable{
    void startEngine();
    void stopEngine();
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
}

public class Traditional_Method_Interface{
    public static void main(String [] args){
        Car myCar = new Car();
        myCar.startEngine();
        myCar.stopEngine();
    }
}