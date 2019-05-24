package Herencia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Clase Coches
		Coches vehiculo01 = new Coches();
		vehiculo01.imprimir();
		vehiculo01.setColor("Verde");
		
		System.out.println("\n");
		vehiculo01.imprimir();
		
		
		//Clase Km0
		Km0 vehiculo02 = new Km0("9788QT", "Azul", "Clasico", 0);
		System.out.println("\n");
		vehiculo02.imprimir();
		
		
		//Clase Nuevo
		SegundaMano vehiculo03 = new SegundaMano();
		System.out.println();
		vehiculo03.imprimir();
		
	}

}
