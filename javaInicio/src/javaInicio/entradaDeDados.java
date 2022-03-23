package javaInicio;

import java.util.Scanner;

public class entradaDeDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hora;

		System.out.println("Qunatas horas ? ");
		hora = sc.nextInt();

		if ( hora < 12) {
			System.out.println("Bom dia ");
		}
		else {
		System.out.println("boa noite ");
		}
		sc.close();
	}

}
