import java.util.Scanner;

public class dds {

	public static void main(String[] args) {
		Scanner dds = new  Scanner(System.in);
		int x = dds.nextInt();
		String dia ;
		if(x==1) {
			dia = "domingo";
		}else if (x==2) {
			dia = "segunda";
		}else if (x==3) {
			dia = "ter�a";
		}else if (x==4) {
			dia = "quarta";
		}else if (x==5) {
			dia = "quinta";
		}else if (x==6) {
			dia = "sexta";
		}else if (x==7) {
			dia = "sabado";
		}else {
			dia ="valor invalido";
		}
		System.out.println("Dia  da semana :  " + dia);
		dds.close();
	}

}
