
import java.util.Locale;
import java.util.Scanner;

public class PLANO1XXT {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		int minutos = leitor.nextInt();
		
		
		double conta = 50.00;
		if (minutos > 100) {
			conta = conta + (minutos - 100) * 2.0;
		}
		System.out.printf("Valor da conta = R$%.2f%n",conta);

		leitor.close();
	}

}
