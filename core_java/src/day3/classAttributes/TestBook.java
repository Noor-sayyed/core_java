package day3.classAttributes;
import day3.beans.*;

public class TestBook {
	
	public static void main(String[] args) {
		Book book1=new Book(101,"DaVinci Code","XYZ","Rs.850");
		Book book2=new Book(102,"Zee","PQR","Rs.630");
		Book book3=new Book(103,"Lee","YHU","Rs.740");
		Book book4=new Book(104,"Yee","KLP","Rs.963");
		Book book5=new Book(105,"Kee","POT","Rs.2000");
		Book book6=new Book(106,"Jee","YOI","Rs.500");
		
		Book[] arrayOfbooks= {book1,book2,book3,book4,book5,book6};
		
		TestBook testBook=new TestBook();
		testBook.displayAllBooks(arrayOfbooks);
		
	}
	
	public void displayAllBooks(Book[] arrayOfbooks) {
		
		for(Book book:arrayOfbooks) {
			System.out.println(book);
			
		}
		}
	}
