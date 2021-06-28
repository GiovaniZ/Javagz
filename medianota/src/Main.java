import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double nota1 = input.nextDouble();
		double nota2 = input.nextDouble();
		double nota3 = input.nextDouble();		
		double nota4 = input.nextDouble();		
		double total = nota1 + nota2 + nota3 + nota4;
		double media = (total) / 4;
				
		
		
		System.out.printf("MEDIA: = %.2f%n", media);
		
		

		input.close();
		
		
				
				
	}

}
