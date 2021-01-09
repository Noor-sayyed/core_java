package day2.Arrays;

public class Example3 {
	//2D array
public static void main(String[] args) {
	int[][] myNumbers = {{40, 32, 55}, {23, 35, 61}};
	int[] firstArray = myNumbers[0];
	int[] secondArray = myNumbers[1];
	for(int i=0; i<firstArray.length; i++) {
	System.out.println(firstArray[i]);
	}
	System.out.println("**********************");
	for(int i=0; i<secondArray.length; i++) {
	System.out.println(secondArray[i]);
}

}
}	
