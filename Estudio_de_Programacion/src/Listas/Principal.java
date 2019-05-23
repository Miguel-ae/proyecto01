package Listas;

import java.util.*; // IMPORTAR java.util.*

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
		
		//Manipular la lista e Imprimirla por pantalla
		
		//LISTAS
		
		//Instanciamos la clase Listas creando un objeto
		Listas lista01 = new Listas();
		
		//Crear una lista generica
		List lista1 = new ArrayList();
		
		//Añadimos datos de cualquier tipo a la lista (de cualquier tipo por que los ArrayList tienen esa particularidad)
		lista1.add("Hola");
		lista1.add(2);
		lista1.add(0.00222);
		lista1.add("Gato");
		lista1.add(false);
		
		//Imprimimos la lista (con el objeto creado anteriormente)
		lista01.ImprimirLG(lista1);
		
		//Eliminar el ultimo elemento de la lista
		lista1.remove(lista1.size()-1);
		
		lista01.ImprimirLG(lista1);
		
		//Eliminar el primer elemento de la lista
		lista1.remove(0);
		
		lista01.ImprimirLG(lista1);
		
		//Eliminar elemento de cualquier posicion de la lista (tienes que escribir el contenido exacto)
		lista1.remove((Object)0.00222);
		
		lista01.ImprimirLG(lista1);
		
		
		//Seguimos experimentando
		lista1.add("Miguel Angel");
		lista1.add(3.1416);
		lista1.add("Java");
		
		lista01.ImprimirLG(lista1);
		
		
		//Mostrar el valor de un elemento segun su indice
		System.out.println(lista1.get(2));          //En la posicion 2 esta Miguel Angel
		
		System.out.println("____________");
		
		
		//Mostrar o saber el indice a partir de el valor de un elemento
		System.out.println(lista1.indexOf("Java"));  //Java esta en la posicion 4
		
		System.out.println("____________");

		
		
		//Saber si contiene o no la lista un elemento
		if(lista1.contains("Java"))
			System.out.println("Contiene el elemento: Java");
		else
			System.out.println("NO contiene el elemento: Java");
		
		System.out.println("____________");
		
		
		//Eliminamos el elemento Java para que salga de resultado false (else)
		lista1.remove("Java");
		
		if(lista1.contains("Java"))
			System.out.println("Contiene el elemento: Java");
		else
			System.out.println("NO contiene el elemento: Java");
				
		System.out.println("____________");
		
		
		//Saber si una lista esta vacia 
		if(lista1.isEmpty())
			System.out.println("No hay ningun elemento almacenado en la lista");
		else
			System.out.println("Hay elementos en la lista");
		
		System.out.println("____________");
		
		
		//Limpiar o borrar todo el contenido de la lista
		lista1.clear();
		
		if(lista1.isEmpty())
			System.out.println("No hay ningun elemento almacenado en la lista");
		else
			System.out.println("Hay elementos en la lista");
				
		System.out.println("____________");

		
		//Ahora que la lista esta vacia vamos a rellenarla con más datos
		lista1.add("Miguel");
		lista1.add("Juan");
		lista1.add("Maria Jose");
		lista1.add("Paula");
		lista1.add("Federico Garcia Lorca");
		
		lista01.ImprimirLG(lista1);
		
		System.out.println("____________");
		
		
		//Para cambiar el valor de una lista
		lista1.set(3, "Cristina");  //Pide la posicion del elemento a cambiar y el valor nuevo que quieres ponerle
		
		lista01.ImprimirLG(lista1);
		
	}

}
