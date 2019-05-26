package Base_datos;
import java.sql.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			//CREAR CONEXION
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3307/mysql", "root", "");
			
			//CREAR OBJETO STATEMENT
			Statement miStatement = miConexion.createStatement();
			
			//EJECUTAR SQL
			ResultSet miResultset = miStatement.executeQuery("SELECT * FROM help_keyword");
			
			//RECORRER EL RESULTSET
			while(miResultset.next()) {
				System.out.println(miResultset.getString("help_keyword_id") + " " + miResultset.getString("name"));
			}
			
		}catch(Exception e) {
			System.out.println("No conecta");
			
			e.printStackTrace();
		}
		
	}

}
