package day4.ArrayList.arraylistofBeans;

import java.util.ArrayList;
import java.util.Iterator;

import day3.beans.Book;
import day3.classAttributes.Employee;

public class Ex9 {

	public static void main(String[] args) {
		Book book1=new Book(101,"DaVinci Code","XYZ","Rs.850");
		Book book2=new Book(102,"Zee","PQR","Rs.630");
		Book book3=new Book(103,"Lee","YHU","Rs.740");
		Book book4=new Book(104,"Yee","KLP","Rs.963");
		Book book5=new Book(105,"Kee","POT","Rs.2000");
		Book book6=new Book(106,"Jee","YOI","Rs.500");
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);
		bookList.add(book5);
		bookList.add(book6); 
		
		Iterator<Book> itr=bookList.iterator();
		      System.out.println("\nThe iterator values"
                + " of list are: "); 
          while (itr.hasNext()) { 
        	  Book x=itr.next();
  			System.out.println(x);
          //System.out.print(itr.next() + " "); 
} 
	}
}
