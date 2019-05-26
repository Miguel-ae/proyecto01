package Herencia;

public class Directivo extends Empleado {
	
	//Creo el atributo
	public double nivel;

	//Creamos los constructores
	public Directivo(String pnombre, int psueldo, double nivel) {
		super(pnombre, psueldo);
		this.nivel = nivel;
	}
	
	/*antes habia creado aqui abajo los metodos Getters y Setters, pero lo he borrado porque he visto que no era 
	necesario ya que los atributos estaban en public*/
	
	
	//Creo el metodo para imprimir por pantalla los datos del directivo, añadiendo tambien su nivel
	public void imprimirDatos() {
		System.out.println("Nombre empleado: " + nombre);
		System.out.println("Sueldo base: " + sueldobase);
		System.out.println("Nivel: " + nivel);
	}
	
	//Este metodo multipliva el sueldo base * nivel y lo imprime
	public void obtenerSalario() {
		System.out.println("Salario: " + sueldobase*nivel);
	}
}
