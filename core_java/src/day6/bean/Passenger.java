package day6.bean;

public class Passenger {

	private String PassengerName;
	private int PassengerId;
	public String getPassengerName() {
		return PassengerName;
	}
	public void setPassengerName(String passengerName) {
		PassengerName = passengerName;
	}
	public int getPassengerId() {
		return PassengerId;
	}
	public void setPassengerId(int passengerId) {
		PassengerId = passengerId;
	}
	public Passenger(String passengerName, int i) {
		super();
		PassengerName = passengerName;
		PassengerId = i;
	}
	@Override
	public String toString() {
		return "Passenger [PassengerName=" + PassengerName + ", PassengerId=" + PassengerId + "]";
	}
}
