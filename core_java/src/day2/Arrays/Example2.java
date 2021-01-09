package day2.Arrays;

public class Example2 {

	public static void main(String[] args) {
		int[] marks = {10, 20, 30, 40};  //array of int values
		/*System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);*/
		System.out.println(marks.length);
		//System.out.println(marks[4]);  array index out of bound exception
		for(int i=0; i<marks.length; i++) {
			int m = marks[i];      //best practice 
			//System.out.println(marks[i]);
			System.out.println(m);
		}
	}
}
