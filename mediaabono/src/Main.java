import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
		Scanner input = new Scanner(System.in);
		
		int janeiro = input.nextInt();
		int fevereiro = input.nextInt();
		int marco = input.nextInt();		
		int abril = input.nextInt();		
		int total = janeiro + fevereiro + marco + abril / 4;
	
		
				
		
		if (total >= 5000) {
		System.out.printf("Parabéns, você vai receber um abono de 10");
		
		}
		

		input.close();
		
		
				
				
	}

}
