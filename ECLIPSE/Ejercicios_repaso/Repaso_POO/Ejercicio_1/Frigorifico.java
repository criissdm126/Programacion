package Ejercicio_1;

public class Frigorifico extends Electrodomestico implements Electrodomestico.MuestraInformacion {
    
	private int temperatura;
    
    public Frigorifico(double c, String m, int t) {
        super(c, m);
        temperatura = t;
    }
    
    @Override
    public String toString() {
        return "Frigorifico - Modelo: " + getModelo() + " - Consumo: " + getConsumo() + " - Temperatura: " + temperatura;
    }
    
    @Override
    public String muestra() {
        return "Temperatura del frigorifico: " + temperatura;
    }
}
