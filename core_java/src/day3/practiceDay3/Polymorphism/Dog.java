package day3.practiceDay3.Polymorphism;

public class Dog extends Animal{

	@Override
	public void greeting() {
		// TODO Auto-generated method stub
		System.out.println("BhowWoof!!!");
		super.greeting();
	}
	
	public void greeting(Dog another) {
	      System.out.println("WWWoooooooooof!");
	   }
	

}
