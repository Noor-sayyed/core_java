package day4.Abstraction;

public class TestAnimal {
	public static void main(String[] args) {
		//Animal animal=new Animal(); gives error because cannot create obj of abstract class
		 
		//with object of subclass(Pig) we can call the method of Main class
		Animal animal=new Pig();
		animal.animalSound();
		animal.sleep();

	}
}
