package Listas;

import java.util.*; // IMPORTAR java.util.*

public class Listas {

// https://curiotecnology.blogspot.com/2012/09/manejo-de-listas-java.html
// TERMINAR CUANDO SE REPASE LO QUE ES static, final, Encapsulamiento, Constructor, Herencia, ...
	
	//METODO PARA LEER E IMPRIMIR LISTAS
	public void ImprimirLG(List l) {
		
		for(int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
		System.out.println("____________");
	}
	
}
