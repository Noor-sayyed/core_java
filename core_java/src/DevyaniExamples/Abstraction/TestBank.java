package DevyaniExamples.Abstraction;

public class TestBank {

	public static void main(String[] args) {
		Bank b;
		b=new SBI();
		System.out.println("Rate Of Interest SBI is:- "+b.getRateofInterest()+" %");
		b=new HDFC();
		System.out.println("Rate Of Interest HDFC is:- "+b.getRateofInterest()+" %");
	}
}
