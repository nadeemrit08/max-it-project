package loop;

public class ForLoop_SumOfNaturalNum {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 10; ) {
			sum = sum + i;
			i++;
		}
		
		System.out.println(sum);
	}
}
