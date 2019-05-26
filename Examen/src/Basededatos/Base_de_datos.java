package Basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Base_de_datos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//CREAR CONEXION
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "");
			
			//CREAR OBJETO STATEMENT
			Statement miStatement = miConexion.createStatement();
			
			//EJECUTAR SQL
			ResultSet miResultset = miStatement.executeQuery("SELECT * FROM city");
			
			//RECORRER EL RESULTSET
			while(miResultset.next()) {
				System.out.println(miResultset.getString("country") + " " + miResultset.getString("country_id"));
			}
			
		}catch(Exception e) {
			System.out.println("No conecta");
			
			e.printStackTrace();
		}
		
	}

}
