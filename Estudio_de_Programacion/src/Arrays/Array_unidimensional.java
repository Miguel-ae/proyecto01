package Arrays;

public class Array_unidimensional {
	
	
	//Metodo básico y manual para escribir y leer arrays
	
	public void Array_Manual() {
		
		int [] numeros01 = new int[3];
	
		numeros01[0] = 3;
		numeros01[1] = 4;	
		numeros01[2] = 9;
		
		
		System.out.println(numeros01[0]);
		System.out.println(numeros01[1]);
		System.out.println(numeros01[2]);
	
	}
	
	
	
	//Metodo rapido y automatico para escribir y leer arrays
	
	public void Array_Automatico() {
		
		String [] nombres = {"Miguel", "Laura", "Luis", "Gustavo", "Nacho", "Paula", "Ana"};
		
		for (int i=0; i<nombres.length; i++) {
			System.out.println("El cliente numero " + (i+1) + " es: " + nombres[i]);
		}
	}
	
	
	
	//Metodo usando la mejor sentencia para arrays que es FOR EACH
	
	public void Array_Foreach() {
		
		int [] numeros02 = {343, 777, 111, -40, 34, 2, 8492, 23, 84, 6486, -20, -615, 4, 2, 2, 4};
		
		for(int lector_foreach:numeros02) {
			System.out.println("El número es " + lector_foreach);
		}
	}
	
	
	//Metodo para "rellenar" valores aleatorios de un array
	
	public void Array_Random() {
	
		int [] num_aleatorios = new int[50];
		
		for(int i=0; i<num_aleatorios.length; i++) {
			num_aleatorios[i]=(int)Math.round(Math.random()*100);
		}
		
		for(int aleatorio:num_aleatorios) {
			System.out.println(aleatorio);
		}
		
	}
	
	
	
	
}