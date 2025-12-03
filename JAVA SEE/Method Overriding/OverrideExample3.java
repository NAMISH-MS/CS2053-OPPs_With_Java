// Q3. Override the toString() method in a Student class

class Student{
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student ID: " + id + ", Name: " + name;
    }
}

public class OverrideExample3 {
    public static void main(String[] args) {
        Student s = new Student(101, "Namish");
        System.out.println(s);
    }
}
