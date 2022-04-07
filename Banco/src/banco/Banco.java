package banco;

import modelos.Conta;

public class Banco {

	public static void main(String[] args) {
		Conta a = new Conta("conta 1");
		System.out.println(a.toString());

		a.depositar(200);
		System.out.println(a.toString());
		a.sacar(150);
		System.out.println(a.toString());
	}

}
