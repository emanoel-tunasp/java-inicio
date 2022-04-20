package carro;

public class Carrob {

	public static void main(String[] args) {
		carro c1 = new carro();

		c1.nome = "uno";
		c1.marca = "fiat";
		c1.ano = 2015;
		c1.vel = 60;
		
		c1.acelerar(10);
		System.out.print(" A velocidade do carro  " +  c1.nome + " da marca " + c1.marca + " ano : " + c1.ano + " e:");
		System.out.println("Velocidade: " + c1.vel + "km/h");
		System.out.println("Lombada eletronica em frente .limite 50km/h");

		c1.freiar(30);

		System.out.println("Velocidade: " + c1.vel + "km/h");

		if (c1.vel <= 50) {
			System.out.println("Tudo certo siga em frente ");
		} else {
			System.out.println("Seu carro recebeu uma multa  ");

		}

	}
}