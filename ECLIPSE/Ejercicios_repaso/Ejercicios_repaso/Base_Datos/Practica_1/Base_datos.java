package Practica_1;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class Base_datos {

	public static void main(String[] args) {
		
	List<String> mismoCurso = new LinkedList<>();

		try {
			// crear conexion
			Connection miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3333/sakila", "root", "admin");
			
			// crear statement
			Statement miStatement = miconexion.createStatement();
			
			//  ejecutar consulta = executeQuery
			// actualiza la info = executeUpdate
			ResultSet miRS = miStatement.executeQuery("Select * from Country");
			
			while (miRS.next()) {
				//System.out.println(miRS.getString(1 + "" ));
				System.out.println("Country_id: " + miRS.getString("country_id"));
				System.out.println("Country: " + miRS.getString("country"));
				System.out.println("Ultima actualizacion: " + miRS.getString("last_update"));
				mismoCurso.add(miRS.getString("country_id"));
				mismoCurso.add(miRS.getString("country"));
				mismoCurso.add(miRS.getString("last_update"));
			}
			
			for(String a: mismoCurso) {
				System.out.println(a);
			}
			//mismoCurso.forEach(x -> System.out.println());
			miconexion.close();
			// tratar el resultado (ResultSet)
			
		} catch (SQLException e) {
			System.out.println("Error.");
			e.printStackTrace();
		}
		
		

	}

}
