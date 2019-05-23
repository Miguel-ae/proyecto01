package Arrays;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ARRAY UNIDIMENSIONAL
		
		Array_unidimensional Array01 = new Array_unidimensional();
		
		
		//Primer método
		Array01.Array_Manual();
		
		System.out.println();
		
		
		//Segundo método
		Array01.Array_Automatico();
		
		System.out.println();		
		
		
		//Tercer método
		Array01.Array_Foreach();
		
		System.out.println();
		
		//Cuarto método
		Array01.Array_Random();
		
		
		//ARRAY BIDIMENSIONAL
		
		Array_bidimensional Array02 = new Array_bidimensional();
		
		
		//Primer método
		Array02.Array_Automatico();
		
		System.out.println();

		//Segundo método
		Array02.Array_Foreach();
		
		
		
		
	}

}
