package DevyaniExamples.Interface;

public interface GPS {
	public abstract void getCoordinates();
    default public void getRoughCoordinates() {
        // implementation to return coordinates from rough sources
        // such as wifi & mobile
        System.out.println("Fetching rough coordinates...");
    }

}
