// Example 2: Constructor Overloading — Rectangle Area
// Problem:

// Create a class Rectangle with overloaded constructors:

// No parameters → default length/width

// One parameter → square

// Two parameters → rectangle


public class Rectangle {
    int length, width;

    // Default
    Rectangle(){
        length = 1;
        width = 1;
    }

    // Square constructor
    Rectangle(int side){
        length = side;
        width = side;
    }

    // Rectangle constructor
    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    int area(){
        return length * width;
    }

    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        System.out.println("Area 1 = " + r1.area());
        System.out.println("Area 2 = " + r2.area());
        System.out.println("Area 3 = " + r3.area());
    }

}
