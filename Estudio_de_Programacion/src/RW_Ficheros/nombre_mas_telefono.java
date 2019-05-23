package RW_Ficheros;

import java.io.*;

public class nombre_mas_telefono {

	final static String FICHERO3 = "C:/Users/Migui/Desktop/nombres_y_telefonos.txt";
	
	
	//PARA ESCRIBIRLOS
	public static void escribirFichero(String[]nombres, int []telefonos) throws IOException{
		DataOutputStream out = null;
		try {
			out = new DataOutputStream(
					  new BufferedOutputStream(
						  new FileOutputStream(FICHERO3)));
			for (int i=0; i < nombres.length; i++) { //nombre.length te calcula el numero nombres que hay
				out.writeUTF("Nombres > " + nombres[i]+ "   Telefonos > " + telefonos[i] + "\n");
			}
			System.out.println("Hay un total de: " + nombres.length + " de personas" + "\n");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if (out != null) {
				out.close();
			}
		}
		
	}
	
	
	
	//PARA LEERLOS
	public static void mostrarFicheros() throws IOException{
		DataInputStream in = null;
		try {
			in = new DataInputStream(
					  new BufferedInputStream(
						  new FileInputStream(FICHERO3)));			
			
			while (in.available()>0) {
				System.out.println(in.readUTF());
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			if (in != null) {
				in.close();
			}
		}
	}

}
