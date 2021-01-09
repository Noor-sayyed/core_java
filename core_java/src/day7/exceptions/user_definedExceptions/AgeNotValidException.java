package day7.exceptions.user_definedExceptions;

public class AgeNotValidException extends Exception {

	public AgeNotValidException() {
		System.out.println("Age must be more than 18");
	}
	
	public AgeNotValidException(String message) {
		System.out.println(message);
	}
}
