package JavaLab02;

//Class with Inheritance
public class Animal {
	void Sound() {
		System.out.println("Animal make a sound.");
	}
	
	class Dog extends Animal{
		void Sound() {
			System.out.println("Dog Barks");
		}
		public static void main(String[] args) {
			Dog D = new Dog();
			D.Sound(); // Overridden method
		}
	}
}
