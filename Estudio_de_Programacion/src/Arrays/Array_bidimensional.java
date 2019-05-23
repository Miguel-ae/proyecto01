package Arrays;

public class Array_bidimensional {
	
	//Metodo para escribir y leer Arrays bidimensionales de forma más ligera
	public void Array_Automatico() {
		
		int[][] numeros = {
				          {12, 20, 3, 54},
		                  {83, 23, 22, 1},
		          		  {97, 65, 55, 2},
		          		  {1, 2, 4, 3,},
		          		  {3, 34, 1, 0}
		};
	
		//bucle for dentro de un bucle for para leer un array bidimensional
		for (int i=0; i<5; i++) {
			System.out.println();
			for (int j=0; j<4; j++) {
				System.out.print(numeros[i][j] + " ");//Este caso es "print" sin "ln" (println)
			}
		}
		
	}
	
	
	//Metodo FOREACH
	public void Array_Foreach() {
			
		int[][] numeros01 = {
					      {12, 20, 3, 54},
			              {83, 23, 22, 1},
			              {97, 65, 55, 2},
			              {1, 2, 4, 3,},
			          	  {3, 34, 1, 0}
		};		
		
		for (int[]foreach:numeros01) {
			System.out.println(); //sysout + CTRL + ESPACIO = Crea System.out.println()
			for (int z:foreach) {
				System.out.print(z + " ");
			}
		}
		
	}

	
	
}
