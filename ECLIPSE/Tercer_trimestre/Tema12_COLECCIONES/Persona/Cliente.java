package Persona;

import java.util.Objects;

public class Cliente implements Comparable{
	
	private int id;
	private String nombre;
	private String tipo;
	private String email;
	private int edad;

	//GETTER Y SETTER
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	//CONSTRUCTOR
	public Cliente(int id, String nombre, String tipo, String email, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.email = email;
		this.edad = edad;
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "Cliente [id = " + id + ", nombre = " + nombre + ", tipo = " + tipo + ", email = " + email + ", edad = " + edad
				+ " ]";
	}

	//COMPARETO
	//POR EMAIL
	@Override
	public int compareTo(Object otro) {
		
		Cliente c = (Cliente) otro;
		return email.compareTo(c.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(email, other.email);
	}
	
}

/* Clase Cliente que tenga:
 * Id
 * Nombre
 * Tipo
 * Email
 * Edad
 * Crear varios clientes y meterlos todos en un ArrayList, que salgan ordenados por email (compare to)
 *Crear clas epara comparar por edad
 */


