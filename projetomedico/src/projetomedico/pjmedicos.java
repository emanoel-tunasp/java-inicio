package projetomedico;

import java.util.Locale;
import java.util.Scanner;

public class pjmedicos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner pj = new Scanner(System.in);
		mrdicos pj1= new mrdicos();
		System.out.println("===Seja bem vindo ao contador PJ===");
		System.out.println("QUAL O NOME DO MEDICO");
		pj1.nome = pj.nextLine();
		System.out.println("QUANTAS HORAS DE SERVIÇOS FORAM PRESTADAS");
		pj1.quantidade= pj.nextInt();
		
		
		
		
		
		
		
		
		
		
		
		
		
		pj.close();
	}

}
