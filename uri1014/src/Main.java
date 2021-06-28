import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner (System.in);
		
		int disttotal = input.nextInt();
		double totalcomb = input.nextDouble();
		
		double consumomedio = disttotal / totalcomb;
		
		
        System.out.printf("%.3f km/l%n", consumomedio);
        
		
		
		input.close();
		

	}

}
