package day2.breakNcontinue;

public class Example1 {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {      //break can be used to jump out the loop
			  if (i == 4) {
			    break;
			  }
			  System.out.println(i);
			}
	}
}
