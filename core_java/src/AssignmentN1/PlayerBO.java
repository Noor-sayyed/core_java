package AssignmentN1;

public class PlayerBO {

	void displayAllPlayerDetails(Player[] playerList) {

      System.out.println("Player Details");
      for(Player p : playerList) {
          System.out.println(p);
      }

  }
  
  void displaySpecificPlayerDetails(Player[] playerList, String countryName) {
      int flag = 0;
      for (int i = 0; i < playerList.length; i++) {
          if(playerList[i].getCountry().equals(countryName)) {
              System.out.println(playerList[i]);
              flag=1;
          }
      }
      if(flag==0) {
          System.out.println("Player wtih (Country Name :"+countryName+") Not Found");
      }
  }
}
