class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("-------------------");
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        // Using Default Constructor
        Student s1 = new Student();
        s1.displayInfo();

        // Using Parameterized Constructor
        Student s2 = new Student("Amit", 21);
        s2.displayInfo();

        Student s3 = new Student("Priya", 19);
        s3.displayInfo();
    }
}
