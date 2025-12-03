// Overload display() with:
// • no parameters
// • one String
// • one int & one String

public class DisplayOverload {
    void display(){
        System.out.println("Display with no parameters.");
    }
    void display(String message){
        System.out.println("Message: " + message);
    }
    void display(int number, String message){
        System.out.println("Number: " + number + ", Message: " + message);
    }

    public static void main(String[] args){
        DisplayOverload displayoverload = new DisplayOverload();
        displayoverload.display();
        displayoverload.display("hello java");
        displayoverload.display(10, "hello java");
    }
}
