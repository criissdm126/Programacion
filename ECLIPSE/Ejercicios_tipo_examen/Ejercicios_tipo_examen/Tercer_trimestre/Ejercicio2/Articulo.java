package Ejercicio2;

public class Articulo {
	
    private String tipo;
    private String descripcion;

    public Articulo(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Descripcion: " + descripcion;
    }
}


/*Genera una clase Articulo únicamente con los atributos privados tipo y descripcion y los métodos que consideres necesarios.
 * Tres ejemplos de articulos podrían ser:
 *    1. Tornillo como descripción y Ferretería como tipo.
 *    2. Lápiz como descripción u Papelerí como tipo.
 *    3. Lavadora como descripción y Electrodoméstico como tipo.
 * Crea en un programa principal una colección de Articulos. 
 * Inserta los 3 articulos anteriores en la colección y muéstralos ordenados según las descripciones de los articulos.
 * No puede haber articulos duplicados.
 */