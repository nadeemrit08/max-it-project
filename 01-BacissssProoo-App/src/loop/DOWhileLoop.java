package loop;

public class DOWhileLoop {

	public static void main(String[] args) {

		int i = 3;
		int j = 2;
		do {
			i = i + 2;
			j = i;
			i = i + j + 1;
		} while (i < j);
		System.out.println(i + " " + j);
	}
}
