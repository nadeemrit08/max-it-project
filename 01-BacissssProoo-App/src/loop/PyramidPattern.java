package loop;

public class PyramidPattern {

	public static void main(String[] args) {
/*
		for (int i = 1; i <= 15; i++) {
			for (int j = 15; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		*/
		
		for(int i=1; i<=15; i++) {
			
			for(int j=15; j>=1; j--) {
				if (j>i) {
					System.out.print(" ");
				} else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}
}
