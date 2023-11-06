package Ejercicio_2;

public class Persona {
	
	int edad;
	int telefono;
	String nombre;
	
	//CONSTRUCTOR
	
	public Persona(int edad, int telefono, String nombre) {
		super();
		this.edad = edad;
		this.telefono = telefono;
		this.nombre = nombre;
	}
	
	//GETTER Y SETTER
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getTelefono() {
		return telefono;
	}
	
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
