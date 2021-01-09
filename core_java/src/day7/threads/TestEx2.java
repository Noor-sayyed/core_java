package day7.threads;

public class TestEx2 {

	public static void main(String[] args) {
		Ex2 ex2=new Ex2();
		Thread thread=new Thread(ex2);
		thread.start();
	}
}
