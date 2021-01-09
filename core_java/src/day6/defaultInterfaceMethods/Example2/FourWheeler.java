package day6.defaultInterfaceMethods.Example2;

public interface FourWheeler {
	default void print() {
		System.out.println("I am in a four wheeler!!");
	}

}
