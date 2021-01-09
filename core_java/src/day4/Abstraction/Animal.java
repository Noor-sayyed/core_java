package day4.Abstraction;

public abstract class Animal {

	//public void animalSound(); This gives error- no body availabel to method 
	//which happens only in abstract class
	public abstract void animalSound();
	public void sleep() {
		System.out.println("Sleepingg Zzzzz!!");
	}
}
