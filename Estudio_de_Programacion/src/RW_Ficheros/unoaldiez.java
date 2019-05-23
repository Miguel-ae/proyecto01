package RW_Ficheros;

import java.io.*;

public class unoaldiez {

	final static String FICHERO2 = "C:/Users/Migui/Desktop/1to10.txt";
	
	//Metodo para escribir del 1 al 10
	public static void Unoaldiez() throws IOException {
		DataOutputStream out = null;
		try {
			out = new DataOutputStream(
					  new BufferedOutputStream(
						  new FileOutputStream(FICHERO2)));
			
			for (int i=1; i <=10; i++) {
				out.writeUTF("Numero = " + i + "\n");
			}	
			
		}catch (Exception e){
			
		}finally {
			if (out != null) {
				out.close();
			}
		}
		
	}
	
}
