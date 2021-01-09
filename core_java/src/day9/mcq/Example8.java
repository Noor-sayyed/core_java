package day9.mcq;

// output??
public class Example8 {
	public static void main(String[] args) {
		int[] a = { 16, 33, 14, 26 };

		for (int i = 4; i > a.length; i--)

			a[i] = a[(a[i] + 6) % a.length];

		System.out.println(a[3]);
	}
}
