package ejercicio8;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Eliminación de espacios en blanco de una cadena: escriba un programa que elimine todos
		//los espacios en blanco de la cadena dada

		System.out.println("Introduce una cadena");
		
		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		String sinEspacios="";
		
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i)!=' ') {
				sinEspacios+=cadena.charAt(i);
				
			
				
			}
			
		}
		System.out.println(sinEspacios);
	}

}
