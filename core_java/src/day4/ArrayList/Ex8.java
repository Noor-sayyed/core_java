package day4.ArrayList;

import java.util.*;

public class Ex8 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(); 
        al.add("Java"); 
        al.add("Friends"); 
        al.add("Dear"); 
        al.add("Is"); 
        al.add("Superb"); 
  
        Collections.sort(al, Collections.reverseOrder()); 
  
        System.out.println("List after the use of" + 
                           " Collection.sort() :\n" + al); 
    } 
	}

