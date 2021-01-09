package day1.strings;

public class Example5 {

	public static void main(String[] args) {
		char c1 = '1';
        //int i = (int) c1;//instaed use below command
        int i=Character.getNumericValue(c1);
        System.out.println(c1+"  "+i);

	}
}
