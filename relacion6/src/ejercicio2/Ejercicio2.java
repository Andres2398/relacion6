package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Encontrar el primer carácter no repetido: escriba un programa que devuelva el primer 
		//carácter no repetido de una cadena determinada.
		
		
		System.out.println("introduce una cadena");
		
		Scanner sc = new Scanner(System.in);
		String cadena= sc.nextLine();
		
		char comprobar=0;
		int contador=0;
		int i=0;
		boolean seguir=true;
		
		//coger cada caracter de la cadena
		while (i<cadena.length()&&seguir) {
			comprobar = cadena.charAt(i);
			contador=0;
			//comparar  cada caracter con toda la cadena
			for (int j = 0; j < cadena.length(); j++) {
				if(comprobar==cadena.charAt(j))
					contador++;
			}
			if(contador==1)
				seguir=false;
				
			i++;
			
		}
		
		if(contador==1) {
			System.out.println("el primer caracter que no se repite es " + comprobar);
		}else {
			System.out.println("No hay ningun caracter que no se repita");
		}
	}

}
