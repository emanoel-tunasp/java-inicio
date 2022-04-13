
import java.util.Locale;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite largura:");

		double largura = sc.nextDouble();
		System.out.println("Digite comprimento:");
		double comprimento = sc.nextDouble();
		System.out.println("Digite metroQuadrado:");
		double metroQuadrado = sc.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("AREA = %.2f%n", + area);
		System.out.printf("PRECO= %.2f%n", + preco);

		sc.close();
	}

}
