package Ejercicio3;

import java.sql.*;

public class Bases{
	
    public static void main(String[] args) {
		
        String curso = "2B";
        String url = "jdbc:mysql://localhost:3306/database"; // URL de la base de datos
        String usr = "username"; // Nombre de usuario
        String pwd = "password"; // Contraseña

        try (Connection con = DriverManager.getConnection(url, usr, pwd)) {
            String sql = "SELECT id, nombre FROM alumnos WHERE curso = ?"; // Consulta SQL con un parámetro
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setString(1, curso); // Establece el valor del parámetro

            ResultSet resultado = sentencia.executeQuery(); // Ejecuta la consulta y obtiene el resultado

            while (resultado.next()) {
                int id = resultado.getInt("id"); // Obtiene el valor de la columna "id"
                String nombre = resultado.getString("nombre"); // Obtiene el valor de la columna "nombre"

                System.out.println("ID: " + id + ", Nombre: " + nombre); // Imprime los valores obtenidos
            }
        }
        catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}

/* Completa el código siguiente para hacer una consulta y sacar toda la información de la tabla alumnos para un determinado curso. Por pantalla mostraremos el id y  e nombre de cada alumno. No es necesario inicializar las variables de la conexión. L aconsulta debe reaizarse evitando el problema de la inyeccion SQL.
String curso = "2B";
Connection con = DriverManager.getConnection(url, usr, pwd);
PreparedStatement sentencia = con.prepareStatement(sql);
System.out.println(id + nombre);
*/