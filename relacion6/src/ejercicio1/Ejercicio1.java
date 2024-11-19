package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Conteo de caracteres duplicados: escriba un programa que cuente los caracteres duplicados 
		//de una cadena determinada.
		
		
		System.out.println("Introduce una cadena");
		
		Scanner sc = new Scanner(System.in);
		
		String cadena = sc.nextLine();
		
		char comprobar;
		int duplicados=0;
		for (int i = 0; i < cadena.length(); i++) {
			comprobar= cadena.charAt(i);
			duplicados=0;
			for (int j = 0; j <cadena.length(); j++) {
				if (comprobar==cadena.charAt(j)) {
					duplicados++;
					
					
					
				}
				
			}
			if(duplicados>1)
				System.out.println("El caracter " + comprobar +" aparece " + duplicados);
		}
		

	}

}
