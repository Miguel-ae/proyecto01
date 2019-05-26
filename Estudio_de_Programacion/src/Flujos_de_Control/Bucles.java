package Flujos_de_Control;

public class Bucles {

	public void numeroPar(int numero) {
	    System.out.println("Numero par menor que: " + numero);
	    int n;
	    do {
	        n = (int) (Math.random() * numero);
	        System.out.println(n);
	    } while (n % 2 != 0);
	    System.out.println("Y el numero par elegido es: " + n);
	}
	
	public void verDiasSemana() {
	    String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
	        
	    System.out.println("Los dias de la semana son:");
	    for (String d: dias) {
	        System.out.println(d);
	    }
	}
}
