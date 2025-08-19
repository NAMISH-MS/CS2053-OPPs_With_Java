package JavaLab02;

//Constructor with class
public class Car {
	String Brand;
	int Year;
	
	//Constructor
	Car(String B, int Y){
		Brand = B;
		Year = Y;
	}
	
	void Display() {
		System.out.println("Car: " + Brand + " (" + Year + ")");
	}
	
	public static void main(String[] args) {
		Car C1 = new Car("Toyota", 2020);
		Car C2 = new Car("Honda", 2022);
		
		C1.Display();
		C2.Display();
	}
}
