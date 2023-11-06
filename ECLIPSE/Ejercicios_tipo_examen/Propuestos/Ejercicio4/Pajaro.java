package Ejercicio4;

public class Pajaro implements Comparable<Pajaro> {

    private String color; // Atributo para almacenar el color del pájaro
    private String raza; // Atributo para almacenar la raza del pájaro

    public Pajaro(String color, String raza) {
        this.color = color; // Inicializar el atributo color con el valor proporcionado
        this.raza = raza; // Inicializar el atributo raza con el valor proporcionado
    }

    public String getColor() {
        return color; // Obtener el valor del atributo color
    }

    public String getRaza() {
        return raza; // Obtener el valor del atributo raza
    }

    public void setColor(String color) {
        this.color = color; // Establecer el valor del atributo color
    }

    public void setRaza(String raza) {
        this.raza = raza; // Establecer el valor del atributo raza
    }

    @Override
    public int compareTo(Pajaro otroPajaro) {
        // Comparar los pájaros por el color utilizando el método compareTo de la clase String
        return this.color.compareTo(otroPajaro.color);
    }

    // Otros métodos que consideres necesarios

    @Override
    public String toString() {
        // Devolver una representación en cadena de texto del objeto Pajaro
        return "Pájaro [color=" + color + ", raza=" + raza + "]";
    }
}
