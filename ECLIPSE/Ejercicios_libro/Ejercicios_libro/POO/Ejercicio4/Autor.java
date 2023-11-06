package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Autor {
	
	private String apellido;
	private String nombre;
	private String fechaNacimiento;
	private List<Libro> libros;
	
	public Autor(String apellido, String nombre, String fechaNacimiento) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.libros = new ArrayList<>();
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
	public void agregarLibro(Libro libro) {
		libros.add(libro);
	}
	
	public List<Libro> getLibros() {
		return libros;
	}
}