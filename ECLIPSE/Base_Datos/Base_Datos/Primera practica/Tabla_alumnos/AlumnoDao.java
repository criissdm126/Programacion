package Tabla_alumnos;

import java.sql.*;
import java.util.*;
import java.util.Date;

public class AlumnoDao {
	
	// Genera un método para pintar alumnos con este formato curso-nombre(nota media)
	/*
	 * MÉTODOS PARA:
	 *    INTERACTUAR
	 *    ALUMNO <-> BD
	 *    SELECT
	 *    INSERT DELETE
	 *    UPDATE 
	 *    CONEXIÓN
	 */
	
    private Connection conexion;
    private final String USUARIO = "sakila2";
    private final String PASSWORD = "sakila2";
    private final String MAQUINA = "localhost";
    private final String BD = "sakila2";

    public AlumnoDao() { // CONEXIÓN
        conexion = conectar();
    }

    public List<Alumno> alumnosXCurso(String curso) {
        List<Alumno> alumnos = new ArrayList<>();

        try {
            String sql = "SELECT * FROM Alumnos WHERE curso = ?";
            PreparedStatement prepared = conexion.prepareStatement(sql);
            prepared.setString(1, curso);
            ResultSet resultset = prepared.executeQuery();

            while (resultset.next()) {
                int id = resultset.getInt("num");
                String nombre = resultset.getString("nombre");
                String fNacimiento = resultset.getString("fNac");
                double notaMedia = resultset.getDouble("media");
                String cursoAlumno = resultset.getString("curso");

                Alumno alumno = new Alumno(id, nombre, fNacimiento, notaMedia, cursoAlumno);
                alumnos.add(alumno);
            }

            resultset.close();
            prepared.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return alumnos;
    }
    
    // CONECTION
    private Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://" + MAQUINA + "/" + BD;
            conexion = DriverManager.getConnection(url, USUARIO, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conexion;
    }

    // CREACIÓN
    public void create(Alumno alumno) {
        String sql = "INSERT INTO Alumnos (id, nombre, fNac, notaMedia, curso) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, alumno.getId());
            sentencia.setString(2, alumno.getNombre());
            sentencia.setString(3, alumno.getfNacimiento());
            sentencia.setDouble(4, alumno.getNotaMedia());
            sentencia.setString(5, alumno.getCurso());
            sentencia.executeUpdate();
            System.out.println("Alumno creado correctamente");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public Alumno read(int id) { // Implementación para obtener un alumno por su ID de la base de datos
        Alumno alumno = null;
        String sql = "SELECT * FROM Alumnos WHERE num = ?";
        try {
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, id);
            ResultSet rs = sentencia.executeQuery();
            if (rs.next()) {
                String nombre = rs.getString("nombre");
                String fNacimiento = rs.getString("fNac");
                double notaMedia = rs.getDouble("media");
                String curso = rs.getString("curso");
                alumno = new Alumno(id, nombre, fNacimiento, notaMedia, curso);           
    }
            rs.close();
            sentencia.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return alumno;
    }

    
    
    // UPDATE
    public void update(Alumno alumno) { // Implementación para actualizar un alumno en la base de datos
       
    	String sql = "UPDATE Alumnos SET nombre=?, fNac=?, media=?, curso=? WHERE num = ?";
        try {
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setString(1, alumno.getNombre());
            sentencia.setString(2, alumno.getfNacimiento());
            sentencia.setDouble(3, alumno.getNotaMedia());
            sentencia.setString(4, alumno.getCurso());
            sentencia.setInt(5, alumno.getId());
            sentencia.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

 
    // DELETE
    public void delete(int id) { // Implementación para eliminar un alumno de la base de datos
    	 String sql = "DELETE FROM Alumnos WHERE num = ?";
         try {
             PreparedStatement sentencia = conexion.prepareStatement(sql);
             sentencia.setInt(1, id);
             sentencia.executeUpdate();
         } catch (SQLException e) {
             e.printStackTrace();
         }
     }
 }
