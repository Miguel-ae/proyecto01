package RW_Ficheros;
import java.io.*;     	 //Importamos el paquete java.io.*

public class Fichero {
	
	final static String FICHERO = "C:/Users/Migui/Desktop/Data.txt";
	
	
	//Metodo para crear y escribir ficheros (OUTPUT) (ESCRIBIR FICHEROS)
	public static void escribirFichero(String[] line, int[] line2) throws IOException{
		DataOutputStream out = null;
		try {
			out = new DataOutputStream(
					  new BufferedOutputStream(
						  new FileOutputStream(FICHERO)));
			
			for (String str:line) {
				str = String.format("%-20s", str); 
				out.writeUTF(str);
				
				for (int entero:line2) {
					out.writeInt(entero);
				} //MIRAR COMO INTRODUCIR NUMERO DE TELEFONO A LA DERECHA
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if (out != null) {
				out.close();
			}
		}
	}
	

	
	//Metodo para mostrar ficheros por pantalla (INPUT) (LEER FICHEROS)
	public static void mostrarFicheros() throws IOException{
		DataInputStream in = null;
		try {
			in = new DataInputStream(
					  new BufferedInputStream(
						  new FileInputStream(FICHERO)));			
			
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
	
	
	//Metodo para modificar ficheros de forma aleatoria, sustituyendo cadenas (RANDOM)
	public static void modificarFicheros(int pos, String newValue) throws IOException {
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(FICHERO, "rw");
			
			raf.seek(pos * (20 + 2));  //Por que siempre se van a escribir 2 bytes antes
			newValue = String.format("%-20s", newValue);
			raf.writeUTF(newValue);
			
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			if (raf != null) {
				raf.close();
			}
		}
	}
	
	
	
}
