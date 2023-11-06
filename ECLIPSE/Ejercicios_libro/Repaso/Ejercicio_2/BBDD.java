package Ejercicio_2;

import java.sql.*;
import java.util.*;

public class BBDD {
    public static void main(String[] args) {
    	
        // Datos de conexión a la base de datos
        String url = "jdbc:mysql://localhost:3333/sakila";
        String username = "root";
        String password = "admin";

        // Lista para almacenar los clientes
        List<String> clientes = new ArrayList<>();

        // Establecer la conexión a la base de datos
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // Crear la consulta SQL
            String sql = "SELECT first_name, last_name FROM customer";

            // Crear el objeto Statement
            Statement statement = connection.createStatement();

            // Ejecutar la consulta
            ResultSet resultSet = statement.executeQuery(sql);

            // Recorrer los resultados y añadir los clientes a la lista
            while (resultSet.next()) {
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String cliente = firstName + " " + lastName;
                clientes.add(cliente);
            }

            // Cerrar los recursos
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Imprimir la lista de clientes
        for (String cliente : clientes) {
            System.out.println(cliente);
        }
    }
}


