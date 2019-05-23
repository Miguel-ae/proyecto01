package Nodos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Mostrar el primer nodo
		Nodo nodo01 = new Nodo();
		nodo01.setInformacion(1);
		nodo01.Visualizar();
		
		
		//Mostrar el segundo nodo
		Nodo nodo02 = new Nodo();
		nodo02.setInformacion(2);
		
		nodo01.colocarNodo(nodo02);
		
		nodo01.getNodo().Visualizar();
		
		
		//Mostrar el tercer nodo
		Nodo nodo03 = new Nodo();
		nodo03.setInformacion(3);
		
		nodo01.getNodo().colocarNodo(nodo03);
		
		nodo02.colocarNodo(nodo03);
		
		nodo02.getNodo().Visualizar();
		
	}

}
