package Ejercicio2;

public class DVD extends Articulo {
	
	int duracion;
	String realizador;
	
	// CONSTRUCTOR
	public DVD(String referencia, String nombre, double precio, int duracion, String realizador) {
		super(referencia, nombre, precio);// PASA COMO PARÁMETRO LOS ATB DE LA CLASE PADRE
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

	public String getRealizador() {
		return realizador;
	}

	public void setRealizador(String realizador) {
		this.realizador = realizador;
	}
	
}

// un DVD tiene cierta duración y lo ha producido un realizador.