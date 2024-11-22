package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Verificar si una cadena contiene solo dígitos: escriba un programa que verifique si la cadena 
		//dada contiene solo dígitos. 

		System.out.println("introduce una cadena");
		char [] numeros= {'1','2','3','4','5','6','7','8','9','0'};
		
		
		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		char comprobar;
		int contador=0;
		
		for (int i = 0; i < cadena.length(); i++) {
			comprobar=cadena.charAt(i);
			for (int j = 0; j <numeros.length; j++) {
				if(comprobar==numeros[j])
					contador++;	
			}
			
				
			}
			
			
		
		
		if(contador==cadena.length()) {
			System.out.println("Tu cadena solo tiene digitos");
			
			
		}
		else {
			System.out.println("Tu cadena tiene todo tipo de caracteres");
		}
		
		
		
	}

}
