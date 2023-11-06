 package Concesionario;

public class Bateria {
	
	private double potencia;
	private double consumo;
	
	public double getPotencia() {
		return this.potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	public double getConsumo() {
		return this.consumo;
	}
	public Bateria(double potencia) {
		
		this.potencia = potencia;
		this.consumo = potencia * 3;
	}


}
