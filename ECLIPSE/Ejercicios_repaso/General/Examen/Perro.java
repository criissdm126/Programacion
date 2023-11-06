package Examen;

public class Perro extends Animal {
	
    public Perro(int id, String nombre, String color) {
        super(id, nombre, color);
    }

    @Override
    public String toString() {
        return "Perro: ID: " + id + ", Nombre: " + nombre + ", Color: " + color;
    }
}