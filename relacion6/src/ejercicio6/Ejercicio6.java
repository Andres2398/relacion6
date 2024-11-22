package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Contar las ocurrencias de cierto carácter: Escriba un programa que cuente las ocurrencias de 
		//cierto carácter en una cadena dada.
		
		String cadena ="mi perro se llama manolo y mi gato se cayo de un tejado";
		System.out.println("Introduce un caracter para comprobar si esta en la cadena");
		
		Scanner sc = new Scanner(System.in);
		
		char caracter;
		
		String recoger = sc.next();
		caracter=recoger.charAt(0);
		int repetidos = 0;
		
		
		char comprobar;
		for (int i = 0; i < cadena.length(); i++) {
			comprobar=cadena.charAt(i);
			
			if (caracter == comprobar){
				repetidos++;
				
				
				
			}
			
		}
		
		System.out.println("la " + recoger + " se repite " + repetidos);
		
		
	}

}
