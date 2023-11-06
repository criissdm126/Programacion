package Ejercicio5;

public class Coche implements Comparable<Coche> {

    private String marca; // Marca del coche
    private String color; // Color del coche
    private int identificador; // Identificador del coche

    public Coche(String marca, String color, int identificador) {
        this.marca = marca; // Inicializar el atributo marca con el valor proporcionado
        this.color = color; // Inicializar el atributo color con el valor proporcionado
        this.identificador = identificador; // Inicializar el atributo identificador con el valor proporcionado
    }

    public String getMarca() {
        return marca; // Obtener el valor del atributo marca
    }

    public String getColor() {
        return color; // Obtener el valor del atributo color
    }

    public int getIdentificador() {
        return identificador; // Obtener el valor del atributo identificador
    }

    @Override
    public int compareTo(Coche otroCoche) {
        // Comparar los coches por identificador
        return Integer.compare(this.identificador, otroCoche.identificador);
    }

    @Override
    public String toString() {
        // Devolver una representación en cadena de texto del objeto Coche
        return "Coche [marca=" + marca + ", color=" + color + ", identificador=" + identificador + "]";
    }
}