package if_statement;

public class NestedIfExample {

	public static void main(String[] args) {
		
		String ad = "Meerut, India";
		
		if (ad.endsWith("India")) {
			if (ad.contains("Meerut")) {
				System.out.println("Your city is Meerut");
			}
		}
	}
}
