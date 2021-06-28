import java.util.Locale;
import java.util.Scanner;

public class Main {

  
    public static void main(String[] args) {
    	
       Locale.setDefault(Locale.US);
       Scanner entrada = new Scanner(System.in);
       
       
       int numerofuncionario = entrada.nextInt();
       int qtdhoratrabalhadas = entrada.nextInt();
       double vlrhora = entrada.nextDouble();
       double salario = qtdhoratrabalhadas * vlrhora;
       
       
       System.out.println("NUMBER = " + numerofuncionario);
       System.out.printf("SALARY = U$ %.2f%n", salario);
       
       
       
       
       entrada.close();
       
    }
    
    
}