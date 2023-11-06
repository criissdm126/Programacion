package Examen;

public abstract class Animal {
	
    protected int id;
    protected String nombre;
    protected String color;

    public Animal(int id, String nombre, String color) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
    }

    public abstract String toString();

}
