package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		
		
		// Unir varias cadenas con un delimitador: Escriba un programa que una las cadenas dadas por
		//el delimitador dado
		
		System.out.println("Introduce una cadena");
		Scanner sc= new Scanner(System.in);
		String cadena = sc.nextLine();
		String unir ="";
		
		while(!(cadena.equals("*"))) {
			
			unir+=cadena+" * ";
			System.out.println("introduce una cadena, * para finalizar");
			cadena=sc.nextLine();
			
		}
		System.out.println(unir);
	
}
}
