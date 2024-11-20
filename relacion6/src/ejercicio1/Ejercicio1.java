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
		int x=0;
		boolean seguir=true;
		int tamano= cadena.length();
		int [] auxiliar = new int [tamano];
		
		//recoger cada caracter de la cadena
		
		for (int i = 0; i < cadena.length(); i++) {
			comprobar= cadena.charAt(i);
			
			
			duplicados=0;
			x=0;
			
			//comprobar si el caracter ya ha salido
			seguir=true;
			while(seguir && x< auxiliar.length) {
				if(comprobar==auxiliar[x]) {
					seguir =false;
					
				}
				x++;
			}
			
			//si no ha salido ya el caracter se compara con todos los demas 
			int j = i+1;
			while (seguir && j<cadena.length()) {
				if (comprobar==cadena.charAt(j)) {
					duplicados++;
					
				}
				j++;
				
			}
			auxiliar [i]=comprobar;
			
			if(duplicados>0)
				System.out.println("La letra  "+ comprobar + " se repeite " + duplicados + " veces");
			
			
		}
			
		
	}

}
