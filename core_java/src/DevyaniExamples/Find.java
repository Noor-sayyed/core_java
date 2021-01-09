package DevyaniExamples;

import java.util.Arrays;

public class Find {

	private static void check(int[] arr, int toCheckValue) 
    { 
        // check if the specified element 
        // is present in the array or not 
        // using Linear Search method 
        boolean test = false; 
        for (int element : arr) { 
            if (element == toCheckValue) { 
                test = true; 
                break; 
            } 
        } 
  
        // Print the result 
        System.out.println("Is " + toCheckValue 
                           + " present in the array: " + test); 
    } 
  
    public static void main(String[] args) 
    { 
  
        // Get the array 
        int arr[] = { 20000,25000,55000,47000,38000}; 
  
        // Get the value to be checked 
        int toCheckValue = 53000; 
  
        // Print the array 
        System.out.println("Array: "
                           + Arrays.toString(arr)); 
  
        // Check if this value is 
        // present in the array or not 
        check(arr, toCheckValue); 
    } 
} 
