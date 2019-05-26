package Base_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//CREAR CONEXION
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/mysql", "root", "");
			
			//CREAR OBJETO STATEMENT
			Statement miStatement = miConexion.createStatement();
			
			String instruccionSql = "INSERT INTO PRODUCTOS (CODIGO, NOMBRE, PRECIO) VALUES ('9745', 'CAMISETA', '25,00')";
			
			//String instruccionSql = "AQUI INTRODUCES CONSULTAS SQL DE FORMA EXACTA A COMO LO HACEMOS EN BBDD";
			
			miStatement.executeUpdate(instruccionSql);
			
			System.out.println("Datos insertados");
			
		}catch (Exception e){
			System.out.println("No conecta");
			
			e.printStackTrace();
		}
	}

}
