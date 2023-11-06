package Practica_1;

import java.sql.*;
import java.util.*;

public class Ejemplo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la tabla: ");
		String campo = sc.nextLine();
		
		try {
			//CONSULTA TABLA
			String sql = "SELECT * FROM COUNTRY WHERE country_id = ? "/*+ campo + " ' "*/;
			
			// crear conexion
			Connection miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3333/sakila", "root", "admin");
			
			// crear statement
			//Statement miStatement = miconexion.createStatement();
			PreparedStatement sentencia = miconexion.prepareStatement(sql);
			sentencia.setString(1, campo);
			System.out.println(sentencia);
			
			//  ejecutar consulta = executeQuery
			// actualiza la info = executeUpdate
			ResultSet miResultset= sentencia.executeQuery();
			
			while (miResultset.next()) {	
				System.out.println(miResultset.getString("Nombre"));
			}
			
		} catch (SQLException e) {
			System.out.println("Error.");
			e.printStackTrace();
		}
		
		

	}

}
