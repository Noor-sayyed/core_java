package AssignmentN;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Player> playerList=new ArrayList<Player>();
		PlayerBO bo=new PlayerBO();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of players: \n");
		int cnt=sc.nextInt();
		
		for(int i=0; i<cnt; i++) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter a Player Name:");
		String pname = sc1.nextLine();
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter a Country Name:");
		String country = sc2.nextLine();
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter a Skill:");
		String skill = sc3.nextLine();
		Player play=new Player(pname, country, skill);
		playerList.add(play);
		
		
		}
		Scanner r=new Scanner(System.in);
		System.out.println("Enter 'ALLDETAILS'- for all player details OR \n 'SPECIFIC'- for specific player details");
	    String in=r.nextLine();
	    if(in.equals("ALLDETAILS")) {
		bo.displayAllPlayerDetails(playerList);
	    }
	    else if(in.equals("SPECIFIC")) {
	    	
	    	Scanner c=new Scanner(System.in);
	    	System.out.println("Enter the country of player: \n");
	    	String countryName=c.nextLine();
	    	bo.displaySpecificPlayerDetails(playerList, countryName);
	    }
	    else {
	    	System.out.println("Wrong Input!!");
	    }
		
	}
	}

