package AssignmentN;

import java.util.List;

public class PlayerBO {
  
	void displayAllPlayerDetails(List<Player> playerList) {
		System.out.println("Player Details...");
		for(Player p:playerList) {
			System.out.println(p);
		}
		
	}
	void displaySpecificPlayerDetails(List<Player> playerList, String countryName) {
		for(Player p:playerList) {
			if(p.getCountry().equalsIgnoreCase(countryName)) {
				System.out.println("Player details "+countryName);
				System.out.println("\n"+p);
			}
	}
}
}