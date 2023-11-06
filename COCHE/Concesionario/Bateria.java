package Concesionario;

public class Bateria {
	
	//ATRIBUTOS
	private double potencia;
	private double consumo;
	
	//CONSTRUCTOR
	public Bateria(double potencia, double consumo) {
		super();
		this.potencia = potencia;
		this.consumo = consumo;
	}
	
	
	//GETTER Y SETTER
	public double getPotencia() {
		return this.potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	public double getConsumo() {
		return this.consumo;
	}
	
	//MÉTODO BATERIA
	public Bateria(double potencia) {
		
		this.potencia = potencia;
		this.consumo = potencia * 3;
	}
}
