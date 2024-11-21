package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	
	
	 static String invertirLetras( String cadena) {
		 	
		 //invertir letra de cada palabra
		  
		 String invertir = "";
		  char caracter;
		 
		
		 for (int i = cadena.length()-1; i >=0; i--) {
			
			 caracter=cadena.charAt(i);
			
			 invertir+=caracter;
			 
		}
		 
		
		return invertir;
	}
	 
	 		
	

	 	
	

	public static void main(String[] args) {
		// Invertir letras y palabras: Escriba un programa que invierta las letras de cada palabra y un 
		//programa que invierta las letras de cada palabra y las palabras mismas. 
		
		
		System.out.println("introduce una cadena introduce * en el final de la frase para acabar");
		
		Scanner sc = new Scanner(System.in);
		String cadena = sc.next();
		
		
		
		while (!cadena.equals("*")) {
			
			String invertirLetra= invertirLetras(cadena);
			System.out.println(invertirLetra);

			
			
				
			cadena=sc.next();
			
		}
		
	}}



	

