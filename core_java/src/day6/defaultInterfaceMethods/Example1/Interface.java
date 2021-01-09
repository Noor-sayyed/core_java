package day6.defaultInterfaceMethods.Example1;

public interface Interface {
	//abstract method
			public void square(int a);
		
			//default method
	  default void myMethod(){
			System.out.println("I am in mymethod of interface");
	  }

}
