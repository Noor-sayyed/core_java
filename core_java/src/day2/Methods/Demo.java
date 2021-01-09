package day2.Methods;

public class Demo {

	void display(int a, double b){
		System.out.println("Print 1st method");
	   }
	   void display(int a, double b, double c){
		System.out.println("Print 2nd method");
	   }
	   public static void main(String args[]){
		Demo obj = new Demo();
		obj.display(10, 50.55f);
	   }
}
