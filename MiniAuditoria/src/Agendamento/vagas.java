package Agendamento;

import java.util.Locale;
import java.util.Scanner;

public class vagas {

	public static void main(String[] args) {
		Scanner lk = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		INFO info = new INFO();
		System.out.println("Tema do treinamento:");
		info.tema = lk.nextLine();
		System.out.println("Nome do organizador do evento :");
		info.nome = lk.nextLine();
		System.out.println("Quantos participantes ?");
		info.participantes = lk.nextInt();
		System.out.println("Dia  do treinamento:");
		info.data = lk.nextInt();
		System.out.println("Quantidade de horas desejadas  :");
		info.horario = lk.nextInt();

		System.out.println(info.nome + " Agendou o miniauditorio para o dia  " + info.data + ",por" + info.horario
				+ " hora . Com o tema " + info.tema);
		if (info.participantes >= info.vagas) {
			System.out.println(" o mini auditorio não suporta essa quantidade participantes ");
		} else {
			System.out.println("Parabens auditorio marcado com sucesso");
		}
		lk.close();
	}
}
