package day1.strings;

public class Example2 {
	public static void main(String[] args) {
		//String name="zensar Technologies";
		//System.out.println("Length of the name is -" + name.toUpperCase());
		//System.out.println("Length of the name is -" + name.toLowerCase());
		String name = "zensar";
		System.out.println(name.toUpperCase());

		String name2 = "Zensar Technologies";
		System.out.println(name2.toLowerCase());
		
		String txt = "Please locate where 'locate' occurs!";
		System.out.println(txt.indexOf("locate")); // Outputs 7
		//System.out.println(txt.indexOf(" "));
		
		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName.concat(lastName));
	}

}
