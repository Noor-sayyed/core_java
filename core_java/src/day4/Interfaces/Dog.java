package day4.Interfaces;

public class Dog implements Animal{  //add unimplemented methods

	@Override
	public void animalSound() {
		// TODO Auto-generated method stub
		System.out.println("Boww Woww!!");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Zzzz!!!");
		
	}

}
