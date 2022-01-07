package testeJu1;

import java.util.Locale;
import java.util.Scanner;

public class Temperaturas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

double Kelvin,Reaumur,Rankine,Fahrenheit;

		System.out.println("Enter the actualy temperature in Celcius:");
		
		int C = sc.nextInt();
		
		Kelvin = C + 273.15 ;
		Reaumur = C * 0.8;
		Rankine = C * 1.8 + 32 + 459.67;
		Fahrenheit = C * 1.8 + 32;
		
		System.out.printf("The actualy temperature in Kelvin is:"+ Kelvin);

		System.out.println("The actualy temperature in Réaumur is" + Reaumur);
		 
		System.out.println("The actualy temperature in Rankine is" + Rankine);
		
		System.out.printf("The actualy temperature in Fahrenheit is %.2f ",  + Fahrenheit);
		
		sc.close();

	}

}
