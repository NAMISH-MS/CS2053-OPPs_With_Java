// Example 1: Constructor Overloading — Student Details

// Write a Java program to overload constructors of a Student class:

// Default constructor

// Constructor with name

// Constructor with name and marks

class Student{
    String name;
    int marks;

    // Default constructor
    Student(){
        name = "Unknown";
        marks = 0;
    }

    // Constructor with name
    Student(String name){
        this.name = name;
        marks = 0;
    }

    // Constructor with name and marks
    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    void display(){
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
    
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student("Namish");
        Student s3 = new Student("Karan", 85);
        
        s1.display();
        s2.display();
        s3.display();
    }
}