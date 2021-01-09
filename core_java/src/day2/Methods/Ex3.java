package day2.Methods;
//static methods
public class Ex3 {
	public static int add(int x,int y) {
		int z = x+y;
		return z;
	}
	
	public static int sub(int x,int y) {
		//int x = 10;
		//int y = 2;
		int z = x-y;
		return z;
	}
public static void main(String[] args) {
	int re1 = add(4,8);
	int re2 = sub(10,12);
	System.out.println("result1 : "+re1);
	System.out.println("result2 : "+re2);
}
}
