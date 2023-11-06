package Ejercicio4;

import java.util.List;

public class Principal {
  
  public static void main(String[] args) {
    
    // Crear objetos de tipo Libro y DVD
    Autor autor1 = new Autor("Saint-Exupery", "Antoine", "29-06-1900");
    Libro libro1 = new Libro("REF001", "El principito", 15.99, 9781234567890L, 100, autor1);
    autor1.agregarLibro(libro1);
    
    // OBJETOS DE REALIZADOR Y AUTOR
    Realizador realizador1 = new Realizador("Nolan", "Christopher", "30-07-1970");
    DVD dvd1 = new DVD("REF002", "Interstellar", 29.99, 169, realizador1);
    realizador1.agregarDVD(dvd1);
    
    // Acceder a los atributos y mostrar información de los artículos
    System.out.println("Libro 1:");
    System.out.println("Referencia: " + libro1.getReferencia());
    System.out.println("Nombre: " + libro1.getNombre());
    System.out.println("Precio: " + libro1.getPrecio() + " euros");
    System.out.println("ISBN: " + libro1.getISBN());
    System.out.println("Numero de paginas: " + libro1.getNumPag());
    System.out.println("Autor: " + libro1.getAutor().getApellido() + ", " + libro1.getAutor().getNombre());
    System.out.println("Fecha de nacimiento del autor: " + libro1.getAutor().getFechaNacimiento());
    System.out.println("-----------------------------");
    
    System.out.println();
    
    System.out.println("DVD 1:");
    System.out.println("Referencia: " + dvd1.getReferencia());
    System.out.println("Nombre: " + dvd1.getNombre());
    System.out.println("Precio: " + dvd1.getPrecio() + " euros");
    System.out.println("Duracion: " + dvd1.getDuracion() + " minutos");
    System.out.println("Realizador: " + dvd1.getRealizador().getApellido() + ", " + dvd1.getRealizador().getNombre());
    System.out.println("Fecha de nacimiento del realizador: " + dvd1.getRealizador().getFechaNacimiento());
    System.out.println("-----------------------------");
    
    System.out.println();
    
    // Obtener la lista de libros relacionados con el autor
    List<Libro> librosAutor = autor1.getLibros();
    System.out.println("Libros relacionados con el autor " + autor1.getApellido() + ", " + autor1.getNombre() + ":");
    for (Libro libro : librosAutor) {
      System.out.println("Referencia: " + libro.getReferencia());
      System.out.println("Nombre: " + libro.getNombre());
      System.out.println("Precio: " + libro.getPrecio() + " euros");
      System.out.println("ISBN: " + libro.getISBN());
      System.out.println("Numero de paginas: " + libro.getNumPag());
      System.out.println("-----------------------------");
    }
    
    System.out.println();
    
    // Obtener la lista de DVDs relacionados con el realizador
    List<DVD> dvdsRealizador = realizador1.getDVDs();
    System.out.println("DVDs relacionados con el realizador " + realizador1.getApellido() + ", " + realizador1.getNombre() + ":");
    for (DVD dvd : dvdsRealizador) {
      System.out.println("Referencia: " + dvd.getReferencia());
      System.out.println("Nombre: " + dvd.getNombre());
      System.out.println("Precio: " + dvd.getPrecio() + " euros");
      System.out.println("Duracion: " + dvd.getDuracion() + " minutos");
      System.out.println("-----------------------------");
      }
    }
}
