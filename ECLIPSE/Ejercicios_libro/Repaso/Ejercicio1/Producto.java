package Ejercicio1;

public class Producto extends Info {
	
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double precio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + ", Precio: " + precio;
    }
}