package Ejercicio_1;

public class Coche {
    private int numPuertas;

    public Coche(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void addPuerta() {
        this.numPuertas++;
    }

    public int getNumPuertas() {
        return this.numPuertas;
    }
}
