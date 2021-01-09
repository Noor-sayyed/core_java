package DevyaniExamples.Interface;

public class Smartphone implements GPS,Radio{

	@Override
	public void startRadio() {
		
		System.out.println("Starting the STATION 98.3!!!");
	}

	@Override
	public void stopRadio() {
		System.out.println("Stoppingg STATION 98.3!!!");
		
	}

	@Override
	public void getCoordinates() {
		System.out.println("().. ().. ()");
		
	}

}
