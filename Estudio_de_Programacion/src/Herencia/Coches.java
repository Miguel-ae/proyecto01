package Herencia;
//https://www.youtube.com/watch?v=LZPafq9Ve_Q
public class Coches {

	private String matricula;
	private String color;
	private String modelo;
	
	
	//Metodo constructor con parametros
	public Coches(String matricula, String color, String modelo) {
		this.matricula = matricula;
		this.color = color;
		this.modelo = modelo;
	}
	
	//Metodo constructor sin parametros
	public Coches() {
		matricula = "8994QR";
		color = "Rojo";
		modelo = "Deportivo";
	}

	//Getters y Setters
	public String getMatricula() {					//Los GETTERS devuelven los datos
		return matricula;
	}

	public void setMatricula(String matricula) {	//Los SETTERS sirven para establecer/declarar los valores
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	//Metodo para mostrar datos por pantalla
	public void imprimir() {
		System.out.println("Datos del coche:" +
				"\n-------------------"+
				"\n Matricula: " +matricula+
				"\n Color: " +color+
				"\n Modelo: " +modelo);
	}
	
	
	
	
}
