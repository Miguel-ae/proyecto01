package RW_Ficheros;

import java.io.*;

public class Principal {

	public static void main(String[] args) throws IOException {//Decir que el metodo main es String [] !!!!
		// TODO Auto-generated method stub
		
		//Creamos un atributo y lo rellenamos para despues usarlo en los parametros de algun metodo
		String [] nombres = {"Miguel", "Manuel", "Ricardo", "Victor"};
		int [] telefonos = {41854864, 86748668, 8949889 , 49489498};
		
		//Creamos el objeto para ejecutar metodos
		Fichero file01 = new Fichero();
		
		
		file01.escribirFichero(nombres, telefonos); //Escribe un fichero con los datos del parametro "nombres"
		
		file01.mostrarFicheros();
		
		
		System.out.println("____________________________" + "\n");
		
		
		file01.modificarFicheros(1, "Leopoldosinapellidos");
		
		file01.mostrarFicheros();

		
		
		//Creamos el objeto de la clase unoaldiez
		unoaldiez file02 = new unoaldiez();
		
		file02.Unoaldiez();
		
		
		
		//Creamos el objeto de la clase nombre_mas_telefono
		nombre_mas_telefono file03 = new nombre_mas_telefono();
		
		file03.escribirFichero(nombres, telefonos);
		file03.mostrarFicheros();
	}

}
