package loop;

public class DoWhileLoop1 {

	public static void main(String[] args) {

		int i = 3;
		int j = 2;
		do {
			for(int k=3; k<=5; k++) {
				j=k+1;
				i+=j+k;
				k+=k+2;
			}
		} while (i < j);
		System.out.println(i/2 + " " + j);
	}
}
