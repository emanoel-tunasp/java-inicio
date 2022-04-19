package aplicação;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produtos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produtos produtos = new Produtos();
		System.out.println("Enter produtos data:");
		System.out.print("Name:");
		produtos.nome = sc.nextLine();
		System.out.println("Preço");
		produtos.preco = sc.nextDouble();
		System.out.print("Quantidade em estoque :");
		produtos.quantidade = sc.nextInt();

		System.out.println();
		System.out.println("Enter the number of products to be added in stook:");
		int quantidade =  sc.nextInt();
		produtos.addProduto(quantidade);
		
		System.out.println();
		System.out.println("Updated data : " + produtos );
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from  stook:");
		quantidade = sc.nextInt();
		produtos.removaProduto(quantidade);
		
		System.out.println();
		System.out.println("Updated data : " + produtos );
		

		sc.close();

	}

}
