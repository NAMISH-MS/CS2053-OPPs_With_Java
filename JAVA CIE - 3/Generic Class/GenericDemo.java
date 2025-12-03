//Create a generic class Box<T> that stores one value and displays it.
//In main(), create objects for Integer and String.

class Box<T>{ // Generic class with type parameter T
    T value; // Generic variable to hold the value
    Box(T value){       // Constructor to initialize the value
        this.value = value;         // 'this' keyword to refer to the current object's variable
    }
    void display(){  // Method to display the value
        System.out.println("Value :" + value);
    }
}

public class GenericDemo {   // Main class
    public static void main(String[] args){  // Main method
        Box<Integer> intBox = new Box<>(100);  // Creating an object of Box with Integer type
        Box<String> strBox =  new Box<>("Namish"); // Creating an object of Box with String type

        intBox.display(); // Displaying the Integer value
        strBox.display(); // Displaying the String value
    }
}

