package ejercicio10;

import java.util.Random;

public class ejercicio10 {

	static int[] numerosRandom(int tamano) {

		int[] v = new int[tamano];

		Random r = new Random();
		int numero;
		boolean cabe = true;
		int j = 0;
		int i = 0;
		while (i < v.length) {
			numero = r.nextInt(6);

			while (numero == 0) {
				numero = r.nextInt(6);
			}
			
			cabe = true;
			j = 0;
			while (j < v.length && cabe) {
				if (numero == v[j]) {
					cabe = false;

				}
				j++;
			}
			if (cabe) {
				v[i] = numero;
				i++;
			}

		}

		return v;

	}

	public static void main(String[] args) {
		// Generación de todas las permutaciones: escriba un programa que genere todas
		// las
		// permutaciones de una cadena determinada.

		char[] v = { '1', '2', '3', '4', '5' };

		int multiplicar = 1;
		for (int i = 1; i <= v.length; i++) {
			multiplicar *= i;

		}
		char[] combinaciones = new char[multiplicar];

		int[] hola = numerosRandom(v.length);
		int numero = 0;
		int multiplicar2=1;
		for (int i = hola.length-1; i <=0; i--) {
			numero+=hola[i]*multiplicar2;
		}
		
		int i =0;
		int j =0;
		boolean cabe=true;
		while(i<combinaciones.length) {
			cabe=true;
			while(j<combinaciones.length) {
				if(numero==combinaciones[j]) {
					cabe=false;
				}
				j++;
			}
			
			
		}

	}

}
