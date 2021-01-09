package day6.defaultInterfaceMethods.Example2;

public interface Vehicle {
	
	default void print() {
		System.out.println("I am in vehicle!!");
	}
	
	static void blowHorn() {
		System.out.println("Blowing Horn!!");
	}

}
