package Ejercicio_1;

public class Electrodomestico implements MuestraInformacion {
    protected double consumo;
    protected String modelo;

    public Electrodomestico(double consumo, String modelo) {
        this.consumo = consumo;
        this.modelo = modelo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String muestra() {
        return "Consumo: " + consumo + " Modelo: " + modelo;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "consumo=" + consumo +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
