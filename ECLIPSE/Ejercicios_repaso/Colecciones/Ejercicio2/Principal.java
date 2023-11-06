package Ejercicio2;

public class Principal {

    public static void main(String[] args) {
    	
    	
        RegistroEstudiantes registro = new RegistroEstudiantes();

        // Agregar estudiantes
        registro.agregarEstudiante(1, "Juan", 20);
        registro.agregarEstudiante(2, "María", 21);
        registro.agregarEstudiante(3, "Pedro", 19);

        // Mostrar estudiantes
        registro.mostrarEstudiantes();

        // Buscar estudiante por ID
        registro.buscarEstudiante(2);
        registro.buscarEstudiante(4); // Intentar buscar un estudiante que no existe
    }
}
/* En el método main de una clase principal, crea un objeto RegistroEstudiantes y realiza las siguientes acciones:
Agrega al menos 3 estudiantes usando el método agregarEstudiante.
Muestra la lista de estudiantes registrados usando el método mostrarEstudiantes.
Realiza una búsqueda de un estudiante por su número de identificación usando el método buscarEstudiante.
*/