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

	static boolean comprobarNumero(int numero, int[] combinaciones) {

		boolean cabe = true;
		for (int i = 0; i < combinaciones.length; i++) {
			if (numero == combinaciones[i])
				cabe = false;
		}

		return cabe;
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
		int[] combinaciones = new int[multiplicar];

		int[] hola = numerosRandom(v.length);
		int numero = 0;
		int multiplicar2 = 1;
		for (int i = hola.length - 1; i >= 0; i--) {
			numero += hola[i] * multiplicar2;
			multiplicar2 *= 10;
			
		}

		int i = 0;

		boolean cabe;
		while (i < combinaciones.length) {

			hola = numerosRandom(v.length);
			multiplicar2 = 1;
			numero=0;
			for (int j = hola.length - 1; j >= 0; j--) {
				numero += hola[j] * multiplicar2;
				multiplicar2 *= 10;
			}

			cabe = comprobarNumero(numero, combinaciones);
			if (cabe == true) {
				combinaciones[i] = numero;
				i++;
				
			}

		}
		for (int j = 0; j < combinaciones.length; j++) {
			System.out.println(combinaciones[j] + " "+ j);
		}

	}

}
