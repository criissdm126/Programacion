package Ficheros_2;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Familiar implements Serializable {
	/**
	 * Necesito el serializable por que si no no podre guardar el array socios en archivos ya que lleva un array en cada objeto Socio de Familiar
	 */
	private static final long serialVersionUID = 1L;
	private String dni, nombre;
	LocalDate ffnacimiento;

	// Constructor
	public Familiar(String d, String n, String f) {
		dni = d;
		nombre = n;
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		ffnacimiento = LocalDate.parse(f, formato);
	}

	// Getters y Setters
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFfnacimiento() {
		return ffnacimiento;
	}

	public void setFfnacimiento(String ffnacimiento) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.ffnacimiento = LocalDate.parse(ffnacimiento, f);
	}

	@Override
	public String toString() {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return " Nombre: " + nombre + "   DNI: " + dni + "   F.Nacimiento: " + f.format(ffnacimiento) + "||";
	}

}
