package day7.practice.exceptions.UserdefinedExceptions;

public class UsrException extends Exception {

	
	public static int accno[] = {1001, 1002, 1003, 1004}; 
	  
    public static String name[] = 
                 {"Nish", "Shubh", "Sush", "Abhi", "Akash"}; 
  
    public static double bal[] = 
         {10000.00, 12000.00, 5600.0, 99.00, 1100.55}; 
  
    UsrException() {    } 
    
    // parametrized constructor 
    UsrException(String str) { }
    public static void main(String[] args) 
    {
    
    try  { 
        // display the heading for the table 
        System.out.println("ACCNO" + "\t" + "CUSTOMER" + 
                                       "\t" + "BALANCE"); 

        // display the actual account information 
        for (int i = 0; i < 5 ; i++) 
        { 
            System.out.println(accno[i] + "\t" + name[i] + 
                                           "\t" + bal[i]); 

            // display own exception if balance < 1000 
            if (bal[i] < 1000) 
            { 
                UsrException me = 
                   new UsrException("Balance is less than 1000"); 
                throw me; 
            } 
        } 
    } //end of try 

    catch (UsrException e) { 
        e.printStackTrace(); 
    } 
    }
}