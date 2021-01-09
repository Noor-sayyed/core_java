package AssignmentN1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String ans = "";
            System.out.println("Enter the number of players");
            int input = sc1.nextInt();
            Player playerList[] = new Player[input];
            for(int i=0;i<input;i++) {
                System.out.println("Enter the player name");
                String name = sc2.nextLine();
                System.out.println("Enter the country name");
                String country = sc2.nextLine();
                System.out.println("Enter the skill");
                String skill = sc2.nextLine();
                playerList[i] = new Player(name, country, skill);
            }
            do{
            System.out.println("Enter choice:");
            System.out.println("1. Display All");
            System.out.println("2. Search By Country");
            int ch = sc1.nextInt();
            switch(ch) {
            case 1:
                PlayerBO bo = new PlayerBO();
                bo.displayAllPlayerDetails(playerList);
                break;
            case 2:
                PlayerBO bo1 = new PlayerBO();
                System.out.println("Enter the country name");
                String country = sc2.nextLine();
                bo1.displaySpecificPlayerDetails(playerList,country);
                break;
            default:
                break;
            }
            System.out.println("Do you want to continue?(Y/N):");
            ans = sc2.nextLine();
        }while("y".equalsIgnoreCase(ans)) ;
    }
}
