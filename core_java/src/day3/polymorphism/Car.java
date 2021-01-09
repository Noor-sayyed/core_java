package day3.polymorphism;

public class Car extends Vehicle {

	int maxSpeed = 180; 
	  
    void display() 
    { 
        System.out.println("Maximum Speed: " + super.maxSpeed); 
    }
}
