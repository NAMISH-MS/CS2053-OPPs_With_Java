// Basic Method Overriding
//Q1. Demonstrate method overriding using Animal and Dog classes

class Animal{
    void sound(){
        System.out.println("Animal makes Sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

public class OverrideExample1{
    public static void main(String[] args){
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();

        myAnimal.sound();
        myDog.sound();
    }
}