package day6.defaultInterfaceMethods.Example2;

public class Car implements Vehicle,FourWheeler{

	@Override
	public void print() {
		  Vehicle.super.print();
	      FourWheeler.super.print();
	      Vehicle.blowHorn();
	      System.out.println("I am in a car!");
		
	}

	

}
