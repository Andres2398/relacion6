package ejercicio3;

import java.util.Scanner;

public class Ejercicio3segundaParte {
	
	
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

		System.out.println("introduce una cadena introduce");
		
		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		String palabra="";
		String invertir;
		
		
		for (int i = 0; i < cadena.length(); i++) {
			
			if(cadena.charAt(i)!=(' ')) {
				palabra+=cadena.charAt(i);
				
				
				
			}else {
				palabra=invertirLetras(palabra);
				System.out.println(palabra);
				palabra="";
				
			}
			
			
		}
		
		palabra=invertirLetras(palabra);
		System.out.println(palabra);
		
	}

}
