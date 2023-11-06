package evaluables;

import java.util.*;

public class Biblio {

	public static void main(String[] args) {
		
		
		int espacio_limite = 0;
		//codigo, titulo, autor de libros
		Scanner sc = new Scanner(System.in);
		Libro[] libros = new Libro[5];
		/*libros[0] = new Libro ("1","Cervantes", "Quijote");
		libros[1] = new Libro ("2","Anonimo", "Celestina");
		libros [2]=  new Libro("3", "Garcia Marquez", "Cien años de soledad");*/
		
	
		
		//personas a realizar el prestamo y codigo

		Persona[] personas = {new Persona("Paco", "p1"), new Persona("Pepe", "p2"), new Persona("María", "p3")};
		/*Persona p1 = new Persona ("Paco", "p1");
		Persona p2 = new Persona ("Pape", "p2");	
		Persona p3 = new Persona ("Maria", "p3");*/
		
		int opcion;
		
		//menú
		do {
			System.out.println("Seleccione una opcion:");
			System.out.println("1. Listado de libros en la biblioteca");
			System.out.println("2. Nuevo libro");
			System.out.println("3. Modificar un libro");
			System.out.println("4. Prestar un libro");
			System.out.println("5. Devolver un libro");
			System.out.println("6. Comparar 2 libros");
			System.out.println("7. Borrar libro");
			System.out.println("0. Salir");
			opcion = sc.nextInt();
			switch(opcion) {
				
				//Listado de libros en la biblioteca
				case 1:
				System.out.println("Listado de libros en la biblioteca:");
				for (Libro libro : libros) {
					if (libro != null) {
						System.out.println(libro);
					}
					/*else {
						System.out.println("No hay libros actualmente en la biblioteca.");
						break;
					}*/
				}
				break;
				
				//Nuevo libro
				case 2:
				if (espacio_limite < 5) {
					System.out.print("Introduzca el codigo del libro: ");
					String cod1 = sc.next();
					System.out.print("Introduzca el titulo del libro: ");
					String titulo = sc.next();
					System.out.print("Introduzca el autor del libro: ");
					String autor = sc.next();
					Libro[] nuevosLibros = new Libro[libros.length + 1];
					for (int i = 0; i < libros.length; i++) {
						nuevosLibros[i] = libros[i];
					}
					nuevosLibros[libros.length] = new Libro(cod1, titulo, autor);
					libros = nuevosLibros;
					System.out.println("El libro ha sido agregado con exito");
					espacio_limite ++;
				}
				else {
					System.out.println("La biblio esta llena");
				}
				break;
				
				//Modificar un libro
				case 3:
				System.out.print("Introduzca el codigo del libro a modificar: ");
				String codigo = sc.next();
				System.out.print("Introduzca el nuevo titulo del libro: ");
				String tituloMod = sc.next();
				System.out.print("Introduzca el nuevo autor del libro: ");
				String autorMod = sc.next();
				for (Libro libro : libros) {
					if (libro != null && libro.getCodigo().equals(codigo)) {
						libro.setTitulo(tituloMod);
						libro.setAutor(autorMod);
						break;
					}
				}
				System.out.println("El libro se ha modificado con exito.");
				break;
				
				//Prestar un libro
				case 4:
				System.out.print("Introduzca el codigo del libro a prestar: ");
				codigo = sc.next();
				System.out.print("Introduzca el codigo de la persona que desea prestar el libro: ");
				String codigoPersona = sc.next();
				Libro libroPrestamo = null;
				Persona personaPrestamo = null;
				for (Libro libro : libros) {
					if (libro != null && libro.getCodigo().equals(codigo)) {
						libroPrestamo = libro;
						break;
					}
				}
				for (Persona persona : personas) {
					if (persona.getCodigo().equals(codigoPersona)) {
						personaPrestamo = persona;
						break;
					}
				}
				if (libroPrestamo != null && personaPrestamo != null) {
					if (libroPrestamo.prestamo(personaPrestamo)) {
						System.out.println("Prestamo realizado con exito");
					}
					else {
						System.out.println("No se ha podido realizar el prestamo");
					}
				}
				else {
					System.out.println("Libro o persona no encontrados");
				}
				break;
				
				//Devolver un libro
				case 5:
				System.out.print("Introduzca el codigo del libro a devolver: ");
				codigo = sc.next();
				libroPrestamo = null;
				for (Libro libro : libros) {
					if (libro != null && libro.getCodigo().equals(codigo)) {
						libroPrestamo = libro;
						break;
					}
				}
				if (libroPrestamo != null) {
					if (libroPrestamo.devolucion()) {
						System.out.println("Devolucion realizada con exito");
					}
					else {
						System.out.println("No se ha podido realizar la devolucion");
					}
				}
				else {
					System.out.println("Libro no encontrado");
				}
				break;
				
				//Comparar 2 libros
				case 6:
				System.out.print("Introduzca el codigo del primer libro: ");
				String codigo1 = sc.next();
				System.out.print("Introduzca el codigo del segundo libro: ");
				String codigo2 = sc.next();
				Libro libro1 = null;
				Libro libro2 = null;
				for (Libro libro : libros) {
					if (libro != null && libro.getCodigo().equals(codigo1)) {
						libro1 = libro;
					}
					if (libro != null && libro.getCodigo().equals(codigo2)) {
						libro2 = libro;
					}
				}
				if (libro1 != null && libro2 != null) {
					System.out.println("Si los libros son iguales saldra true y si son distintos saldra false: " + libro1.compara(libro2));
				}
				else {
					System.out.println("Alguno de los libros no se encuentra en la biblioteca.");
				}
				break;			
				
				//Borrar libro
				case 7:
				System.out.print("Introduzca el codigo del libro a borrar: ");
				String codigo11 = sc.next();
				int a = 0;
				boolean borrado = false;
				for (Libro libro : libros) {
					if (libro != null && libros[a].getCodigo().compareToIgnoreCase(codigo11) == 0) {
						if (libros[a].getDisponible()) {
							libros[a] = null;
							System.out.println("Libro borrado con exito.");
							espacio_limite --;
							borrado = true;
							break;
						}
						else {
							System.out.println("El libro con el codigo introducido esta prestado y no se puede borrar.");
							borrado = true;
							break;
						}
					}
					a++;
				}
				if (!borrado) {
					System.out.println("El codigo introducido es incorrecto y no se puede borrar el libro.");
				}
				break;

				 /*System.out.print("Introduzca el codigo del libro a borrar: ");
		 // codigo = sc.next();

		
			int cod = sc.nextInt();
			
			if (cod > libros.length-1 || cod < 0){
				System.err.println("Codigo no valido");
			}
			else if (libros[cod] == null) {
				System.err.println("Codigo no valido");
			}
			else if  (libros[cod].getDisponible() == false) {
				System.err.println("Codigo no valido");
			}
			else {
				libros[cod] = null;
				System.out.println("El libro ha sido borrado con exito.");
			}
		 
		  break;*/
			}
		} while (opcion != 0); {
			// opciones del menú
		}
	}
}












