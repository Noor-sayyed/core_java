package day9.mcq;

// output??
public class Example9 {
	public static void main(String[] args) {

		int i = 0;

		int j = 0;

		for (int x = 0; x < 7; x++) {

			i++;

			if (x == 2)
				break;

			j++;

		}

		System.out.println(i + ", " + j);

	}
}
