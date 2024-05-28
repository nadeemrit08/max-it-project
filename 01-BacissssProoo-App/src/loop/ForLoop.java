package loop;

public class ForLoop {

	public static void main(String[] args) {

		for (int i = 2; i <= 3;) {
			for (int j = 3; j > 1;) {
				while (i < j) {
					++i;
					System.out.println(i + "  " + j);
					i *= i + 1;
				}
				j--;

			}
			i++;
		}

	}
}
