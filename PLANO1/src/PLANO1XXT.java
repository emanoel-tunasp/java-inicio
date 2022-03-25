
import java.util.Scanner;

public class PLANO1XXT {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.println("=====IMPAR OU PAR=====");
		System.out.println("Digite um numero");
		int numero = leitor.nextInt();

		if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

		leitor.close();
	}

}
