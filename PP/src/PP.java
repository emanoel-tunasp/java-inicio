
import java.util.Scanner;

public class PP {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("O programa so libera com a senha ! ");
		System.out.println("QUAL E A SENHA ?");
		String senha= sc.nextLine();
		
		while (!senha.equals("ttpp")){
			System.out.println(senha instanceof String);
			senha= sc.nextLine();
			
		}

		System.out.println("Seja bem vindo!");
	}

}
