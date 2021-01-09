package day3.inheritance;

public class Test2 {

	public static void main(String[] args) {
		Vehicle obj =new Car();   //allowed storing the obj of child class in parent class
		obj.start();              //reverse is not true
		obj.stop();
	}
}
