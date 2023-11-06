package Libro;

import java.util.Scanner;

public class Biblioteca {
	
	
    private static Libro[] libros; // Array de libros
    private static int numLibros; // Número de libros en la biblioteca

    public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        libros = new Libro[100]; // Crear un array de libros con capacidad para 100 libros
        numLibros = 0; // Inicializar el contador de libros a 0

        int opcion;
        
        do { // Mostrar el menú
			
			System.out.println("----- MENU -----");
            System.out.println("1. Listado de libros en la biblioteca");
            System.out.println("2. Nuevo libro");
            System.out.println("3. Modificar un libro");
            System.out.println("4. Prestar un libro");
            System.out.println("5. Devolver un libro");
            System.out.println("6. Comparar 2 libros");
            System.out.println("7. Borrar libro");
            System.out.println("0. Salir");
            
            System.out.print("Seleccione una opcion: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    listarLibros();
                    break;
                case 2:
                    nuevoLibro();
                    break;
                case 3:
                    modificarLibro();
                    break;
                case 4:
                    prestarLibro();
                    break;
                case 5:
                    devolverLibro();
                    break;
                case 6:
                    compararLibros();
                    break;
                case 7:
                    borrarLibro();
                    break;
                case 0:
                    System.out.println("Saliste de la biblioteca.");
                    break;
                default:
                    System.out.println("Opcion incorrecta. Intentalo de nuevo.");
                    break;
            }

            System.out.println();
        } while (opcion != 0);
    }

    // Método para listar los libros en la biblioteca
    private static void listarLibros() {
        System.out.println("----- LISTADO DE LIBROS -----");
        
        if (numLibros == 0) {
            System.out.println("No hay libros en la biblioteca.");
        }
        else {
			
			for (int i = 0; i < numLibros; i++) {
				System.out.println(libros[i].toString());
            }
        }
    }

    // Método para agregar un nuevo libro a la biblioteca
    private static void nuevoLibro() {
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("----- NUEVO LIBRO -----");
        
        System.out.print("Ingrese el codigo del libro: ");
        String codigo = scanner.nextLine();
        
        System.out.print("Ingrese el titulo del libro: ");
        String titulo = scanner.nextLine();
		
		System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();

        Libro libro = new Libro(codigo, titulo, autor, true, null);
        libros[numLibros] = libro;
        numLibros++;

        System.out.println("Libro agregado correctamente.");
    }
    
    // Método para modificar un libro existente en la biblioteca
    private static void modificarLibro() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("----- MODIFICAR LIBRO -----");
		
		System.out.print("Ingrese el codigo del libro a modificar: ");
        String codigo = scanner.nextLine();

        int indice = buscarLibro(codigo); // Buscar el índice del libro en el array

        if (indice == -1) {
            System.out.println("El libro con codigo " + codigo + " no existe en la biblioteca.");
        }
        
        else {
            Libro libro = libros[indice];
            System.out.println("Datos actuales del libro:");
            System.out.println(libro.toString());
            System.out.println("Ingrese los nuevos datos:");

            System.out.print("Nuevo titulo del libro: ");
            String nuevoTitulo = scanner.nextLine();
            libro.setTitulo(nuevoTitulo);

            System.out.print("Nuevo autor del libro: ");
            String nuevoAutor = scanner.nextLine();
            libro.setAutor(nuevoAutor);

            System.out.println("Libro modificado correctamente.");
        }
    }

    // Método para buscar un libro por su código y devolver su índice en el array
    private static int buscarLibro(String codigo) {
		
		for (int i = 0; i < numLibros; i++) {
			
			if (libros[i].getCodigo().equals(codigo)) {
                return i; // Se encontró el libro, devolver su índice
            }
        }
        return -1; // No se encontró el libro
    }
    
    
 // Método para prestar un libro de la biblioteca
    private static void prestarLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- PRESTAR LIBRO -----");
        System.out.print("Ingrese el codigo del libro a prestar: ");
        String codigo = scanner.nextLine();

        Libro libroPrestamo = null;
        Persona personaPrestamo = null;
        for (Libro libro : libros) {
            if (libro != null && libro.getCodigo().equals(codigo)) {
                libroPrestamo = libro;
                break;
            }
        }
        
        if (libroPrestamo != null) {
            if (!libroPrestamo.isDisponible()) {
                
				System.out.print("Ingrese el nombre del usuario que prestara el libro: ");
                String usuario = scanner.nextLine();
                
                System.out.print("Ingrese el codigo del usuario: ");
                String codigoUsuario = scanner.nextLine();
                
                personaPrestamo = new Persona(usuario, codigoUsuario); // Crear un objeto Persona con el nombre y el código del usuario
                libroPrestamo.setDisponible(false);
                libroPrestamo.setPrestamo(personaPrestamo); // Pasar el objeto Persona al método setPrestamo()
                
                System.out.println("El libro ha sido prestado correctamente a " + usuario + ".");
            }
            else {
                System.out.println("El libro con codigo " + codigo + " ya esta prestado.");
            }
        }
        else {
            System.out.println("El libro con codigo " + codigo + " no existe en la biblioteca.");
        }
    }



 // Método para devolver un libro prestado de la biblioteca
    private static void devolverLibro() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("----- DEVOLVER LIBRO -----");
		
		System.out.print("Ingrese el codigo del libro a devolver: ");
        String codigo = scanner.nextLine();

        Libro libroPrestamo = null;


        for (Libro libro : libros) {
			
			if (libro != null && libro.getCodigo().equals(codigo)) {
				
				libroPrestamo = libro;
                break;
            }
        }

        if (libroPrestamo != null) {
			
			if (libroPrestamo.devolucion()) {
                System.out.println("Devolución realizada con exito");
            }
			
			else {
                System.out.println("No se ha podido realizar la devolucion");
            }
        }
        else {
            System.out.println("Libro no encontrado");
        }
    }
    
 // Método para comparar dos libros por su código
    private static void compararLibros() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("----- COMPARAR LIBROS -----");
        
        System.out.print("Ingrese el codigo del primer libro: ");
        String codigo1 = scanner.nextLine();
		
		System.out.print("Ingrese el codigodel segundo libro: ");
        String codigo2 = scanner.nextLine();

        int indice1 = buscarLibro(codigo1); // Buscar el índice del primer libro en el array
        int indice2 = buscarLibro(codigo2); // Buscar el índice del segundo libro en el array

        if (indice1 == -1) {
            System.out.println("El primer libro con codigo " + codigo1 + " no existe en la biblioteca.");
        }
		
		else if (indice2 == -1) {
            System.out.println("El segundo libro con codigo " + codigo2 + " no existe en la biblioteca.");
        }
        
        else {
			
			Libro libro1 = libros[indice1];
            Libro libro2 = libros[indice2];

            if (libro1.equals(libro2)) {
				
				System.out.println("Los libros con codigos " + codigo1 + " y " + codigo2 + " son iguales.");
            }
            else {
                System.out.println("Los libros con codigos " + codigo1 + " y " + codigo2 + " son diferentes.");
            }
        }
    }
 // Método para borrar un libro de la biblioteca
    private static void borrarLibro() {
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("----- BORRAR LIBRO -----");
        
        System.out.print("Ingrese el codigo del libro a borrar: ");
        String codigo = scanner.nextLine();

        int indice = buscarLibro(codigo); // Buscar el índice del libro en el array

        if (indice == -1) {
            System.out.println("El libro con codigo " + codigo + " no existe en la biblioteca.");
        }
        else { // Desplazar los libros a partir del índice hacia la izquierda
            
            for (int i = indice; i < numLibros - 1; i++) {
                libros[i] = libros[i + 1];
            }

            numLibros--;
            System.out.println("El libro con codigo " + codigo + " ha sido borrado de la biblioteca.");
        }
    }

}
