package Strings;

public class Usos_Strings {
	
	public void cadena1() {
		
		String mi_nombre="Miguel";
		
		System.out.println(mi_nombre.length()); //length()  Te calcula el numero de caracteres (length=tamaño de la cadena)
		
		
		
		System.out.println(mi_nombre.charAt(0)); //charAt()   Me devuelve la letra en la posicion que yo he indicado
		
		
		
		String s = "Esto no es una canción"; 
		char buf[] = new char[2];    //Si se necesita extraer más de un carácter a la vez
		s.getChars(5, 7, buf, 0);
		
		
	
		
		
		int ultima_letra=mi_nombre.length();   					//Devuelve la ultima letra del nombre
		System.out.println(mi_nombre.charAt(ultima_letra-1));        
				
		
		
				
				
		//Imprime el texto segun la posicion que se indica/ substring()
		System.out.println(mi_nombre.substring(2, 6));
		
		
		
		
		
		//equals()    Compara Strings              ||||      equalsIgnoreCase()   Ignora las mayusculas en la comparacion             
		String nombre1, nombre2;
		nombre1 = "Miguel";
		nombre2 = "miguel";
		
		System.out.println(nombre1.equals(nombre2)); //compara strings totalmente
		System.out.println(nombre1.equalsIgnoreCase(nombre2)); //compara string con excepciones de mayusculas
		
		
		
		
		//Comparación con                   CompareTo()
		String cadena1 = "Leire";
		String cadena2 = "Laura";
		
		if (cadena1.compareTo(cadena2) == 0)
			System.out.println("cadena1 y cadena2 son iguales");
			else
		System.out.println("No son iguales");
		
		
		
		
		//Búsqueda en la cadena             indexOf()
		String Objeto_cadena = "LeopoldoSinApellidos";
		Objeto_cadena.indexOf("a");
		Objeto_cadena.indexOf("ape");
		
		
		
		
		//Conversión de minúsculas a mayusculas de una cadena 		toLowerCase()  y   toUpperCase()
		System.out.println(Objeto_cadena.toLowerCase());
		System.out.println(Objeto_cadena.toUpperCase());
		
		
		
		
		//Contains()      Devuelve datos si contiene lo que hay en su parametro
		
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
