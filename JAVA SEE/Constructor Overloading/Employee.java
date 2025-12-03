// Example 4: Constructor Overloading — Employee Salary
// Problem:

// Overload constructors for:

// Default salary

// Salary with name

// Salary with name and salary amount


public class Employee {
    String name;
    double salary;

    Employee(){
        name = "Unknown";
        salary = 0.0;
    }

    Employee(String name){
        this.name = name;
        salary = 0.0;
    }

    Employee (String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args){
        Employee e1 = new Employee();
        Employee e2 = new Employee("Alice");
        Employee e3 = new Employee("bob", 75000.00);

        e1.display();
        e2.display();
        e3.display();
    }


}
