package projetojava;
import java.util.Locale;

public class projetoJV {

	public static void main(String[] args) {
		
		
		
		String produto1 = "computer";
		String produto2 = "office desk";
		int age =30;
		int code =5290 ;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		System.out.println("Products:");
		System.out.printf("Computer,which price is %.2f \n",price1 ); 
		System.out.printf("Office desk,which prince is %.2f \n \n",price2);
		System.out.printf("Record: %d years old,code %d and gender:%s \n\n",age,code,gender);
		System.out.printf("Measue with eight decimal places %.8f \n:",measure );
		
		System.out.printf("US decimal point: %.3f \n ",measure );
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f\n  ",measure );
		
	}

}

