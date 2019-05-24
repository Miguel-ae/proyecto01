package Herencia;

public class SegundaMano extends Coches {

	private String nombreap;
	private int kilometros;
	
	
	//Metodo constructor heredado de la superclase Coche
	public SegundaMano(String matricula, String color, String modelo, String nombreap, int kilometros) {
		super(matricula, color, modelo);
		this.nombreap = nombreap;
		this.kilometros = kilometros;
	}
	
	public SegundaMano() {
		nombreap = "Miguel Garcia Ordoñez";
		kilometros = 80000;
	}

	
	
	//Getters y Setters
	public String getNombreap() {
		return nombreap;
	}

	public void setNombreap(String nombreap) {
		this.nombreap = nombreap;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	
	
	//Metodo imprimir
	public void imprimir() {
		System.out.println("Datos del coche de Segunda Mano:" +
				"\n-------------------"+
				"\n Matricula: " +getMatricula()+
				"\n Color: " +getColor()+
				"\n Modelo: " +getModelo()+
				"\n Kilometros: " +kilometros+
				"\n Nombre del Antiguo Propietario: " +nombreap);
	}
	
	
	
	
	
}
