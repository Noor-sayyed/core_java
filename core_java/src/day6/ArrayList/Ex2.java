package day6.ArrayList;
import java.util.*;

import day3.classAttributes.Employee;
import day6.bean.InvitationCard;

//ii) Implement code with ArrayList with InvitationCard bean and foreach loop

public class Ex2 {

	public static void main(String[] args) {
		InvitationCard invitation1=new InvitationCard("Bansal's",20);
		InvitationCard invitation2=new InvitationCard("Agarwal's",10);
		InvitationCard invitation3=new InvitationCard("Malhotra's",5);
		InvitationCard invitation4=new InvitationCard("Khandelwal's",30);
		InvitationCard invitation5=new InvitationCard("Rajput's",50);
		
		ArrayList<InvitationCard> arrayList=new ArrayList<InvitationCard>();
		arrayList.add(invitation1);
		arrayList.add(invitation2);
		arrayList.add(invitation3);
		arrayList.add(invitation4);
		arrayList.add(invitation5);
		
		System.out.println("Using for each loop!!");
		for(InvitationCard ic:arrayList) {
			System.out.println(ic);
		
	  }   
	}
}
