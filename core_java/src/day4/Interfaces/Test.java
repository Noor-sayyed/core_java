package day4.Interfaces;

public class Test {
	public static void main(String[] args) {
		
		Dog dog=new Dog();  //create dog obj
		dog.animalSound();
		dog.sleep();
		System.out.println(dog.count);
		/*Animal animal=new Dog(); //create main class obj using subclass
		animal.animalSound();
		animal.sleep();
		System.out.println(animal.count);*/
	}
	

}
