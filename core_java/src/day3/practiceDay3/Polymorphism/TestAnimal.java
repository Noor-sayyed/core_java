package day3.practiceDay3.Polymorphism;

public class TestAnimal {

	public static void main(String[] args) {
		/*Cat cat1 = new Cat();
	      cat1.greeting();
	      Dog dog1 = new Dog();
	      dog1.greeting();
	      Wolf wolf1 = new Wolf();
	      wolf1.greeting();*/
	      
	      //poly
	      
	      Animal animal1 = new Cat();
	      animal1.greeting();
	      Animal animal2 = new Dog();
	      animal2.greeting();
	      Animal animal3 = new Wolf();
	      animal3.greeting();
	}
}
