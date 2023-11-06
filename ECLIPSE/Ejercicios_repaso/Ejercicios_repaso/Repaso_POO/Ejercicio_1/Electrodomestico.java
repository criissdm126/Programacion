package Ejercicio_1;

public class Electrodomestico {
    
	private double consumo;
    private String modelo;
    
    public Electrodomestico(double c, String m) {
        setConsumo(c);
        setModelo(m);
    }
    
    // Otros métodos y atributos de la clase Electrodomestico
    
    public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public interface MuestraInformacion {
        public String muestra();
    }
}