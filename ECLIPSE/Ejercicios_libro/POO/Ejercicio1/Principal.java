package Ejercicio1;

public class Principal {

    public static void main(String[] args) {
    	
        // Crear objetos de tipo Articulo
        Articulo articulo1 = new Articulo("REF001", "Camiseta", 19.99);
        Articulo articulo2 = new Articulo("REF002", "Pantalon", 29.99);

        // Acceder a los atributos y mostrar información de los artículos
        System.out.println("Articulo 1:");
        System.out.println("Referencia: " + articulo1.getReferencia());
        System.out.println("Nombre: " + articulo1.getNombre());
        System.out.println("Precio: " + articulo1.getPrecio() + " euros");

        System.out.println();

        System.out.println("Articulo 2:");
        System.out.println("Referencia: " + articulo2.getReferencia());
        System.out.println("Nombre: " + articulo2.getNombre());
        System.out.println("Precio: " + articulo2.getPrecio() + " euros");
    }
}

/*Crear una clase que represente un artículo de una tienda de venta por correspondencia.
 * Un artículo se caracteriza por su referencia, su nombre y su precio.
 * Crear, a continuación, un método main que permita probar el correcto funcionamiento de la clase anterior.
 */