package Herencia;

public class Empleado {

	public String nombre;
	public double sueldobase;
	
	public Empleado(String pnombre, 	int psueldo)
	{
		nombre = pnombre;
		sueldobase = psueldo;
	}
	
	public void imprimirDatos() {
		System.out.println("Nombre empleado: " + nombre);
		System.out.println("Sueldo base: " + sueldobase);
	}
	
	
	public static void main(String[] args) {
		
		// Un objeto empleado1 de tipo Emnpleado
		Empleado empleado1 = new Empleado("Pepe", 1200);
		empleado1.imprimirDatos();

		System.out.println("--------------------------");
		
		
		// Un objeto empleado1 de tipo Directivo
		Directivo empleado2 = new Directivo("Miguel", 1400, 22.00);
		empleado2.imprimirDatos();
		empleado2.obtenerSalario();
		
	}

	
}
