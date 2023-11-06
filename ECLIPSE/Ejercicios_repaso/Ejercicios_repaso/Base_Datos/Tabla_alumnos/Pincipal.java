package Tabla_alumnos;

import java.util.Date;
import java.util.List;

public class Pincipal {
	
	/*
	 * ALUMNOSDAO dao = new AlumnoDao();
	 * dao.insertar
	 * dao.leer
	 * dao.borrar
	 * dao.actualizar
	 */
	
    public static void main(String[] args) {
    	
        // Ejemplos de uso de las clases y métodos
        AlumnoDao dao = new AlumnoDao();

        // Obtener los alumnos del curso "2A"
        List<Alumno> segundoA = dao.alumnosXCurso("2A");
        for (Alumno a : segundoA) {
            System.out.println(a);
        }

     // Crear un nuevo alumno
        String fechaNacimiento = "2000-01-01"; // Ejemplo de fecha de nacimiento en formato "YYYY-MM-DD"
        Alumno a1 = new Alumno(1, "Juan", fechaNacimiento, 9.5, "2A");
        dao.create(a1);
        
        // Actualizar un alumno
        Alumno alumno = dao.read(1);
        if (alumno != null) {
            alumno.setNombre("Pedro");
            alumno.setCurso("3A");
            dao.update(alumno);
        }

        // Eliminar un alumno
        dao.delete(1);

    }
}
/*
 *     public static void main(String[] args) {
        // Ejemplos de uso de las clases y métodos
        AlumnoDao dao = new AlumnoDao();

        // Obtener los alumnos del curso "2A"
        List<Alumno> segundoA = dao.alumnosXCurso("2A");
        for (Alumno a : segundoA) {
            System.out.println(a);
        }

        // Crear un nuevo alumno
        Alumno a1 = new Alumno(1, "Juan", new Date(), 9.5, "2A");
        dao.create(a1);

        // Actualizar un alumno
        Alumno alumno = dao.read(1);
        if (alumno != null) {
            alumno.setNombre("Pedro");
            alumno.setCurso("3A");
            dao.update(alumno);
        }

        // Eliminar un alumno
        dao.delete(1);
    }
 */
