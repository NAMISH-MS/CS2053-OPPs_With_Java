// Define a simple class
class Student {
    // Data members (attributes)
    String name;
    int age;

    // Method (behavior)
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class
public class CLassObjectExample {
    public static void main(String[] args) {
        // Create object of Student
        Student s1 = new Student();
        
        // Assign values
        s1.name = "Rahul";
        s1.age = 20;

        // Call method
        s1.displayInfo();
    }
}
