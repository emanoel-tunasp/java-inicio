package apllication;

import java.util.Locale;
import java.util.Scanner;

import Entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Triangle x ,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();		
		x.c = sc.nextDouble();	
		System.out.println("Enter the measures of triangle y : ");
		y.a= sc.nextDouble();
		y.b= sc.nextDouble();
		y.c= sc.nextDouble();
		
		double P = (x.a + x.b +x.c) / 2.0;
		double areaX = Math.sqrt(P *(P - x.a)*(P - x.b) *(P - x.c));
		
		 P = (y.a + y.b +y.c) / 2.0;
		double areaY = Math.sqrt(P *(P - y.a)*(P - y.b) *(P - y.c));
		
		System.out.printf("Triangle X area: %.4f%n",areaX);
		System.out.printf("Triangle X area: %.4f%n",areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area :X");
		}
		else {
			System.out.println("Larger area:Y");
		}
		
		
				sc.close();
	}

}
