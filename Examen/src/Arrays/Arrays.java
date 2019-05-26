package Arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] alumnos = {"Miguel", "Laura", "Luis", "Gustavo"};
		
		int [] notas = {10, 8, 3, 5};
		
		
		for (int i = 0; i < notas.length; i++) {
		
			if (notas[i] < 5) {
			  System.out.println(alumnos[i] + ": " + "Suspenso");
			} else if ((notas[i] >= 5) && (notas[i] < 7)) {
			  System.out.println(alumnos[i] + ": " + "Aprobado");
			} else if ((notas[i] >= 7) && (notas[i] < 9)) {
			  System.out.println(alumnos[i] + ": " +"Notable");
			} else {
				System.out.println(alumnos[i] + ": " +"Sobresaliente");
			}
			System.out.println("");
		
	}

}
	
	
}
