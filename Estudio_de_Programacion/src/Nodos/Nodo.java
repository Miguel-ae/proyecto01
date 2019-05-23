package Nodos;

public class Nodo {

	private int informacion;
	private Nodo siguiente;
	
	public Nodo() {
		informacion = 0;
		siguiente = null;
	}
	
	public void colocarNodo(Nodo parametro) {
		siguiente = parametro;
	}

	
	public void setInformacion(int a) {
		informacion = a;
	}
	
	
	public void Visualizar() {
		System.out.println(informacion);
	}
	
	
	public Nodo getNodo() {
		return siguiente;
	}
	
	
}
