
import java.util.Locale;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
        
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("DIGITE QUANTOS MINUTOS VOCÊ UTILIZOU :");
		int minutos = sc.nextInt();
		double conta = 50.0;
		
		if(minutos > 100) {
			conta +=  (minutos-100)* 2.0;
		}
		
		
			System.out.printf("valor a CONTA = R$ %.2f%n ", conta);
			
		
		
		
		sc.close();

	}
}
