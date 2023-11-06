package Ejercicio2;

public class Principal {

    public static void main(String[] args) {
    	
        // Crear objetos de tipo Libro y DVD
    	// String referencia, String nombre, double precio, int iSBN, int numPag, String autor
        Libro libro1 = new Libro("REF001", "El principito", 15.99, 9781234567890L, 100, "Antoine de Saint-Exupery");
        DVD dvd1 = new DVD("REF002", "Interstellar", 29.99, 169, "Christopher Nolan");

        // Acceder a los atributos y mostrar información de los artículos
        System.out.println("Libro 1:");
        System.out.println("Referencia: " + libro1.getReferencia());
        System.out.println("Nombre: " + libro1.getNombre());
        System.out.println("Precio: " + libro1.getPrecio() + " euros");
        System.out.println("ISBN: " + libro1.getISBN());
        System.out.println("Numero de paginas: " + libro1.getNumPag());
        System.out.println("Autor: " + libro1.getAutor());

        System.out.println();

        System.out.println("DVD 1:");
        System.out.println("Referencia: " + dvd1.getReferencia());
        System.out.println("Nombre: " + dvd1.getNombre());
        System.out.println("Precio: " + dvd1.getPrecio() + " euros");
        System.out.println("Duracion: " + dvd1.getDuracion() + " minutos");
        System.out.println("Realizador: " + dvd1.getRealizador());
    }
}
