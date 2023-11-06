package Simulacro;

import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

public class Ejercicio_1 {

	


	    public static void main(String[] args) {
	        int codigoCliente = 123; // Código del cliente que deseas leer
	        Cliente cliente = leerCliente(codigoCliente);
	        
	        // Mostrar los campos del objeto cliente
	        System.out.println("Código: " + cliente.getCodigo());
	        System.out.println("Nombre: " + cliente.getNombre());
	        System.out.println("Apellido: " + cliente.getApellido());
	        // ... Mostrar los demás campos del cliente
	    }

	    public static Cliente leerCliente(int codigoCliente) {
	        Connection con = conexion(); // Establecer la conexión a la base de datos

	        Cliente cliente = null;
	        String sql = "SELECT * FROM clientes WHERE codigo = ?";
	        
	        try (PreparedStatement stmt = con.prepareStatement(sql)) {
	            stmt.setInt(1, codigoCliente);
	            ResultSet rs = stmt.executeQuery();
	            
	            if (rs.next()) {
	                cliente = new Cliente();
	                cliente.setCodigo(rs.getInt("codigo"));
	                cliente.setNombre(rs.getString("nombre"));
	                cliente.setApellido(rs.getString("apellido"));
	                // ... Establecer los demás campos del cliente
	            }
	            
	            rs.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        return cliente;
	    }

	    public static Connection conexion() {
	        // Aquí se establecería la conexión a la base de datos
	        // Implementa la lógica para crear y retornar la conexión
	        
	        return null; // Retorno temporal para que el código compile sin errores
	    }
	}

/* Crear un método leerCliente, que dado un código, se conecte con una BD y devuelva un objeto de tipo cliente.
 * Desde el main se mostrará todos los campos del objeto.
 * La conexión a la BD no tienes que desarrollarla
 * Puedes utilizar la sentencia:
 *             Connection con = conexion();
 */




