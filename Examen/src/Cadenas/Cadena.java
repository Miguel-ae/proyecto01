package Cadenas;

public class Cadena {
	
	private String cadena;
	private int posicion;
	private int longitud;
	
	public void devolverSubcadena(String cadena, int posicion, int longitud) {
		
		System.out.println("Cadena: " + cadena);
		
		System.out.println("Subcadena: " + cadena.substring(posicion, posicion+longitud));

	}
	

}
