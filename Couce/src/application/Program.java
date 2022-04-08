package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		Product product = new Product( );
		System.out.println("Enter product data :");
		System.out.println("Name:");
		product.name = sc.nextLine();
		System.out.print ("Prince:");
		product.price = sc.nextDouble();
		System.out.print ("Quantity in stook :");
		product.quantity = sc.nextInt();
		System.out.print (product.name +", " + product.price + ","+ product.quantity);

		sc.close();
	}

}
