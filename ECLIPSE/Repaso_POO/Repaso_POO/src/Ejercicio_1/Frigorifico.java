package Ejercicio_1;

public class Frigorifico extends Electrodomestico implements MuestraInformacion {
    private int temperatura;

    public Frigorifico(double consumo, String modelo, int temperatura) {
        super(consumo, modelo);
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Frigorifico{" +
                "consumo=" + consumo +
                ", modelo='" + modelo + '\'' +
                ", temperatura=" + temperatura +
                '}';
    }

    @Override
    public String muestra() {
        return "La temperatura del frigorífico es de " + temperatura + " grados Celsius.";
    }
}