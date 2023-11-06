package Ejercicio4;

import java.util.*;

public class Realizador {
	
	private String apellido;
	private String nombre;
	private String fechaNacimiento;
	private List<DVD> dvds;
	
	// CONSTRUCTOR
	public Realizador(String apellido, String nombre, String fechaNacimiento) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.dvds = new ArrayList<>();
	}
	
	// GETTERS Y SETTERS
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public void agregarDVD(DVD dvd) {
		dvds.add(dvd);
	}
	
	public List<DVD> getDVDs() {
		return dvds;
	}
	
	// TO STRING
	
	@Override
	public String toString() {
		return "Realizador [apellido=" + apellido + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

}