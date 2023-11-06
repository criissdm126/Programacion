package Ejercicio_2;

public class Cliente extends Persona {
	
	double credito;
	
	
    public Cliente(int edad, int telefono, String nombre) {
		super(edad, telefono, nombre);
	}
    
	public Cliente(int edad, int telefono, String nombre, double credito) {
		super(edad, telefono, nombre);
		this.credito = credito;
	}



	//GETTER Y SETTER
	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}
	
	

}
