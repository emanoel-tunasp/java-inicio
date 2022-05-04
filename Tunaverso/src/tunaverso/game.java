package tunaverso;

import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		Scanner tn = new Scanner(System.in);
		personagem tunadragon = new personagem();
		System.out.println("==SEJA BEM VINDO AO TUNAVERSO==");
		System.out.println("QUAL O TIPO DO PERSONAGEM /MONSTRO/MAGO/GUERREIRO?");
		tunadragon.tipo = tn. nextLine();
		System.out.println("QUANTO DE FORÇA TEM SEU PERSONAGEM?");
		tunadragon.forca = tn.nextInt();
		System.out.println("QUANTO DE VELOCIDADE TEM SEU PERSONAGEM?");
		tunadragon.velocidade = tn .nextDouble();
		tunadragon.atacar();
		tn.close();
	}

}
