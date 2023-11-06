package Examen;

public class Gato extends Animal {
	
    public Gato(int id, String nombre, String color) {
        super(id, nombre, color);
    }

    @Override
    public String toString() {
        return "Gato: ID = " + id + ", Nombre = " + nombre + ", Color = " + color;
    }
}