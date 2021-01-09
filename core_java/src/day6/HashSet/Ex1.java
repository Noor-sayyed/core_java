package day6.HashSet;

import java.util.*;
//Implement code with HashSet with PersonalInfo bean and foreach loop 

import day3.classAttributes.Employee;
import day6.bean.PersonalInfo;

public class Ex1 {

	public static void main(String[] args) {
		PersonalInfo info1=new PersonalInfo("Mrs.Katina","Married");
		PersonalInfo info2=new PersonalInfo("Ms.Jones","UnMarried");
		PersonalInfo info3=new PersonalInfo("Harry","UnMarried");
		PersonalInfo info4=new PersonalInfo("Mr.Carry","Married");
		
		Set<PersonalInfo> pInfo=new HashSet<PersonalInfo>();
		pInfo.add(info1);
		pInfo.add(info2);
		pInfo.add(info3);
		pInfo.add(info4);
		
		System.out.println("Using for loop!!");
		for(PersonalInfo p:pInfo) {
			System.out.println(p);
		}
	}
}
