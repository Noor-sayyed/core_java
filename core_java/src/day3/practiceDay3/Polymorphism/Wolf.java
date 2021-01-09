package day3.practiceDay3.Polymorphism;

public class Wolf extends Dog {

	@Override
	public void greeting() {
		// TODO Auto-generated method stub
		System.out.println("WWWowww");
		super.greeting();
	}

	@Override
	public void greeting(Dog another) {
		// TODO Auto-generated method stub
		System.out.println("WWWWWowwwww");
		super.greeting(another);
	}

	
}
