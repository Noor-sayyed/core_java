package day6.HashSet;
import java.util.*;

import day3.classAttributes.Employee;
import day6.bean.Patient;
//Implement code with HashSet with Patient bean and Iterator
public class Ex2 {

	public static void main(String[] args) {
		
		Patient patient1=new Patient(601, "Nalini", "Covid");
		Patient patient2=new Patient(602, "Shudhanshu", "Artherities");
		Patient patient3=new Patient(603, "Vidyut", "Jaundice");
		Patient patient4=new Patient(604, "Amey", "Cholera");
		
		Set<Patient> patients=new HashSet<Patient>();
		patients.add(patient1);
		patients.add(patient2);
		patients.add(patient3);
		patients.add(patient4);
		
		System.out.println("Using Iterator");
		Iterator<Patient> itr=patients.iterator();
		while(itr.hasNext()) {
			Patient p=itr.next();
			System.out.println(p);
		
	}
}
}
