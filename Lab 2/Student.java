package JavaLab02;

// objects with class
public class Student {
	 String name;
	 int age;

	 void displayInfo() {
		 System.out.println("Name:" + name + ", Age:" + age);
	 }


	public static void main(String[] args) {
		Student S1 = new Student();
		S1.name = "John";
		S1.age = 20;
		S1.displayInfo();
	}
}
