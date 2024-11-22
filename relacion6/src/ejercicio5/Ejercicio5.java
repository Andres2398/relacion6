package ejercicio5;


import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//  Contar vocales y consonantes: escribir un programa que cuente las vocales y consonantes en 
		//una cadena dada.
		
		System.out.println("Introduce una cadena");
		
		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		int vocales=0;   
		int consonantes=0;
		
		for (int i = 0; i < cadena.length(); i++) {
			
			if(cadena.charAt(i)==' ') {
			}
			else if(cadena.charAt(i)=='a' || cadena.charAt(i)=='e'|| cadena.charAt(i)=='i'|| cadena.charAt(i)=='o' || cadena.charAt(i)=='u' ) {
				vocales++;
			}else {
				consonantes++;
				
			}
			
			
		}
		System.out.println("Tu cadena tiene " + vocales + " vocales y " + consonantes + " consonantes") ;
		
		
		
		
		
	}

}
