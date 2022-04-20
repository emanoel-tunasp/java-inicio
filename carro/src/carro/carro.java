package carro;

import java.util.Scanner;

public class carro {

	// atributos
	String nome;
	String marca;
	int ano;
	int vel;
	String alerta;
	
	Scanner c1 =new Scanner(System.in);
	// métodos
	void acelerar(int aceleracao) {
		vel += aceleracao;
	}

	void freiar(int reduzir) {
		vel = reduzir;
	}

	void buzinar() {
		System.out.println("bibiiiiiiiiiiiiiiiiiiii");
	}
}