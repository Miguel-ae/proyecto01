package Herencia;

public class Km0 extends Coches{

	private int kilometros;
	
	//Metodos constructores heredados
	public Km0(String matricula, String color, String modelo, int kilometros) {
		super(matricula, color, modelo);
		this.kilometros = kilometros;
	}
	
	public Km0() {
		kilometros = 0;
	}
	
	
	//Getters y Setters
	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	
	
	//Metodo imprimir
	public void imprimir() {
		System.out.println("Datos del coche con Km0:" +
				"\n-------------------"+
				"\n Matricula: " +getMatricula()+
				"\n Color: " +getColor()+
				"\n Modelo: " +getModelo()+
				"\n Kilometros: " +kilometros);
	}
	
	
	
	
}
