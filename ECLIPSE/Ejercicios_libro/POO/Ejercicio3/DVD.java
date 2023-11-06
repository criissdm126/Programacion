package Ejercicio3;

public class DVD extends Articulo {
	
	int duracion;
	Realizador realizador; // Cambio en el tipo de dato del atributo realizador
	
	// CONSTRUCTOR
	public DVD(String referencia, String nombre, double precio, int duracion, Realizador realizador) {
		super(referencia, nombre, precio);
		this.duracion = duracion;
		this.realizador = realizador;
	}
	
	// GETTER Y SETTER
	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Realizador getRealizador() {
		return realizador;
	}

	public void setRealizador(Realizador realizador) {
		this.realizador = realizador;
	}
}
