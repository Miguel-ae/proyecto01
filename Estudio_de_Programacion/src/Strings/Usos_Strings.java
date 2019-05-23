package Strings;

public class Usos_Strings {
	
	public void cadena1() {
		
		String mi_nombre="Miguel";
		
		System.out.println(mi_nombre.length()); //Te calcula el numero de caracteres (length=tamaño de la cadena)
		
		System.out.println(mi_nombre.charAt(0)); //Me devuelve la letra en la posicion que yo he indicado
		
		int ultima_letra=mi_nombre.length(); //Devuelve la ultima letra del nombre
				System.out.println(mi_nombre.charAt(ultima_letra-1));
				
		
				
				
		//Imprime el texto segun la posicion que se indica/ substring()
		System.out.println(mi_nombre.substring(2, 6));
		
		
		
		
		//Compara strings/ equals()
		String nombre1, nombre2;
		nombre1 = "Miguel";
		nombre2 = "miguel";
		
		System.out.println(nombre1.equals(nombre2)); //compara strings totalmente
		System.out.println(nombre1.equalsIgnoreCase(nombre2)); //compara string con excepciones de mayusculas
		
		
		
		
		//Metodo Contains()
		
		String nombre_completo = "Miguel Angel Perez Morales";
		
		Boolean contiene = nombre_completo.contains("Miguel");
		
		System.out.println(contiene);
		
	}
	
	//Metodo para contar numero de caracteres repetidos en una cadena
	public int Contar_letras(String nombre_completo, char n) {
	
		int contador = 0;
		for (int i = 0; i < nombre_completo.length(); i++) {
		// Comprobar si el caracter n esta en la posicion i
		if (nombre_completo.charAt(i) == n)
		contador++;
		}
		return contador;
	}
}
