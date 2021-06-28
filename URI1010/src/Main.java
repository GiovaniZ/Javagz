import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int codpeca1 = input.nextInt();
		int nrpecas1 = input.nextInt();
		double vlrunit1 = input.nextDouble();
		int codpeca2 = input.nextInt();
		int nrpecas2 = input.nextInt();
		double vlrunit2 = input.nextDouble();
		
		double total = nrpecas1 * vlrunit1 + nrpecas2 * vlrunit2;
		
		
	System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		
		
		input.close();

	}

}
